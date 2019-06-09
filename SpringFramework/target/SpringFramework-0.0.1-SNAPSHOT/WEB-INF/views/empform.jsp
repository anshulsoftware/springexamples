
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>  
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href='<c:url value="/resources/css/bootstrap.min.css" />' rel="stylesheet">
   
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script> 
   

<style>
.error {
	color: red
}
</style>
</head>
<body>
	<h1>Add New Employee</h1>
	<form:form method="post" action="save" modelAttribute="emp">
		<table>
			<tr>
				<td>Id :</td>
				<td><form:input path="id" /></td>
				<td><form:errors path="id" cssClass="error"/></td>

			</tr>
			<tr>
				<td>Name :</td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" cssClass="error" /></td>

			</tr>
			<tr>
				<td>Salary :</td>
				<td><form:input path="salary" /></td>
				<td><form:errors path="salary" cssClass="error" /></td>

			</tr>
			<tr>
				<td>Designation :</td>
				<td><form:input path="designation" /></td>
				<td><form:errors path="designation" cssClass="error" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Save" class="btn btn-primary"/></td>
			</tr>
		</table>
		
	</form:form>
<form action="">
${msg }
</form>
<form action="">
${err }
</form>
	
	<img width="1000" hieght="1200" src="<c:url value="/resources/images/index1.png" />"></img> 
	
	 <script src="<c:url value="/resources/js/jquery.min.js" />"></script>
</body>
</html>