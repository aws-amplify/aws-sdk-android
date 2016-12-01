package com.amazonaws.mobileconnectors.pinpoint.analytics.utils;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;

public class ContextWithPermissions extends ContextWrapper {
    public ContextWithPermissions(Context base) {
        super(base);
    }

    @Override
    public int checkCallingOrSelfPermission(String permission) {
        if (permission.equalsIgnoreCase("android.permission.INTERNET")
                || permission.equalsIgnoreCase("android.permission.ACCESS_NETWORK_STATE"))
            return PackageManager.PERMISSION_GRANTED;
        else
            return super.checkCallingOrSelfPermission(permission);
    }
}
