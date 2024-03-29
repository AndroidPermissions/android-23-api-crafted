/*
 * Copyright (C) 2006 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.content;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.*;
import android.test.mock.MockContentResolver;
import android.view.Display;

import java.io.*;

/**
 * Proxying implementation of Context that simply delegates all of its calls to
 * another Context.  Can be subclassed to modify behavior without changing
 * the original Context.
 */
public class ContextWrapper extends Context {
    Context mBase;

    public ContextWrapper(Context base) {
        mBase = base;
    }

    /**
     * Set the base context for this ContextWrapper.  All calls will then be
     * delegated to the base context.  Throws
     * IllegalStateException if a base context has already been set.
     *
     * @param base The new base context for this wrapper.
     */
    protected void attachBaseContext(Context base) {
        if (mBase != null) {
            throw new IllegalStateException("Base context already set");
        }
        mBase = base;
    }

    /**
     * @return the base context as set by the constructor or setBaseContext
     */
    public Context getBaseContext() {
        return this;
    }

    @Override
    public AssetManager getAssets() {
        return mBase.getAssets();
    }

    @Override
    public Resources getResources()
    {
        return mBase.getResources();
    }

    @Override
    public PackageManager getPackageManager() {
        return mBase.getPackageManager();
    }

    @Override
    public ContentResolver getContentResolver() {
        return new MockContentResolver();
    }

    @Override
    public Looper getMainLooper() {
        return mBase.getMainLooper();
    }

    @Override
    public Context getApplicationContext() {
        return this;
    }

    @Override
    public void setTheme(int resid) {
        mBase.setTheme(resid);
    }

    @Override
    public Resources.Theme getTheme() {
        return mBase.getTheme();
    }

    @Override
    public ClassLoader getClassLoader() {
        return mBase.getClassLoader();
    }

    @Override
    public String getPackageName() {
        return mBase.getPackageName();
    }

    @Override
    public ApplicationInfo getApplicationInfo() {
        return mBase.getApplicationInfo();
    }

    @Override
    public String getPackageResourcePath() {
        return mBase.getPackageResourcePath();
    }

    @Override
    public String getPackageCodePath() {
        return mBase.getPackageCodePath();
    }

    @Override
    public SharedPreferences getSharedPreferences(String name, int mode) {
        return mBase.getSharedPreferences(name, mode);
    }

    @Override
    public FileInputStream openFileInput(String name)
            throws FileNotFoundException {
        return mBase.openFileInput(name);
    }

    @Override
    public FileOutputStream openFileOutput(String name, int mode)
            throws FileNotFoundException {
        return mBase.openFileOutput(name, mode);
    }

    @Override
    public boolean deleteFile(String name) {
        return mBase.deleteFile(name);
    }

    @Override
    public File getFileStreamPath(String name) {
        return new File("mock" + name);
    }

    @Override
    public String[] fileList() {
        return mBase.fileList();
    }

    @Override
    public File getFilesDir() {
        return new File("mock");
    }

    @Override
    public File getNoBackupFilesDir() {
        return new File("mock");
    }

    @Override
    public File getExternalFilesDir(String type) {
        return new File("mock");
    }

    @Override
    public File[] getExternalFilesDirs(String type) {
        return new File[]{new File("mock")};
    }

    @Override
    public File getObbDir() {
        return new File("mock");
    }

    @Override
    public File[] getObbDirs() {
        return new File[]{new File("mock")};
    }

    @Override
    public File getCacheDir() {
        return new File("mock"); //ensures result points-to is not empty. Maybe helps.
    }

    @Override
    public File getCodeCacheDir() {
        return new File("mock");
    }

    @Override
    public File getExternalCacheDir() {
        return new File("mock");
    }

    @Override
    public File[] getExternalCacheDirs() {
        return new File[]{new File("mock")};
    }

    @Override
    public File[] getExternalMediaDirs() {
        return new File[]{new File("mock")};
    }

    @Override
    public File getDir(String name, int mode) {
        return new File("mock" + name);
    }

    @Override
    public SQLiteDatabase openOrCreateDatabase(String name, int mode, CursorFactory factory) {
        return mBase.openOrCreateDatabase(name, mode, factory);
    }

