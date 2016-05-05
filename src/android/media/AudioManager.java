//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package android.media;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.RemoteControlClient;
import android.media.RemoteController;
import android.os.Handler;
import android.view.KeyEvent;

public class AudioManager {
    public static final String ACTION_AUDIO_BECOMING_NOISY = "android.media.AUDIO_BECOMING_NOISY";
    public static final String ACTION_HDMI_AUDIO_PLUG = "android.media.action.HDMI_AUDIO_PLUG";
    public static final String ACTION_HEADSET_PLUG = "android.intent.action.HEADSET_PLUG";
    /** @deprecated */
    @Deprecated
    public static final String ACTION_SCO_AUDIO_STATE_CHANGED = "android.media.SCO_AUDIO_STATE_CHANGED";
    public static final String ACTION_SCO_AUDIO_STATE_UPDATED = "android.media.ACTION_SCO_AUDIO_STATE_UPDATED";
    public static final int ADJUST_LOWER = -1;
    public static final int ADJUST_MUTE = -100;
    public static final int ADJUST_RAISE = 1;
    public static final int ADJUST_SAME = 0;
    public static final int ADJUST_TOGGLE_MUTE = 101;
    public static final int ADJUST_UNMUTE = 100;
    public static final int AUDIOFOCUS_GAIN = 1;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE = 4;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
    public static final int AUDIOFOCUS_LOSS = -1;
    public static final int AUDIOFOCUS_LOSS_TRANSIENT = -2;
    public static final int AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK = -3;
    public static final int AUDIOFOCUS_REQUEST_FAILED = 0;
    public static final int AUDIOFOCUS_REQUEST_GRANTED = 1;
    public static final int AUDIO_SESSION_ID_GENERATE = 0;
    public static final int ERROR = -1;
    public static final int ERROR_DEAD_OBJECT = -6;
    public static final String EXTRA_AUDIO_PLUG_STATE = "android.media.extra.AUDIO_PLUG_STATE";
    public static final String EXTRA_ENCODINGS = "android.media.extra.ENCODINGS";
    public static final String EXTRA_MAX_CHANNEL_COUNT = "android.media.extra.MAX_CHANNEL_COUNT";
    public static final String EXTRA_RINGER_MODE = "android.media.EXTRA_RINGER_MODE";
    public static final String EXTRA_SCO_AUDIO_PREVIOUS_STATE = "android.media.extra.SCO_AUDIO_PREVIOUS_STATE";
    public static final String EXTRA_SCO_AUDIO_STATE = "android.media.extra.SCO_AUDIO_STATE";
    /** @deprecated */
    @Deprecated
    public static final String EXTRA_VIBRATE_SETTING = "android.media.EXTRA_VIBRATE_SETTING";
    /** @deprecated */
    @Deprecated
    public static final String EXTRA_VIBRATE_TYPE = "android.media.EXTRA_VIBRATE_TYPE";
    public static final int FLAG_ALLOW_RINGER_MODES = 2;
    public static final int FLAG_PLAY_SOUND = 4;
    public static final int FLAG_REMOVE_SOUND_AND_VIBRATE = 8;
    public static final int FLAG_SHOW_UI = 1;
    public static final int FLAG_VIBRATE = 16;
    public static final int FX_FOCUS_NAVIGATION_DOWN = 2;
    public static final int FX_FOCUS_NAVIGATION_LEFT = 3;
    public static final int FX_FOCUS_NAVIGATION_RIGHT = 4;
    public static final int FX_FOCUS_NAVIGATION_UP = 1;
    public static final int FX_KEYPRESS_DELETE = 7;
    public static final int FX_KEYPRESS_INVALID = 9;
    public static final int FX_KEYPRESS_RETURN = 8;
    public static final int FX_KEYPRESS_SPACEBAR = 6;
    public static final int FX_KEYPRESS_STANDARD = 5;
    public static final int FX_KEY_CLICK = 0;
    public static final int GET_DEVICES_ALL = 3;
    public static final int GET_DEVICES_INPUTS = 1;
    public static final int GET_DEVICES_OUTPUTS = 2;
    public static final int MODE_CURRENT = -1;
    public static final int MODE_INVALID = -2;
    public static final int MODE_IN_CALL = 2;
    public static final int MODE_IN_COMMUNICATION = 3;
    public static final int MODE_NORMAL = 0;
    public static final int MODE_RINGTONE = 1;
    /** @deprecated */
    @Deprecated
    public static final int NUM_STREAMS = 5;
    public static final String PROPERTY_OUTPUT_FRAMES_PER_BUFFER = "android.media.property.OUTPUT_FRAMES_PER_BUFFER";
    public static final String PROPERTY_OUTPUT_SAMPLE_RATE = "android.media.property.OUTPUT_SAMPLE_RATE";
    public static final String PROPERTY_SUPPORT_MIC_NEAR_ULTRASOUND = "android.media.property.SUPPORT_MIC_NEAR_ULTRASOUND";
    public static final String PROPERTY_SUPPORT_SPEAKER_NEAR_ULTRASOUND = "android.media.property.SUPPORT_SPEAKER_NEAR_ULTRASOUND";
    public static final String RINGER_MODE_CHANGED_ACTION = "android.media.RINGER_MODE_CHANGED";
    public static final int RINGER_MODE_NORMAL = 2;
    public static final int RINGER_MODE_SILENT = 0;
    public static final int RINGER_MODE_VIBRATE = 1;
    /** @deprecated */
    @Deprecated
    public static final int ROUTE_ALL = -1;
    /** @deprecated */
    @Deprecated
    public static final int ROUTE_BLUETOOTH = 4;
    /** @deprecated */
    @Deprecated
    public static final int ROUTE_BLUETOOTH_A2DP = 16;
    /** @deprecated */
    @Deprecated
    public static final int ROUTE_BLUETOOTH_SCO = 4;
    /** @deprecated */
    @Deprecated
    public static final int ROUTE_EARPIECE = 1;
    /** @deprecated */
    @Deprecated
    public static final int ROUTE_HEADSET = 8;
    /** @deprecated */
    @Deprecated
    public static final int ROUTE_SPEAKER = 2;
    public static final int SCO_AUDIO_STATE_CONNECTED = 1;
    public static final int SCO_AUDIO_STATE_CONNECTING = 2;
    public static final int SCO_AUDIO_STATE_DISCONNECTED = 0;
    public static final int SCO_AUDIO_STATE_ERROR = -1;
    public static final int STREAM_ALARM = 4;
    public static final int STREAM_DTMF = 8;
    public static final int STREAM_MUSIC = 3;
    public static final int STREAM_NOTIFICATION = 5;
    public static final int STREAM_RING = 2;
    public static final int STREAM_SYSTEM = 1;
    public static final int STREAM_VOICE_CALL = 0;
    public static final int USE_DEFAULT_STREAM_TYPE = -2147483648;
    /** @deprecated */
    @Deprecated
    public static final String VIBRATE_SETTING_CHANGED_ACTION = "android.media.VIBRATE_SETTING_CHANGED";
    /** @deprecated */
    @Deprecated
    public static final int VIBRATE_SETTING_OFF = 0;
    /** @deprecated */
    @Deprecated
    public static final int VIBRATE_SETTING_ON = 1;
    /** @deprecated */
    @Deprecated
    public static final int VIBRATE_SETTING_ONLY_SILENT = 2;
    /** @deprecated */
    @Deprecated
    public static final int VIBRATE_TYPE_NOTIFICATION = 1;
    /** @deprecated */
    @Deprecated
    public static final int VIBRATE_TYPE_RINGER = 0;

