<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="v01.CommandList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Objects" %>

<form action="/chooseCommand">
    <select name="command" onchange="this.form.submit()">
        <c:forEach var="commandFamily" items="<%=CommandList.getCommands()%>">
            <optgroup label="${commandFamily.key}">
                <c:forEach var="command" items="${commandFamily.value}">
                    <c:if test="${commandFamily.key != param.cmdFam || command.name != param.cmd}">
                        <option value="${commandFamily.key}_${command.name}">${command.name}</option>
                    </c:if>
                    <c:if test="${commandFamily.key == param.cmdFam && command.name == param.cmd}">
                        <option selected="selected" value="${commandFamily.key}_${command.name}">${command.name}</option>
                    </c:if>
                </c:forEach>
            </optgroup>
        </c:forEach>
    </select>
</form>


<%
    String cmdFamily = request.getParameter("cmdFam");
    String cmdName = request.getParameter("cmd");
    CommandList.Param[] methodParams = CommandList.getParams(cmdFamily, cmdName);

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < methodParams.length; i++) {
        sb.append("arg");
        sb.append(i);
        sb.append(".value");

        if (methodParams.length > i + 1)
            sb.append(" + '_' + ");
    }

    String argsConcat = sb.toString();
%>

<script>
    function disableInputs(form) {
        var controls = form.elements;
        for (var i=0, iLen=controls.length; i<iLen; i++) {
            controls[i].disabled = controls[i].type == 'number';
        }
    }
</script>


<form action="/addCommand" onsubmit="disableInputs(this)" oninput="args.value = <%= argsConcat %>">
    <input type="hidden" name="commandFamily" value="<%= cmdFamily %>" />
    <input type="hidden" name="commandName" value="<%= cmdName %>" />
    <input type="hidden" name="args" />
    <c:forEach var="p" items='<%= methodParams %>' varStatus="loop">
        ${p.name}: <input name="arg${loop.index}" type="number" min="${p.minVal}" max="${p.maxVal}" required>
    </c:forEach>
    <p><input type="submit" value="Dodaj"></p>
</form>