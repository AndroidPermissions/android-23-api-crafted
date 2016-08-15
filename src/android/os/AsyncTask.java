//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package android.os;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class AsyncTask<Params, Progress, Result> {
    public static final Executor SERIAL_EXECUTOR = null;
    public static final Executor THREAD_POOL_EXECUTOR = null;
    private Result result;

    public AsyncTask() {
    }

    public final AsyncTask.Status getStatus() {
        return null;
    }

    protected abstract Result doInBackground(Params... var1);

    protected void onPreExecute() {
    }

    protected void onPostExecute(Result result) {
    }

    protected void onProgressUpdate(Progress... values) {
    }

    protected void onCancelled(Result result) {
        onCancelled();
    }

    protected void onCancelled() {
    }

    public final boolean isCancelled() {
        return true;
    }

    public final boolean cancel(boolean mayInterruptIfRunning) {
        onCancelled(result);
        return true;
    }

    public final Result get() throws InterruptedException, ExecutionException {
        return result;
    }

    public final Result get(long timeout, TimeUnit unit)
            throws InterruptedException, ExecutionException, TimeoutException {
        return get();
    }

    public final AsyncTask<Params, Progress, Result> execute(Params... params) {
        onPreExecute();
        result = doInBackground(params);
        onPostExecute(result);
        return this;
    }

    public final AsyncTask<Params, Progress, Result> executeOnExecutor(Executor exec, Params... params) {
        return execute(params);
    }

    public static void execute(Runnable runnable) {
        runnable.run();
    }

    protected final void publishProgress(Progress... values) {
        onProgressUpdate(values);
    }

    public static enum Status {
        FINISHED,
        PENDING,
        RUNNING;

        private Status() {
        }
    }
}
