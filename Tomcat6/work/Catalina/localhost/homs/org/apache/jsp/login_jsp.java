package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<link href=\"style/alogin.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<title>用户登录</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction loadimage(){\r\n");
      out.write("\t\tdocument.getElementById(\"randImage\").src=\"images/image.jsp?\"+Math.random();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form id=\"form1\" name=\"form1\" action=\"login.htm\" method=\"post\">\r\n");
      out.write("\t<div class=\"MAIN\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li class=\"top\"></li>\r\n");
      out.write("\t\t\t<li class=\"top2\"></li>\r\n");
      out.write("\t\t\t<li class=\"topA\"></li>\r\n");
      out.write("\t\t\t<li class=\"topB\">\r\n");
      out.write("\t\t\t\t<span> \r\n");
      out.write("\t\t\t\t\t<a href=\"\" target=\"_blank\"><img src=\"\" alt=\"\" style=\"\" /></a>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"topC\"></li>\r\n");
      out.write("\t\t\t<li class=\"topD\">\r\n");
      out.write("\t\t\t<ul class=\"login\">\r\n");
      out.write("\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t<li><span class=\"left\">用户名：</span> <span style=\"\"> <input id=\"userName\" name=\"userName\" type=\"text\" class=\"txt\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /> </span></li>\r\n");
      out.write("\t\t\t\t<li><span class=\"left\">密&nbsp;&nbsp;&nbsp;码：</span> <span style=\"\"> <input id=\"password\" name=\"password\" type=\"password\" class=\"txt\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${password }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onkeydown= \"if(event.keyCode==13)form1.submit()\"/> </span></li>\r\n");
      out.write("\t\t\t\t<li><span class=\"left\">验证码：</span> <span style=\"\"> <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imageCode }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"imageCode\"  class=\"txtCode\" id=\"imageCode\" size=\"10\" onkeydown= \"if(event.keyCode==13)form1.submit()\"/>&nbsp;<img onclick=\"javascript:loadimage();\"  title=\"换一张试试\" name=\"randImage\" id=\"randImage\" src=\"images/image.jsp\" width=\"60\" height=\"20\" border=\"1\" align=\"absmiddle\"> </span></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"topE\"></li>\r\n");
      out.write("\t\t\t<li class=\"middle_A\"></li>\r\n");
      out.write("\t\t\t<li class=\"middle_B\"></li>\r\n");
      out.write("\t\t\t<li class=\"middle_C\"><span class=\"btn\"> <img alt=\"\" src=\"images/login/btnlogin.gif\" onclick=\"javascript:document.getElementById('form1').submit()\"/> </span>&nbsp;&nbsp;<span ><font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</font></span></li>\r\n");
      out.write("\t\t\t<li class=\"middle_D\"></li>\r\n");
      out.write("\t\t\t<li class=\"bottom_A\"></li>\r\n");
      out.write("\t\t\t<li class=\"bottom_B\">社区医院管理系统</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
