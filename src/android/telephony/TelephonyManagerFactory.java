package android.telephony;

/**
 * @author Denis Bogdanas <bogdanad@oregonstate.edu> Created on 5/4/2016.
 */
public class TelephonyManagerFactory {
    public static TelephonyManager create() {
        return new TelephonyManager();
    }
}
