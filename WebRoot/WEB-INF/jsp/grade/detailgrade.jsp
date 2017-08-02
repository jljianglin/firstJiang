<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'detailgrade.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
	<table width="85%" border="1" align="center">
		<tr>
			<td width="45%" align="right">班级编号:</td>
			<td align="left">${grade.gradeid }</td>
		</tr>
		<tr>
			<td align="right">班级名称:</td>
			<td align="left">${grade.gradename }</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="button" value="返回" onclick="window.history.go(-1);"/>
			</td>
		</tr>
	</table>
  </body>
</html>
