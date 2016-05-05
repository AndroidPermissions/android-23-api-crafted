package android.os;

/**
 * @author Denis Bogdanas <bogdanad@oregonstate.edu> Created on 5/4/2016.
 */
public class BatteryManagerFactory {
    public static BatteryManager create() {
        return new BatteryManager();
    }
}
