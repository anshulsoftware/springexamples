<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href='<c:url value="/resources/css/bootstrap.min.css" />' rel="stylesheet">
    <script src="<c:url value="/resources/js/jquery.min.js" />"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script> 
   
</head>
<body>
<form action="save" method="post">

<table>
<tr>
<td>Name :</td>
<td><input type="text" name="name"/></td>
</tr>
<tr><td>Password :</td><td><input type="text" name="pass"/></td></tr>
<tr><td></td><td><input type="submit" value="save"></td></tr>


</table>

<%

String msg=(String)request.getAttribute("msg");
if(msg==null)
{
			
}
else
{
	out.println(msg);
}


%>





</form>
</body>
</html>