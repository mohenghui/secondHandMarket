package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>菜单主页</title>\r\n");
      out.write("   \r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar url;   // 菜单添加和修改的url\r\n");
      out.write("\tvar url2;  // 按钮添加和修改的url\r\n");
      out.write("\t\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$('#treeGrid').treegrid({\r\n");
      out.write("\t\t\turl:'treeGridMenu.htm?parentId=-1',\r\n");
      out.write("\t\t\tonLoadSuccess:function(){\r\n");
      out.write("\t\t\t\t$(\"#treeGrid\").treegrid('expandAll');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$('#dlg').dialog({\r\n");
      out.write("\t\t    onClose:function(){\r\n");
      out.write("\t\t\t\t$(\"#fm\").form('clear');\r\n");
      out.write("\t\t\t\t$(\"#iconCls\").val(\"icon-item\");\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$('#operationReserveDlg').dialog({\r\n");
      out.write("\t\t    onClose:function(){\r\n");
      out.write("\t\t\t\t$(\"#fm2\").form('clear');\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tfunction formatIconCls(value,row,index){\r\n");
      out.write("\t\treturn \"<div class=\"+value+\">&nbsp;</div>\";\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction openMenuAddDialog(){\r\n");
      out.write("\t\tvar node=$('#treeGrid').treegrid('getSelected');\r\n");
      out.write("\t\tif(node==null){\r\n");
      out.write("\t\t\t$.messager.alert('系统提示','请选择一个父菜单节点！');\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t$(\"#dlg\").dialog(\"open\").dialog(\"setTitle\",\"添加菜单\");\r\n");
      out.write("\t\turl=\"reserveMenu.htm?parentId=\"+node.id;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\tfunction openMenuUpdateDialog(){\r\n");
      out.write("\t\tvar node=$('#treeGrid').treegrid('getSelected');\r\n");
      out.write("\t\tif(node==null){\r\n");
      out.write("\t\t\t$.messager.alert('系统提示','请选择一个要修改的菜单！');\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t$(\"#dlg\").dialog(\"open\").dialog(\"setTitle\",\"修改菜单\");\r\n");
      out.write("\t\t$(\"#fm\").form(\"load\",node);\r\n");
      out.write("\t\t$(\"#menuName\").val(node.text);\r\n");
      out.write("\t\turl=\"reserveMenu.htm?menuId=\"+node.id;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction deleteMenu(){\r\n");
      out.write("\t\tvar node=$(\"#treeGrid\").treegrid('getSelected');\r\n");
      out.write("\t\tif(node==null){\r\n");
      out.write("\t\t\t$.messager.alert('系统提示','请选择一个要删除的菜单节点！');\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar parentNode=$(\"#treeGrid\").treegrid('getParent',node.id);\r\n");
      out.write("\t\t$.messager.confirm(\"系统提示\",\"您确认要删除这个菜单节点吗?\",function(r){\r\n");
      out.write("\t\t\tif(r){\r\n");
      out.write("\t\t\t\t$.post(\"deleteMenu.htm\",{menuId:node.id,parentId:parentNode.id},function(result){\r\n");
      out.write("\t\t\t\t\tif(result.success){\r\n");
      out.write("\t\t\t\t\t\t$.messager.alert('系统提示',\"您已成功删除这个菜单节点！\");\r\n");
      out.write("\t\t\t\t\t\t$(\"#treeGrid\").treegrid(\"reload\");\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t$.messager.alert('系统提示',result.errorMsg);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\"json\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction reserveMenu(){\r\n");
      out.write("\t\t$(\"#fm\").form(\"submit\",{\r\n");
      out.write("\t\t\turl:url,\r\n");
      out.write("\t\t\tonSubmit:function(){\r\n");
      out.write("\t\t\t\treturn $(this).form(\"validate\");\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tsuccess:function(result){\r\n");
      out.write("\t\t\t\tvar result=eval('('+result+')');\r\n");
      out.write("\t\t\t\tif(result.errorMsg){\r\n");
      out.write("\t\t\t\t\t$.messager.alert('系统提示',\"<font color=red>\"+result.errorMsg+\"</font>\");\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$.messager.alert('系统提示','保存成功');\r\n");
      out.write("\t\t\t\t\t$('#treeGrid').treegrid('reload');\r\n");
      out.write("\t\t\t\t\tcloseMenuDialog();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction closeMenuDialog(){\r\n");
      out.write("\t\t$(\"#dlg\").dialog(\"close\");\r\n");
      out.write("\t\t$(\"#fm\").form('clear');\r\n");
      out.write("\t\t$(\"#iconCls\").val(\"icon-item\");\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tfunction openOperationDialog(){\r\n");
      out.write("\t\tvar selectedRows=$(\"#treeGrid\").treegrid('getSelections');\r\n");
      out.write("\t\tif(selectedRows.length!=1){\r\n");
      out.write("\t\t\t$.messager.alert('系统提示','请选择一条要编辑的数据！');\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar row=selectedRows[0];\r\n");
      out.write("\t\t$(\"#operationDlg\").dialog(\"open\").dialog(\"setTitle\",\"按钮管理\");\r\n");
      out.write("\t\tvar url = \"../operation/operationList.htm?menuId=\"+row.id;\r\n");
      out.write("\t\t$('#operationTable').datagrid({       \r\n");
      out.write("\t\t        nowrap : false,//设置为true，当数据长度超出列宽时将会自动截取  \r\n");
      out.write("\t\t        striped : true,//设置为true将交替显示行背景。  \r\n");
      out.write("\t\t        collapsible : true,//显示可折叠按钮 \r\n");
      out.write("\t\t    \turl:url,//url调用Action方法  \r\n");
      out.write("\t\t        singleSelect:false,//为true时只能选择单行  \r\n");
      out.write("\t\t        fitColumns:true,//允许表格自动缩放，以适应父容器  \r\n");
      out.write("\t\t        remoteSort : false, \r\n");
      out.write("\t\t        pagination : true,//分页  \r\n");
      out.write("\t\t        rownumbers : true//行数  \r\n");
      out.write("\t\t });   \r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tfunction openOperationAddDialog(){\r\n");
      out.write("\t\tvar node=$('#treeGrid').treegrid('getSelected');\r\n");
      out.write("\t\tif(node==null){\r\n");
      out.write("\t\t\t$.messager.alert('系统提示','请选择一个父菜单节点！');\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t$(\"#o_menuName\").val(node.text);\r\n");
      out.write("\t\t$(\"#o_menuId\").val(node.id);\r\n");
      out.write("\t\t$(\"#operationReserveDlg\").dialog(\"open\").dialog(\"setTitle\",\"添加菜单\");\r\n");
      out.write("\t\turl2=\"../operation/reserveOperation.htm\";\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction openOperationUpdateDialog(){\r\n");
      out.write("\t\tvar selectedRows=$(\"#operationTable\").datagrid('getSelections');\r\n");
      out.write("\t\tif(selectedRows.length!=1){\r\n");
      out.write("\t\t\t$.messager.alert('系统提示','请选择一条要编辑的数据！');\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar row=selectedRows[0];\r\n");
      out.write("\t\t$(\"#operationReserveDlg\").dialog(\"open\").dialog(\"setTitle\",\"修改角色信息\");\r\n");
      out.write("\t\t$(\"#fm2\").form(\"load\",row);\r\n");
      out.write("\t\t$(\"#o_menuName\").attr(\"readonly\",\"readonly\");\r\n");
      out.write("\t\turl2=\"../operation/reserveOperation.htm?operationId=\"+row.operationId;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tfunction reserveOperation(){\r\n");
      out.write("\t\t$(\"#fm2\").form(\"submit\",{\r\n");
      out.write("\t\t\turl:url2,\r\n");
      out.write("\t\t\tonSubmit:function(){\r\n");
      out.write("\t\t\t\treturn $(this).form(\"validate\");\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tsuccess:function(result){\r\n");
      out.write("\t\t\t\tvar result=eval('('+result+')');\r\n");
      out.write("\t\t\t\tif(result.errorMsg){\r\n");
      out.write("\t\t\t\t\t$.messager.alert('系统提示',\"<font color=red>\"+result.errorMsg+\"</font>\");\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$.messager.alert('系统提示','保存成功');\r\n");
      out.write("\t\t\t\t\t$(\"#operationTable\").datagrid(\"reload\");\r\n");
      out.write("\t\t\t\t\tcloseOperationReserveDialog();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tfunction closeOperationReserveDialog(){\r\n");
      out.write("\t\t$(\"#operationReserveDlg\").dialog(\"close\");\r\n");
      out.write("\t\t$(\"#fm2\").form('clear');\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction deleteOperation(){\r\n");
      out.write("\t\tvar selectedRows=$(\"#operationTable\").datagrid('getSelections');\r\n");
      out.write("\t\tif(selectedRows.length==0){\r\n");
      out.write("\t\t\t$.messager.alert('系统提示','请选择要删除的数据！');\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t} \r\n");
      out.write("\t\tvar strIds=[];\r\n");
      out.write("\t\tfor(var i=0;i<selectedRows.length;i++){\r\n");
      out.write("\t\t\tstrIds.push(selectedRows[i].operationId);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar ids=strIds.join(\",\");\r\n");
      out.write("\t\t$.messager.confirm(\"系统提示\",\"您确认要删除这<font color=red>\"+selectedRows.length+\"</font>条数据吗？\",function(r){\r\n");
      out.write("\t\t\tif(r){\r\n");
      out.write("\t\t\t\t$.post(\"../operation/deleteOperation.htm\",{ids:ids},function(result){\r\n");
      out.write("\t\t\t\t\tif(result.success){\r\n");
      out.write("\t\t\t\t\t\t$.messager.alert('系统提示',\"您已成功删除<font color=red>\"+result.delNums+\"</font>条数据！\");\r\n");
      out.write("\t\t\t\t\t\t$(\"#operationTable\").datagrid(\"reload\");\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t$.messager.alert('系统提示','<font color=red>'+selectedRows[result.errorIndex].roleName+'</font>'+result.errorMsg);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\"json\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"margin: 1px;\">\r\n");
      out.write("\r\n");
      out.write("<!-- 菜单显示主页面 -->\r\n");
      out.write("<table id=\"treeGrid\"  class=\"easyui-treegrid\" \r\n");
      out.write("  toolbar=\"#tb\" data-options=\"idField:'id',treeField:'text',fit:true,fitColumns:true\">\r\n");
      out.write("    <thead>\r\n");
      out.write("    \t<tr>\r\n");
      out.write("    \t\t<th field=\"id\" width=\"30\" align=\"center\">菜单编号</th>\r\n");
      out.write("    \t\t<th field=\"text\" width=\"80\">菜单名称</th>\r\n");
      out.write("    \t\t<th field=\"iconCls\" width=\"35\" align=\"center\" formatter=\"formatIconCls\" >图标</th>\r\n");
      out.write("    \t\t<th field=\"operationNames\" width=\"80\" align=\"center\"  >包含按钮</th>\r\n");
      out.write("    \t\t<th field=\"menuUrl\" width=\"100\" align=\"center\">链接地址</th>\r\n");
      out.write("    \t\t<th field=\"seq\" width=\"100\" align=\"center\">顺序</th>\r\n");
      out.write("    \t\t<th field=\"menuDescription\" width=\"100\" align=\"center\">备注</th>\r\n");
      out.write("    \t</tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<!-- 菜单显示主页面上的操作按钮 -->\r\n");
      out.write("<div id=\"tb\">\r\n");
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
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 菜单的新增/修改form -->\r\n");
      out.write("<div id=\"dlg\" class=\"easyui-dialog\" style=\"width: 630px;height: 350px;padding: 10px 20px\"\r\n");
      out.write("  closed=\"true\" buttons=\"#dlg-buttons\" >\r\n");
      out.write("  <form id=\"fm\" method=\"post\">\r\n");
      out.write("  \t<table cellspacing=\"5px;\">\r\n");
      out.write("  \t\t<tr>\r\n");
      out.write("  \t\t\t<td>名称：</td>\r\n");
      out.write("  \t\t\t<td><input type=\"text\" id=\"menuName\" name=\"menuName\" class=\"easyui-validatebox\" required=\"true\"/></td>\r\n");
      out.write("  \t\t\t<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>\r\n");
      out.write("  \t\t\t<td>样式：</td>\r\n");
      out.write("  \t\t\t<td><input type=\"text\" id=\"iconCls\" name=\"iconCls\" value=\"icon-item\" class=\"easyui-validatebox\" required=\"true\"/>\r\n");
      out.write("  \t\t\t</td>\r\n");
      out.write("  \t\t</tr>\r\n");
      out.write("  \t\t<tr>\r\n");
      out.write("  \t\t\t<td>路径：</td>\r\n");
      out.write("  \t\t\t<td ><input type=\"text\" id=\"menuUrl\" name=\"menuUrl\" class=\"easyui-validatebox\" /></td>\r\n");
      out.write("  \t\t\t<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>\r\n");
      out.write("  \t\t\t<td>序号：</td>\r\n");
      out.write("  \t\t\t<td ><input type=\"text\" id=\"seq\" name=\"seq\" class=\"easyui-validatebox\" required=\"true\" onkeyup=\"this.value=this.value.replace(/\\D/g,'')\"/></td>\r\n");
      out.write("  \t\t</tr>\r\n");
      out.write("  \t\t<tr>\r\n");
      out.write("  \t\t\t<td valign=\"top\">备注：</td>\r\n");
      out.write("  \t\t\t<td colspan=\"4\">\r\n");
      out.write("  \t\t\t\t<textarea rows=\"7\" cols=\"50\" name=\"menuDescription\" id=\"menuDescription\"></textarea>\r\n");
      out.write("  \t\t\t</td>\r\n");
      out.write("  \t\t</tr>\r\n");
      out.write("  \t</table>\r\n");
      out.write("  </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 菜单新增/修改的保存按钮 -->\r\n");
      out.write("<div id=\"dlg-buttons\"  style=\"text-align:center\">\r\n");
      out.write("\t<a href=\"javascript:reserveMenu()\" class=\"easyui-linkbutton\" iconCls=\"icon-ok\" >保存</a>\r\n");
      out.write("\t<a href=\"javascript:closeMenuDialog()\" class=\"easyui-linkbutton\" iconCls=\"icon-cancel\" >关闭</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 按钮展示列表 -->\r\n");
      out.write("<div id=\"operationDlg\" class=\"easyui-dialog\" style=\"width: 450px;height: 300px;padding: 10px 20px\" closed=\"true\" >\r\n");
      out.write("<table  class=\"easyui-datagrid\" id=\"operationTable\"   toolbar=\"#operationTb\">\r\n");
      out.write("    <thead>\r\n");
      out.write("    \t<tr>\r\n");
      out.write("    \t\t<th field=\"cb2\" checkbox=\"true\" align=\"center\"></th>\r\n");
      out.write("    \t\t<th field=\"menuId\" width=\"30\" align=\"center\" data-options=\"hidden:true\"></th>\r\n");
      out.write("    \t\t<th field=\"operationId\" width=\"100\" align=\"center\">按钮编号</th>\r\n");
      out.write("    \t\t<th field=\"operationName\" width=\"100\" align=\"center\">按钮名称</th>\r\n");
      out.write("    \t\t<th field=\"menuName\" width=\"100\" align=\"center\">所属菜单</th>\r\n");
      out.write("    \t</tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 按钮列表上的操作 -->\r\n");
      out.write("<div id=\"operationTb\">\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<a href=\"javascript:openOperationAddDialog()\" class=\"easyui-linkbutton\" iconCls=\"icon-add\" plain=\"true\">添加</a>\r\n");
      out.write("\t\t<a href=\"javascript:openOperationUpdateDialog()\" class=\"easyui-linkbutton\" iconCls=\"icon-edit\" plain=\"true\">修改</a>\r\n");
      out.write("\t\t<a href=\"javascript:deleteOperation()\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\" plain=\"true\">删除</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 按钮的新增/修改form -->\r\n");
      out.write("<div id=\"operationReserveDlg\" class=\"easyui-dialog\" style=\"width: 350px;height: 200px;padding: 10px 20px\"\r\n");
      out.write("  closed=\"true\" buttons=\"#operationdlg-buttons\" >\r\n");
      out.write("  <form id=\"fm2\" method=\"post\">\r\n");
      out.write("  \t<table cellspacing=\"5px;\">\r\n");
      out.write("  \t\t<tr>\r\n");
      out.write("  \t\t\t<td>所属菜单：</td>\r\n");
      out.write("  \t\t\t<td><input type=\"text\" id=\"o_menuName\" name=\"menuName\" class=\"easyui-validatebox\" readonly=\"readonly\"/></td>\r\n");
      out.write("  \t\t</tr>\r\n");
      out.write("  \t\t<tr>\r\n");
      out.write("  \t\t\t<td>按钮名称：</td>\r\n");
      out.write("  \t\t\t<td><input type=\"text\" id=\"operationName\" name=\"operationName\" class=\"easyui-validatebox\" required=\"true\"/></td>\r\n");
      out.write("  \t\t</tr>\r\n");
      out.write("  \t\t<input type=\"hidden\" id=\"o_menuId\" name=\"menuId\" />\r\n");
      out.write("  \t</table>\r\n");
      out.write("  </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"operationdlg-buttons\"  style=\"text-align:center\">\r\n");
      out.write("\t<a href=\"javascript:reserveOperation()\" class=\"easyui-linkbutton\" iconCls=\"icon-ok\" >保存</a>\r\n");
      out.write("\t<a href=\"javascript:closeOperationReserveDialog()\" class=\"easyui-linkbutton\" iconCls=\"icon-cancel\" >关闭</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_privilege_005foperation_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  privilege:operation
    dingzhen.tag.PrivilegeTag _jspx_th_privilege_005foperation_005f0 = (dingzhen.tag.PrivilegeTag) _005fjspx_005ftagPool_005fprivilege_005foperation_0026_005foperationId_005fonClick_005fname_005ficonCls_005fclazz_005fnobody.get(dingzhen.tag.PrivilegeTag.class);
    _jspx_th_privilege_005foperation_005f0.setPageContext(_jspx_page_context);
    _jspx_th_privilege_005foperation_005f0.setParent(null);
    // /WEB-INF/view/menu.jsp(235,2) name = operationId type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f0.setOperationId("10000");
    // /WEB-INF/view/menu.jsp(235,2) name = clazz type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f0.setClazz("easyui-linkbutton");
    // /WEB-INF/view/menu.jsp(235,2) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f0.setOnClick("openMenuAddDialog()");
    // /WEB-INF/view/menu.jsp(235,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f0.setName("添加");
    // /WEB-INF/view/menu.jsp(235,2) name = iconCls type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/view/menu.jsp(236,2) name = operationId type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f1.setOperationId("10001");
    // /WEB-INF/view/menu.jsp(236,2) name = clazz type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f1.setClazz("easyui-linkbutton");
    // /WEB-INF/view/menu.jsp(236,2) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f1.setOnClick("openMenuUpdateDialog()");
    // /WEB-INF/view/menu.jsp(236,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f1.setName("修改");
    // /WEB-INF/view/menu.jsp(236,2) name = iconCls type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/view/menu.jsp(237,2) name = operationId type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f2.setOperationId("10002");
    // /WEB-INF/view/menu.jsp(237,2) name = clazz type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f2.setClazz("easyui-linkbutton");
    // /WEB-INF/view/menu.jsp(237,2) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f2.setOnClick("deleteMenu()");
    // /WEB-INF/view/menu.jsp(237,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f2.setName("删除");
    // /WEB-INF/view/menu.jsp(237,2) name = iconCls type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/view/menu.jsp(238,2) name = operationId type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f3.setOperationId("10014");
    // /WEB-INF/view/menu.jsp(238,2) name = clazz type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f3.setClazz("easyui-linkbutton");
    // /WEB-INF/view/menu.jsp(238,2) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f3.setOnClick("openOperationDialog()");
    // /WEB-INF/view/menu.jsp(238,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f3.setName("按钮管理");
    // /WEB-INF/view/menu.jsp(238,2) name = iconCls type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_privilege_005foperation_005f3.setIconCls("icon-edit");
    int _jspx_eval_privilege_005foperation_005f3 = _jspx_th_privilege_005foperation_005f3.doStartTag();
    if (_jspx_th_privilege_005foperation_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fprivilege_005foperation_0026_005foperationId_005fonClick_005fname_005ficonCls_005fclazz_005fnobody.reuse(_jspx_th_privilege_005foperation_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fprivilege_005foperation_0026_005foperationId_005fonClick_005fname_005ficonCls_005fclazz_005fnobody.reuse(_jspx_th_privilege_005foperation_005f3);
    return false;
  }
}
