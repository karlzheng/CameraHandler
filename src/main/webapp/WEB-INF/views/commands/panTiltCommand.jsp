<div class="panTilt-commands">
    <div class="btn-group mr-2" role="group" aria-label="First group">
        <button type="button" class="btn btn-secondary" disabled style="width: 200px">Camera PanTilt:</button>
        <button type="button" class="btn btn-secondary" onclick="window.location.href='/panTiltHome'">panTiltHome</button>
        <button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#panTiltUpModal">panTiltUp</button>
        <button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#panTiltDownModal">panTiltDown</button>
        <button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#panTiltLeftModal">panTiltLeft</button>
        <button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#panTiltRightModal">panTiltRight</button>
        <button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#panTiltUpLeftModal">panTiltUpLeft</button>
        <button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#panTiltUpRightModal">panTiltUpRight</button>
        <button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#panTiltDownLeftModal">panTiltDownLeft</button>
        <button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#panTiltDownRightModal">panTiltDownRight</button>
        <button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#panTiltStopModal">panTiltStop</button>
        <button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#panTiltAbsolutePositionModal">panTiltAbsolutePosition</button>
        <button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#panTiltRelativePositionModal">panTiltRelativePosition</button>
    </div>
</div>

<!-- Modal -->
<div class="modal fade" id="panTiltUpModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <form action="/panTiltUp">
                    <ul style="list-style-type:none">
                        <li>Pan speed: <input type="text" name="panSpeed"></li> <!-- validation for int input-->
                        <li>Tilt speed: <input type="text" name="tiltSpeed"></li> <!-- validation for int input-->
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

<!-- Modal -->
<div class="modal fade" id="panTiltDownModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <form action="/panTiltDown">
                    <ul style="list-style-type:none">
                        <li>Pan speed: <input type="text" name="panSpeed"></li> <!-- validation for int input-->
                        <li>Tilt speed: <input type="text" name="tiltSpeed"></li> <!-- validation for int input-->
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

<!-- Modal -->
<div class="modal fade" id="panTiltLeftModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <form action="/panTiltLeft">
                    <ul style="list-style-type:none">
                        <li>Pan speed: <input type="text" name="panSpeed"></li> <!-- validation for int input-->
                        <li>Tilt speed: <input type="text" name="tiltSpeed"></li> <!-- validation for int input-->
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

<!-- Modal -->
<div class="modal fade" id="panTiltRightModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <form action="/panTiltRight">
                    <ul style="list-style-type:none">
                        <li>Pan speed: <input type="text" name="panSpeed"></li> <!-- validation for int input-->
                        <li>Tilt speed: <input type="text" name="tiltSpeed"></li> <!-- validation for int input-->
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

<!-- Modal -->
<div class="modal fade" id="panTiltUpLeftModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <form action="/panTiltUpLeft">
                    <ul style="list-style-type:none">
                        <li>Pan speed: <input type="text" name="panSpeed"></li> <!-- validation for int input-->
                        <li>Tilt speed: <input type="text" name="tiltSpeed"></li> <!-- validation for int input-->
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

<!-- Modal -->
<div class="modal fade" id="panTiltUpRightModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <form action="/panTiltUpRight">
                    <ul style="list-style-type:none">
                        <li>Pan speed: <input type="text" name="panSpeed"></li> <!-- validation for int input-->
                        <li>Tilt speed: <input type="text" name="tiltSpeed"></li> <!-- validation for int input-->
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

<!-- Modal -->
<div class="modal fade" id="panTiltDownLeftModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <form action="/panTiltDownLeft">
                    <ul style="list-style-type:none">
                        <li>Pan speed: <input type="text" name="panSpeed"></li> <!-- validation for int input-->
                        <li>Tilt speed: <input type="text" name="tiltSpeed"></li> <!-- validation for int input-->
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

<!-- Modal -->
<div class="modal fade" id="panTiltDownRightModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <form action="/panTiltDownRight">
                    <ul style="list-style-type:none">
                        <li>Pan speed: <input type="text" name="panSpeed"></li> <!-- validation for int input-->
                        <li>Tilt speed: <input type="text" name="tiltSpeed"></li> <!-- validation for int input-->
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

<!-- Modal -->
<div class="modal fade" id="panTiltStopModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <form action="/panTiltStop">
                    <ul style="list-style-type:none">
                        <li>Pan speed: <input type="text" name="panSpeed"></li> <!-- validation for int input-->
                        <li>Tilt speed: <input type="text" name="tiltSpeed"></li> <!-- validation for int input-->
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

<!-- Modal -->
<div class="modal fade" id="panTiltAbsolutePositionModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <form action="/panTiltAbsolutePosition">
                    <ul style="list-style-type:none">
                        <li>Pan speed: <input type="text" name="panSpeed"></li> <!-- validation for int input-->
                        <li>Tilt speed: <input type="text" name="tiltSpeed"></li> <!-- validation for int input-->
                        <li>Pan position: <input type="text" name="panPosition"></li> <!-- validation for int input-->
                        <li>Tilt position: <input type="text" name="tiltPosition"></li> <!-- validation for int input-->
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

<!-- Modal -->
<div class="modal fade" id="panTiltRelativePositionModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <form action="/panTiltRelativePosition">
                    <ul style="list-style-type:none">
                        <li>Pan speed: <input type="text" name="panSpeed"></li> <!-- validation for int input-->
                        <li>Tilt speed: <input type="text" name="tiltSpeed"></li> <!-- validation for int input-->
                        <li>Pan position: <input type="text" name="panPosition"></li> <!-- validation for int input-->
                        <li>Tilt position: <input type="text" name="tiltPosition"></li> <!-- validation for int input-->
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
