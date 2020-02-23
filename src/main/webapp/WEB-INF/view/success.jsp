<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ page isELIgnored="false" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   
   <h2>${Location }</h2>
   <img alt="banner-1.jpg" src="resource/banner-1.jpg" style="width: 100px;height: 100px">
   <table>
        <thead>
         <tr>
       <th>FID</th>
       <th>Image</th>
        </tr>
     </thead>
     <tbody>
      <c:forEach var="ftp" items="${fileup }">
        <tr>
          <th>${ftp.uid }</th>
          <th> <img alt="" src="resource/${ftp.filename }" style="width: 50px;height: 50px"></th>
        </tr>
      </c:forEach>
     </tbody>
   </table>
</body>
</html>