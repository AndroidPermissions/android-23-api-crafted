package android.telecom;

/**
 * @author Denis Bogdanas <bogdanad@oregonstate.edu> Created on 8/8/2016.
 */
public class TelecomManagerFactory {
    public static TelecomManager create() {
        return new TelecomManager();
    }
}
