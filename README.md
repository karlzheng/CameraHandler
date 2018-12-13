# Camera Handler
Control Sony VISCA EVI-D30/D31 camera through web interface or console.

Features:
* choosing target camera (1-8 or broadcast)
* configuring camera
* steering the movement
* creating and executing command macros
* 70 different commands implemented

# How to use?


## Use web interface

Using web interface is intuitive and therefore detailed description is not needed.


## Use console

To type commands into console you have to follow this pattern:

```
<command-group-lowercase> <command-name-lowercase> <arg-1> ... <arg-n>

// examples:
pantilt upright 15 4
zoom wide
focus autofocuson
power off
addressset setaddress 4
```

All implemented commands:

<table>
    <thead>
        <tr>
            <th>Group</th>
            <th>Command</th>
            <th>Argument values</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td rowspan=2>AddressSet</td>
            <td><code>setAddress(int address)</code></td>
            <td rowspan=2><strong>address</strong>:
                <ul>
                    <li>1-8 - camera number</li>
                    <li>0 - broadcast</li>
                </ul>
            </td>
        </tr>
        <tr>
            <td><code>ifClear()</code></td>
        </tr>
        <tr>
            <td rowspan=3>ATAE</td>
            <td><code>on()</code></td>
            <td rowspan=3></td>
        </tr>
        <tr>
            <td><code>off()</code></td>
        </tr>
        <tr>
            <td><code>onOff()</code></td>
        </tr>
        <tr>
            <td rowspan=3>ATAutoZoom</td>
            <td><code>on()</code></td>
            <td rowspan=3></td>
        </tr>
        <tr>
            <td><code>off()</code></td>
        </tr>
        <tr>
            <td><code>onOff()</code></td>
        </tr>
        <tr>
            <td rowspan=3>ATMDFrameDisplay</td>
            <td><code>on()</code></td>
            <td rowspan=3></td>
        </tr>
        <tr>
            <td><code>off()</code></td>
        </tr>
        <tr>
            <td><code>onOff()</code></td>
        </tr>
        <tr>
            <td>ATMDStartStop</td>
            <td><code>startStop()</code></td>
            <td></td>
        </tr>
        <tr>
            <td rowspan=3>ATMode</td>
            <td><code>on()</code></td>
            <td rowspan=3></td>
        </tr>
        <tr>
            <td><code>off()</code></td>
        </tr>
        <tr>
            <td><code>onOff()</code></td>
        </tr>
        <tr>
            <td rowspan=3>ATOffset</td>
            <td><code>on()</code></td>
            <td rowspan=3></td>
        </tr>
        <tr>
            <td><code>off()</code></td>
        </tr>
        <tr>
            <td><code>onOff()</code></td>
        </tr>
        <tr>
            <td rowspan=2>Backlight</td>
            <td><code>on()</code></td>
            <td rowspan=2></td>
        </tr>
        <tr>
            <td><code>off()</code></td>
        </tr>
        <tr>
            <td rowspan=3>Bright</td>
            <td><code>reset()</code></td>
            <td rowspan=3></td>
        </tr>
        <tr>
            <td><code>up()</code></td>
        </tr>
        <tr>
            <td><code>down()</code></td>
        </tr>
        <tr>
            <td rowspan=3>Datascreen</td>
            <td><code>on()</code></td>
            <td rowspan=3></td>
        </tr>
        <tr>
            <td><code>off()</code></td>
        </tr>
        <tr>
            <td><code>onOff()</code></td>
        </tr>
        <tr>
            <td rowspan=7>Focus</td>
            <td><code>stop()</code></td>
            <td rowspan=7><strong>focusData</strong>: 0-100</td>
        </tr>
        <tr>
            <td><code>far()</code></td>
        </tr>
        <tr>
            <td><code>near()</code></td>
        </tr>
        <tr>
            <td><code>autoFocusOn()</code></td>
        </tr>
        <tr>
            <td><code>manualFocusOn()</code></td>
        </tr>
        <tr>
            <td><code>mixedFocus()</code></td>
        </tr>
        <tr>
            <td><code>direct(int focusData)</code></td>
        </tr>
        <tr>
            <td rowspan=3>IRReceive</td>
            <td><code>on()</code></td>
            <td rowspan=3></td>
        </tr>
        <tr>
            <td><code>off()</code></td>
        </tr>
        <tr>
            <td><code>onOff()</code></td>
        </tr>
        <tr>
            <td rowspan=2>IRReceiveReturn</td>
            <td><code>on()</code></td>
            <td rowspan=2></td>
        </tr>
        <tr>
            <td><code>off()</code></td>
        </tr>
        <tr>
            <td rowspan=2>KeyLock</td>
            <td><code>on()</code></td>
            <td rowspan=2></td>
        </tr>
        <tr>
            <td><code>off()</code></td>
        </tr>
        <tr>
            <td rowspan=3>Memory</td>
            <td><code>reset(int positionNumber)</code></td>
            <td rowspan=3><strong>positionNumber</strong>: 0-5</td>
        </tr>
        <tr>
            <td><code>set(int positionNumber)</code></td>
        </tr>
        <tr>
            <td><code>recall(int positionNumber)</code></td>
        </tr>
        <tr>
            <td>Misc</td>
            <td><code>commandCancel(int socketNumber)</code></td>
            <td><strong>socketNumber</strong>: 0 or 1</td>
        </tr>
        <tr>
            <td rowspan=13>PanTilt</td>
            <td><code>up(int panSpeed, int tiltSpeed)</code></td>
            <td rowspan=13>
                <strong>panSpeed</strong>: 1-18<br/>
                <strong>tiltSpeed</strong>: 1-14<br/>
                <strong>panPosition</strong>: 0-100</br>
                <strong>tiltPosition</strong>: 0-100
            </td>
        </tr>
        <tr>
            <td><code>down(int panSpeed, int tiltSpeed)</code></td>
        </tr>
        <tr>
            <td><code>left(int panSpeed, int tiltSpeed)</code></td>
        </tr>
        <tr>
            <td><code>right(int panSpeed, int tiltSpeed)</code></td>
        </tr>
        <tr>
            <td><code>upLeft(int panSpeed, int tiltSpeed)</code></td>
        </tr>
        <tr>
            <td><code>upRight(int panSpeed, int tiltSpeed)</code></td>
        </tr>
        <tr>
            <td><code>downLeft(int panSpeed, int tiltSpeed)</code></td>
        </tr>
        <tr>
            <td><code>downRight(int panSpeed, int tiltSpeed)</code></td>
        </tr>
        <tr>
            <td><code>stop(int panSpeed, int tiltSpeed)</code></td>
        </tr>
        <tr>
            <td><code>absolutePosition(int panSpeed, int tiltSpeed, int panPosition, int tiltPosition)</code></td>
        </tr>
        <tr>
            <td><code>relativePosition(int panSpeed, int tiltSpeed, int panPosition, int tiltPosition)</code></td>
        </tr>
        <tr>
            <td><code>home()</code></td>
        </tr>
        <tr>
            <td><code>reset()</code></td>
        </tr>
        <tr>
            <td rowspan=2>PanTiltLimit</td>
            <td><code>limitSet(int corner, int panPosition, int tiltPosition)</code></td>
            <td rowspan=2>
                <strong>corner</strong>: 0 or 1<br/>
                <strong>panPosition</strong>: 0-100<br/>
                <strong>tiltPosition</strong>: 0-100
            </td>
        </tr>
        <tr>
            <td><code>limitClear(int corner)</code></td>
        </tr>
        <tr>
            <td rowspan=2>Power</td>
            <td><code>on()</code></td>
            <td rowspan=2></td>
        </tr>
        <tr>
            <td><code>off()</code></td>
        </tr>
        <tr>
            <td rowspan=6>Zoom</td>
            <td><code>stop()</code></td>
            <td rowspan=6>
                <strong>zoomSpeed</strong>: 2-7<br/>
                <strong>zoomData</strong>: 0-100
            </td>
        </tr>
        <tr>
            <td><code>tele()</code></td>
        </tr>
        <tr>
            <td><code>wide()</code></td>
        </tr>
        <tr>
            <td><code>tele(int zoomSpeed)</code></td>
        </tr>
        <tr>
            <td><code>wide(int zoomSpeed)</code></td>
        </tr>
        <tr>
            <td><code>direct(int zoomData)</code></td>
        </tr>
    </tbody>
</table>
