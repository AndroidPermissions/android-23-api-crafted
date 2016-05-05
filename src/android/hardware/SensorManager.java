//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package android.hardware;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorListener;
import android.hardware.TriggerEventListener;
import android.os.Handler;
import java.util.List;

public class SensorManager {
    public static final int AXIS_MINUS_X = 129;
    public static final int AXIS_MINUS_Y = 130;
    public static final int AXIS_MINUS_Z = 131;
    public static final int AXIS_X = 1;
    public static final int AXIS_Y = 2;
    public static final int AXIS_Z = 3;
    /** @deprecated */
    @Deprecated
    public static final int DATA_X = 0;
    /** @deprecated */
    @Deprecated
    public static final int DATA_Y = 1;
    /** @deprecated */
    @Deprecated
    public static final int DATA_Z = 2;
    public static final float GRAVITY_DEATH_STAR_I = 3.5303614E-7F;
    public static final float GRAVITY_EARTH = 9.80665F;
    public static final float GRAVITY_JUPITER = 23.12F;
    public static final float GRAVITY_MARS = 3.71F;
    public static final float GRAVITY_MERCURY = 3.7F;
    public static final float GRAVITY_MOON = 1.6F;
    public static final float GRAVITY_NEPTUNE = 11.0F;
    public static final float GRAVITY_PLUTO = 0.6F;
    public static final float GRAVITY_SATURN = 8.96F;
    public static final float GRAVITY_SUN = 275.0F;
    public static final float GRAVITY_THE_ISLAND = 4.815162F;
    public static final float GRAVITY_URANUS = 8.69F;
    public static final float GRAVITY_VENUS = 8.87F;
    public static final float LIGHT_CLOUDY = 100.0F;
    public static final float LIGHT_FULLMOON = 0.25F;
    public static final float LIGHT_NO_MOON = 0.001F;
    public static final float LIGHT_OVERCAST = 10000.0F;
    public static final float LIGHT_SHADE = 20000.0F;
    public static final float LIGHT_SUNLIGHT = 110000.0F;
    public static final float LIGHT_SUNLIGHT_MAX = 120000.0F;
    public static final float LIGHT_SUNRISE = 400.0F;
    public static final float MAGNETIC_FIELD_EARTH_MAX = 60.0F;
    public static final float MAGNETIC_FIELD_EARTH_MIN = 30.0F;
    public static final float PRESSURE_STANDARD_ATMOSPHERE = 1013.25F;
    /** @deprecated */
    @Deprecated
    public static final int RAW_DATA_INDEX = 3;
    /** @deprecated */
    @Deprecated
    public static final int RAW_DATA_X = 3;
    /** @deprecated */
    @Deprecated
    public static final int RAW_DATA_Y = 4;
    /** @deprecated */
    @Deprecated
    public static final int RAW_DATA_Z = 5;
    /** @deprecated */
    @Deprecated
    public static final int SENSOR_ACCELEROMETER = 2;
    /** @deprecated */
    @Deprecated
    public static final int SENSOR_ALL = 127;
    public static final int SENSOR_DELAY_FASTEST = 0;
    public static final int SENSOR_DELAY_GAME = 1;
    public static final int SENSOR_DELAY_NORMAL = 3;
    public static final int SENSOR_DELAY_UI = 2;
    /** @deprecated */
    @Deprecated
    public static final int SENSOR_LIGHT = 16;
    /** @deprecated */
    @Deprecated
    public static final int SENSOR_MAGNETIC_FIELD = 8;
    /** @deprecated */
    @Deprecated
    public static final int SENSOR_MAX = 64;
    /** @deprecated */
    @Deprecated
    public static final int SENSOR_MIN = 1;
    /** @deprecated */
    @Deprecated
    public static final int SENSOR_ORIENTATION = 1;
    /** @deprecated */
    @Deprecated
    public static final int SENSOR_ORIENTATION_RAW = 128;
    /** @deprecated */
    @Deprecated
    public static final int SENSOR_PROXIMITY = 32;
    public static final int SENSOR_STATUS_ACCURACY_HIGH = 3;
    public static final int SENSOR_STATUS_ACCURACY_LOW = 1;
    public static final int SENSOR_STATUS_ACCURACY_MEDIUM = 2;
    public static final int SENSOR_STATUS_NO_CONTACT = -1;
    public static final int SENSOR_STATUS_UNRELIABLE = 0;
    /** @deprecated */
    @Deprecated
    public static final int SENSOR_TEMPERATURE = 4;
    /** @deprecated */
    @Deprecated
    public static final int SENSOR_TRICORDER = 64;
    public static final float STANDARD_GRAVITY = 9.80665F;

    public SensorManager() {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public int getSensors() {
        throw new RuntimeException("Stub!");
    }

    public List<Sensor> getSensorList(int type) {
        throw new RuntimeException("Stub!");
    }

    public Sensor getDefaultSensor(int type) {
        throw new RuntimeException("Stub!");
    }

    public Sensor getDefaultSensor(int type, boolean wakeUp) {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public boolean registerListener(SensorListener listener, int sensors) {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public boolean registerListener(SensorListener listener, int sensors, int rate) {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public void unregisterListener(SensorListener listener) {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public void unregisterListener(SensorListener listener, int sensors) {
        throw new RuntimeException("Stub!");
    }

    public void unregisterListener(SensorEventListener listener, Sensor sensor) {
        throw new RuntimeException("Stub!");
    }

    public void unregisterListener(SensorEventListener listener) {
        throw new RuntimeException("Stub!");
    }

    public boolean registerListener(SensorEventListener listener, Sensor sensor, int samplingPeriodUs) {
        throw new RuntimeException("Stub!");
    }

    public boolean registerListener(SensorEventListener listener, Sensor sensor, int samplingPeriodUs, int maxReportLatencyUs) {
        throw new RuntimeException("Stub!");
    }

    public boolean registerListener(SensorEventListener listener, Sensor sensor, int samplingPeriodUs, Handler handler) {
        throw new RuntimeException("Stub!");
    }

    public boolean registerListener(SensorEventListener listener, Sensor sensor, int samplingPeriodUs, int maxReportLatencyUs, Handler handler) {
        throw new RuntimeException("Stub!");
    }

    public boolean flush(SensorEventListener listener) {
        throw new RuntimeException("Stub!");
    }

    public static boolean getRotationMatrix(float[] R, float[] I, float[] gravity, float[] geomagnetic) {
        throw new RuntimeException("Stub!");
    }

    public static float getInclination(float[] I) {
        throw new RuntimeException("Stub!");
    }

    public static boolean remapCoordinateSystem(float[] inR, int X, int Y, float[] outR) {
        throw new RuntimeException("Stub!");
    }

    public static float[] getOrientation(float[] R, float[] values) {
        throw new RuntimeException("Stub!");
    }

    public static float getAltitude(float p0, float p) {
        throw new RuntimeException("Stub!");
    }

    public static void getAngleChange(float[] angleChange, float[] R, float[] prevR) {
        throw new RuntimeException("Stub!");
    }

    public static void getRotationMatrixFromVector(float[] R, float[] rotationVector) {
        throw new RuntimeException("Stub!");
    }

    public static void getQuaternionFromVector(float[] Q, float[] rv) {
        throw new RuntimeException("Stub!");
    }

    public boolean requestTriggerSensor(TriggerEventListener listener, Sensor sensor) {
        throw new RuntimeException("Stub!");
    }

    public boolean cancelTriggerSensor(TriggerEventListener listener, Sensor sensor) {
        throw new RuntimeException("Stub!");
    }
}
