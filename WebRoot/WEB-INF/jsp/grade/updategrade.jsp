<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updategrade.jsp' starting page</title>
    
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
	<form action="doUpdateGrade.action" method="post">
		<table width="85%" border="1" align="center">
			<tr>
				<th align="right" width="45%">班级名称:</th>
				<td>
					<input type="text" name="gradename" value="${grade.gradename }"/>
					<input type="hidden" name="gradeid" value="${grade.gradeid }"/>
				</td>
				<td></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="保存班级信息" />
				</td>
			</tr>
		</table>
	</form>
  </body>
</html>
