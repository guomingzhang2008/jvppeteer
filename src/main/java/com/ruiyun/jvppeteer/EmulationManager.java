package com.ruiyun.jvppeteer;

import com.ruiyun.jvppeteer.options.Viewport;
import com.ruiyun.jvppeteer.transport.websocket.CDPSession;

public class EmulationManager {

    private CDPSession client;

    private boolean emulatingMobile;

    private boolean hasTouch;

    public EmulationManager(CDPSession client) {
        this.client = client;
    }

    public boolean emulateViewport(Viewport viewport) {
        return false;
    }
}
