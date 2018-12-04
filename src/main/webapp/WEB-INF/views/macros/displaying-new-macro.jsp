<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="v01.Macros" %>


<ol>
    <c:forEach var="macroMethod" items="<%=Macros.getNewMacroMethods()%>">
    <li>${macroMethod.name}<br>Parameters: ${macroMethod.paramsString}</li>
</c:forEach>
</ol>

<form action="/addMacro">
    <c:if test="${param.alert == 'nameisbusy'}">
        <div class="alert alert-danger">
            <p>Nazwa jest juz zajeta!</p>
        </div>
    </c:if>
    <input type="text" name="macroName" placeholder="Macro name" required />
    <p><input type="submit" value="Save macro"></p>
</form>
