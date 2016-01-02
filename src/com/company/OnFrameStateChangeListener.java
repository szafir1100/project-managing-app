package com.company;

import java.util.EventListener;

/**
 * Created by Tomek on 2015-12-07.
 */
public interface OnFrameStateChangeListener extends EventListener {

    void frameStateChanged(Window.FrameState frameState, String loggedUsername, String loggedPassword);
}
