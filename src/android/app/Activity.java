//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package android.app;

import android.app.ActivityManager.TaskDescription;
import android.app.assist.AssistContent;
import android.content.*;
import android.content.IntentSender.SendIntentException;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.*;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater.Factory2;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Toolbar;
import org.oregonstate.stubs.LayoutInflaterStub;

import java.io.FileDescriptor;
import java.io.PrintWriter;

public class Activity extends ContextThemeWrapper
        implements Factory2, Callback, android.view.KeyEvent.Callback, OnCreateContextMenuListener,
        ComponentCallbacks2 {
    public static final int DEFAULT_KEYS_DIALER = 1;
    public static final int DEFAULT_KEYS_DISABLE = 0;
    public static final int DEFAULT_KEYS_SEARCH_GLOBAL = 4;
    public static final int DEFAULT_KEYS_SEARCH_LOCAL = 3;
    public static final int DEFAULT_KEYS_SHORTCUT = 2;
    protected static final int[] FOCUSED_STATE_SET = null;
    public static final int RESULT_CANCELED = 0;
    public static final int RESULT_FIRST_USER = 1;
    public static final int RESULT_OK = -1;

    public Activity() {
        throw new RuntimeException("Stub!");
    }

    public Intent getIntent() {
        return new Intent("");
    }

    public void setIntent(Intent newIntent) {
        throw new RuntimeException("Stub!");
    }

    public final Application getApplication() {
        return new Application();
    }

    public final boolean isChild() {
        throw new RuntimeException("Stub!");
    }

    public final Activity getParent() {
        return this;
    }

    public WindowManager getWindowManager() {
        return new WindowManager() {
            @Override
            public Display getDefaultDisplay() {
                return null;
            }

            @Override
            public void removeViewImmediate(View view) {

            }

            @Override
            public void addView(View view, ViewGroup.LayoutParams layoutParams) {

            }

            @Override
            public void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {

            }

            @Override
            public void removeView(View view) {

            }
        };
    }

    public Window getWindow() {
        throw new RuntimeException("Stub!");
    }

    public LoaderManager getLoaderManager() {
        return new LoaderManager() {
            @Override
            public <D> Loader<D> initLoader(int i, Bundle bundle, LoaderCallbacks<D> loaderCallbacks) {
                return null;
            }

            @Override
            public <D> Loader<D> restartLoader(int i, Bundle bundle, LoaderCallbacks<D> loaderCallbacks) {
                return null;
            }

            @Override
            public void destroyLoader(int i) {

            }

            @Override
            public <D> Loader<D> getLoader(int i) {
                return null;
            }

            @Override
            public void dump(String s, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strings) {

            }
        };
    }

    public View getCurrentFocus() {
        return new View(null);
    }

    protected void onCreate(Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }

    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        throw new RuntimeException("Stub!");
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }

    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        throw new RuntimeException("Stub!");
    }

    protected void onPostCreate(Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }

    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        throw new RuntimeException("Stub!");
    }

    protected void onStart() {
        throw new RuntimeException("Stub!");
    }

    protected void onRestart() {
        throw new RuntimeException("Stub!");
    }

    public void onStateNotSaved() {
        throw new RuntimeException("Stub!");
    }

    protected void onResume() {
        throw new RuntimeException("Stub!");
    }

    protected void onPostResume() {
        throw new RuntimeException("Stub!");
    }

    public boolean isVoiceInteraction() {
        throw new RuntimeException("Stub!");
    }

    public boolean isVoiceInteractionRoot() {
        throw new RuntimeException("Stub!");
    }

    public VoiceInteractor getVoiceInteractor() {
        return new VoiceInteractor();
    }

    protected void onNewIntent(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    protected void onSaveInstanceState(Bundle outState) {
        throw new RuntimeException("Stub!");
    }

    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        throw new RuntimeException("Stub!");
    }

    protected void onPause() {
        throw new RuntimeException("Stub!");
    }

    protected void onUserLeaveHint() {
        throw new RuntimeException("Stub!");
    }

    public boolean onCreateThumbnail(Bitmap outBitmap, Canvas canvas) {
        throw new RuntimeException("Stub!");
    }

    public CharSequence onCreateDescription() {
        return "";
    }

    public void onProvideAssistData(Bundle data) {
        throw new RuntimeException("Stub!");
    }

    public void onProvideAssistContent(AssistContent outContent) {
        throw new RuntimeException("Stub!");
    }

    public boolean showAssist(Bundle args) {
        throw new RuntimeException("Stub!");
    }

    protected void onStop() {
        throw new RuntimeException("Stub!");
    }

    protected void onDestroy() {
        throw new RuntimeException("Stub!");
    }

    public void reportFullyDrawn() {
        throw new RuntimeException("Stub!");
    }

    public void onConfigurationChanged(Configuration newConfig) {
        throw new RuntimeException("Stub!");
    }

    public int getChangingConfigurations() {
        throw new RuntimeException("Stub!");
    }

    /**
     * @deprecated
     */
    @Deprecated
    public Object getLastNonConfigurationInstance() {
        throw new RuntimeException("Stub!");
    }

    /**
     * @deprecated
     */
    @Deprecated
    public Object onRetainNonConfigurationInstance() {
        throw new RuntimeException("Stub!");
    }

    public void onLowMemory() {
        throw new RuntimeException("Stub!");
    }

    public void onTrimMemory(int level) {
        throw new RuntimeException("Stub!");
    }

    public FragmentManager getFragmentManager() {
        return new FragmentManager() {
            @Override
            public FragmentTransaction beginTransaction() {
                return null;
            }

            @Override
            public boolean executePendingTransactions() {
                return false;
            }

            @Override
            public Fragment findFragmentById(int i) {
                return null;
            }

            @Override
            public Fragment findFragmentByTag(String s) {
                return null;
            }

            @Override
            public void popBackStack() {

            }

            @Override
            public boolean popBackStackImmediate() {
                return false;
            }

            @Override
            public void popBackStack(String s, int i) {

            }

            @Override
            public boolean popBackStackImmediate(String s, int i) {
                return false;
            }

            @Override
            public void popBackStack(int i, int i1) {

            }

            @Override
            public boolean popBackStackImmediate(int i, int i1) {
                return false;
            }

            @Override
            public int getBackStackEntryCount() {
                return 0;
            }

            @Override
            public BackStackEntry getBackStackEntryAt(int i) {
                return null;
            }

            @Override
            public void addOnBackStackChangedListener(OnBackStackChangedListener onBackStackChangedListener) {

            }

            @Override
            public void removeOnBackStackChangedListener(
                    OnBackStackChangedListener onBackStackChangedListener) {

            }

            @Override
            public void putFragment(Bundle bundle, String s, Fragment fragment) {

            }

            @Override
            public Fragment getFragment(Bundle bundle, String s) {
                return null;
            }

            @Override
            public Fragment.SavedState saveFragmentInstanceState(Fragment fragment) {
                return null;
            }

            @Override
            public boolean isDestroyed() {
                return false;
            }

            @Override
            public void dump(String s, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strings) {

            }
        };
    }

    public void onAttachFragment(Fragment fragment) {
        throw new RuntimeException("Stub!");
    }

    /**
     * @deprecated
     */
    @Deprecated
    public final Cursor managedQuery(Uri uri, String[] projection, String selection, String[] selectionArgs,
                                     String sortOrder) {
        throw new RuntimeException("Stub!");
    }

    /**
     * @deprecated
     */
    @Deprecated
    public void startManagingCursor(Cursor c) {
        throw new RuntimeException("Stub!");
    }

    /**
     * @deprecated
     */
    @Deprecated
    public void stopManagingCursor(Cursor c) {
        throw new RuntimeException("Stub!");
    }

    public View findViewById(int id) {
        return new View(null);
    }

    public ActionBar getActionBar() {
        throw new RuntimeException("Stub!");
    }

    public void setActionBar(Toolbar toolbar) {
        throw new RuntimeException("Stub!");
    }

    public void setContentView(int layoutResID) {
        throw new RuntimeException("Stub!");
    }

    public void setContentView(View view) {
        throw new RuntimeException("Stub!");
    }

    public void setContentView(View view, LayoutParams params) {
        throw new RuntimeException("Stub!");
    }

    public void addContentView(View view, LayoutParams params) {
        throw new RuntimeException("Stub!");
    }

    public TransitionManager getContentTransitionManager() {
        return new TransitionManager();
    }

    public void setContentTransitionManager(TransitionManager tm) {
        throw new RuntimeException("Stub!");
    }

    public Scene getContentScene() {
        return new Scene(null);
    }

    public void setFinishOnTouchOutside(boolean finish) {
        throw new RuntimeException("Stub!");
    }

    public final void setDefaultKeyMode(int mode) {
        throw new RuntimeException("Stub!");
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        throw new RuntimeException("Stub!");
    }

    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        throw new RuntimeException("Stub!");
    }

    public boolean onKeyUp(int keyCode, KeyEvent event) {
        throw new RuntimeException("Stub!");
    }

    public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) {
        throw new RuntimeException("Stub!");
    }

    public void onBackPressed() {
        throw new RuntimeException("Stub!");
    }

    public boolean onKeyShortcut(int keyCode, KeyEvent event) {
        throw new RuntimeException("Stub!");
    }

    public boolean onTouchEvent(MotionEvent event) {
        throw new RuntimeException("Stub!");
    }

    public boolean onTrackballEvent(MotionEvent event) {
        throw new RuntimeException("Stub!");
    }

    public boolean onGenericMotionEvent(MotionEvent event) {
        throw new RuntimeException("Stub!");
    }

    public void onUserInteraction() {
        throw new RuntimeException("Stub!");
    }

    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams params) {
        throw new RuntimeException("Stub!");
    }

    public void onContentChanged() {
        throw new RuntimeException("Stub!");
    }

    public void onWindowFocusChanged(boolean hasFocus) {
        throw new RuntimeException("Stub!");
    }

    public void onAttachedToWindow() {
        throw new RuntimeException("Stub!");
    }

    public void onDetachedFromWindow() {
        throw new RuntimeException("Stub!");
    }

    public boolean hasWindowFocus() {
        throw new RuntimeException("Stub!");
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        throw new RuntimeException("Stub!");
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        throw new RuntimeException("Stub!");
    }

    public boolean dispatchTouchEvent(MotionEvent ev) {
        throw new RuntimeException("Stub!");
    }

    public boolean dispatchTrackballEvent(MotionEvent ev) {
        throw new RuntimeException("Stub!");
    }

    public boolean dispatchGenericMotionEvent(MotionEvent ev) {
        throw new RuntimeException("Stub!");
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        throw new RuntimeException("Stub!");
    }

    public View onCreatePanelView(int featureId) {
        return findViewById(featureId);
    }

    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        throw new RuntimeException("Stub!");
    }

    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        throw new RuntimeException("Stub!");
    }

    public boolean onMenuOpened(int featureId, Menu menu) {
        throw new RuntimeException("Stub!");
    }

    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        throw new RuntimeException("Stub!");
    }

    public void onPanelClosed(int featureId, Menu menu) {
        throw new RuntimeException("Stub!");
    }

    public void invalidateOptionsMenu() {
        throw new RuntimeException("Stub!");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        throw new RuntimeException("Stub!");
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        throw new RuntimeException("Stub!");
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        throw new RuntimeException("Stub!");
    }

    public boolean onNavigateUp() {
        throw new RuntimeException("Stub!");
    }

    public boolean onNavigateUpFromChild(Activity child) {
        throw new RuntimeException("Stub!");
    }

    public void onCreateNavigateUpTaskStack(TaskStackBuilder builder) {
        throw new RuntimeException("Stub!");
    }

    public void onPrepareNavigateUpTaskStack(TaskStackBuilder builder) {
        throw new RuntimeException("Stub!");
    }

    public void onOptionsMenuClosed(Menu menu) {
        throw new RuntimeException("Stub!");
    }

    public void openOptionsMenu() {
        throw new RuntimeException("Stub!");
    }

    public void closeOptionsMenu() {
        throw new RuntimeException("Stub!");
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
        throw new RuntimeException("Stub!");
    }

    public void registerForContextMenu(View view) {
        throw new RuntimeException("Stub!");
    }

    public void unregisterForContextMenu(View view) {
        throw new RuntimeException("Stub!");
    }

    public void openContextMenu(View view) {
        throw new RuntimeException("Stub!");
    }

    public void closeContextMenu() {
        throw new RuntimeException("Stub!");
    }

    public boolean onContextItemSelected(MenuItem item) {
        throw new RuntimeException("Stub!");
    }

    public void onContextMenuClosed(Menu menu) {
        throw new RuntimeException("Stub!");
    }

    /**
     * @deprecated
     */
    @Deprecated
    protected Dialog onCreateDialog(int id) {
        return new Dialog(this);
    }

    /**
     * @deprecated
     */
    @Deprecated
    protected Dialog onCreateDialog(int id, Bundle args) {
        return new Dialog(this);
    }

    /**
     * @deprecated
     */
    @Deprecated
    protected void onPrepareDialog(int id, Dialog dialog) {
        throw new RuntimeException("Stub!");
    }

    /**
     * @deprecated
     */
    @Deprecated
    protected void onPrepareDialog(int id, Dialog dialog, Bundle args) {
        throw new RuntimeException("Stub!");
    }

    /**
     * @deprecated
     */
    @Deprecated
    public final void showDialog(int id) {
        throw new RuntimeException("Stub!");
    }

    /**
     * @deprecated
     */
    @Deprecated
    public final boolean showDialog(int id, Bundle args) {
        throw new RuntimeException("Stub!");
    }

    /**
     * @deprecated
     */
    @Deprecated
    public final void dismissDialog(int id) {
        throw new RuntimeException("Stub!");
    }

    /**
     * @deprecated
     */
    @Deprecated
    public final void removeDialog(int id) {
        throw new RuntimeException("Stub!");
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        throw new RuntimeException("Stub!");
    }

    public boolean onSearchRequested() {
        throw new RuntimeException("Stub!");
    }

    public final SearchEvent getSearchEvent() {
        throw new RuntimeException("Stub!");
    }

    public void startSearch(String initialQuery, boolean selectInitialQuery, Bundle appSearchData,
                            boolean globalSearch) {
        throw new RuntimeException("Stub!");
    }

    public void triggerSearch(String query, Bundle appSearchData) {
        throw new RuntimeException("Stub!");
    }

    public void takeKeyEvents(boolean get) {
        throw new RuntimeException("Stub!");
    }

    public final boolean requestWindowFeature(int featureId) {
        throw new RuntimeException("Stub!");
    }

    public final void setFeatureDrawableResource(int featureId, int resId) {
        throw new RuntimeException("Stub!");
    }

    public final void setFeatureDrawableUri(int featureId, Uri uri) {
        throw new RuntimeException("Stub!");
    }

    public final void setFeatureDrawable(int featureId, Drawable drawable) {
        throw new RuntimeException("Stub!");
    }

    public final void setFeatureDrawableAlpha(int featureId, int alpha) {
        throw new RuntimeException("Stub!");
    }

    public LayoutInflater getLayoutInflater() {
        return new LayoutInflaterStub();
    }

    public MenuInflater getMenuInflater() {
        return new MenuInflater(this);
    }

    protected void onApplyThemeResource(Theme theme, int resid, boolean first) {
        throw new RuntimeException("Stub!");
    }

    public final void requestPermissions(String[] permissions, int requestCode) {
        throw new RuntimeException("Stub!");
    }

    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        throw new RuntimeException("Stub!");
    }

    public boolean shouldShowRequestPermissionRationale(String permission) {
        throw new RuntimeException("Stub!");
    }

    public void startActivityForResult(Intent intent, int requestCode) {
        throw new RuntimeException("Stub!");
    }

    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        throw new RuntimeException("Stub!");
    }

    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask,
                                           int flagsValues, int extraFlags) throws SendIntentException {
        throw new RuntimeException("Stub!");
    }

    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask,
                                           int flagsValues, int extraFlags, Bundle options) throws SendIntentException {
        throw new RuntimeException("Stub!");
    }

    public void startActivity(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    public void startActivity(Intent intent, Bundle options) {
        throw new RuntimeException("Stub!");
    }

    public void startActivities(Intent[] intents) {
        throw new RuntimeException("Stub!");
    }

    public void startActivities(Intent[] intents, Bundle options) {
        throw new RuntimeException("Stub!");
    }

    public void startIntentSender(IntentSender intent, Intent fillInIntent, int flagsMask, int flagsValues,
                                  int extraFlags) throws SendIntentException {
        throw new RuntimeException("Stub!");
    }

    public void startIntentSender(IntentSender intent, Intent fillInIntent, int flagsMask, int flagsValues,
                                  int extraFlags, Bundle options) throws SendIntentException {
        throw new RuntimeException("Stub!");
    }

    public boolean startActivityIfNeeded(Intent intent, int requestCode) {
        throw new RuntimeException("Stub!");
    }

    public boolean startActivityIfNeeded(Intent intent, int requestCode, Bundle options) {
        throw new RuntimeException("Stub!");
    }

    public boolean startNextMatchingActivity(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    public boolean startNextMatchingActivity(Intent intent, Bundle options) {
        throw new RuntimeException("Stub!");
    }

    public void startActivityFromChild(Activity child, Intent intent, int requestCode) {
        throw new RuntimeException("Stub!");
    }

    public void startActivityFromChild(Activity child, Intent intent, int requestCode, Bundle options) {
        throw new RuntimeException("Stub!");
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int requestCode) {
        throw new RuntimeException("Stub!");
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int requestCode, Bundle options) {
        throw new RuntimeException("Stub!");
    }

    public void startIntentSenderFromChild(Activity child, IntentSender intent, int requestCode, Intent fillInIntent,
                                           int flagsMask, int flagsValues, int extraFlags) throws SendIntentException {
        throw new RuntimeException("Stub!");
    }

    public void startIntentSenderFromChild(Activity child, IntentSender intent, int requestCode, Intent fillInIntent,
                                           int flagsMask, int flagsValues, int extraFlags, Bundle options)
            throws SendIntentException {
        throw new RuntimeException("Stub!");
    }

    public void overridePendingTransition(int enterAnim, int exitAnim) {
        throw new RuntimeException("Stub!");
    }

    public final void setResult(int resultCode) {
        throw new RuntimeException("Stub!");
    }

    public final void setResult(int resultCode, Intent data) {
        throw new RuntimeException("Stub!");
    }

    public Uri getReferrer() {
        throw new RuntimeException("Stub!");
    }

    public Uri onProvideReferrer() {
        throw new RuntimeException("Stub!");
    }

    public String getCallingPackage() {
        throw new RuntimeException("Stub!");
    }

    public ComponentName getCallingActivity() {
        return new ComponentName("", "");
    }

    public void setVisible(boolean visible) {
        throw new RuntimeException("Stub!");
    }

    public boolean isFinishing() {
        throw new RuntimeException("Stub!");
    }

    public boolean isDestroyed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isChangingConfigurations() {
        throw new RuntimeException("Stub!");
    }

    public void recreate() {
        throw new RuntimeException("Stub!");
    }

    public void finish() {
        throw new RuntimeException("Stub!");
    }

    public void finishAffinity() {
        throw new RuntimeException("Stub!");
    }

    public void finishFromChild(Activity child) {
        throw new RuntimeException("Stub!");
    }

    public void finishAfterTransition() {
        throw new RuntimeException("Stub!");
    }

    public void finishActivity(int requestCode) {
        throw new RuntimeException("Stub!");
    }

    public void finishActivityFromChild(Activity child, int requestCode) {
        throw new RuntimeException("Stub!");
    }

    public void finishAndRemoveTask() {
        throw new RuntimeException("Stub!");
    }

    public boolean releaseInstance() {
        throw new RuntimeException("Stub!");
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        throw new RuntimeException("Stub!");
    }

    public void onActivityReenter(int resultCode, Intent data) {
        throw new RuntimeException("Stub!");
    }

    public PendingIntent createPendingResult(int requestCode, Intent data, int flags) {
        return new PendingIntent();
    }

    public void setRequestedOrientation(int requestedOrientation) {
        throw new RuntimeException("Stub!");
    }

    public int getRequestedOrientation() {
        throw new RuntimeException("Stub!");
    }

    public int getTaskId() {
        throw new RuntimeException("Stub!");
    }

    public boolean isTaskRoot() {
        throw new RuntimeException("Stub!");
    }

    public boolean moveTaskToBack(boolean nonRoot) {
        throw new RuntimeException("Stub!");
    }

    public String getLocalClassName() {
        throw new RuntimeException("Stub!");
    }

    public ComponentName getComponentName() {
        return new ComponentName("", "");
    }

    public SharedPreferences getPreferences(int mode) {
        throw new RuntimeException("Stub!");
    }

    public void setTitle(CharSequence title) {
        throw new RuntimeException("Stub!");
    }

    public void setTitle(int titleId) {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public void setTitleColor(int textColor) {
        throw new RuntimeException("Stub!");
    }

    public final CharSequence getTitle() {
        throw new RuntimeException("Stub!");
    }

    public final int getTitleColor() {
        throw new RuntimeException("Stub!");
    }

    protected void onTitleChanged(CharSequence title, int color) {
        throw new RuntimeException("Stub!");
    }

    protected void onChildTitleChanged(Activity childActivity, CharSequence title) {
        throw new RuntimeException("Stub!");
    }

    public void setTaskDescription(TaskDescription taskDescription) {
        throw new RuntimeException("Stub!");
    }

    public final void setProgressBarVisibility(boolean visible) {
        throw new RuntimeException("Stub!");
    }

    public final void setProgressBarIndeterminateVisibility(boolean visible) {
        throw new RuntimeException("Stub!");
    }

    public final void setProgressBarIndeterminate(boolean indeterminate) {
        throw new RuntimeException("Stub!");
    }

    public final void setProgress(int progress) {
        throw new RuntimeException("Stub!");
    }

    public final void setSecondaryProgress(int secondaryProgress) {
        throw new RuntimeException("Stub!");
    }

    public final void setVolumeControlStream(int streamType) {
        throw new RuntimeException("Stub!");
    }

    public final int getVolumeControlStream() {
        throw new RuntimeException("Stub!");
    }

    public final void setMediaController(MediaController controller) {
        throw new RuntimeException("Stub!");
    }

    public final MediaController getMediaController() {
        throw new RuntimeException("Stub!");
    }

    public final void runOnUiThread(Runnable action) {
        throw new RuntimeException("Stub!");
    }

    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return new View(this);
    }

    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        return new View(this);
    }

    public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        throw new RuntimeException("Stub!");
    }

    public boolean isImmersive() {
        throw new RuntimeException("Stub!");
    }

    public boolean requestVisibleBehind(boolean visible) {
        throw new RuntimeException("Stub!");
    }

    public void onVisibleBehindCanceled() {
        throw new RuntimeException("Stub!");
    }

    public void onEnterAnimationComplete() {
        throw new RuntimeException("Stub!");
    }

    public void setImmersive(boolean i) {
        throw new RuntimeException("Stub!");
    }

    public ActionMode startActionMode(android.view.ActionMode.Callback callback) {
        throw new RuntimeException("Stub!");
    }

    public ActionMode startActionMode(android.view.ActionMode.Callback callback, int type) {
        throw new RuntimeException("Stub!");
    }

    public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
        throw new RuntimeException("Stub!");
    }

    public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int type) {
        throw new RuntimeException("Stub!");
    }

    public void onActionModeStarted(ActionMode mode) {
        throw new RuntimeException("Stub!");
    }

    public void onActionModeFinished(ActionMode mode) {
        throw new RuntimeException("Stub!");
    }

    public boolean shouldUpRecreateTask(Intent targetIntent) {
        throw new RuntimeException("Stub!");
    }

    public boolean navigateUpTo(Intent upIntent) {
        throw new RuntimeException("Stub!");
    }

    public boolean navigateUpToFromChild(Activity child, Intent upIntent) {
        throw new RuntimeException("Stub!");
    }

    public Intent getParentActivityIntent() {
        throw new RuntimeException("Stub!");
    }

    public void setEnterSharedElementCallback(SharedElementCallback callback) {
        throw new RuntimeException("Stub!");
    }

    public void setExitSharedElementCallback(SharedElementCallback callback) {
        throw new RuntimeException("Stub!");
    }

    public void postponeEnterTransition() {
        throw new RuntimeException("Stub!");
    }

    public void startPostponedEnterTransition() {
        throw new RuntimeException("Stub!");
    }

    public void startLockTask() {
        throw new RuntimeException("Stub!");
    }

    public void stopLockTask() {
        throw new RuntimeException("Stub!");
    }

    public void showLockTaskEscapeMessage() {
        throw new RuntimeException("Stub!");
    }
}
