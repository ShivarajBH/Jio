<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>lock details</title>
</head>
<body>
<h3>List of locks</h3>
<h3><a href="insertlock.html">Add New Lock</a></h3>

<c:if test="${!empty lock1}">
	<table align="left" border="1">
		<tr>
			<th>LockSno</th>
			<th>LockPrice</th>
			<th>LockModel</th>
			<th>LockColor</th>
			<th>LockKind</th>
			<th>LockSize</th>
			<th>Height</th>
			<th>Depth</th>
			<th>Width</th>
			<th>Weight</th>
            <th>Edit/Delete</th>
		</tr>

		<c:forEach items="${lock1}" var="lock">
			<tr>
				<td><c:out value="${lock.lockSno}"/></td>
				<td><c:out value="${lock.lockPrice}"/></td>
				<td><c:out value="${lock.lockModel}"/></td>
				<td><c:out value="${lock.lockColor}"/></td>
				<td><c:out value="${lock.lockKind }"/></td>
				
				<td><c:out value="${lock.lockSize}"/></td>
				<td><c:out value="${lock.height}"/></td>
				<td><c:out value="${lock.depth }"/></td>
				<td><c:out value="${lock.width}"/></td>
				<td><c:out value="${lock.weight}"/></td>
				
				<td align="center"><a href="edit.html?lockSno=${lock.lockSno}">Edit</a> | <a href="delete.html?lockSno=${lock.lockSno}" onclick=" return confirm('Are you sure you want to Delete? lock=${lock.lockSno}')">Delete</a></td> 
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>