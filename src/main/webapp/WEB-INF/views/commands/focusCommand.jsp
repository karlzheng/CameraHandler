<div class="focus-commands">
    <div class="btn-group mr-2" role="group" aria-label="First group">
        <button type="button" class="btn btn-secondary" disabled style="width: 200px">Camera focus:</button>
        <button type="button" class="btn btn-secondary" onclick="window.location.href='/focusStop'">focusStop</button>
        <button type="button" class="btn btn-secondary" onclick="window.location.href='/focusFar'">focusFar</button>
        <button type="button" class="btn btn-secondary" onclick="window.location.href='/focusNear'">focusNear</button>
        <button type="button" class="btn btn-secondary" onclick="window.location.href='/autoFocusOn'">autoFocusOn</button>
        <button type="button" class="btn btn-secondary" onclick="window.location.href='/manualFocusOn'">manualFocusOn</button>
        <button type="button" class="btn btn-secondary" onclick="window.location.href='/mixedFocus'">mixedFocus</button>
        <button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#directFocusModal">directFocus</button>
    </div>
</div>

<!-- Modal -->
<div class="modal fade" id="directFocusModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <form action="/directFocus">
                    <ul style="list-style-type:none">
                        <li>Focus data: <input type="number" name="focusData" min="0" max="100" required></li> <!-- validation for int input-->
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
