//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package android.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class AlarmManager {
    public static final String ACTION_NEXT_ALARM_CLOCK_CHANGED = "android.app.action.NEXT_ALARM_CLOCK_CHANGED";
    public static final int ELAPSED_REALTIME = 3;
    public static final int ELAPSED_REALTIME_WAKEUP = 2;
    public static final long INTERVAL_DAY = 86400000L;
    public static final long INTERVAL_FIFTEEN_MINUTES = 900000L;
    public static final long INTERVAL_HALF_DAY = 43200000L;
    public static final long INTERVAL_HALF_HOUR = 1800000L;
    public static final long INTERVAL_HOUR = 3600000L;
    public static final int RTC = 1;
    public static final int RTC_WAKEUP = 0;

    public AlarmManager() {
        throw new RuntimeException("Stub!");
    }

    public void set(int type, long triggerAtMillis, PendingIntent operation) {
        throw new RuntimeException("Stub!");
    }

    public void setRepeating(int type, long triggerAtMillis, long intervalMillis, PendingIntent operation) {
        throw new RuntimeException("Stub!");
    }

    public void setWindow(int type, long windowStartMillis, long windowLengthMillis, PendingIntent operation) {
        throw new RuntimeException("Stub!");
    }

    public void setExact(int type, long triggerAtMillis, PendingIntent operation) {
        throw new RuntimeException("Stub!");
    }

    public void setAlarmClock(AlarmManager.AlarmClockInfo info, PendingIntent operation) {
        throw new RuntimeException("Stub!");
    }

    public void setInexactRepeating(int type, long triggerAtMillis, long intervalMillis, PendingIntent operation) {
        throw new RuntimeException("Stub!");
    }

    public void setAndAllowWhileIdle(int type, long triggerAtMillis, PendingIntent operation) {
        throw new RuntimeException("Stub!");
    }

    public void setExactAndAllowWhileIdle(int type, long triggerAtMillis, PendingIntent operation) {
        throw new RuntimeException("Stub!");
    }

    public void cancel(PendingIntent operation) {
        throw new RuntimeException("Stub!");
    }

    public void setTime(long millis) {
        throw new RuntimeException("Stub!");
    }

    public void setTimeZone(String timeZone) {
        throw new RuntimeException("Stub!");
    }

    public AlarmManager.AlarmClockInfo getNextAlarmClock() {
        throw new RuntimeException("Stub!");
    }

    public static final class AlarmClockInfo implements Parcelable {
        public static final Creator<AlarmManager.AlarmClockInfo> CREATOR = null;

        public AlarmClockInfo(long triggerTime, PendingIntent showIntent) {
            throw new RuntimeException("Stub!");
        }

        public long getTriggerTime() {
            throw new RuntimeException("Stub!");
        }

        public PendingIntent getShowIntent() {
            throw new RuntimeException("Stub!");
        }

        public int describeContents() {
            throw new RuntimeException("Stub!");
        }

        public void writeToParcel(Parcel dest, int flags) {
            throw new RuntimeException("Stub!");
        }
    }
}
