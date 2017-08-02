<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
  </head>
  <script type="text/javascript" src="<%=path %>/js/jquery-1.5.2.min.js"></script>
  <script type="text/javascript">
  	$(function(){
		$("#form").submit(function(){
			var uname = $("#username").val();
			var pwd = $("#password").val();

			if(uname==""){
				$("#uusername").html("用户名不能为空!");
				return false;
				}
			if(uname.length>20||uname.length<5){
				$("#uusername").html("用户名长度为5-20之间!");
				return false;
				}
			if(pwd==""){
				$("#ppassword").html("密码不能为空!");
				return false;
				}
			if(pwd.length>20||pwd.length<4){
				$("#ppassword").html("密码长度为4-20之间!");
				return false;
				}



			})
			$("#username").focus(function(){
				$("#uusername").html("");
				})
			$("#password").focus(function(){
				$("#ppassword").html("");
				})

			var no = "${n}";
			if(no.length>0){
				alert(no);
				}
  	  	})
  
  
  </script>
  
  <body>
    <form action="doLogin.action" method="post" id="form">
    	<table align="center" border="1" width="85%">
    		<tr>
    			<th width="40%">用户名:</th>
    			<td width="25%">
    				<input type="text" name="username" id="username"/>
    			</td>
    			<td id="uusername"></td>
    		</tr>
    		<tr>
    			<th>密码:</th>
    			<td>
    				<input type="password" name="password" id="password"/>
    			</td>
    			<td id="ppassword"></td>
    		</tr>
    		<tr>
    			<td colspan="3" align="center">
    				<input type="submit" value="登录"/>
    			</td>
    		</tr>
    	</table>
    </form>
    
  </body>
</html>
