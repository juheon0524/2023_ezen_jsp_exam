package com.sayan.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/upload2.do")
public class MultiUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.setCharacterEncoding("utf-8");
	     response.setContentType("text/html; charset=utf-8");

	     PrintWriter out = response.getWriter();
	     
	     String savePath = "upload";
	     int uploadFileLimit = 5*1024*1024;
	     String entType = "utf-8";
	     
	     ServletContext context = getServletContext();
	     String uploadFilePath = context.getRealPath(savePath);
	     
	     try {
			MultipartRequest multi = new MultipartRequest(
					request,
					uploadFilePath,
					uploadFileLimit,
					entType,
					new DefaultFileRenamePolicy());
			Enumeration files = multi.getFileNames();
			while(files.hasMoreElements()) {
				String file = (String)files.nextElement();
				System.out.println("file : " + file);

				String fileName = multi.getFilesystemName(file);
				System.out.println("fileName : " + fileName); //서버상 파일이름
				
				String oriName = multi.getOriginalFileName(file); //실제파일명
				System.out.println("oriName : " + oriName);
				
				out.print("<br> 업로드된 파일명 : " + fileName);
				out.print("<br> 원본 파일명 : " + oriName);
				out.print("<hr>");
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
