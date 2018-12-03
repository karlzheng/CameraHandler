<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="v01.Macros" %>


<select name="macro">
    <c:forEach var="macro" items="<%=Macros.getMacros()%>">
        <option value="${macro.name}">${macro.name}</option>
    </c:forEach>
</select>
