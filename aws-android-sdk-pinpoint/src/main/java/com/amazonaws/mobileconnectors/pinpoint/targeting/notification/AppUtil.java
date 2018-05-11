package com.amazonaws.mobileconnectors.pinpoint.targeting.notification;

import android.app.ActivityManager;
import android.content.Context;

import java.util.List;

/* package */ class AppUtil {
    private final Context applicationContext;
    /**
     * Constructor for utility class.
     */
    /* package */ AppUtil(final Context appContext) {
        this.applicationContext = appContext;
    }

    /**
     * @return true if the application is in the foreground, otherwise return false.
     */
    /* package */ boolean isAppInForeground() {
        // Gets a list of running processes.
        final ActivityManager am = (ActivityManager) applicationContext.getSystemService(Context.ACTIVITY_SERVICE);
        final List<ActivityManager.RunningAppProcessInfo> processes = am.getRunningAppProcesses();

        // On some versions of android the first item in the list is what runs in the foreground, but this is not true
        // on all versions. Check the process importance to see if the app is in the foreground.
        final String packageName = applicationContext.getApplicationContext().getPackageName();
        for (final ActivityManager.RunningAppProcessInfo appProcess : processes) {
            final String processName = appProcess.processName;
            if (ActivityManager.RunningAppProcessInfo.IMPORTANCE_FOREGROUND == appProcess.importance &&
                packageName.equals(processName)) {
                return true;
            }
        }
        return false;
    }
}
