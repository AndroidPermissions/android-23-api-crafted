//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package java.lang;

import java.util.Map;

/**
 * Required to link start() with run().
 */
public class Thread implements Runnable {
    public static final int MAX_PRIORITY = 10;
    public static final int MIN_PRIORITY = 1;
    public static final int NORM_PRIORITY = 5;

    private Runnable target;

    public Thread() {
        throw new RuntimeException("Stub!");
    }

    public Thread(Runnable runnable) {
        target = runnable;
    }

    public Thread(Runnable runnable, String threadName) {
        target = runnable;
    }

    public Thread(String threadName) {
        throw new RuntimeException("Stub!");
    }

    public Thread(ThreadGroup group, Runnable runnable) {
        target = runnable;
    }

    public Thread(ThreadGroup group, Runnable runnable, String threadName) {
        target = runnable;
    }

    public Thread(ThreadGroup group, String threadName) {
        throw new RuntimeException("Stub!");
    }

    public Thread(ThreadGroup group, Runnable runnable, String threadName, long stackSize) {
        target = runnable;
    }

    public static int activeCount() {
        throw new RuntimeException("Stub!");
    }

    public final void checkAccess() {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public int countStackFrames() {
        throw new RuntimeException("Stub!");
    }

    public static native Thread currentThread();

    /** @deprecated */
    @Deprecated
    public void destroy() {
        throw new RuntimeException("Stub!");
    }

    public static void dumpStack() {
        throw new RuntimeException("Stub!");
    }

    public static int enumerate(Thread[] threads) {
        throw new RuntimeException("Stub!");
    }

    public static Map<Thread, StackTraceElement[]> getAllStackTraces() {
        throw new RuntimeException("Stub!");
    }

    public ClassLoader getContextClassLoader() {
        throw new RuntimeException("Stub!");
    }

    public static Thread.UncaughtExceptionHandler getDefaultUncaughtExceptionHandler() {
        throw new RuntimeException("Stub!");
    }

    public long getId() {
        throw new RuntimeException("Stub!");
    }

    public final String getName() {
        throw new RuntimeException("Stub!");
    }

    public final int getPriority() {
        throw new RuntimeException("Stub!");
    }

    public StackTraceElement[] getStackTrace() {
        throw new RuntimeException("Stub!");
    }

    public Thread.State getState() {
        throw new RuntimeException("Stub!");
    }

    public final ThreadGroup getThreadGroup() {
        throw new RuntimeException("Stub!");
    }

    public Thread.UncaughtExceptionHandler getUncaughtExceptionHandler() {
        throw new RuntimeException("Stub!");
    }

    public void interrupt() {
        throw new RuntimeException("Stub!");
    }

    public static native boolean interrupted();

    public final boolean isAlive() {
        throw new RuntimeException("Stub!");
    }

    public final boolean isDaemon() {
        throw new RuntimeException("Stub!");
    }

    public native boolean isInterrupted();

    public final void join() throws InterruptedException {
        throw new RuntimeException("Stub!");
    }

    public final void join(long millis) throws InterruptedException {
        throw new RuntimeException("Stub!");
    }

    public final void join(long millis, int nanos) throws InterruptedException {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public final void resume() {
        throw new RuntimeException("Stub!");
    }

    public void run() {
        throw new RuntimeException("Stub!");
    }

    public void setContextClassLoader(ClassLoader cl) {
        throw new RuntimeException("Stub!");
    }

    public final void setDaemon(boolean isDaemon) {
        throw new RuntimeException("Stub!");
    }

    public static void setDefaultUncaughtExceptionHandler(Thread.UncaughtExceptionHandler handler) {
        throw new RuntimeException("Stub!");
    }

    public final void setName(String threadName) {
        throw new RuntimeException("Stub!");
    }

    public final void setPriority(int priority) {
        throw new RuntimeException("Stub!");
    }

    public void setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler handler) {
        throw new RuntimeException("Stub!");
    }

    public static void sleep(long time) throws InterruptedException {
        throw new RuntimeException("Stub!");
    }

    public static void sleep(long millis, int nanos) throws InterruptedException {
        throw new RuntimeException("Stub!");
    }

    /**
     * Should call target.run() directly, otherwise context sensitivity is lost!
     */
    public synchronized void start() {
        target.run();
    }

    /** @deprecated */
    @Deprecated
    public final void stop() {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public final synchronized void stop(Throwable throwable) {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public final void suspend() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    public static native void yield();

    public static boolean holdsLock(Object object) {
        throw new RuntimeException("Stub!");
    }

    public interface UncaughtExceptionHandler {
        void uncaughtException(Thread var1, Throwable var2);
    }

    public static enum State {
        BLOCKED,
        NEW,
        RUNNABLE,
        TERMINATED,
        TIMED_WAITING,
        WAITING;

        private State() {
        }
    }
}
