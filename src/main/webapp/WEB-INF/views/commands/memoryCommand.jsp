<div class="memory-commands">
    <div class="btn-group mr-2" role="group" aria-label="First group">
        <button type="button" class="btn btn-secondary" disabled style="width: 200px">Camera memory:</button>
        <button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#memoryResetModal">memoryReset</button>
        <button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#memorySetModal">memorySet</button>
        <button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#memoryRecallModal">memoryRecall</button>
    </div>
</div>

<!-- Modal -->
<div class="modal fade" id="memoryResetModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <form action="/memoryReset">
                    <ul style="list-style-type:none">
                        <li>Position number: <input type="text" name="positionNumber"></li> <!-- validation for int input-->
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
<div class="modal fade" id="memorySetModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <form action="/memorySet">
                    <ul style="list-style-type:none">
                        <li>Position number: <input type="text" name="positionNumber"></li> <!-- validation for int input-->
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
<div class="modal fade" id="memoryRecallModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <form action="/memoryRecall">
                    <ul style="list-style-type:none">
                        <li>Position number: <input type="text" name="positionNumber"></li> <!-- validation for int input-->
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
