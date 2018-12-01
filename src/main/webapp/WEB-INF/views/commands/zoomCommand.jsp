<div class="zoom-commands">
    <div class="btn-group mr-2" role="group" aria-label="First group">
        <button type="button" class="btn btn-secondary" disabled style="width: 200px">Camera zoom:</button>
        <button type="button" class="btn btn-secondary" onclick="window.location.href='/zoomStop'">zoomStop</button>
        <button type="button" class="btn btn-secondary" onclick="window.location.href='/zoomTele'">zoomTele</button>
        <button type="button" class="btn btn-secondary" onclick="window.location.href='/zoomWide'">zoomWide</button>
        <button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#zoomTeleWithSpeedModal">zoomTeleWithSpeed</button>
        <button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#zoomWideWithSpeedModal">zoomWideWithSpeed</button>
        <button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#zoomDirectModal">zoomDirect</button>
    </div>
</div>


<!-- Modal -->
<div class="modal fade" id="zoomTeleWithSpeedModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <form action="/zoomTeleWithSpeed">
                    <ul style="list-style-type:none">
                        <li>Zoom speed: <input type="text" name="zoomSpeed"></li> <!-- validation for int input-->
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
<div class="modal fade" id="zoomWideWithSpeedModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <form action="/zoomWideWithSpeed">
                    <ul style="list-style-type:none">
                        <li>Zoom speed: <input type="text" name="zoomSpeed"></li> <!-- validation for int input-->
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
<div class="modal fade" id="zoomDirectModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <form action="/zoomDirect">
                    <ul style="list-style-type:none">
                        <li>Zoom data: <input type="text" name="zoomData"></li> <!-- validation for int input-->
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
