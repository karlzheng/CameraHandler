<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="v01.Macros" %>


<select name="macro">
    <c:forEach var="name" items="<%=Macros.getMacrosName()%>">
        <option value="${name}">${name}</option>
    </c:forEach>
</select>
