<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="v01.Macros" %>


<form action="/executeMacro">

    <select name="macroName">
        <c:forEach var="name" items="<%=Macros.getMacrosName()%>">
            <option value="${name}">${name}</option>
        </c:forEach>
    </select>

    <input type="submit" value="Execute macro">
</form>
