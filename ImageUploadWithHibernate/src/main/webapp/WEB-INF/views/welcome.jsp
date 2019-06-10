
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>

<tr>

<td>${id}</td><td>${name}</td><td>${image}</td>

</tr>

<img width="800", height="200" src="<c:url value="F:/WorkSpace/SpringForm/src/main/resources/images/"/>${image}"/><br>
</table>

<%-- <img src="<c:url value="/resources/images/"/>${image}"/> --%>
<br>
<%-- <img alt="pictures3" src="<%=request.getContextPath()%>/${image}" /><br>
<img alt="pictures4" src="<%=request.getContextPath()%>/resources/images/${image}" /> --%>

</body>
</html>