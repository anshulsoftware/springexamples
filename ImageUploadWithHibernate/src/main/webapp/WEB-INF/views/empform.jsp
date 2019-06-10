
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
	<div id="global">
        <form:form action="save" method="post" enctype="multipart/form-data" modelAttribute="employee">
           <table>
           
                <legend>Add a product</legend>
                <tr>
                   <td> <label for="id">Id: </label></td>
                   <td> <form:input id="id" path="id"  /></td>
                   </tr> 
                
                <tr>
                   <td>
                    <label for="name">Name: </label></td>
                   <td> <form:input id="name" path="name" /></td>
                </tr>
                <tr>
                   <td>
                    <label for="image"> Images: </label></td>
                   <td> <input type="file" name="image" multiple="multiple"/></td>
                </tr>
                   <td> <input  type="submit" value="Get Image" name="getImage" class="btn btn-success"></td>
                   <td> <input  type="submit" value="Add Image" name="saveImage" class="btn btn-success"></td>
                </tr>
            </table>
            
        </form:form>
        <form:form>
        ${msg }
        </form:form>
    </div>
</body>
</html>