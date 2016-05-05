package org.oregonstate.stubs;

import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/**
 * @author Denis Bogdanas <bogdanad@oregonstate.edu> Created on 4/27/2016.
 */
public class WindowManagerStub implements WindowManager {
    @Override
    public Display getDefaultDisplay() {
        return null;
    }

    @Override
    public void removeViewImmediate(View view) {

    }

    @Override
    public void addView(View view, ViewGroup.LayoutParams params) {

    }

    @Override
    public void updateViewLayout(View view, ViewGroup.LayoutParams params) {

    }

    @Override
    public void removeView(View view) {

    }
}
