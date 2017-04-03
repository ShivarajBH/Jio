<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
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
	<meta http-equiv="description" content="Moaddi Vending Machines">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style>
body {background-color: powderblue;}

</style>
	
	
  </head>
  
   <dd><dd><dd><dd><dd><dd><dd><dd><h1 style="color:red;">Moaddi Company</h1> </dd></dd> </dd></dd></dd></dd></dd></dd><br>
   <!--  <a href="employeelist.htm">Machinelist</a> -->
   <tr>
 <dd><dd><dd><dd>   <a href="machineslist.html">Home</a></dd></dd></dd></dd><br>
  </tr>
 <dd><dd><dd><dd>   <a href="locklist.html">Create Lock Page</a></dd></dd></dd></dd><br>
    
   
    
  <dd><dd><dd><dd>  <a href="supplierlist.html">Signout</a></dd></dd></dd></dd><br>
   
  </body>
</html>
