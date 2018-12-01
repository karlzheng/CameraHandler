<div class="misc-commands">
    <div class="btn-group mr-2" role="group" aria-label="First group">
        <button type="button" class="btn btn-secondary" disabled style="width: 200px">Camera misc:</button>
        <button type="button" class="btn btn-secondary" onclick="window.location.href='/miscAddressSet'">miscAddressSet</button>
        <button type="button" class="btn btn-secondary" onclick="window.location.href='/miscIFClear'">miscIFClear</button>
        <button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#miscCommandCancelModal">miscCommandCancel</button>
    </div>
</div>

<!-- Modal -->
<div class="modal fade" id="miscCommandCancelModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <form action="/miscCommandCancel">
                    <ul style="list-style-type:none">
                        <li>Socket number: <input type="text" name="socketNumber"></li> <!-- validation for int input-->
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
