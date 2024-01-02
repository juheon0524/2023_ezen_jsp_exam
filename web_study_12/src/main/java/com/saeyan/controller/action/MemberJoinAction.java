package com.saeyan.controller.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.MemberDAO;
import com.saeyan.dto.MemberVO;

public class MemberJoinAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, Exception {
		MemberVO vo = new MemberVO();
		vo.setCustno(Integer.parseInt(request.getParameter("cutno")));
		vo.setCustname(request.getParameter("cutname"));
		vo.setPhone(request.getParameter("phone"));
		vo.setAddress(request.getParameter("address"));
		vo.setDate(request.getParameter("date"));
		vo.setGrade(request.getParameter("grade"));
		vo.setCity(request.getParameter("city"));
		
		MemberDAO mDao = MemberDAO.getInstance();
		int result = mDao.updateMember(vo);
		
		if(result==1) {
//			new MemberListAction().execute(request, response);
		}
		

	}

}
