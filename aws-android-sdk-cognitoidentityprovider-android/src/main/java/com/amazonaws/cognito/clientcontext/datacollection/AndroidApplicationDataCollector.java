package com.amazonaws.cognito.clientcontext.datacollection;

import java.util.HashMap;
import java.util.Map;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;

/**
 * It collects application related data for the device.
 */
public class AndroidApplicationDataCollector extends AndroidDataCollector {

    private static final String TAG = AndroidApplicationDataCollector.class.getSimpleName();
    private static final int ALL_FLAGS_OFF = 0;
    
    @Override
    public Map<String, String> collect(Context context) {
        Map<String, String> contextData = new HashMap<String, String>();
        contextData.put(AndroidDataRecordKey.APP_NAME, getAppName(context));
        contextData.put(AndroidDataRecordKey.APP_TARGET_SDK, getAppTargetSdk(context));
        contextData.put(AndroidDataRecordKey.APP_VERSION, getAppVersion(context));
        return contextData;
    }

    private String getAppName(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();

        PackageManager packageManager = context.getPackageManager();
        String appName = (String) packageManager.getApplicationLabel(applicationInfo);
        return appName;
    }

    private String getAppVersion(Context context) {
        PackageManager packageManager = context.getPackageManager();

        String appVersion = "";
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), ALL_FLAGS_OFF);
            appVersion = packageInfo.versionName;
        } catch (NameNotFoundException e) {
            Log.i(TAG, "Unable to get app version. Provided package name could not be found.");
        }
        return appVersion;
    }

    private String getAppTargetSdk(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return String.valueOf(applicationInfo.targetSdkVersion);
    }
}