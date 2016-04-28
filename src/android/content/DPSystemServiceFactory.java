package android.content;

import android.location.LocationManager;
import android.stubs.WindowManagerStub;
import android.view.WindowManager;

/**
 * @author Denis Bogdanas <bogdanad@oregonstate.edu> Created on 4/27/2016.
 */
public class DPSystemServiceFactory {

    /**
     * Gets the name of the system-level service that is represented by the specified class.
     *
     * @param serviceClass The class of the desired service.
     * @return The service name or null if the class is not a supported system service.
     */
    public static String getSystemServiceName(Class<?> serviceClass) {
        if (serviceClass == WindowManager.class) {
            return Context.WINDOW_SERVICE;
        } else {
            return null;
        }
    }

    /**
     * @see #WINDOW_SERVICE
     * @see android.view.WindowManager
     * @see #LAYOUT_INFLATER_SERVICE
     * @see android.view.LayoutInflater
     * @see #ACTIVITY_SERVICE
     * @see android.app.ActivityManager
     * @see #POWER_SERVICE
     * @see android.os.PowerManager
     * @see #ALARM_SERVICE
     * @see android.app.AlarmManager
     * @see #NOTIFICATION_SERVICE
     * @see android.app.NotificationManager
     * @see #KEYGUARD_SERVICE
     * @see android.app.KeyguardManager
     * @see #LOCATION_SERVICE
     * @see android.location.LocationManager
     * @see #SEARCH_SERVICE
     * @see android.app.SearchManager
     * @see #SENSOR_SERVICE
     * @see android.hardware.SensorManager
     * @see #STORAGE_SERVICE
     * @see android.os.storage.StorageManager
     * @see #VIBRATOR_SERVICE
     * @see android.os.Vibrator
     * @see #CONNECTIVITY_SERVICE
     * @see android.net.ConnectivityManager
     * @see #WIFI_SERVICE
     * @see android.net.wifi.WifiManager
     * @see #AUDIO_SERVICE
     * @see android.media.AudioManager
     * @see #MEDIA_ROUTER_SERVICE
     * @see android.media.MediaRouter
     * @see #TELEPHONY_SERVICE
     * @see android.telephony.TelephonyManager
     * @see #TELEPHONY_SUBSCRIPTION_SERVICE
     * @see android.telephony.SubscriptionManager
     * @see #CARRIER_CONFIG_SERVICE
     * @see android.telephony.CarrierConfigManager
     * @see #INPUT_METHOD_SERVICE
     * @see android.view.inputmethod.InputMethodManager
     * @see #UI_MODE_SERVICE
     * @see android.app.UiModeManager
     * @see #DOWNLOAD_SERVICE
     * @see android.app.DownloadManager
     * @see #BATTERY_SERVICE
     * @see android.os.BatteryManager
     * @see #JOB_SCHEDULER_SERVICE
     * @see android.app.job.JobScheduler
     * @see #NETWORK_STATS_SERVICE
     * @see android.app.usage.NetworkStatsManager
     */
    public static Object getSystemService(String name) {
        switch (name) {
            /*
            * @see #LOCATION_SERVICE
            * @see android.location.LocationManager
            * */
            case Context.WINDOW_SERVICE:
                return new WindowManagerStub();
            case Context.LOCATION_SERVICE:
                //todo create a clean android.jar lib that doesn't contain this and other crafted classes
                //use it as dependency of this project
                Class<?> clazz = LocationManager.class;
                try {
                    return clazz.newInstance();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            default:
                return null;
        }
    }
}