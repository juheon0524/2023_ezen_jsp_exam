/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-10-24 04:00:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.shop;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link href=\"../css/reset.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"../css/header.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"../css/join.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"../css/footer.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"../script/member.js\"></script>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write(" <div class=\"joinContent\">\r\n");
      out.write(" 	<form name=\"frm\" method=\"post\" action=\"MemberServlet\">\r\n");
      out.write(" 	<table>\r\n");
      out.write(" 		<tr>\r\n");
      out.write(" 			<th colspan=\"5\" class=\"tableTitle\">홈쇼핑 회원 등록</th>\r\n");
      out.write(" 		</tr>\r\n");
      out.write(" 		<tr>\r\n");
      out.write(" 			<th>회원번호(자동발생)</th>\r\n");
      out.write(" 			<td colspan=\"4\"><input type=\"text\"></td>\r\n");
      out.write(" 		</tr>\r\n");
      out.write(" 		<tr>\r\n");
      out.write(" 			<th>회원성명</th>\r\n");
      out.write(" 			<td><input type=\"text\"></td>\r\n");
      out.write(" 		</tr>\r\n");
      out.write(" 		<tr>\r\n");
      out.write(" 			<th>회원전화</th>\r\n");
      out.write(" 			<td><input type=\"text\"></td>\r\n");
      out.write(" 		</tr>\r\n");
      out.write(" 		<tr>\r\n");
      out.write(" 			<th>회원주소</th>\r\n");
      out.write(" 			<td><input type=\"text\"></td>\r\n");
      out.write(" 		</tr>\r\n");
      out.write(" 		<tr>\r\n");
      out.write(" 			<th>가입일자</th>\r\n");
      out.write(" 			<td><input type=\"text\"></td>\r\n");
      out.write(" 		</tr>\r\n");
      out.write(" 		<tr>\r\n");
      out.write(" 			<th>고객등급<br/>(A:VIP, B:일반, C:직원)</th>\r\n");
      out.write(" 			<td><input type=\"text\" class=\"tableInput\"></td>\r\n");
      out.write(" 		</tr>\r\n");
      out.write(" 		<tr>\r\n");
      out.write(" 			<th>도시코드</th>\r\n");
      out.write(" 			<td><input type=\"text\"></td>\r\n");
      out.write(" 		</tr>\r\n");
      out.write(" 		<tr>\r\n");
      out.write(" 			<th colspan=\"5\">\r\n");
      out.write(" 				<input type=\"submit\" value=\"등록\" onclick=\"return memberCheck()\" >\r\n");
      out.write(" 				<input type=\"button\" value=\"목록\" onclick=\"location.href='/MemberServlet?command=member_list'\">\r\n");
      out.write(" 			</th>\r\n");
      out.write(" 		</tr>\r\n");
      out.write(" 	</table>\r\n");
      out.write(" 	</form>\r\n");
      out.write(" </div>\r\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write(" </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
