//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package android.app;

import android.content.Intent;

public class KeyguardManager {
    public KeyguardManager() {
        throw new RuntimeException("Stub!");
    }

    public Intent createConfirmDeviceCredentialIntent(CharSequence title, CharSequence description) {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public KeyguardManager.KeyguardLock newKeyguardLock(String tag) {
        throw new RuntimeException("Stub!");
    }

    public boolean isKeyguardLocked() {
        throw new RuntimeException("Stub!");
    }

    public boolean isKeyguardSecure() {
        throw new RuntimeException("Stub!");
    }

    public boolean inKeyguardRestrictedInputMode() {
        throw new RuntimeException("Stub!");
    }

    public boolean isDeviceLocked() {
        throw new RuntimeException("Stub!");
    }

    public boolean isDeviceSecure() {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public void exitKeyguardSecurely(KeyguardManager.OnKeyguardExitResult callback) {
        throw new RuntimeException("Stub!");
    }

    public interface OnKeyguardExitResult {
        void onKeyguardExitResult(boolean var1);
    }

    /** @deprecated */
    @Deprecated
    public class KeyguardLock {
        KeyguardLock() {
            throw new RuntimeException("Stub!");
        }

        public void disableKeyguard() {
            throw new RuntimeException("Stub!");
        }

        public void reenableKeyguard() {
            throw new RuntimeException("Stub!");
        }
    }
}
