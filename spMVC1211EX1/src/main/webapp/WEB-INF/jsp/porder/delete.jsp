<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Model.porder"
    import="Dao.porderDao"
    import="java.util.List"%>
  <%
  //List<porder> l=new porderDao().queryAll2();  
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<table width=600 align=center border=1>
		<tr height=100>
			<td align=center><jsp:include page="../title.jsp"/>
		<tr height=450>
			<td >
			<form action="deleteController" method="post">
				<table width=500 align=center border=1>
					<tr align=center>
						<td>刪除訂單資料
					<tr align=center>
						<td>
						ID:<input type="text" name="id" size=3>
						
						<input type="submit" value="確定">					
						
				</table>
			</form>
			<hr>
			<table width=500 align=center border=1>
			<tr>
				<td>ID<td>桌號<td>A餐<td>B餐<td>C餐<td>金額
			<%
				/*for(porder p:l)
				{
					out.println("<tr><td>"+p.getId()+
							"<td>"+p.getDesk()+
							"<td>"+p.getA()+
							"<td>"+p.getB()+
							"<td>"+p.getC()+
							"<td>"+p.getSum());
				}*/
			
			
			%>
			<tr>
				<td colspan=6 align=center>
				<a href="porderIndex">回首頁</a>
			</table>
			
			
			
			
			
		<tr height=50>
			<td align=center><jsp:include page="../footer.jsp"/>
	
	</table>

</body>
</html>