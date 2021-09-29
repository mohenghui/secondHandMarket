package org.apache.jsp.WEB_002dINF.view.jiuzhen;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class recipe_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>配方主页</title>\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    \r\n");
      out.write("        \r\n");
      out.write("\t\tvar url;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction searchRecipe(){\r\n");
      out.write("    \t\t$('#dg').datagrid('load',{\r\n");
      out.write("    \t\t\tstatus:$('#s_status').val()\r\n");
      out.write("    \t\t});\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("\t\t// 打开新增\r\n");
      out.write("        function openRecipeAddDialog(){\r\n");
      out.write("        \t$(\"#dlg\").dialog(\"open\").dialog(\"setTitle\",\"添加信息\");\r\n");
      out.write("        \turl = 'reserveRecipe.htm';\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\t\t// 打开修改\r\n");
      out.write("        function openRecipeUpdateDialog(){\r\n");
      out.write("    \t\tvar selectedRows=$(\"#dg\").datagrid('getSelections');\r\n");
      out.write("    \t\tif(selectedRows.length!=1){\r\n");
      out.write("    \t\t\t$.messager.alert('系统提示','请选择一条要编辑的数据！');\r\n");
      out.write("    \t\t\treturn;\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t\tvar row=selectedRows[0];\r\n");
      out.write("    \t\t$(\"#dlg\").dialog(\"open\").dialog(\"setTitle\",\"修改信息\");\r\n");
      out.write("    \t\t$(\"#fm\").form(\"load\",row);\r\n");
      out.write("    \t\turl=\"reserveRecipe.htm?id=\"+row.id;\r\n");
      out.write("    \t}\r\n");
      out.write("\r\n");
      out.write("\t\t//改变收费状态\r\n");
      out.write("\t\tfunction changeStatus(){\r\n");
      out.write("\t\t\tvar selectedRows=$(\"#dg\").datagrid('getSelections');\r\n");
      out.write("    \t\tif(selectedRows.length!=1){\r\n");
      out.write("    \t\t\t$.messager.alert('系统提示','请选择一条要编辑的数据！');\r\n");
      out.write("    \t\t\treturn;\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t\tvar row=selectedRows[0];\r\n");
      out.write("    \t\tif(row.status=='1'){\r\n");
      out.write("    \t\t\t$.messager.alert('系统提示','已收费');return;\r\n");
      out.write("    \t\t} else {\r\n");
      out.write("    \t\t\tconsole.log(1);\r\n");
      out.write("    \t\t\t$.ajax({\r\n");
      out.write("    \t\t\t\turl:'changeStatus.htm',\r\n");
      out.write("    \t\t\t\tdata:{id:row.id,mids:row.mids},\r\n");
      out.write("    \t\t\t\tdataType:'json',\r\n");
      out.write("    \t\t\t\ttype:'post',\r\n");
      out.write("    \t\t\t\tsuccess:function(result){\r\n");
      out.write("    \t\t\t\t\tif(result.success){\r\n");
      out.write("    \t\t\t\t\t\t$.messager.alert('系统提示',\"收费成功\");\r\n");
      out.write("    \t\t\t\t\t\t$(\"#dg\").datagrid(\"reload\");\r\n");
      out.write("    \t\t\t\t\t}else{\r\n");
      out.write("    \t\t\t\t\t\t$.messager.alert('系统提示',result.errorMsg);\r\n");
      out.write("    \t\t\t\t\t}\r\n");
      out.write("    \t\t\t\t}\r\n");
      out.write("    \t\t\t});\r\n");
      out.write("    \t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        // 保存\r\n");
      out.write("        function reserveRecipe(){\r\n");
      out.write("        \tvar r = $(\"#registerid\").combobox('getValue');\r\n");
      out.write("        \tif(r==null || r.length==0){\r\n");
      out.write("        \t\t$.messager.alert('系统提示',\"请选择\");\r\n");
      out.write("        \t}\r\n");
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
      out.write("    \t\t\t\t\tcloseRecipeDialog();\r\n");
      out.write("    \t\t\t\t\t$(\"#dg\").datagrid(\"reload\");\r\n");
      out.write("    \t\t\t\t}\r\n");
      out.write("    \t\t\t}\r\n");
      out.write("    \t\t});\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        // 关闭添加修改对话框\r\n");
      out.write("        function closeRecipeDialog(){\r\n");
      out.write("        \t$(\"#fm\").form('clear');\r\n");
      out.write("        \t$(\"#dlg\").dialog(\"close\");\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("    \t// 删除科室\r\n");
      out.write("    \tfunction deleteRecipe(){\r\n");
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
      out.write("    \t\t\t\t$.post(\"deleteRecipe.htm\",{ids:ids},function(result){\r\n");
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
      out.write("\t\t\r\n");
      out.write("\t\tfunction printRecipe(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\tvar selectedRows=$(\"#dg\").datagrid('getSelections');\r\n");
      out.write("    \t\tif(selectedRows.length!=1){\r\n");
      out.write("    \t\t\t$.messager.alert('系统提示','请选择一条要打印的数据！');\r\n");
      out.write("    \t\t\treturn;\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t\tvar row=selectedRows[0];\r\n");
      out.write("    \t\tvar str = \"\";         // 组装成一个table来打印\r\n");
      out.write("    \t\tstr += \"<table cellspacing='5px;'>\";\r\n");
      out.write("\t\t\tstr += \"<tr><td>姓名</td>\";\r\n");
      out.write("  \t\t\tstr += \"<td><input value='\"+row.register.name+\"'  /></td>\";\r\n");
      out.write("  \t\t\tstr += \"</tr><tr><td>性别</td>\";\r\n");
      out.write("  \t\t\tstr += \"<td><input value='\"+row.register.sex+\"' /></td>\";\r\n");
      out.write("  \t\t\tstr += \"</tr><tr><td>年龄</td>\";\r\n");
      out.write("  \t\t\tstr += \"<td><input value='\"+row.register.age+\"'/></td>\";\r\n");
      out.write("  \t\t\tstr += \"</tr><tr><td>配药</td>\";\r\n");
      out.write("  \t\t\tstr += \"<td><input value='\"+row.mnames+\"'/></td>\";\r\n");
      out.write("  \t\t\tstr += \"</tr><tr><td>详情</td>\";\r\n");
      out.write("  \t\t\tstr += \"<td><input value='\"+row.remarks+\"'/></td>\";\r\n");
      out.write("  \t\t\tstr += \"</tr></table>\";\r\n");
      out.write("    \t\tdocument.body.innerHTML=str;\r\n");
      out.write("\t\t\twindow.print(); \r\n");
      out.write("\t\t\twindow.location.href=window.location.href;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t function openMedicineChooseDialog(){\r\n");
      out.write("        \t$(\"#dlg2\").dialog(\"open\").dialog(\"setTitle\",\"选择药品\");\r\n");
      out.write("        \t$(\"#dg2\").datagrid(\"reload\");\r\n");
      out.write("        }\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction chooseMedicine(){\r\n");
      out.write("\t\t\tvar selectedRows=$(\"#dg2\").datagrid('getSelections');\r\n");
      out.write("    \t\tvar money = 0;\r\n");
      out.write("    \t\tvar mids =\"\";\r\n");
      out.write("    \t\tvar mnames = \"\";\r\n");
      out.write("    \t\tfor(var i=0;i<selectedRows.length;i++){\r\n");
      out.write("\t    \t\tvar row=selectedRows[i];\r\n");
      out.write("    \t\t\tmoney += row.price;\r\n");
      out.write("    \t\t\tmids += (\",\" + row.id );\r\n");
      out.write("    \t\t\tmnames += (\",\" + row.name );\r\n");
      out.write("    \t\t\t\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t\t$(\"#total\").val(money);\r\n");
      out.write("    \t\t$(\"#mids\").val(mids.substring(1));\r\n");
      out.write("    \t\t$(\"#mnames\").val(mnames.substring(1));\r\n");
      out.write("    \t\tcloseMedicineDialog();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction closeMedicineDialog(){\r\n");
      out.write("    \t\t$(\"#dlg2\").dialog(\"close\");\r\n");
      out.write("    \t}\r\n");
      out.write("\t\t\r\n");
      out.write("    </script>\r\n");
      out.write("    </head>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("<body style=\"margin:1px\">\r\n");
      out.write("\r\n");
      out.write("<!-- 加载数据表格 -->\r\n");
      out.write("<table  id=\"dg\" class=\"easyui-datagrid\" fitColumns=\"true\"\r\n");
      out.write("   \t\t\t\t pagination=\"true\" rownumbers=\"true\" url=\"recipeList.htm\" fit=\"true\" toolbar=\"#tb\"\r\n");
      out.write("   \t\t\t\t data-options=\"\r\n");
      out.write("   \t\t\t\t \t onLoadSuccess: function (data) {\r\n");
      out.write("\r\n");
      out.write("                 \t\t\t$(this).datagrid('doCellTip', { 'max-width': '400px', 'delay': 500 });\r\n");
      out.write("           \t\t\t\t}\r\n");
      out.write("   \t\t\t\t \">\r\n");
      out.write("        <thead>\r\n");
      out.write("            \t<tr>\r\n");
      out.write("            \t\t<th data-options=\"field:'ck',checkbox:true\"></th>\r\n");
      out.write("                \t<th data-options=\"field:'id',width:80,hidden:true\" align=\"center\"></th>\r\n");
      out.write("                \t<th field=\"register\" width=\"20\" align=\"center\" formatter=\"formatName\">姓名</th>\r\n");
      out.write("                \t<th field=\"mnames\" width=\"80\" align=\"center\">配药</th>\r\n");
      out.write("                \t<th field=\"remarks\" width=\"80\" align=\"center\">其他</th>\r\n");
      out.write("                \t<th field=\"status\" width=\"80\" align=\"center\" formatter=\"formatStatus\">状态</th>\r\n");
      out.write("            \t</tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("</table>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction formatName(value){\r\n");
      out.write("\t\treturn value.name;\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction formatAge(value){\r\n");
      out.write("\t\treturn value.age;\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction formatSex(value){\r\n");
      out.write("\t\treturn value.sex;\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction formatStatus(value){\r\n");
      out.write("\t\tif(value==0){\r\n");
      out.write("\t\t\treturn \"未收费\";\r\n");
      out.write("\t\t} else{\r\n");
      out.write("\t\t\treturn \"已收费\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
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
      out.write("\t\t");
      if (_jspx_meth_privilege_005foperation_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_privilege_005foperation_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"updownInterval\"> </div>\r\n");
      out.write("\t&nbsp;&nbsp;收费状态\r\n");
      out.write("\t<select id=\"s_status\">\r\n");
      out.write("\t\t<option value=''>全部</option>\r\n");
      out.write("\t\t<option value='0'>未收费</option>\r\n");
      out.write("\t\t<option value='1'>已收费</option>\r\n");
      out.write("\t</select>\r\n");
      out.write("\t<a href=\"javascript:searchRecipe()\" class=\"easyui-linkbutton\" iconCls=\"icon-search\" >搜索</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 新增和修改对话框 -->\r\n");
      out.write("<div id=\"dlg\" class=\"easyui-dialog\" style=\"text-align:right;width: 520px;height: 400px;padding: 10px 20px\"\r\n");
      out.write("  \t\tclosed=\"true\" buttons=\"#dlg-buttons\">\r\n");
      out.write(" <form id=\"fm\" method=\"post\">\r\n");
      out.write(" \t<table cellspacing=\"5px;\">\r\n");
      out.write("  \t\t<tr>\r\n");
      out.write("  \t\t\t<td>挂号信息</td>\r\n");
      out.write("  \t\t\t<td><input class=\"easyui-combobox\" name=\"registerid\" id=\"registerid\"  size=\"20\" data-options=\"editable:false,panelHeight:'auto',valueField:'id',textField:'name',url:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/register/comboList.htm'\"/></td>\r\n");
      out.write("  \t\t</tr>\r\n");
      out.write("  \t\t<tr>\r\n");
      out.write("  \t\t<tr>\r\n");
      out.write("  \t\t\t<td>选药</td>\r\n");
      out.write("  \t\t\t<td onclick=\"openMedicineChooseDialog()\"><input type=\"hidden\" id=\"mids\" name=\"mids\" />点击选择</td>\r\n");
      out.write("  \t\t</tr>\t\r\n");
      out.write("  \t\t<tr>\r\n");
      out.write("  \t\t\t<td>选择的药品</td>\r\n");
      out.write("  \t\t\t<td ><input  id=\"mnames\" name=\"mnames\" style=\"width:300px\"/></td>\r\n");
      out.write("  \t\t</tr>\r\n");
      out.write("  \t\t<tr>\r\n");
      out.write("  \t\t</tr>\r\n");
      out.write("  \t\t<tr>\r\n");
      out.write("  \t\t\t<td>其他</td>\r\n");
      out.write("  \t\t\t<td rowspan=\"3\">\r\n");
      out.write("  \t\t\t\t<textarea name=\"remarks\" rows=\"10px\" cols=\"20px\"></textarea>\r\n");
      out.write("  \t\t\t</td>\r\n");
      out.write("  \t\t</tr>\r\n");
      out.write("  \t\t<input type=\"hidden\"  name=\"total\" id=\"total\"/>\r\n");
      out.write("  \t</table>\r\n");
      out.write(" </form>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"dlg-buttons\" style=\"text-align:center\">\r\n");
      out.write("\t<a href=\"javascript:reserveRecipe()\" class=\"easyui-linkbutton\" iconCls=\"icon-ok\">保存</a>\r\n");
      out.write("\t<a href=\"javascript:closeRecipeDialog()\" class=\"easyui-linkbutton\" iconCls=\"icon-cancel\">关闭</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"dlg2\" class=\"easyui-dialog\" iconCls=\"icon-search\" style=\"width: 500px;height: 480px;padding: 10px 20px\"\r\n");
      out.write("  closed=\"true\" buttons=\"#dlg2-buttons\">\r\n");
      out.write("  \t<table id=\"dg2\"class=\"easyui-datagrid\" fitColumns=\"true\" rownumbers=\"true\" url=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/medicine/medicineList.htm?page=1&rows=9999\" fit=\"true\" >\r\n");
      out.write("    <thead>\r\n");
      out.write("    \t<tr>\r\n");
      out.write("    \t\t<th data-options=\"field:'ck',checkbox:true\"></th>\r\n");
      out.write("    \t\t<th field=\"id\" width=\"50\" align=\"center\">编号</th>\r\n");
      out.write("    \t\t<th field=\"name\" width=\"100\" align=\"center\">药品名称</th>\r\n");
      out.write("    \t\t<th field=\"price\" width=\"200\" align=\"center\">价格</th>\r\n");
      out.write("    \t</tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"dlg2-buttons\">\r\n");
      out.write("\t<a href=\"javascript:chooseMedicine()\" class=\"easyui-linkbutton\" iconCls=\"icon-ok\" >确定</a>\r\n");
      out.write("\t<a href=\"javascript:closeMedicineDialog()\" class=\"easyui-linkbutton\" iconCls=\"icon-cancel\" >关闭</a>\r\n");
      out.write("</div>\r\n");
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
    // /WEB-INF/view/jiuzhen/recipe.jsp(233,2) name = operationId type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f0.setOperationId("100037");
    // /WEB-INF/view/jiuzhen/recipe.jsp(233,2) name = clazz type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f0.setClazz("easyui-linkbutton");
    // /WEB-INF/view/jiuzhen/recipe.jsp(233,2) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f0.setOnClick("openRecipeAddDialog()");
    // /WEB-INF/view/jiuzhen/recipe.jsp(233,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f0.setName("添加");
    // /WEB-INF/view/jiuzhen/recipe.jsp(233,2) name = iconCls type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/view/jiuzhen/recipe.jsp(234,2) name = operationId type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f1.setOperationId("100038");
    // /WEB-INF/view/jiuzhen/recipe.jsp(234,2) name = clazz type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f1.setClazz("easyui-linkbutton");
    // /WEB-INF/view/jiuzhen/recipe.jsp(234,2) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f1.setOnClick("openRecipeUpdateDialog()");
    // /WEB-INF/view/jiuzhen/recipe.jsp(234,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f1.setName("修改");
    // /WEB-INF/view/jiuzhen/recipe.jsp(234,2) name = iconCls type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/view/jiuzhen/recipe.jsp(235,2) name = operationId type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f2.setOperationId("100039");
    // /WEB-INF/view/jiuzhen/recipe.jsp(235,2) name = clazz type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f2.setClazz("easyui-linkbutton");
    // /WEB-INF/view/jiuzhen/recipe.jsp(235,2) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f2.setOnClick("deleteRecipe()");
    // /WEB-INF/view/jiuzhen/recipe.jsp(235,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f2.setName("删除");
    // /WEB-INF/view/jiuzhen/recipe.jsp(235,2) name = iconCls type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f2.setIconCls("icon-remove");
    int _jspx_eval_privilege_005foperation_005f2 = _jspx_th_privilege_005foperation_005f2.doStartTag();
    if (_jspx_th_privilege_005foperation_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fprivilege_005foperation_0026_005foperationId_005fonClick_005fname_005ficonCls_005fclazz_005fnobody.reuse(_jspx_th_privilege_005foperation_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fprivilege_005foperation_0026_005foperationId_005fonClick_005fname_005ficonCls_005fclazz_005fnobody.reuse(_jspx_th_privilege_005foperation_005f2);
    return false;
  }

  private boolean _jspx_meth_privilege_005foperation_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  privilege:operation
    dingzhen.tag.PrivilegeTag _jspx_th_privilege_005foperation_005f3 = (dingzhen.tag.PrivilegeTag) _005fjspx_005ftagPool_005fprivilege_005foperation_0026_005foperationId_005fonClick_005fname_005ficonCls_005fclazz_005fnobody.get(dingzhen.tag.PrivilegeTag.class);
    _jspx_th_privilege_005foperation_005f3.setPageContext(_jspx_page_context);
    _jspx_th_privilege_005foperation_005f3.setParent(null);
    // /WEB-INF/view/jiuzhen/recipe.jsp(236,2) name = operationId type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f3.setOperationId("100040");
    // /WEB-INF/view/jiuzhen/recipe.jsp(236,2) name = clazz type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f3.setClazz("easyui-linkbutton");
    // /WEB-INF/view/jiuzhen/recipe.jsp(236,2) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f3.setOnClick("printRecipe()");
    // /WEB-INF/view/jiuzhen/recipe.jsp(236,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f3.setName("打印");
    // /WEB-INF/view/jiuzhen/recipe.jsp(236,2) name = iconCls type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f3.setIconCls("icon-redo");
    int _jspx_eval_privilege_005foperation_005f3 = _jspx_th_privilege_005foperation_005f3.doStartTag();
    if (_jspx_th_privilege_005foperation_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fprivilege_005foperation_0026_005foperationId_005fonClick_005fname_005ficonCls_005fclazz_005fnobody.reuse(_jspx_th_privilege_005foperation_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fprivilege_005foperation_0026_005foperationId_005fonClick_005fname_005ficonCls_005fclazz_005fnobody.reuse(_jspx_th_privilege_005foperation_005f3);
    return false;
  }

  private boolean _jspx_meth_privilege_005foperation_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  privilege:operation
    dingzhen.tag.PrivilegeTag _jspx_th_privilege_005foperation_005f4 = (dingzhen.tag.PrivilegeTag) _005fjspx_005ftagPool_005fprivilege_005foperation_0026_005foperationId_005fonClick_005fname_005ficonCls_005fclazz_005fnobody.get(dingzhen.tag.PrivilegeTag.class);
    _jspx_th_privilege_005foperation_005f4.setPageContext(_jspx_page_context);
    _jspx_th_privilege_005foperation_005f4.setParent(null);
    // /WEB-INF/view/jiuzhen/recipe.jsp(237,2) name = operationId type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f4.setOperationId("100039");
    // /WEB-INF/view/jiuzhen/recipe.jsp(237,2) name = clazz type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f4.setClazz("easyui-linkbutton");
    // /WEB-INF/view/jiuzhen/recipe.jsp(237,2) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f4.setOnClick("changeStatus()");
    // /WEB-INF/view/jiuzhen/recipe.jsp(237,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f4.setName("收费");
    // /WEB-INF/view/jiuzhen/recipe.jsp(237,2) name = iconCls type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f4.setIconCls("icon-redo");
    int _jspx_eval_privilege_005foperation_005f4 = _jspx_th_privilege_005foperation_005f4.doStartTag();
    if (_jspx_th_privilege_005foperation_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fprivilege_005foperation_0026_005foperationId_005fonClick_005fname_005ficonCls_005fclazz_005fnobody.reuse(_jspx_th_privilege_005foperation_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fprivilege_005foperation_0026_005foperationId_005fonClick_005fname_005ficonCls_005fclazz_005fnobody.reuse(_jspx_th_privilege_005foperation_005f4);
    return false;
  }
}
