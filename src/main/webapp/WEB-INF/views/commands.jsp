<%@ page import="v01.CommandList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div class="command-groups">
    Chosen camera: ${param.camera}<br>
    Camera command: ${param.command}

    <c:forEach var="commandFamily" items="<%=CommandList.getCommands()%>">
        <div class="${commandFamily.key}-commands">
            <div class="btn-group mr-2" role="group" aria-label="First group">
                <button type="button" class="btn btn-secondary" disabled style="width: 200px">Camera ${commandFamily.key}:</button>

                <c:forEach var="command" items="${commandFamily.value}">
                    <%-- if method has NO arguments --%>
                    <c:if test="${fn:length(command.params) == 0}">
                        <button type="button" class="btn btn-secondary"
                                onclick="window.location.href='/${commandFamily.key}_${command.name}'">
                                ${command.name}
                        </button>
                    </c:if>

                    <%-- if method has 1 or more arguments --%>
                    <c:if test="${fn:length(command.params) > 0}">
                        <button type="button" class="btn btn-secondary" data-toggle="modal"
                                data-target="#${commandFamily.key}${command.name}Modal">
                                ${command.name}
                        </button>
                    </c:if>
                </c:forEach>
            </div>
        </div>

        <!-- Modal -->
        <c:forEach var="command" items="${commandFamily.value}">
            <c:if test="${fn:length(command.params) > 0}">

                <div class="modal fade" id="${commandFamily.key}${command.name}Modal" tabindex="-1" role="dialog"
                     aria-labelledby="exampleModalLabel" aria-hidden="true">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-body">
                                <form action="/${commandFamily.key}_${command.name}">
                                    <ul style="list-style-type:none">
                                        <c:forEach var="par" items="${command.params}">
                                            <li>${par.name}:
                                                <input type="number"
                                                        name="${par.name}"
                                                        min="${par.minVal}"
                                                        max="${par.maxVal}"
                                                        required>
                                            </li>
                                        </c:forEach>
                                        <li>
                                            <button data-dismiss="modal">Cancel</button>
                                            <input type="submit" value="Do command">
                                        </li>
                                    </ul>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </c:if>
        </c:forEach>
    </c:forEach>
</div>