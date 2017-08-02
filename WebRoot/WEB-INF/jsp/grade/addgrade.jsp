<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addgrade.jsp' starting page</title>
    
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
    <form action="doAddGrade.action" method="post">
    	<table align="center" border="1" width="85%">
    		<tr>
    			<td>班级名称:</td>
    			<td>
    				<input type="text" name="gradename"/>
    			</td>
    			<td></td>
    		</tr>
    		<tr>
    			<td>
    				<input type="submit" value="新增"/>
    			</td>
    		</tr>
    	</table>
    </form>
  </body>
</html>
