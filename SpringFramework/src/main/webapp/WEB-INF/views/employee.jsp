<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>  
<html>  
<head>  
    <title>Employee Form</title>  
    <!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
   -->
    <link href='<c:url value="/resources/css/bootstrap.min.css" />' rel="stylesheet">
    <script src="<c:url value="/resources/js/jquery.min.js" />"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script> 
   
    <style>  
.error{color:red}  
</style>
</head>  
<h3>Spring Project Mvc</h3>  
<body>  
<h1> Hello</h1>
    <form:form action="submitForm" modelAttribute="emp">  
        First name: <form:input path="firstName" />  
        <form:errors path="firstName" cssClass="error"/>       
        <br><br>  
        Last name: <form:input path="lastName" /> 
        <form:errors path="lastName" cssClass="error"/> 
        <br><br>  
        Gender:   
        Male <form:radiobutton path="Gender" value="Male"/>  
        Female <form:radiobutton path="Gender" value="Female"/>  
        <form:errors path="Gender" cssClass="error" />
        <br><br>  
        <input type="submit" value="Submit" class="btn btn-primary"/>  
    </form:form>  
</body>  
</html>