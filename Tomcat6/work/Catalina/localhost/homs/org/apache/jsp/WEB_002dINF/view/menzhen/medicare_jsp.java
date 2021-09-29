package org.apache.jsp.WEB_002dINF.view.menzhen;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class medicare_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/common.jsp");
    _jspx_dependants.add("/WEB-INF/privilege.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fprivilege_005foperation_0026_005foperationId_005fonClick_005fname_005ficonCls_005fclazz_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fprivilege_005foperation_0026_005foperationId_005fonClick_005fname_005ficonCls_005fclazz_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fprivilege_005foperation_0026_005foperationId_005fonClick_005fname_005ficonCls_005fclazz_005fnobody.release();
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
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery-easyui-1.3.3/jquery.PrintArea.js\" ></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery-easyui-1.3.3/kz.js\" ></script>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>医保卡主页</title>\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("\t\tvar url;\r\n");
      out.write("\r\n");
      out.write("\t\t// 打开新增信息对话框\r\n");
      out.write("        function openMedicareAddDialog(){\r\n");
      out.write("        \t$(\"#dlg\").dialog(\"open\").dialog(\"setTitle\",\"添加信息\");\r\n");
      out.write("        \turl = 'reserveMedicare.htm';\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\t\t// 打开修改信息对话框\r\n");
      out.write("        function openMedicareUpdateDialog(){\r\n");
      out.write("    \t\tvar selectedRows=$(\"#dg\").datagrid('getSelections');\r\n");
      out.write("    \t\tif(selectedRows.length!=1){\r\n");
      out.write("    \t\t\t$.messager.alert('系统提示','请选择一条要编辑的数据！');\r\n");
      out.write("    \t\t\treturn;\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t\tvar row=selectedRows[0];\r\n");
      out.write("    \t\t$(\"#dlg\").dialog(\"open\").dialog(\"setTitle\",\"修改信息\");\r\n");
      out.write("    \t\t$(\"#fm\").form(\"load\",row);\r\n");
      out.write("    \t\turl=\"reserveMedicare.htm?id=\"+row.id;\r\n");
      out.write("    \t}\r\n");
      out.write("\r\n");
      out.write("        // 保存信息\r\n");
      out.write("        function reserveMedicare(){\r\n");
      out.write("        \t$(\"#fm\").form(\"submit\",{\r\n");
      out.write("    \t\t\turl:url,\r\n");
      out.write("    \t\t\tonSubmit:function(){\r\n");
      out.write("    \t\t\t\treturn $(this).form(\"validate\");\r\n");
      out.write("    \t\t\t},\r\n");
      out.write("    \t\t\tsuccess:function(result){\r\n");
      out.write("    \t\t\t\tvar result=eval('('+result+')');\r\n");
      out.write("    \t\t\t\tif(result.errorMsg){\r\n");
      out.write("    \t\t\t\t\t$.messager.alert('系统提示',\"<font color=red>\"+result.errorMsg+\"</font>\");\r\n");
      out.write("    \t\t\t\t\treturn;\r\n");
      out.write("    \t\t\t\t}else{\r\n");
      out.write("    \t\t\t\t\t$.messager.alert('系统提示','保存成功');\r\n");
      out.write("    \t\t\t\t\tcloseMedicareDialog();\r\n");
      out.write("    \t\t\t\t\t$(\"#dg\").datagrid(\"reload\");\r\n");
      out.write("    \t\t\t\t}\r\n");
      out.write("    \t\t\t}\r\n");
      out.write("    \t\t});\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        // 关闭添加修改对话框\r\n");
      out.write("        function closeMedicareDialog(){\r\n");
      out.write("        \t$(\"#fm\").form('clear');\r\n");
      out.write("        \t$(\"#dlg\").dialog(\"close\");\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("    \t// 删除\r\n");
      out.write("    \tfunction deleteMedicare(){\r\n");
      out.write("    \t\tvar selectedRows=$(\"#dg\").datagrid('getSelections');\r\n");
      out.write("    \t\tif(selectedRows.length==0){\r\n");
      out.write("    \t\t\t$.messager.alert('系统提示','请选择要删除的数据！');\r\n");
      out.write("    \t\t\treturn;\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t\tvar strIds=[];\r\n");
      out.write("    \t\tfor(var i=0;i<selectedRows.length;i++){\r\n");
      out.write("    \t\t\tstrIds.push(selectedRows[i].id);\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t\tvar ids=strIds.join(\",\"); \r\n");
      out.write("    \t\t$.messager.confirm(\"系统提示\",\"您确认要删除这<font color=red>\"+selectedRows.length+\"</font>条数据吗？\",function(r){\r\n");
      out.write("    \t\t\tif(r){\r\n");
      out.write("    \t\t\t\t$.post(\"deleteMedicare.htm\",{ids:ids},function(result){\r\n");
      out.write("    \t\t\t\t\tif(result.success){\r\n");
      out.write("    \t\t\t\t\t\t$.messager.alert('系统提示',\"您已成功删除<font color=red>\"+result.delNums+\"</font>条数据！\");\r\n");
      out.write("    \t\t\t\t\t\t$(\"#dg\").datagrid(\"reload\");\r\n");
      out.write("    \t\t\t\t\t}else{\r\n");
      out.write("    \t\t\t\t\t\t$.messager.alert('系统提示',result.errorMsg);\r\n");
      out.write("    \t\t\t\t\t}\r\n");
      out.write("    \t\t\t\t},\"json\");\r\n");
      out.write("    \t\t\t}\r\n");
      out.write("    \t\t});\r\n");
      out.write("    \t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("    </script>\r\n");
      out.write("    </head>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("<body style=\"margin:1px\">\r\n");
      out.write("\r\n");
      out.write("<!-- 加载数据表格 -->\r\n");
      out.write("<table  id=\"dg\" class=\"easyui-datagrid\" fitColumns=\"true\"\r\n");
      out.write("   \t\t\t\t pagination=\"true\" rownumbers=\"true\" url=\"medicareList.htm\" fit=\"true\" toolbar=\"#tb\">\r\n");
      out.write("        <thead>\r\n");
      out.write("            \t<tr>\r\n");
      out.write("            \t\t<th data-options=\"field:'ck',checkbox:true\"></th>\r\n");
      out.write("                \t<th data-options=\"field:'id',width:80,hidden:true\" align=\"center\"></th>\r\n");
      out.write("                \t<th field=\"name\" width=\"60\" align=\"center\">拥有人</th>\r\n");
      out.write("                \t<th field=\"no\" width=\"60\" align=\"center\">编号</th>\r\n");
      out.write("            \t</tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("</table>\r\n");
      out.write("    \t\r\n");
      out.write("<!-- 数据表格上的搜索和添加等操作按钮 -->\r\n");
      out.write("<div id=\"tb\" >\r\n");
      out.write("\t<div class=\"updownInterval\"> </div>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t");
      if (_jspx_meth_privilege_005foperation_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_privilege_005foperation_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_privilege_005foperation_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"updownInterval\"> </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 新增和修改对话框 -->\r\n");
      out.write("<div id=\"dlg\" class=\"easyui-dialog\" style=\"text-align:right;width: 320px;height: 220px;padding: 10px 20px\"\r\n");
      out.write("  \t\tclosed=\"true\" buttons=\"#dlg-buttons\">\r\n");
      out.write(" <form id=\"fm\" method=\"post\">\r\n");
      out.write(" \t<table cellspacing=\"5px;\">\r\n");
      out.write("  \t\t<tr>\r\n");
      out.write("  \t\t\t<td>拥有人</td>\r\n");
      out.write("  \t\t\t<td><input type=\"text\" id=\"name\" name=\"name\" class=\"easyui-validatebox\" required=\"true\"/></td>\r\n");
      out.write("  \t\t</tr>\r\n");
      out.write("  \t\t<tr>\r\n");
      out.write("  \t\t\t<td>编号</td>\r\n");
      out.write("  \t\t\t<td><input type=\"text\" id=\"no\" name=\"no\" class=\"easyui-validatebox\" required=\"true\"/></td>\r\n");
      out.write("  \t\t</tr>\r\n");
      out.write("  \t</table>\r\n");
      out.write(" </form>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"dlg-buttons\" style=\"text-align:center\">\r\n");
      out.write("\t<a href=\"javascript:reserveMedicare()\" class=\"easyui-linkbutton\" iconCls=\"icon-ok\">保存</a>\r\n");
      out.write("\t<a href=\"javascript:closeMedicareDialog()\" class=\"easyui-linkbutton\" iconCls=\"icon-cancel\">关闭</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_privilege_005foperation_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  privilege:operation
    dingzhen.tag.PrivilegeTag _jspx_th_privilege_005foperation_005f0 = (dingzhen.tag.PrivilegeTag) _005fjspx_005ftagPool_005fprivilege_005foperation_0026_005foperationId_005fonClick_005fname_005ficonCls_005fclazz_005fnobody.get(dingzhen.tag.PrivilegeTag.class);
    _jspx_th_privilege_005foperation_005f0.setPageContext(_jspx_page_context);
    _jspx_th_privilege_005foperation_005f0.setParent(null);
    // /WEB-INF/view/menzhen/medicare.jsp(110,2) name = operationId type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f0.setOperationId("100028");
    // /WEB-INF/view/menzhen/medicare.jsp(110,2) name = clazz type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f0.setClazz("easyui-linkbutton");
    // /WEB-INF/view/menzhen/medicare.jsp(110,2) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f0.setOnClick("openMedicareAddDialog()");
    // /WEB-INF/view/menzhen/medicare.jsp(110,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f0.setName("添加");
    // /WEB-INF/view/menzhen/medicare.jsp(110,2) name = iconCls type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f0.setIconCls("icon-add");
    int _jspx_eval_privilege_005foperation_005f0 = _jspx_th_privilege_005foperation_005f0.doStartTag();
    if (_jspx_th_privilege_005foperation_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fprivilege_005foperation_0026_005foperationId_005fonClick_005fname_005ficonCls_005fclazz_005fnobody.reuse(_jspx_th_privilege_005foperation_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fprivilege_005foperation_0026_005foperationId_005fonClick_005fname_005ficonCls_005fclazz_005fnobody.reuse(_jspx_th_privilege_005foperation_005f0);
    return false;
  }

  private boolean _jspx_meth_privilege_005foperation_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  privilege:operation
    dingzhen.tag.PrivilegeTag _jspx_th_privilege_005foperation_005f1 = (dingzhen.tag.PrivilegeTag) _005fjspx_005ftagPool_005fprivilege_005foperation_0026_005foperationId_005fonClick_005fname_005ficonCls_005fclazz_005fnobody.get(dingzhen.tag.PrivilegeTag.class);
    _jspx_th_privilege_005foperation_005f1.setPageContext(_jspx_page_context);
    _jspx_th_privilege_005foperation_005f1.setParent(null);
    // /WEB-INF/view/menzhen/medicare.jsp(111,2) name = operationId type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f1.setOperationId("100029");
    // /WEB-INF/view/menzhen/medicare.jsp(111,2) name = clazz type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f1.setClazz("easyui-linkbutton");
    // /WEB-INF/view/menzhen/medicare.jsp(111,2) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f1.setOnClick("openMedicareUpdateDialog()");
    // /WEB-INF/view/menzhen/medicare.jsp(111,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f1.setName("修改");
    // /WEB-INF/view/menzhen/medicare.jsp(111,2) name = iconCls type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f1.setIconCls("icon-edit");
    int _jspx_eval_privilege_005foperation_005f1 = _jspx_th_privilege_005foperation_005f1.doStartTag();
    if (_jspx_th_privilege_005foperation_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fprivilege_005foperation_0026_005foperationId_005fonClick_005fname_005ficonCls_005fclazz_005fnobody.reuse(_jspx_th_privilege_005foperation_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fprivilege_005foperation_0026_005foperationId_005fonClick_005fname_005ficonCls_005fclazz_005fnobody.reuse(_jspx_th_privilege_005foperation_005f1);
    return false;
  }

  private boolean _jspx_meth_privilege_005foperation_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  privilege:operation
    dingzhen.tag.PrivilegeTag _jspx_th_privilege_005foperation_005f2 = (dingzhen.tag.PrivilegeTag) _005fjspx_005ftagPool_005fprivilege_005foperation_0026_005foperationId_005fonClick_005fname_005ficonCls_005fclazz_005fnobody.get(dingzhen.tag.PrivilegeTag.class);
    _jspx_th_privilege_005foperation_005f2.setPageContext(_jspx_page_context);
    _jspx_th_privilege_005foperation_005f2.setParent(null);
    // /WEB-INF/view/menzhen/medicare.jsp(112,2) name = operationId type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f2.setOperationId("100030");
    // /WEB-INF/view/menzhen/medicare.jsp(112,2) name = clazz type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f2.setClazz("easyui-linkbutton");
    // /WEB-INF/view/menzhen/medicare.jsp(112,2) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f2.setOnClick("deleteMedicare()()");
    // /WEB-INF/view/menzhen/medicare.jsp(112,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f2.setName("删除");
    // /WEB-INF/view/menzhen/medicare.jsp(112,2) name = iconCls type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f2.setIconCls("icon-remove");
    int _jspx_eval_privilege_005foperation_005f2 = _jspx_th_privilege_005foperation_005f2.doStartTag();
    if (_jspx_th_privilege_005foperation_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fprivilege_005foperation_0026_005foperationId_005fonClick_005fname_005ficonCls_005fclazz_005fnobody.reuse(_jspx_th_privilege_005foperation_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fprivilege_005foperation_0026_005foperationId_005fonClick_005fname_005ficonCls_005fclazz_005fnobody.reuse(_jspx_th_privilege_005foperation_005f2);
    return false;
  }
}
