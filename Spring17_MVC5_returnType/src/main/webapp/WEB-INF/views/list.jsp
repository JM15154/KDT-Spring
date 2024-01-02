<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>main.jsp</h2>

<c:forEach var="dto" items="${xxx }">
	${dto.userid }
	${dto.passwd }

</c:forEach>
</body>
</html>