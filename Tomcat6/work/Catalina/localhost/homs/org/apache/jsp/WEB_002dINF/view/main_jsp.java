package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/common.jsp");
    _jspx_dependants.add("/WEB-INF/privilege.tld");
  }

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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	/**-====================================================================
	*                               基本常量的设定
	*=====================================================================**/
	//设定context path
	String path = request.getContextPath();
	if("/".equals(path.trim())) path = "";
	pageContext.setAttribute("path",path);

      out.write("\r\n");
      out.write("<!-- CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery-easyui-1.3.3/themes/default/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery-easyui-1.3.3/themes/icon.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/style/main.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- JAVASCRIPT -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery-easyui-1.3.3/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery-easyui-1.3.3/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery-easyui-1.3.3/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>主界面</title>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    var url;\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 加载左树菜单\r\n");
      out.write("\t\t$(\"#tree\").tree({\r\n");
      out.write("\t\t\tlines:true,\r\n");
      out.write("\t\t\turl:'menuTree.htm?parentId=-1',\r\n");
      out.write("\t\t\tonLoadSuccess:function(){\r\n");
      out.write("\t\t\t\t$(\"#tree\").tree('expandAll');\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tonClick:function(node){\r\n");
      out.write("\t\t\t\tif(node.id==16){\r\n");
      out.write("\t\t\t\t\tlogout();\r\n");
      out.write("\t\t\t\t}else if(node.id==15){\r\n");
      out.write("\t\t\t\t\topenPasswordUpdateDialog();\r\n");
      out.write("\t\t\t\t}else　if(node.attributes.menuUrl){\r\n");
      out.write("\t\t\t\t\topenTab(node);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t// 退出登录\r\n");
      out.write("\t\tfunction logout(){\r\n");
      out.write("\t\t\t$.messager.confirm('系统提示','您确定要退出系统吗？',function(r){\r\n");
      out.write("\t\t\t\tif(r){\r\n");
      out.write("\t\t\t\t\twindow.location.href='logout.htm';\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t// 打开修改密码的窗体\r\n");
      out.write("\t\tfunction openPasswordUpdateDialog(){\r\n");
      out.write("\t\t\turl=\"updatePassword.htm\";\r\n");
      out.write("\t\t\t$(\"#dlg\").dialog(\"open\").dialog(\"setTitle\",\"修改密码\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t/**左边的菜单点击显示\r\n");
      out.write("\t\t\t如果存在（即已经打开了），选中他\r\n");
      out.write("\t\t\t如果不存在则打开他\r\n");
      out.write("\t\t*/\t\t\r\n");
      out.write("\t\tfunction openTab(node){\r\n");
      out.write("\t\t\tif($(\"#tabs\").tabs(\"exists\",node.text)){\r\n");
      out.write("\t\t\t\t$(\"#tabs\").tabs(\"select\",node.text);\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tvar content=\"<iframe frameborder=0 scrolling='auto' style='width:100%;height:100%' src=\"+node.attributes.menuUrl+\"></iframe>\"\r\n");
      out.write("\t\t\t\t$(\"#tabs\").tabs(\"add\",{\r\n");
      out.write("\t\t\t\t\ttitle:node.text,\r\n");
      out.write("\t\t\t\t\ticonCls:node.iconCls,\r\n");
      out.write("\t\t\t\t\tclosable:true,\r\n");
      out.write("\t\t\t\t\tcontent:content\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tbindTabEvent();\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\tbindTabEvent();\r\n");
      out.write("\t\tbindTabMenuEvent();\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tfunction bindTabEvent(){\r\n");
      out.write("\t\t$(\".tabs-inner\").dblclick(function(){\r\n");
      out.write("\t\t\tvar subtitle = $(this).children(\".tabs-title\").text();\r\n");
      out.write("\t\t\t$('#tabs').tabs('close',subtitle);\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t$(\".tabs-inner\").bind('contextmenu',function(e){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$('#mm').menu('show', {\r\n");
      out.write("\t\t\t\tleft: e.pageX,\r\n");
      out.write("\t\t\t\ttop: e.pageY\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\tvar subtitle =$(this).children(\".tabs-title\").text();\r\n");
      out.write("\t\t\t$('#mm').data(\"currtab\",subtitle);\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\tfunction bindTabMenuEvent(){\r\n");
      out.write("\t\tvar temp = $('#tabs');\r\n");
      out.write("\t\t$('#mm-tabrefresh').click(function(){\r\n");
      out.write("\t\t\tvar currtab_title = $('#mm').data(\"currtab\");\r\n");
      out.write("\t\t\tvar frame = temp.tabs('getTab', currtab_title).find('iframe')\r\n");
      out.write("\t\t\tframe.attr('src',frame.attr('src'));\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t//关闭当前\r\n");
      out.write("\t\t$('#mm-tabclose').click(function(){\r\n");
      out.write("\t\t\tvar currtab_title = $('#mm').data(\"currtab\");\r\n");
      out.write("\t\t\t$('#tabs').tabs('close',currtab_title);\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t//全部关闭\r\n");
      out.write("\t\t$('#mm-tabcloseall').click(function(){\r\n");
      out.write("\t\t\t$('.tabs-inner span').each(function(i,n){\r\n");
      out.write("\t\t\t\tvar t = $(n).text();\r\n");
      out.write("\t\t\t\t$('#tabs').tabs('close',t);\r\n");
      out.write("\t\t\t});\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t//关闭除当前之外的TAB\r\n");
      out.write("\t\t$('#mm-tabcloseother').click(function(){\r\n");
      out.write("\t\t\tvar currtab_title = $('#mm').data(\"currtab\");\r\n");
      out.write("\t\t\t$('.tabs-inner span').each(function(i,n){\r\n");
      out.write("\t\t\t\tvar t = $(n).text();\r\n");
      out.write("\t\t\t\tif(t!=currtab_title)\r\n");
      out.write("\t\t\t\t\t$('#tabs').tabs('close',t);\r\n");
      out.write("\t\t\t});\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t//关闭当前右侧的TAB\r\n");
      out.write("\t\t$('#mm-tabcloseright').click(function(){\r\n");
      out.write("\t\t\tvar nextall = $('.tabs-selected').nextAll();\r\n");
      out.write("\t\t\tif(nextall.length==0){\r\n");
      out.write("\t\t\t\t//msgShow('系统提示','后边没有啦~~','error');\r\n");
      out.write("\t\t\t\talert('后边没有啦~~');\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tnextall.each(function(i,n){\r\n");
      out.write("\t\t\t\tvar t=$('a:eq(0) span',$(n)).text();\r\n");
      out.write("\t\t\t\t$('#tabs').tabs('close',t);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t//关闭当前左侧的TAB\r\n");
      out.write("\t\t$('#mm-tabcloseleft').click(function(){\r\n");
      out.write("\t\t\tvar prevall = $('.tabs-selected').prevAll();\r\n");
      out.write("\t\t\tif(prevall.length==0){\r\n");
      out.write("\t\t\t\talert('到头了，前边没有啦~~');\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tprevall.each(function(i,n){\r\n");
      out.write("\t\t\t\tvar t=$('a:eq(0) span',$(n)).text();\r\n");
      out.write("\t\t\t\t$('#tabs').tabs('close',t);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 修改密码提交\r\n");
      out.write("\tfunction updatePassword(){\r\n");
      out.write("\t\t$(\"#fm\").form(\"submit\",{\r\n");
      out.write("\t\t\turl:url,\r\n");
      out.write("\t\t\tonSubmit:function(){\r\n");
      out.write("\t\t\t\tvar oldPassword=$(\"#oldPassword\").val();\r\n");
      out.write("\t\t\t\tvar newPassword=$(\"#newPassword\").val();\r\n");
      out.write("\t\t\t\tvar newPassword2=$(\"#newPassword2\").val();\r\n");
      out.write("\t\t\t\tif(!$(this).form(\"validate\")){  //先进行easyui验证\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(newPassword!=newPassword2){\r\n");
      out.write("\t\t\t\t\t$.messager.alert('系统提示','确认密码输入错误！');\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(oldPassword!='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentUser.password}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("'){\r\n");
      out.write("\t\t\t\t\t$.messager.alert('系统提示','原密码错误！');\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\treturn true;\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tsuccess:function(result){\r\n");
      out.write("\t\t\t\tvar result=eval('('+result+')');\r\n");
      out.write("\t\t\t\tif(result.errorMsg){\r\n");
      out.write("\t\t\t\t\t$.messager.alert('系统提示',result.errorMsg);\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$.messager.alert('系统提示','密码修改成功，下一次登录生效！');\r\n");
      out.write("\t\t\t\t\tclosePasswordUpdateDialog();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction closePasswordUpdateDialog(){\r\n");
      out.write("\t\t$(\"#dlg\").dialog(\"close\");\r\n");
      out.write("\t\t$(\"#oldPassword\").val(\"\");\r\n");
      out.write("\t\t$(\"#newPassword\").val(\"\");\r\n");
      out.write("\t\t$(\"#newPassword2\").val(\"\");\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("  </head>\r\n");
      out.write(" \r\n");
      out.write("<body class=\"easyui-layout\">\r\n");
      out.write("<div region=\"north\" style=\"height: 68px;\">\r\n");
      out.write("<div style=\"padding: 0px;margin: 0px;background-color: #E0ECFF;\">\r\n");
      out.write("<table>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/mainlogo.png\"/></td>\r\n");
      out.write("\t\t<td valign=\"bottom\">欢迎：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentUser.userName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&nbsp;『");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentUser.roleName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("』</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div region=\"center\">\r\n");
      out.write("\t<div class=\"easyui-tabs\" fit=\"true\" border=\"false\" id=\"tabs\" >\r\n");
      out.write("\t\t<div title=\"首页\" data-options=\"iconCls:'icon-home'\">\r\n");
      out.write("\t\t\t<div align=\"center\" style=\"padding-top: 100px;\"><font color=\"red\" size=\"10\">欢迎使用</font></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div region=\"west\" style=\"width: 160px;padding: 5px;\" title=\"导航菜单\" split=\"true\">\r\n");
      out.write("<ul id=\"tree\" class=\"easyui-tree\"></ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div region=\"south\" style=\"height: 25px;padding: 5px;\" align=\"center\">\r\n");
      out.write("\t合肥鼎真信息科技有限公司 <a href=\"http://www.ttitcn.cn\" target=\"_blank\">http://www.ttitcn.cn</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"dlg\" class=\"easyui-dialog\" style=\"width: 400px;height: 220px;padding: 10px 20px\" \r\n");
      out.write(" closed=\"true\" buttons=\"#dlg-buttons\" data-options=\"iconCls:'icon-modifyPassword'\">\r\n");
      out.write(" <form id=\"fm\" method=\"post\">\r\n");
      out.write(" <input type=\"hidden\" name=\"userId\" id=\"userId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentUser.userId }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write(" \t<table cellspacing=\"4px;\" style=\"text-align:right\">\r\n");
      out.write(" \t\t<tr>\r\n");
      out.write(" \t\t\t<td>用户名：</td>\r\n");
      out.write(" \t\t\t<td><input type=\"text\" name=\"userName\" id=\"userName\" readonly=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentUser.userName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" style=\"width: 200px;\" /></td>\r\n");
      out.write(" \t\t</tr>\r\n");
      out.write(" \t\t<tr>\r\n");
      out.write(" \t\t\t<td>原密码：</td>\r\n");
      out.write(" \t\t\t<td><input type=\"password\" class=\"easyui-validatebox\" name=\"oldPassword\" id=\"oldPassword\" style=\"width: 200px;\" required=\"true\" /></td>\r\n");
      out.write(" \t\t</tr>\r\n");
      out.write(" \t\t<tr>\r\n");
      out.write(" \t\t\t<td>新密码：</td>\r\n");
      out.write(" \t\t\t<td><input type=\"password\" class=\"easyui-validatebox\" name=\"newPassword\" id=\"newPassword\" style=\"width: 200px;\" required=\"true\"  /></td>\r\n");
      out.write(" \t\t</tr>\r\n");
      out.write(" \t\t<tr>\r\n");
      out.write(" \t\t\t<td>确认新密码：</td>\r\n");
      out.write(" \t\t\t<td><input type=\"password\" class=\"easyui-validatebox\" name=\"newPassword2\" id=\"newPassword2\" style=\"width: 200px;\" required=\"true\" /></td>\r\n");
      out.write(" \t\t</tr>\r\n");
      out.write(" \t</table>\r\n");
      out.write(" </form>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"dlg-buttons\" style=\"text-align:center\">\r\n");
      out.write("\t<a href=\"javascript:updatePassword()\" class=\"easyui-linkbutton\" iconCls=\"icon-ok\">保存</a>\r\n");
      out.write("\t<a href=\"javascript:closePasswordUpdateDialog()\" class=\"easyui-linkbutton\" iconCls=\"icon-cancel\">关闭</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 右键菜单 -->\r\n");
      out.write("<div id=\"mm\" class=\"easyui-menu\" style=\"width:150px;\">\r\n");
      out.write("\t\t<div id=\"mm-tabrefresh\">刷新</div>\r\n");
      out.write("\t\t<div class=\"menu-sep\"></div>\r\n");
      out.write("\t\t<div id=\"mm-tabclose\">关闭</div>\r\n");
      out.write("\t\t<div id=\"mm-tabcloseall\">全部关闭</div>\r\n");
      out.write("\t\t<div id=\"mm-tabcloseother\">除此之外全部关闭</div>\r\n");
      out.write("\t\t<div class=\"menu-sep\"></div>\r\n");
      out.write("\t\t<div id=\"mm-tabcloseright\">当前页右侧全部关闭</div>\r\n");
      out.write("\t\t<div id=\"mm-tabcloseleft\">当前页左侧全部关闭</div>\r\n");
      out.write("</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