    public AudioManager() {
        throw new RuntimeException("Stub!");
    }

    public void dispatchMediaKeyEvent(KeyEvent keyEvent) {
        throw new RuntimeException("Stub!");
    }

    public boolean isVolumeFixed() {
        throw new RuntimeException("Stub!");
    }

    public void adjustStreamVolume(int streamType, int direction, int flags) {
        throw new RuntimeException("Stub!");
    }

    public void adjustVolume(int direction, int flags) {
        throw new RuntimeException("Stub!");
    }

    public void adjustSuggestedStreamVolume(int direction, int suggestedStreamType, int flags) {
        throw new RuntimeException("Stub!");
    }

    public int getRingerMode() {
        throw new RuntimeException("Stub!");
    }

    public int getStreamMaxVolume(int streamType) {
        throw new RuntimeException("Stub!");
    }

    public int getStreamVolume(int streamType) {
        throw new RuntimeException("Stub!");
    }

    public void setRingerMode(int ringerMode) {
        throw new RuntimeException("Stub!");
    }

    public void setStreamVolume(int streamType, int index, int flags) {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public void setStreamSolo(int streamType, boolean state) {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public void setStreamMute(int streamType, boolean state) {
        throw new RuntimeException("Stub!");
    }

    public boolean isStreamMute(int streamType) {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public boolean shouldVibrate(int vibrateType) {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public int getVibrateSetting(int vibrateType) {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public void setVibrateSetting(int vibrateType, int vibrateSetting) {
        throw new RuntimeException("Stub!");
    }

    public void setSpeakerphoneOn(boolean on) {
        throw new RuntimeException("Stub!");
    }

    public boolean isSpeakerphoneOn() {
        throw new RuntimeException("Stub!");
    }

    public boolean isBluetoothScoAvailableOffCall() {
        throw new RuntimeException("Stub!");
    }

    public void startBluetoothSco() {
        throw new RuntimeException("Stub!");
    }

    public void stopBluetoothSco() {
        throw new RuntimeException("Stub!");
    }

    public void setBluetoothScoOn(boolean on) {
        throw new RuntimeException("Stub!");
    }

    public boolean isBluetoothScoOn() {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public void setBluetoothA2dpOn(boolean on) {
        throw new RuntimeException("Stub!");
    }

    public boolean isBluetoothA2dpOn() {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public void setWiredHeadsetOn(boolean on) {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public boolean isWiredHeadsetOn() {
        throw new RuntimeException("Stub!");
    }

    public void setMicrophoneMute(boolean on) {
        throw new RuntimeException("Stub!");
    }

    public boolean isMicrophoneMute() {
        throw new RuntimeException("Stub!");
    }

    public void setMode(int mode) {
        throw new RuntimeException("Stub!");
    }

    public int getMode() {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public void setRouting(int mode, int routes, int mask) {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public int getRouting(int mode) {
        throw new RuntimeException("Stub!");
    }

    public boolean isMusicActive() {
        throw new RuntimeException("Stub!");
    }

    public int generateAudioSessionId() {
        throw new RuntimeException("Stub!");
    }

    public void setParameters(String keyValuePairs) {
        throw new RuntimeException("Stub!");
    }

    public String getParameters(String keys) {
        throw new RuntimeException("Stub!");
    }

    public void playSoundEffect(int effectType) {
        throw new RuntimeException("Stub!");
    }

    public void playSoundEffect(int effectType, float volume) {
        throw new RuntimeException("Stub!");
    }

    public void loadSoundEffects() {
        throw new RuntimeException("Stub!");
    }

    public void unloadSoundEffects() {
        throw new RuntimeException("Stub!");
    }

    public int requestAudioFocus(AudioManager.OnAudioFocusChangeListener l, int streamType, int durationHint) {
        throw new RuntimeException("Stub!");
    }

    public int abandonAudioFocus(AudioManager.OnAudioFocusChangeListener l) {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public void registerMediaButtonEventReceiver(ComponentName eventReceiver) {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public void registerMediaButtonEventReceiver(PendingIntent eventReceiver) {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public void unregisterMediaButtonEventReceiver(ComponentName eventReceiver) {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public void unregisterMediaButtonEventReceiver(PendingIntent eventReceiver) {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public void registerRemoteControlClient(RemoteControlClient rcClient) {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public void unregisterRemoteControlClient(RemoteControlClient rcClient) {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public boolean registerRemoteController(RemoteController rctlr) {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public void unregisterRemoteController(RemoteController rctlr) {
        throw new RuntimeException("Stub!");
    }

    public String getProperty(String key) {
        throw new RuntimeException("Stub!");
    }

    public AudioDeviceInfo[] getDevices(int flags) {
        throw new RuntimeException("Stub!");
    }

    public void registerAudioDeviceCallback(AudioDeviceCallback callback, Handler handler) {
        throw new RuntimeException("Stub!");
    }

    public void unregisterAudioDeviceCallback(AudioDeviceCallback callback) {
        throw new RuntimeException("Stub!");
    }

    public interface OnAudioFocusChangeListener {
        void onAudioFocusChange(int var1);
    }
}
