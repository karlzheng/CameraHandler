<jsp:include page="declaration/header.jsp"></jsp:include>
<body>
    <div class="command-groups">
        Camera command: ${param.command}
        <jsp:include page="commands/powerCommand.jsp"></jsp:include>
        <jsp:include page="commands/zoomCommand.jsp"></jsp:include>
        <jsp:include page="commands/focusCommand.jsp"></jsp:include>
        <jsp:include page="commands/backlightCommand.jsp"></jsp:include>
        <jsp:include page="commands/brightCommand.jsp"></jsp:include>
        <jsp:include page="commands/memoryCommand.jsp"></jsp:include>
        <jsp:include page="commands/keyLockCommand.jsp"></jsp:include>
        <jsp:include page="commands/irReceiveCommand.jsp"></jsp:include>
        <jsp:include page="commands/irReceiveReturnCommand.jsp"></jsp:include>
        <jsp:include page="commands/panTiltCommand.jsp"></jsp:include>
        <jsp:include page="commands/panTiltLimitSet.jsp"></jsp:include>
        <jsp:include page="commands/dataScreenCommand.jsp"></jsp:include>
        <jsp:include page="commands/atModeCommand.jsp"></jsp:include>
        <jsp:include page="commands/atAEModeCommand.jsp"></jsp:include>
        <jsp:include page="commands/atAutoZoomCommand.jsp"></jsp:include>
        <jsp:include page="commands/atMDFrameDisplayCommand.jsp"></jsp:include>
        <jsp:include page="commands/atOffSetCommand.jsp"></jsp:include>
        <jsp:include page="commands/atMDStartStopCommand.jsp"></jsp:include>
        <jsp:include page="commands/miscCommand.jsp"></jsp:include>
    </div>

</body>
</html>