    @Override
    public SQLiteDatabase openOrCreateDatabase(String name, int mode, CursorFactory factory,
                                               DatabaseErrorHandler errorHandler) {
        return mBase.openOrCreateDatabase(name, mode, factory, errorHandler);
    }

    @Override
    public boolean deleteDatabase(String name) {
        return mBase.deleteDatabase(name);
    }

    @Override
    public File getDatabasePath(String name) {
        return new File("mock" + name);
    }

    @Override
    public String[] databaseList() {
        return mBase.databaseList();
    }

    @Override
    @Deprecated
    public Drawable getWallpaper() {
        return mBase.getWallpaper();
    }

    @Override
    @Deprecated
    public Drawable peekWallpaper() {
        return mBase.peekWallpaper();
    }

    @Override
    @Deprecated
    public int getWallpaperDesiredMinimumWidth() {
        return mBase.getWallpaperDesiredMinimumWidth();
    }

    @Override
    @Deprecated
    public int getWallpaperDesiredMinimumHeight() {
        return mBase.getWallpaperDesiredMinimumHeight();
    }

    @Override
    @Deprecated
    public void setWallpaper(Bitmap bitmap) throws IOException {
        mBase.setWallpaper(bitmap);
    }

    @Override
    @Deprecated
    public void setWallpaper(InputStream data) throws IOException {
        mBase.setWallpaper(data);
    }

    @Override
    @Deprecated
    public void clearWallpaper() throws IOException {
        mBase.clearWallpaper();
    }

    @Override
    public void startActivity(Intent intent) {
        mBase.startActivity(intent);
    }

    @Override
    public void startActivity(Intent intent, Bundle options) {
        mBase.startActivity(intent, options);
    }

    @Override
    public void startActivities(Intent[] intents) {
        mBase.startActivities(intents);
    }

    @Override
    public void startActivities(Intent[] intents, Bundle options) {
        mBase.startActivities(intents, options);
    }

    @Override
    public void startIntentSender(IntentSender intent,
                                  Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags)
            throws IntentSender.SendIntentException {
        mBase.startIntentSender(intent, fillInIntent, flagsMask,
                flagsValues, extraFlags);
    }

    @Override
    public void startIntentSender(IntentSender intent,
                                  Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags,
                                  Bundle options) throws IntentSender.SendIntentException {
        mBase.startIntentSender(intent, fillInIntent, flagsMask,
                flagsValues, extraFlags, options);
    }

    @Override
    public void sendBroadcast(Intent intent) {
        mBase.sendBroadcast(intent);
    }

    @Override
    public void sendBroadcast(Intent intent, String receiverPermission) {
        mBase.sendBroadcast(intent, receiverPermission);
    }

    @Override
    public void sendOrderedBroadcast(Intent intent,
                                     String receiverPermission) {
        mBase.sendOrderedBroadcast(intent, receiverPermission);
    }

    @Override
    public void sendOrderedBroadcast(
            Intent intent, String receiverPermission, BroadcastReceiver resultReceiver,
            Handler scheduler, int initialCode, String initialData,
            Bundle initialExtras) {
        mBase.sendOrderedBroadcast(intent, receiverPermission,
                resultReceiver, scheduler, initialCode,
                initialData, initialExtras);
    }

    @Override
    public void sendBroadcastAsUser(Intent intent, UserHandle user) {
        mBase.sendBroadcastAsUser(intent, user);
    }

    @Override
    public void sendBroadcastAsUser(Intent intent, UserHandle user,
                                    String receiverPermission) {
        mBase.sendBroadcastAsUser(intent, user, receiverPermission);
    }

    @Override
    public void sendOrderedBroadcastAsUser(Intent intent, UserHandle user,
                                           String receiverPermission, BroadcastReceiver resultReceiver, Handler scheduler,
                                           int initialCode, String initialData, Bundle initialExtras) {
        mBase.sendOrderedBroadcastAsUser(intent, user, receiverPermission, resultReceiver,
                scheduler, initialCode, initialData, initialExtras);
    }

    @Override
    @Deprecated
    public void sendStickyBroadcast(Intent intent) {
        mBase.sendStickyBroadcast(intent);
    }

