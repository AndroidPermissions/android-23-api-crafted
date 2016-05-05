package android.telephony;

/**
 * @author Denis Bogdanas <bogdanad@oregonstate.edu> Created on 5/4/2016.
 */
public class SubscriptionManagerFactory {
    public static SubscriptionManager create() {
        return new SubscriptionManager();
    }
}
