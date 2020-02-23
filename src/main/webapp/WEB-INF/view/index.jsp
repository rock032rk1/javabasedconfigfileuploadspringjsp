<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h2>${msg }</h2>
    
    <fieldset style="width: 40%">
     <legend>File Upload</legend> 
      <form action="save" method="post" enctype="multipart/form-data">
      File to Upload: <input type="file" required="required" name="file"><br>
     <!--  Description   : <input type="text" required="required" name="description"><br> -->
                      <input type="submit" value="Upload">
    </form>
    
    </fieldset>
    
    <a href="fileup">Show Result</a>
</body>
</html>