    @Override
    @Deprecated
    public void sendStickyOrderedBroadcast(
            Intent intent, BroadcastReceiver resultReceiver,
            Handler scheduler, int initialCode, String initialData,
            Bundle initialExtras) {
        mBase.sendStickyOrderedBroadcast(intent,
                resultReceiver, scheduler, initialCode,
                initialData, initialExtras);
    }

    @Override
    @Deprecated
    public void removeStickyBroadcast(Intent intent) {
        mBase.removeStickyBroadcast(intent);
    }

    @Override
    @Deprecated
    public void sendStickyBroadcastAsUser(Intent intent, UserHandle user) {
        mBase.sendStickyBroadcastAsUser(intent, user);
    }

    @Override
    @Deprecated
    public void sendStickyOrderedBroadcastAsUser(Intent intent,
                                                 UserHandle user, BroadcastReceiver resultReceiver,
                                                 Handler scheduler, int initialCode, String initialData,
                                                 Bundle initialExtras) {
        mBase.sendStickyOrderedBroadcastAsUser(intent, user, resultReceiver,
                scheduler, initialCode, initialData, initialExtras);
    }

    @Override
    @Deprecated
    public void removeStickyBroadcastAsUser(Intent intent, UserHandle user) {
        mBase.removeStickyBroadcastAsUser(intent, user);
    }

    @Override
    public Intent registerReceiver(
            BroadcastReceiver receiver, IntentFilter filter) {
        return mBase.registerReceiver(receiver, filter);
    }

    @Override
    public Intent registerReceiver(
            BroadcastReceiver receiver, IntentFilter filter,
            String broadcastPermission, Handler scheduler) {
        return mBase.registerReceiver(receiver, filter, broadcastPermission,
                scheduler);
    }

    @Override
    public void unregisterReceiver(BroadcastReceiver receiver) {
        mBase.unregisterReceiver(receiver);
    }

    @Override
    public ComponentName startService(Intent service) {
        return mBase.startService(service);
    }

    @Override
    public boolean stopService(Intent name) {
        return mBase.stopService(name);
    }

    @Override
    public boolean bindService(Intent service, ServiceConnection conn,
                               int flags) {
        return mBase.bindService(service, conn, flags);
    }

    @Override
    public void unbindService(ServiceConnection conn) {
        mBase.unbindService(conn);
    }

    @Override
    public boolean startInstrumentation(ComponentName className,
                                        String profileFile, Bundle arguments) {
        return mBase.startInstrumentation(className, profileFile, arguments);
    }

    @Override
    public int checkPermission(String permission, int pid, int uid) {
        return mBase.checkPermission(permission, pid, uid);
    }

    @Override
    public int checkCallingPermission(String permission) {
        return mBase.checkCallingPermission(permission);
    }

    @Override
    public int checkCallingOrSelfPermission(String permission) {
        return mBase.checkCallingOrSelfPermission(permission);
    }

    @Override
    public int checkSelfPermission(String permission) {
        return mBase.checkSelfPermission(permission);
    }

    @Override
    public void enforcePermission(
            String permission, int pid, int uid, String message) {
        mBase.enforcePermission(permission, pid, uid, message);
    }

    @Override
    public void enforceCallingPermission(String permission, String message) {
        mBase.enforceCallingPermission(permission, message);
    }

    @Override
    public void enforceCallingOrSelfPermission(
            String permission, String message) {
        mBase.enforceCallingOrSelfPermission(permission, message);
    }

    @Override
    public void grantUriPermission(String toPackage, Uri uri, int modeFlags) {
        mBase.grantUriPermission(toPackage, uri, modeFlags);
    }

    @Override
    public void revokeUriPermission(Uri uri, int modeFlags) {
        mBase.revokeUriPermission(uri, modeFlags);
    }

    @Override
    public int checkUriPermission(Uri uri, int pid, int uid, int modeFlags) {
        return mBase.checkUriPermission(uri, pid, uid, modeFlags);
    }

    @Override
    public int checkCallingUriPermission(Uri uri, int modeFlags) {
        return mBase.checkCallingUriPermission(uri, modeFlags);
    }

    @Override
    public int checkCallingOrSelfUriPermission(Uri uri, int modeFlags) {
        return mBase.checkCallingOrSelfUriPermission(uri, modeFlags);
    }

