package org.oregonstate.stubs;

import android.content.Context;
import android.view.LayoutInflater;

/**
 * @author Denis Bogdanas <bogdanad@oregonstate.edu> Created on 5/4/2016.
 */
public class LayoutInflaterStub extends LayoutInflater {

    public LayoutInflaterStub() {
        super(null);
    }

    @Override
    public LayoutInflater cloneInContext(Context context) {
        return null;
    }
}
