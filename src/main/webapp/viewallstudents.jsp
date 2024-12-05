<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View All Students</title>
</head>
<body>
<%--  <c:forEach items="${studentlist}" var="emp">
            <tr>
                <td><c:out value="${emp.id}"/></td>
                <td><c:out value="${emp.name}"/></td>
                <td><c:out value="${emp.gender}"/></td>            
                <td><c:out value="${emp.department}"/></td>          
                <td><c:out value="${emp.email}"/></td>
               
            </tr>
        </c:forEach> --%>
        
        
        <c:forEach items="${studentlist}" var="std">
        <c:out value="${std.id }"></c:out>
        </c:forEach>
        
       
</body>
</html>