//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package android.app;

import android.animation.Animator;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.Loader;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.*;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View.OnCreateContextMenuListener;

import java.io.FileDescriptor;
import java.io.PrintWriter;

public class Fragment implements ComponentCallbacks2, OnCreateContextMenuListener {
    public Fragment() {
        throw new RuntimeException("Stub!");
    }

    public static Fragment instantiate(Context context, String fname) {
        return new Fragment();
    }

    public static Fragment instantiate(Context context, String fname, Bundle args) {
        return new Fragment();
    }

    public final boolean equals(Object o) {
        throw new RuntimeException("Stub!");
    }

    public final int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    public final int getId() {
        throw new RuntimeException("Stub!");
    }

    public final String getTag() {
        return "";
    }

    public void setArguments(Bundle args) {
        throw new RuntimeException("Stub!");
    }

    public final Bundle getArguments() {
        return new Bundle();
    }

    public void setInitialSavedState(Fragment.SavedState state) {
        throw new RuntimeException("Stub!");
    }

    public void setTargetFragment(Fragment fragment, int requestCode) {
        throw new RuntimeException("Stub!");
    }

    public final Fragment getTargetFragment() {
        return this;
    }

    public final int getTargetRequestCode() {
        throw new RuntimeException("Stub!");
    }

    public Context getContext() {
        return getActivity();
    }

    public final Activity getActivity() {
        return new Activity();
    }

    public final Object getHost() {
        return getActivity();
    }

    public final Resources getResources() {
        return new Resources(null, null, null);
    }

    public final CharSequence getText(int resId) {
        return "";
    }

    public final String getString(int resId) {
        return "";
    }

    public final String getString(int resId, Object... formatArgs) {
        return "";
    }

    public final FragmentManager getFragmentManager() {
        return null;
    }

    public final FragmentManager getChildFragmentManager() {
        throw new RuntimeException("Stub!");
    }

    public final Fragment getParentFragment() {
        return new Fragment();
    }

    public final boolean isAdded() {
        throw new RuntimeException("Stub!");
    }

    public final boolean isDetached() {
        throw new RuntimeException("Stub!");
    }

    public final boolean isRemoving() {
        throw new RuntimeException("Stub!");
    }

    public final boolean isInLayout() {
        throw new RuntimeException("Stub!");
    }

    public final boolean isResumed() {
        throw new RuntimeException("Stub!");
    }

    public final boolean isVisible() {
        throw new RuntimeException("Stub!");
    }

    public final boolean isHidden() {
        throw new RuntimeException("Stub!");
    }

    public void onHiddenChanged(boolean hidden) {
        throw new RuntimeException("Stub!");
    }

    public void setRetainInstance(boolean retain) {
        throw new RuntimeException("Stub!");
    }

    public final boolean getRetainInstance() {
        throw new RuntimeException("Stub!");
    }

    public void setHasOptionsMenu(boolean hasMenu) {
        throw new RuntimeException("Stub!");
    }

    public void setMenuVisibility(boolean menuVisible) {
        throw new RuntimeException("Stub!");
    }

    public void setUserVisibleHint(boolean isVisibleToUser) {
        throw new RuntimeException("Stub!");
    }

