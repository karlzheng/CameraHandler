<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta http-equiv="Pragma" content="no-cache">
    <meta http-equiv="Cache-Control" content="no-cache">
    <meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">

    <title>V01</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
</head>
<body>
    <div class="command-groups">
        Camera command: ${param.command}
        <div class="power-commands">
            <div class="btn-group mr-2" role="group" aria-label="First group">
                <button type="button" class="btn btn-secondary" disabled style="width: 200px">Camera power:</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/powerOn'">on</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/powerOff'">off</button>
            </div>
        </div>
        <div class="zoom-commands">
            <div class="btn-group mr-2" role="group" aria-label="First group">
                <button type="button" class="btn btn-secondary" disabled style="width: 200px">Camera zoom:</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/zoomStop'">zoomStop</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/zoomTele'">zoomTele</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/zoomWide'">zoomWide</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/zoomTeleWithSpeed'">fix to input</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/zoomWideWithSpeed'">fix to input</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/zoomDirect'">fix to input</button>
            </div>
        </div>
        <div class="focus-commands">
            <div class="btn-group mr-2" role="group" aria-label="First group">
                <button type="button" class="btn btn-secondary" disabled style="width: 200px">Camera focus:</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/focusStop'">focusStop</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/focusFar'">focusFar</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/focusNear'">focusNear</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/autoFocusOn'">autoFocusOn</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/manualFocusOn'">manualFocusOn</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/mixedFocus'">mixedFocus</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/directFocus'">fix to input</button>
            </div>
        </div>
        <div class="backlight-commands">
            <div class="btn-group mr-2" role="group" aria-label="First group">
                <button type="button" class="btn btn-secondary" disabled style="width: 200px">Camera backlight:</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/backlightOn'">backlightOn</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/backlightOff'">backlightOff</button>
            </div>
        </div>
        <div class="memory-commands">
            <div class="btn-group mr-2" role="group" aria-label="First group">
                <button type="button" class="btn btn-secondary" disabled style="width: 200px">Camera memory:</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/memoryReset'">memoryReset</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/memorySet'">memorySet</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/memoryRecall'">memoryRecall</button>
            </div>
        </div>
        <div class="keyLock-commands">
            <div class="btn-group mr-2" role="group" aria-label="First group">
                <button type="button" class="btn btn-secondary" disabled style="width: 200px">Camera keyLock:</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/keyLockOn'">keyLockOn</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/keyLockOff'">keyLockOff</button>
            </div>
        </div>
        <div class="irReceive-commands">
            <div class="btn-group mr-2" role="group" aria-label="First group">
                <button type="button" class="btn btn-secondary" disabled style="width: 200px">Camera IRReceive:</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/irReceiveOn'">irReceiveOn</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/irReceiveOff'">irReceiveOff</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/irReceiveOnOff'">irReceiveOnOff</button>
            </div>
        </div>
        <div class="irReceiveReturn-commands">
            <div class="btn-group mr-2" role="group" aria-label="First group">
                <button type="button" class="btn btn-secondary" disabled style="width: 200px">Camera IRReceiveReturn:</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/irReceiveReturnOn'">irReceiveReturnOn</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/irReceiveReturnOff'">irReceiveReturnOff</button>
            </div>
        </div>
        <div class="panTilt-commands">
            <div class="btn-group mr-2" role="group" aria-label="First group">
                <button type="button" class="btn btn-secondary" disabled style="width: 200px">Camera PanTilt:</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/panTiltHome'">panTiltHome</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/panTiltUp'">panTiltUp</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/panTiltDown'">panTiltDown</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/panTiltLeft'">panTiltLeft</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/panTiltRight'">panTiltRight</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/panTiltUpLeft'">panTiltUpLeft</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/panTiltUpRight'">panTiltUpRight</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/panTiltDownLeft'">panTiltDownLeft</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/panTiltDownRight'">panTiltDownRight</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/panTiltStop'">panTiltStop</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/panTiltAbsolutePosition'">panTiltAbsolutePosition</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/panTiltRelativePosition'">panTiltRelativePosition</button>
            </div>
        </div>
        <div class="panTiltLimitSet-commands">
            <div class="btn-group mr-2" role="group" aria-label="First group">
                <button type="button" class="btn btn-secondary" disabled style="width: 200px">Camera PanTiltLimitSet:</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/panTiltlimitSet'">panTiltlimitSet</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/panTiltlimitClear'">panTiltlimitClear</button>
            </div>
        </div>
        <div class="dataScreen-commands">
            <div class="btn-group mr-2" role="group" aria-label="First group">
                <button type="button" class="btn btn-secondary" disabled style="width: 200px">Camera DataScreen:</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/dataScreenOn'">dataScreenOn</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/dataScreenOff'">dataScreenOff</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/dataScreenOnOff'">dataScreenOnOff</button>
            </div>
        </div>
        <div class="atMode-commands">
            <div class="btn-group mr-2" role="group" aria-label="First group">
                <button type="button" class="btn btn-secondary" disabled style="width: 200px">Camera ATMode:</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/atModeOn'">atModeOn</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/atModeOff'">atModeOff</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/atModeOnOff'">atModeOnOff</button>
            </div>
        </div>
        <div class="atAEMode-commands">
            <div class="btn-group mr-2" role="group" aria-label="First group">
                <button type="button" class="btn btn-secondary" disabled style="width: 200px">Camera ATAEMode:</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/atAEOn'">atAEOn</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/atAEOff'">atAEOff</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/atAEOnOff'">atAEOnOff</button>
            </div>
        </div>
        <div class="atAutoZoom-commands">
            <div class="btn-group mr-2" role="group" aria-label="First group">
                <button type="button" class="btn btn-secondary" disabled style="width: 200px">Camera ATAutoZoom:</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/atAutoZoomOn'">atAutoZoomOn</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/atAutoZoomOff'">atAutoZoomOff</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/atAutoZoomOnOff'">atAutoZoomOnOff</button>
            </div>
        </div>
        <div class="atMDFrameDisplay-commands">
            <div class="btn-group mr-2" role="group" aria-label="First group">
                <button type="button" class="btn btn-secondary" disabled style="width: 200px">Camera atMDFrameDisplay:</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/atMDFrameDisplayOn'">atMDFrameDisplayOn</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/atMDFrameDisplayOff'">atMDFrameDisplayOff</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/atMDFrameDisplayOnOff'">atMDFrameDisplayOnOff</button>
            </div>
        </div>
        <div class="atOffset-commands">
            <div class="btn-group mr-2" role="group" aria-label="First group">
                <button type="button" class="btn btn-secondary" disabled style="width: 200px">Camera atOffset:</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/atOffsetOn'">atOffsetOn</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/atOffsetOff'">atOffsetOff</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/atOffsetOnOff'">atOffsetOnOff</button>
            </div>
        </div>
        <div class="atMDStartStop-commands">
            <div class="btn-group mr-2" role="group" aria-label="First group">
                <button type="button" class="btn btn-secondary" disabled style="width: 200px">Camera atMDStartStop:</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/atMDStartStop'">atMDStartStop</button>
            </div>
        </div>
        <div class="misc-commands">
            <div class="btn-group mr-2" role="group" aria-label="First group">
                <button type="button" class="btn btn-secondary" disabled style="width: 200px">Camera misc:</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/miscAddressSet'">miscAddressSet</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/miscIFClear'">miscIFClear</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/miscCommandCancel'">miscCommandCancel</button>
            </div>
        </div>
    </div>

</body>
</html>
