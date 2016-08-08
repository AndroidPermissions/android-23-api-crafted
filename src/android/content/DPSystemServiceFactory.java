package android.content;

import android.accounts.AccountManagerFactory;
import android.app.DownloadManagerFactory;
import android.app.UiModeManagerFactory;
import android.app.usage.NetworkStatsManagerFactory;
import android.hardware.camera2.CameraManagerFactory;
import android.media.MediaRouterFactory;
import android.os.BatteryManagerFactory;
import android.telecom.TelecomManagerFactory;
import android.telephony.CarrierConfigManagerFactory;
import android.telephony.SubscriptionManagerFactory;
import android.telephony.TelephonyManagerFactory;
import android.view.inputmethod.InputMethodManagerFactory;
import org.oregonstate.stubs.JobSchedulerStub;
import org.oregonstate.stubs.LayoutInflaterStub;
import org.oregonstate.stubs.WindowManagerStub;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Denis Bogdanas <bogdanad@oregonstate.edu> Created on 4/27/2016.
 */
public class DPSystemServiceFactory {

    private static final Map<String, Class<?>> nameToServiceClassMap = new HashMap<>();
    private static final Map<Class<?>, String> serviceClassToNameMap = new HashMap<>();

    static {
        registerService(Context.WINDOW_SERVICE, android.view.WindowManager.class);
        registerService(Context.LAYOUT_INFLATER_SERVICE, android.view.LayoutInflater.class);
        registerService(Context.ACTIVITY_SERVICE, android.app.ActivityManager.class);
        registerService(Context.POWER_SERVICE, android.os.PowerManager.class);
        registerService(Context.ALARM_SERVICE, android.app.AlarmManager.class);
        registerService(Context.NOTIFICATION_SERVICE, android.app.NotificationManager.class);
        registerService(Context.KEYGUARD_SERVICE, android.app.KeyguardManager.class);
        registerService(Context.LOCATION_SERVICE, android.location.LocationManager.class);
        registerService(Context.SEARCH_SERVICE, android.app.SearchManager.class);
        registerService(Context.SENSOR_SERVICE, android.hardware.SensorManager.class);
        registerService(Context.STORAGE_SERVICE, android.os.storage.StorageManager.class);
        registerService(Context.VIBRATOR_SERVICE, android.os.Vibrator.class);
        registerService(Context.CONNECTIVITY_SERVICE, android.net.ConnectivityManager.class);
        registerService(Context.WIFI_SERVICE, android.net.wifi.WifiManager.class);
        registerService(Context.AUDIO_SERVICE, android.media.AudioManager.class);
        registerService(Context.MEDIA_ROUTER_SERVICE, android.media.MediaRouter.class);
        registerService(Context.TELEPHONY_SERVICE, android.telephony.TelephonyManager.class);
        registerService(Context.TELEPHONY_SUBSCRIPTION_SERVICE, android.telephony.SubscriptionManager.class);
        registerService(Context.CARRIER_CONFIG_SERVICE, android.telephony.CarrierConfigManager.class);
        registerService(Context.INPUT_METHOD_SERVICE, android.view.inputmethod.InputMethodManager.class);
        registerService(Context.UI_MODE_SERVICE, android.app.UiModeManager.class);
        registerService(Context.DOWNLOAD_SERVICE, android.app.DownloadManager.class);
        registerService(Context.JOB_SCHEDULER_SERVICE, android.app.job.JobScheduler.class);
        registerService(Context.NETWORK_STATS_SERVICE, android.app.usage.NetworkStatsManager.class);

        registerService(Context.CAMERA_SERVICE, android.hardware.camera2.CameraManager.class);
        registerService(Context.ACCOUNT_SERVICE, android.accounts.AccountManager.class);
        registerService(Context.TELECOM_SERVICE, android.telecom.TelecomManager.class);
    }

    private static void registerService(String name, Class<?> clazz) {
        nameToServiceClassMap.put(name, clazz);
        serviceClassToNameMap.put(clazz, name);
    }

    /**
     * Gets the name of the system-level service that is represented by the specified class.
     *
     * @param serviceClass The class of the desired service.
     * @return The service name or null if the class is not a supported system service.
     */
    public static String getSystemServiceName(Class<?> serviceClass) {
        return serviceClassToNameMap.get(serviceClass);
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
        return getSystemService(nameToServiceClassMap.get(name));
    }