    public boolean getUserVisibleHint() {
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

    public void startActivity(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    public void startActivity(Intent intent, Bundle options) {
        throw new RuntimeException("Stub!");
    }

    public void startActivityForResult(Intent intent, int requestCode) {
        throw new RuntimeException("Stub!");
    }

    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        throw new RuntimeException("Stub!");
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
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

    /**
     * @deprecated
     */
    @Deprecated
    public void onInflate(AttributeSet attrs, Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }

    public void onInflate(Context context, AttributeSet attrs, Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }

    /**
     * @deprecated
     */
    @Deprecated
    public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }

    public void onAttach(Context context) {
        throw new RuntimeException("Stub!");
    }

    /**
     * @deprecated
     */
    @Deprecated
    public void onAttach(Activity activity) {
        throw new RuntimeException("Stub!");
    }

    public Animator onCreateAnimator(int transit, boolean enter, int nextAnim) {
        throw new RuntimeException("Stub!");
    }

    public void onCreate(Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return getView();
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }

    public View getView() {
        return new View(null);
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }

    public void onViewStateRestored(Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }

    public void onStart() {
        throw new RuntimeException("Stub!");
    }

    public void onResume() {
        throw new RuntimeException("Stub!");
    }

    public void onSaveInstanceState(Bundle outState) {
        throw new RuntimeException("Stub!");
    }

    public void onConfigurationChanged(Configuration newConfig) {
        throw new RuntimeException("Stub!");
    }

    public void onPause() {
        throw new RuntimeException("Stub!");
    }

    public void onStop() {
        throw new RuntimeException("Stub!");
    }

    public void onLowMemory() {
        throw new RuntimeException("Stub!");
    }

    public void onTrimMemory(int level) {
        throw new RuntimeException("Stub!");
    }

    public void onDestroyView() {
        throw new RuntimeException("Stub!");
    }

    public void onDestroy() {
        throw new RuntimeException("Stub!");
    }

    public void onDetach() {
        throw new RuntimeException("Stub!");
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        throw new RuntimeException("Stub!");
    }

    public void onPrepareOptionsMenu(Menu menu) {
        throw new RuntimeException("Stub!");
    }

    public void onDestroyOptionsMenu() {
        throw new RuntimeException("Stub!");
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        throw new RuntimeException("Stub!");
    }

    public void onOptionsMenuClosed(Menu menu) {
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

    public boolean onContextItemSelected(MenuItem item) {
        throw new RuntimeException("Stub!");
    }

    public void setEnterSharedElementCallback(SharedElementCallback callback) {
        throw new RuntimeException("Stub!");
    }

    public void setExitSharedElementCallback(SharedElementCallback callback) {
        throw new RuntimeException("Stub!");
    }

    public void setEnterTransition(Transition transition) {
        throw new RuntimeException("Stub!");
    }

    public Transition getEnterTransition() {
        return new Transition() {
            @Override
            public void captureStartValues(TransitionValues transitionValues) {

            }

            @Override
            public void captureEndValues(TransitionValues transitionValues) {

            }
        };
    }

    public void setReturnTransition(Transition transition) {
        throw new RuntimeException("Stub!");
    }

    public Transition getReturnTransition() {
        return getEnterTransition();
    }

    public void setExitTransition(Transition transition) {
        throw new RuntimeException("Stub!");
    }

    public Transition getExitTransition() {
        return getEnterTransition();
    }

    public void setReenterTransition(Transition transition) {
        throw new RuntimeException("Stub!");
    }

    public Transition getReenterTransition() {
        return getEnterTransition();
    }

    public void setSharedElementEnterTransition(Transition transition) {
        throw new RuntimeException("Stub!");
    }

    public Transition getSharedElementEnterTransition() {
        return getEnterTransition();
    }

    public void setSharedElementReturnTransition(Transition transition) {
        throw new RuntimeException("Stub!");
    }

    public Transition getSharedElementReturnTransition() {
        return getEnterTransition();
    }

    public void setAllowEnterTransitionOverlap(boolean allow) {
        throw new RuntimeException("Stub!");
    }

    public boolean getAllowEnterTransitionOverlap() {
        throw new RuntimeException("Stub!");
    }

    public void setAllowReturnTransitionOverlap(boolean allow) {
        throw new RuntimeException("Stub!");
    }

    public boolean getAllowReturnTransitionOverlap() {
        throw new RuntimeException("Stub!");
    }

    public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        throw new RuntimeException("Stub!");
    }

    public static class InstantiationException extends AndroidRuntimeException {
        public InstantiationException(String msg, Exception cause) {
            throw new RuntimeException("Stub!");
        }
    }

    public static class SavedState implements Parcelable {
        public static final ClassLoaderCreator<Fragment.SavedState> CREATOR = null;

        SavedState() {
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