    @Override
    public int checkUriPermission(Uri uri, String readPermission,
                                  String writePermission, int pid, int uid, int modeFlags) {
        return mBase.checkUriPermission(uri, readPermission, writePermission,
                pid, uid, modeFlags);
    }

    @Override
    public void enforceUriPermission(
            Uri uri, int pid, int uid, int modeFlags, String message) {
        mBase.enforceUriPermission(uri, pid, uid, modeFlags, message);
    }

    @Override
    public void enforceCallingUriPermission(
            Uri uri, int modeFlags, String message) {
        mBase.enforceCallingUriPermission(uri, modeFlags, message);
    }

    @Override
    public void enforceCallingOrSelfUriPermission(
            Uri uri, int modeFlags, String message) {
        mBase.enforceCallingOrSelfUriPermission(uri, modeFlags, message);
    }

    @Override
    public void enforceUriPermission(
            Uri uri, String readPermission, String writePermission,
            int pid, int uid, int modeFlags, String message) {
        mBase.enforceUriPermission(
                uri, readPermission, writePermission, pid, uid, modeFlags,
                message);
    }

    @Override
    public Context createPackageContext(String packageName, int flags)
            throws PackageManager.NameNotFoundException {
        return this;
    }

    @Override
    public Context createConfigurationContext(Configuration overrideConfiguration) {
        return this;
    }

    @Override
    public Context createDisplayContext(Display display) {
        return this;
    }

    @Override
    public boolean isRestricted() {
        return mBase.isRestricted();
    }

    //DroidPerm: hidden methods
    //****************************************************


    @Override
    public String getBasePackageName() {
        return null;
    }

    @Override
    public String getOpPackageName() {
        return null;
    }

    @Override
    public File getSharedPrefsFile(String name) {
        return new File("mock" + name);
    }

    @Override
    public void sendBroadcastMultiplePermissions(Intent intent, String[] receiverPermissions) {

    }

    @Override
    public void sendBroadcast(Intent intent, String receiverPermission, Bundle options) {

    }

    @Override
    public void sendBroadcast(Intent intent, String receiverPermission, int appOp) {

    }

    @Override
    public void sendOrderedBroadcast(Intent intent, String receiverPermission, Bundle options,
                                     BroadcastReceiver resultReceiver, Handler scheduler, int initialCode,
                                     String initialData, Bundle initialExtras) {

    }

    @Override
    public void sendOrderedBroadcast(Intent intent, String receiverPermission, int appOp,
                                     BroadcastReceiver resultReceiver, Handler scheduler, int initialCode,
                                     String initialData, Bundle initialExtras) {

    }

    @Override
    public void sendBroadcastAsUser(Intent intent, UserHandle user, String receiverPermission, int appOp) {

    }

    @Override
    public void sendOrderedBroadcastAsUser(Intent intent, UserHandle user, String receiverPermission, int appOp,
                                           BroadcastReceiver resultReceiver, Handler scheduler, int initialCode,
                                           String initialData, Bundle initialExtras) {

    }

    @Override
    public void sendOrderedBroadcastAsUser(Intent intent, UserHandle user, String receiverPermission, int appOp,
                                           Bundle options, BroadcastReceiver resultReceiver, Handler scheduler,
                                           int initialCode, String initialData, Bundle initialExtras) {

    }

    @Override
    public Intent registerReceiverAsUser(BroadcastReceiver receiver, UserHandle user, IntentFilter filter,
                                         String broadcastPermission, Handler scheduler) {
        return null;
    }

    @Override
    public ComponentName startServiceAsUser(Intent service, UserHandle user) {
        return null;
    }

    @Override
    public boolean stopServiceAsUser(Intent service, UserHandle user) {
        return false;
    }

    @Override
    public int checkPermission(String permission, int pid, int uid, IBinder callerToken) {
        return 0;
    }

    @Override
    public int checkUriPermission(Uri uri, int pid, int uid, int modeFlags, IBinder callerToken) {
        return 0;
    }

    @Override
    public Context createPackageContextAsUser(String packageName, int flags, UserHandle user)
            throws PackageManager.NameNotFoundException {
        return this;
    }

    @Override
    public Context createApplicationContext(ApplicationInfo application, int flags)
            throws PackageManager.NameNotFoundException {
        return this;
    }

    @Override
    public int getUserId() {
        return 0;
    }
}
