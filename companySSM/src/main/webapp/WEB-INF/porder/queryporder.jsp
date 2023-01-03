<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5" 
    import="Model.*"
    import="Factory.*"
    import="java.util.*"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>SSM</title>
<%
member m=(member)session.getAttribute("M");
fact f=implFactory.a.getBean("sf",fact.class);
%>
</head>
<body>


<table width=80% align="center" >
  <form action="../porder/querysum" method="post">
    <tr>
      <td colspan=7 align="center"><h2><%=m.getName() %>的查詢訂單</h2>
  <tr>
     <td  colspan=7 align="center">
     金額從<input type="text" name="start" size="5">  
       到<input type="text" name="end"size="5">  
        <input type="submit" value="ok">
   </from>        
      
   <hr>
<tr>
   <td align="center">  

   
    <%out.println("<table width=750 align=center border=1>"); %> 
   <%
   System.out.println("query step1~~~~~~~~");
   porder[]p=(porder[])session.getAttribute("P");
  
   if(p==null){
	   System.out.println("query step2~~~~~~~~");   
   List<Object>l =f.getPd().queryAll();
    p=l.toArray(new porder[l.size()]);
    
   }
   System.out.println("query step3~~~~~~~~");
   for (porder o:p) {
   	out.println("<tr><td>ID:"+o.getId()+
   			"<td>nama:"+o.getName()+
   			"<td>product1:"+o.getProduct1()+
   			"<td>product2:"+o.getProduct2()+
   			"<td>product3:"+o.getProduct3()+
   			"<td>sum:"+o.getSum()+
   			"<td>discountprice:"+o.getDiscountprice()+
   			"<td>date:"+o.getDate()
   			);
   }
   
     session.removeAttribute("P");
   %>   
   <%out.println("</table>");%>    
 </table>     
</body>
</html>