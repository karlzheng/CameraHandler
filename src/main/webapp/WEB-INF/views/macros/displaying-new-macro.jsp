<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="v01.Macros" %>


<ol>
    <c:forEach var="macroMethod" items="<%=Macros.getNewMacroMethods()%>">
    <li>${macroMethod.name}<br>Parameters: ${macroMethod.paramsString}</li>
</c:forEach>
</ol>

<form action="/addMacro">
    <input type="text" name="macroName" placeholder="Macro name" required />
    <p><input type="submit" value="Save macro"></p>
</form>