<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5" import="Model.member"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>SSM</title>
<%
member m=(member)session.getAttribute("M");
%>
</head>
<body>
<form action="../porder/add" method="post">

<table width=400 align="center" border=1>

 <tr>
   <td colspan=2 align="center"><h2>購物選單</h2>
<tr>
   <td width=200>名稱:
   <td><%= m.getName() %>
   
<tr>
   <td width=200>product1
   <td><input type="text" name="product1">  
<tr>
   <td width=200>product2
   <td><input type="text" name="product2">
<tr>
   <td width=200>product3
   <td><input type="text" name="product3">
<tr>
  <td colspan=2><input type="submit" value="ok"> 
</table>
</from>
</body>
</html>