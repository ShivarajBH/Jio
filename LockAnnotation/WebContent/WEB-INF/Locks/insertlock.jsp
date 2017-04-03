<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>

<body>


<h3>Add Lock Details</h3>
		<form:form method="POST" action="save.html">
	   		<table>
			    <tr>
			        <td><form:label path="lockSno">LockSno:</form:label></td>
			        <td><form:input path="lockSno" value="${lock.lockSno}" readonly="true"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="lockPrice">LockPrice:</form:label></td>
			        <td><form:input path="lockPrice" value="${lock.lockPrice}"/></td>
			    </tr>
			    <tr>
			       <td><form:label path="lockModel">LockModel:</form:label>  </td>
			<td><form:select path="lockModel">
			         <form:option value="">Select</form:option>
                    <form:option value="knablock">knab lock</form:option>
                   <form:option value="leverhandle">lever handle</form:option>
                   <form:option value="deadbolt">dead bolt</form:option>
                    <form:option value="keylessentry">keyless entry</form:option>
                    </form:select>
                </td>
			    </tr>
			    <tr>
			        <td><form:label path="lockColor">LockColor:</form:label></td>
			        <td><form:input path="lockColor" value="${lock.lockColor}"/></td>
			    </tr>
			    
			    <tr>
			    <td><form:label path="lockKind">LockKind:</form:label></td>
			    <td><form:select path="lockKind">
			         <form:option value="">Select</form:option>
                    <form:option value="single">Single</form:option>
                   <form:option value="double">Double</form:option>
                   <form:option value="multi">Multi</form:option>
                  
                    </form:select>
			    
			    <tr>
			    <td><form:label path="lockSize">LockSize</form:label></td>
			    <td><form:input path="lockSize" value="${lock.lockSize }" readonly="true"/></td>
			    </tr>
			    
			    <tr>
			    <td><form:label path="height">Height:</form:label></td>
			    <td><form:input path="height" value="${lock.height }"/></td>
			   
			    
			    
			    <td><form:label path="depth">Depth:</form:label></td>
			    <td><form:input path="depth" value="${lock.depth }"/></td>
			    </tr>
			  
			    
			     <tr>
			        <td><form:label path="width">Width:</form:label></td>
                    <td><form:input path="width" value="${lock.width}"/></td>
			    
			        <td><form:label path="weight">Weight:</form:label></td>
                    <td><form:input path="weight" value="${lock.weight}"/></td>
			    </tr>
			    <tr>
			      <td colspan="2"><input type="submit" value="Submit"/></td>
		      </tr> 
		      
			</table> 
		</form:form>
		
 <c:if test="${!empty lock1}">
<h3>List of locks</h3>
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
			<th>Edit/delete</th>
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