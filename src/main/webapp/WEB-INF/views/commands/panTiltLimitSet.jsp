<div class="panTiltLimitSet-commands">
    <div class="btn-group mr-2" role="group" aria-label="First group">
        <button type="button" class="btn btn-secondary" disabled style="width: 200px">Camera PanTiltLimitSet:</button>
        <button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#panTiltlimitSetModal">panTiltlimitSet</button>
        <button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#panTiltlimitClearModal">panTiltlimitClear</button>
    </div>
</div>

<!-- Modal -->
<div class="modal fade" id="panTiltlimitSetModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <form action="/panTiltlimitSet">
                    <ul style="list-style-type:none">
                        <li>Corner: <input type="text" name="corner"></li> <!-- validation for int input-->
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
<div class="modal fade" id="panTiltlimitClearModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <form action="/panTiltlimitClear">
                    <ul style="list-style-type:none">
                        <li>Corner: <input type="text" name="corner"></li> <!-- validation for int input-->
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
