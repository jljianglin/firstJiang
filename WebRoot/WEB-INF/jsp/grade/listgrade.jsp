<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'listgrade.jsp' starting page</title>
    
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

	<form action="toAddGrade.action" method="post">
		<table align="center" border="1" width="85%">
			<tr>
				<th>班级编号:</th>
				<th>班级名称</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${glist}" var="g">
				<tr>
				<td>
					${g.gradeid }
				</td>
					
					<td>
						${g.gradename }
					</td>
					
					<th>
						<a href="doDetailGrade.action?gradeid=${g.gradeid }">查看</a>
						<a href="toUpdateGrade.action?gradeid=${g.gradeid }">修改</a>
						<a href="doDeleteGrade.action?gradeid=${g.gradeid }" onclick="return confirm('确认删除该班级么?')">删除</a>
					</th>
				</tr>
				
			</c:forEach>
			<tr>
				<td colspan="3" align="center">
					<input type="submit" value="新增班级信息" />
				</td>
			</tr>
			
		</table>
	</form>
  </body>
</html>
