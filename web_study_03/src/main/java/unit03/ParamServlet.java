package unit03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/param")
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		String id = request.getParameter("id");
		int age = Integer.parseInt(request.getParameter("age"));
		String content = request.getParameter("content");
		String gender = request.getParameter("gender");
		String checkEmail = request.getParameter("checkEmail");
		String items[] = request.getParameterValues("item");
		String job = request.getParameter("job");
		
		
		PrintWriter out = response.getWriter();
		out.println("이름 : " + id + "<br />");
		out.println("나이 : " + age + "<br />");
		out.println("내용 : " + content + "<br />");
		out.println("성별 : " + gender + "<br />");
		out.println("이메일수신 : " + checkEmail + "<br />");
		if(items==null) {
			out.println("악세서리를 선택하지 않았습니다.");
		}else {
			out.print("관심있는 악세서리 : ");
			for(String item : items)
				out.print(item + " ");	
		}
		out.println("<br />");
		out.print("직업 : " + job);
		
		out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
