<jsp:include page="declaration/header.jsp"/>
<body>
<jsp:include page="cameraChoice.jsp"/>

<div class="command-groups">
        <%
            request.setAttribute("param.camera","All cameras");

        %>
        Chosen camera: ${param.camera}<br>
        Camera command: ${param.command}
        <jsp:include page="commands/powerCommand.jsp"/>
        <jsp:include page="commands/zoomCommand.jsp"/>
        <jsp:include page="commands/focusCommand.jsp"/>
        <jsp:include page="commands/backlightCommand.jsp"/>
        <jsp:include page="commands/brightCommand.jsp"/>
        <jsp:include page="commands/memoryCommand.jsp"/>
        <jsp:include page="commands/keyLockCommand.jsp"/>
        <jsp:include page="commands/irReceiveCommand.jsp"/>
        <jsp:include page="commands/irReceiveReturnCommand.jsp"/>
        <jsp:include page="commands/panTiltCommand.jsp"/>
        <jsp:include page="commands/panTiltLimitSet.jsp"/>
        <jsp:include page="commands/dataScreenCommand.jsp"/>
        <jsp:include page="commands/atModeCommand.jsp"/>
        <jsp:include page="commands/atAEModeCommand.jsp"/>
        <jsp:include page="commands/atAutoZoomCommand.jsp"/>
        <jsp:include page="commands/atMDFrameDisplayCommand.jsp"/>
        <jsp:include page="commands/atOffSetCommand.jsp"/>
        <jsp:include page="commands/atMDStartStopCommand.jsp"/>
        <jsp:include page="commands/miscCommand.jsp"/>
    </div>

</body>
</html>
