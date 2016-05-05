package android.app.usage;

/**
 * @author Denis Bogdanas <bogdanad@oregonstate.edu> Created on 5/4/2016.
 */
public class NetworkStatsManagerFactory {
    public static NetworkStatsManager create() {
        return new NetworkStatsManager();
    }
}
