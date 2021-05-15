<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.2.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/easyui/jquery.easyui.min.js" /></script>
	<!-- 导入easyui类库 -->
<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/themes/icon.css">
</head>
<body class="easyui-layout">   
    <div data-options="region:'north',split:true" style="height:100px;">North</div>   
    <div data-options="region:'south',split:true" style="height:100px;">South</div>   
    <div data-options="region:'center',title:'center title'" style="padding:5px;background:red;">center</div>   
    <div data-options="region:'west',title:'系统菜单',split:true" style="width:200px;">
    <div class="easyui-accordion">
   		<div title="面板一">哈哈</div>
   		<div title="面板二">呵呵</div>
   		<div title="面板三">嘻嘻</div>
    </div>
    </div>   
</body> 
</html>