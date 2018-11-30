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
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/powerOn'">on</button>
                <button type="button" class="btn btn-secondary" onclick="window.location.href='/powerOff'">off</button>
            </div>
        </div>
        <div class="zoom-commands">

        </div>
        <div class="focus-commands">

        </div>
        <div class="backlight-commands">

        </div>
        <div class="memory-commands">

        </div>
        <div class="keyLock-commands">

        </div>
        <div class="irReceive-commands">

        </div>
        <div class="irReceiveReturn-commands">

        </div>
        <div class="panTilt-commands">

        </div>
    </div>

</body>
</html>
