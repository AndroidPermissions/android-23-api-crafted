//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package android.app;

import android.app.Notification;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.service.notification.StatusBarNotification;

public class NotificationManager {
    public static final String ACTION_INTERRUPTION_FILTER_CHANGED = "android.app.action.INTERRUPTION_FILTER_CHANGED";
    public static final String ACTION_NOTIFICATION_POLICY_ACCESS_GRANTED_CHANGED = "android.app.action.NOTIFICATION_POLICY_ACCESS_GRANTED_CHANGED";
    public static final String ACTION_NOTIFICATION_POLICY_CHANGED = "android.app.action.NOTIFICATION_POLICY_CHANGED";
    public static final int INTERRUPTION_FILTER_ALARMS = 4;
    public static final int INTERRUPTION_FILTER_ALL = 1;
    public static final int INTERRUPTION_FILTER_NONE = 3;
    public static final int INTERRUPTION_FILTER_PRIORITY = 2;
    public static final int INTERRUPTION_FILTER_UNKNOWN = 0;

    public NotificationManager() {
        throw new RuntimeException("Stub!");
    }

    public void notify(int id, Notification notification) {
        throw new RuntimeException("Stub!");
    }

    public void notify(String tag, int id, Notification notification) {
        throw new RuntimeException("Stub!");
    }

    public void cancel(int id) {
        throw new RuntimeException("Stub!");
    }

    public void cancel(String tag, int id) {
        throw new RuntimeException("Stub!");
    }

    public void cancelAll() {
        throw new RuntimeException("Stub!");
    }

    public boolean isNotificationPolicyAccessGranted() {
        throw new RuntimeException("Stub!");
    }

    public NotificationManager.Policy getNotificationPolicy() {
        throw new RuntimeException("Stub!");
    }

    public void setNotificationPolicy(NotificationManager.Policy policy) {
        throw new RuntimeException("Stub!");
    }

    public StatusBarNotification[] getActiveNotifications() {
        throw new RuntimeException("Stub!");
    }

    public final int getCurrentInterruptionFilter() {
        throw new RuntimeException("Stub!");
    }

    public final void setInterruptionFilter(int interruptionFilter) {
        throw new RuntimeException("Stub!");
    }

    public static class Policy implements Parcelable {
        public static final Creator<NotificationManager.Policy> CREATOR = null;
        public static final int PRIORITY_CATEGORY_CALLS = 8;
        public static final int PRIORITY_CATEGORY_EVENTS = 2;
        public static final int PRIORITY_CATEGORY_MESSAGES = 4;
        public static final int PRIORITY_CATEGORY_REMINDERS = 1;
        public static final int PRIORITY_CATEGORY_REPEAT_CALLERS = 16;
        public static final int PRIORITY_SENDERS_ANY = 0;
        public static final int PRIORITY_SENDERS_CONTACTS = 1;
        public static final int PRIORITY_SENDERS_STARRED = 2;
        public final int priorityCallSenders;
        public final int priorityCategories;
        public final int priorityMessageSenders;

        public Policy(int priorityCategories, int priorityCallSenders, int priorityMessageSenders) {
            throw new RuntimeException("Stub!");
        }

        public void writeToParcel(Parcel dest, int flags) {
            throw new RuntimeException("Stub!");
        }

        public int describeContents() {
            throw new RuntimeException("Stub!");
        }

        public int hashCode() {
            throw new RuntimeException("Stub!");
        }

        public boolean equals(Object o) {
            throw new RuntimeException("Stub!");
        }

        public String toString() {
            throw new RuntimeException("Stub!");
        }

        public static String priorityCategoriesToString(int priorityCategories) {
            throw new RuntimeException("Stub!");
        }

        public static String prioritySendersToString(int prioritySenders) {
            throw new RuntimeException("Stub!");
        }
    }
}
