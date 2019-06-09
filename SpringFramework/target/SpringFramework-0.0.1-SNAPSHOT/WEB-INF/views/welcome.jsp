<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>  
<html>  
<head>

   <!--  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
   -->

  <link href='<c:url value="/resources/css/bootstrap.min.css" />' rel="stylesheet">
    <script src="<c:url value="/resources/js/jquery.min.js" />"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script> 
</head>
<body>  

<p> Employee Information</p> 
 
First Name : ${emp.firstName} <br>  
Last Name : ${emp.lastName} <br>  
Gender: ${emp.gender}  



<div class="container">
  <h2>Employee Information </h2>
            
  <table class="table table-striped">
    <thead>
      <tr>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Gender</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>${emp.firstName}</td>
        <td>${emp.lastName}</td>
        <td>${emp.gender}</td>
      </tr>
     
    </tbody>
  </table>
</div>
</body>  
</html> 