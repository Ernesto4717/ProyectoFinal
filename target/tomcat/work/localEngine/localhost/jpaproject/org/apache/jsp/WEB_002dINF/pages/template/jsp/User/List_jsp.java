package org.apache.jsp.WEB_002dINF.pages.template.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class List_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<div data-ng-controller=\"springController\">\r\n");
      out.write("\t<ol class=\"breadcrumb\">\r\n");
      out.write("\t\t<li><a href=\"<c:url value=\"/User/home\"/>\">Home</a></li>\r\n");
      out.write("\t\t<li class=\"active\">User List</li>\r\n");
      out.write("\t</ol>\r\n");
      out.write("\t<div class=\"form group\">\r\n");
      out.write("\t\t<input type=\"search\" placeholder=\"search by name\" data-ng-model=\"name\">\r\n");
      out.write("\t\t<button type=\"button\" class=\"btn-sm btn-default\" data-ng-click=\"search()\">\r\n");
      out.write("\t\t\t<span class=\"glyphicon glyphicon-search\"></span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<table class=\"table\">\r\n");
      out.write("\t\t<thead class=\"thead-inverse\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th width=\"5%\">Username</th>\r\n");
      out.write("\t\t\t\t<th width=\"10%\">Name</th>\r\n");
      out.write("\t\t\t\t<th width=\"10%\">Role</th>\r\n");
      out.write("\t\t\t\t<th width=\"10%\">Active</th>\r\n");
      out.write("\t\t\t\t<th width=\"11%\">Delete</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\r\n");
      out.write("\t\t<tr data-ng-repeat=\"user in userList\">\r\n");
      out.write("\t\t\t<td><a\r\n");
      out.write("\t\t\t\tdata-ng-href=\"/User/edit?username={{user.username}}&status=\">{{user.username}}</a></td>\r\n");
      out.write("\t\t\t<td data-ng-bind=\"user.name\"></td>\r\n");
      out.write("\t\t\t<td data-ng-bind=\"user.role.description\"></td>\r\n");
      out.write("\t\t\t<td data-ng-bind=\"user.status\"></td>\r\n");
      out.write("\t\t\t<td data-ng-show=\"user.status=='S'\">Delete</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
