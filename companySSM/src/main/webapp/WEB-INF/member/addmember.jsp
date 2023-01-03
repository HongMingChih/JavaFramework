<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"">
<title>SSM</title>
</head>
<body>
<form action="../member/add" method="post">
<table width=400 align="center" border=1>

 <tr>
   <td colspan=2 align="center"><h2>請註冊</h2>
<tr>
   <td width=200>名稱:
   <td><input type="text" name="name">
<tr>
   <td width=200>帳戶:
   <td><input type="text" name="username">
<tr>
   <td width=200>密號:
   <td><input type="password" name="password">  
<tr>
   <td width=200>電話:
   <td><input type="text" name="phone">
<tr>
   <td width=200>地址:
   <td><input type="text" name="address">
<tr>
   <td width=200>管理員:
   <td><input type="radio" name="admin" value="true">true  
       <input type="radio" name="admin" value="false">false 
<tr>
  <td colspan=2><input type="submit" value="ok"> 
</table>
</form>
</body>
</html>