<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="com.gmail.silverleaf.annn.Flat"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<html>
<head>
    <title>Flat selection results</title>
    <meta charset="utf-8">
    <link rel='stylesheet' href='style.css' type='text/css' media='all' />
</head>
<body>
    <p><c:out value="${flatCount}"></c:out></p>
    <table>
        <thead>
            <th>District</th>
            <th>Address</th>
            <th>Square</th>
            <th>Rooms</th>
            <th>Price</th>
        </thead>
        <tbody>
            <c:forEach items="${flatList}" var="flat">
                <tr>
                    <td><c:out value="${flat.getDistrict()}"></c:out></td>
                    <td><c:out value="${flat.getAddress()}"></c:out></td>
                    <td><c:out value="${flat.getSquare()}"></c:out></td>
                    <td><c:out value="${flat.getRooms()}"></c:out></td>
                    <td><c:out value="${flat.getPrice()}"></c:out></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
