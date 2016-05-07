package android.hardware.camera2;

/**
 * @author Denis Bogdanas <bogdanad@oregonstate.edu> Created on 5/6/2016.
 */
public class CameraManagerFactory {
    public static CameraManager create() {
        return new CameraManager();
    }
}
