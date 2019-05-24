<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Grade from Text</title>
</head>
<body>
	<center>
		<table border="1" cellpadding="20" cellspacing="2">
			<tbody>
				<tr bgcolor="silver">
					<td><center>Grade</center></td>
					<td><center>Salary</center></td>
				</tr>
				<c:forEach items="${listgrade}" var="grade">
					<tr>
						<td><center>
								<c:out value="${grade.grade}" />
							</center></td>
						<td><center>
								<c:out value="${grade.salary}" />
							</center></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</center>

</body>
</html>