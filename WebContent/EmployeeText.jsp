<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee From Text</title>
</head>
<body>
	<center>
		<table border="1" cellpadding="20" cellspacing="2">
			<tbody>
				<tr bgcolor="silver">
					<td><center>ID</center></td>
					<td><center>Name</center></td>
					<td><center>Entry Date</center></td>
					<td><center>Detail</center></td>
					<c:forEach items="${employeeList}" var="emptxt">
						<tr>
							<td><center>
									<c:out value="${emptxt.id}" />
								</center></td>
							<td><center>
									<c:out value="${emptxt.name}" />
								</center></td>
							<td><center>
									<c:out value="${emptxt.entrydate}" />
								</center></td>
							<td><center>
									<a href='EmployeeGradeController?id=${emptxt.id}'>Grade</a>
								</center></td>
					</c:forEach>
			</tbody>
		</table>
	</center>
</body>
</html>