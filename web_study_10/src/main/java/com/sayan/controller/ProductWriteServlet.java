package com.sayan.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.sayan.dao.ProductDAO;
import com.sayan.dto.ProductVO;

@WebServlet("/productWrite.do")
public class ProductWriteServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dis = request.getRequestDispatcher("product/productWrite.jsp");
		dis.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		ServletContext context = getServletContext();
		String path = context.getRealPath("upload");
		int sizeLimit = 20*1024*1024;
		String encType = "utf-8";
		
		MultipartRequest multi = new MultipartRequest(
				request,  //요청
				path,	//저장경로
				sizeLimit, //업로드 크기
				encType,	//인코딩 방법
				new DefaultFileRenamePolicy() // 중복되면 파일명뒤에 숫자 1씩 증가
				);
		String name = multi.getParameter("name");
		int price = Integer.parseInt(multi.getParameter("price"));
		String description = multi.getParameter("description");	
		String pictureurl = multi.getFilesystemName("pictureurl");
		
		ProductVO vo = new ProductVO();
		vo.setName(name);
		vo.setPrice(price);
		vo.setDescription(description);
		vo.setPictureurl(pictureurl);
		
		ProductDAO pDao = ProductDAO.getInstance();
		int result = pDao.insertProduct(vo);
		System.out.println("result : " + result);
		if(result==1) {
			response.sendRedirect("productList.do");
		} else {
			response.sendRedirect("productWrite.do");
		}
		
	}
}
