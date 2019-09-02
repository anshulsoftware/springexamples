<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Contact</title>
	<link href='<c:url value="/resources/css/bootstrap.min.css" />' rel="stylesheet">
    <script src="<c:url value="/resources/js/jquery.min.js" />"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script> 
	<%-- <script src="<c:url value="/resources/js/val.js" />"></script>--%>
	<%-- <script src="<c:url value="/resources/js/common/common.js" />"></script>  --%>
	<script src="<c:url value="/resources/js1/val.js" />"></script>
	<script src="<c:url value="/resources/js1/common/common.js" />"></script>
</head>

<body>
    <div align="center">
        <h1>New/Edit Employee</h1>
        <form:form  method="post" modelAttribute="employee">  <!--method="post" action="saveEmployee2" modelAttribute="employee"-->
        <table>
            <form:hidden path="id"/>
            <tr>
                <td>Name:</td>
                <td><form:input id="name" path="name" /></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><form:input id="email" path="email" /></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><form:input id="address" path="address" /></td>
            </tr>
            <tr>
                <td>Telephone:</td>
                <td><form:input id="telephone" path="telephone" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                <!-- onclick="formValidation()" -->
                <input type="submit"  value="Save" id="btnSave"  class="btn btn-success"/>
                <!-- <input type="submit" value="click" class="btn btn-success"> -->
                </td>
            </tr>
        </table>
        </form:form>
    </div>
    
    <div align="center">
		<h1>Employee List</h1>

		<table border="1">

			<th>Name</th>
			<th>Email</th>
			<th>Address</th>
			<th>Telephone</th>
			<th>Action</th>

			<c:forEach var="employee" items="${listEmployee}">
				<tr>

					<td>${employee.name}</td>
					<td>${employee.email}</td>
					<td>${employee.address}</td>
					<td>${employee.telephone}</td>
					<td><a href="editEmployee?id=${employee.id}">Edit</a>

						&nbsp;&nbsp;&nbsp;&nbsp; 
						<a href="deleteEmployee?id=${employee.id}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			New Employee Register <!-- <a href="newEmployee">here</a> -->
		</h4>
	</div>
</body>

</html>