    /**
     * Return the handle to a system-level service by class. <p> Note: System services obtained via this API may be
     * closely associated with the Context in which they are obtained from.  In general, do not share the service
     * objects between various different contexts (Activities, Applications, Services, Providers, etc.) </p>
     *
     * @param serviceClass The class of the desired service.
     * @return The service or null if the class is not a supported system service.
     */
    @SuppressWarnings("unchecked")
    public static <T> T getSystemService(Class<T> serviceClass) {
        //Original implementation:

        // Because subclasses may override getSystemService(String) we cannot
        // perform a lookup by class alone.  We must first map the class to its
        // service name then invoke the string-based method.
        //String serviceName = getSystemServiceName(serviceClass);
        //return serviceName != null ? (T)getSystemService(serviceName) : null;

        //only permissions with explicit annotations were checked whether normal or dangerous
        //http://developer.android.com/guide/topics/security/permissions.html#normal-dangerous
        //http://developer.android.com/guide/topics/security/normal-permissions.html
        if (serviceClass == android.view.WindowManager.class) {
            return (T) new WindowManagerStub(); //none
        } else if (serviceClass == android.view.LayoutInflater.class) {
            return (T) new LayoutInflaterStub(); //none
        } else if (serviceClass == android.app.ActivityManager.class) {
            return (T) new android.app.ActivityManager(); //none INTERACT_ACROSS_USERS_FULL, others, no annot.
        } else if (serviceClass == android.os.PowerManager.class) {
            return (T) new android.os.PowerManager(); //DEVICE_POWER, others, no annot
        } else if (serviceClass == android.app.AlarmManager.class) {
            return (T) new android.app.AlarmManager(); //SET_TIME, no annot
        } else if (serviceClass == android.app.NotificationManager.class) {
            return (T) new android.app.NotificationManager(); //none
        } else if (serviceClass == android.app.KeyguardManager.class) {
            return (T) new android.app.KeyguardManager(); //DISABLE_KEYGUARD, normal perm
        } else if (serviceClass == android.location.LocationManager.class) {
            return (T) new android.location.LocationManager(); //ACCESS_COARSE_LOCATION, ACCESS_FINE_LOCATION
        } else if (serviceClass == android.app.SearchManager.class) {
            return (T) new android.app.SearchManager(); //none
        } else if (serviceClass == android.hardware.SensorManager.class) {
            return (T) new android.hardware.SensorManager(); //parametric, not documented/annotated.
        } else if (serviceClass == android.os.storage.StorageManager.class) {
            return (T) new android.os.storage.StorageManager(); //none
        } else if (serviceClass == android.os.Vibrator.class) {
            return (T) new android.os.Vibrator(); //VIBRATE, normal perm
        } else if (serviceClass == android.net.ConnectivityManager.class) {
            return (T) new android.net.ConnectivityManager(); //ACCESS_NETWORK_STATE, no annot
        } else if (serviceClass == android.net.wifi.WifiManager.class) {
            return (T) new android.net.wifi.WifiManager(); //ACCESS_WIFI_STATE, normal
        } else if (serviceClass == android.media.AudioManager.class) {
            return (T) new android.media.AudioManager(); //MODIFY_AUDIO_SETTINGS, others, no anno
        } else if (serviceClass == android.media.MediaRouter.class) {
            return (T) MediaRouterFactory.create(); //none
        } else if (serviceClass == android.telephony.TelephonyManager.class) {
            return (T) TelephonyManagerFactory.create(); //READ_PHONE_STATE, many related, not annotated
        } else if (serviceClass == android.telephony.SubscriptionManager.class) {
            return (T) SubscriptionManagerFactory.create(); //READ_PHONE_STATE, no anno
        } else if (serviceClass == android.telephony.CarrierConfigManager.class) {
            return (T) CarrierConfigManagerFactory.create(); //READ_PHONE_STATE, not annotated
        } else if (serviceClass == android.view.inputmethod.InputMethodManager.class) {
            return (T) InputMethodManagerFactory.create(); //WRITE_SECURE_SETTINGS
        } else if (serviceClass == android.app.UiModeManager.class) {
            return (T) UiModeManagerFactory.create(); //none
        } else if (serviceClass == android.app.DownloadManager.class) {
            //ACCESS_CACHE_FILESYSTEM (unknown kind), many others, no annotations
            return (T) DownloadManagerFactory.create();
        } else if (serviceClass == android.os.BatteryManager.class) {
            return (T) BatteryManagerFactory.create(); //none
        } else if (serviceClass == android.app.job.JobScheduler.class) {
            return (T) new JobSchedulerStub(); //none
        } else if (serviceClass == android.app.usage.NetworkStatsManager.class) {
            return (T) NetworkStatsManagerFactory.create(); //PACKAGE_USAGE_STATS, no annotations

        } else if (serviceClass == android.hardware.camera2.CameraManager.class) {
            return (T) CameraManagerFactory.create(); //CAMERA
        } else if (serviceClass == android.accounts.AccountManager.class) {
            return (T) AccountManagerFactory.create(); //GET_ACCOUNTS
        } else if (serviceClass == android.telecom.TelecomManager.class) {
            return (T) TelecomManagerFactory.create(); //READ_PHONE_STATE
        } else {
            return null;
        }
    }
}
