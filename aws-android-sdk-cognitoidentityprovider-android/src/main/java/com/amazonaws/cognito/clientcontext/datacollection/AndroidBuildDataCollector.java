package com.amazonaws.cognito.clientcontext.datacollection;

import java.util.HashMap;
import java.util.Map;

import android.content.Context;
import android.os.Build;

/**
 * It collects build information for underlying device hardware.
 */
public class AndroidBuildDataCollector extends AndroidDataCollector {
    
    @Override
    public Map<String, String> collect(Context context) {
        Map<String, String> contextData = new HashMap<String, String>();
        contextData.put(AndroidDataRecordKey.BRAND, Build.BRAND);
        contextData.put(AndroidDataRecordKey.FINGERPRINT, Build.FINGERPRINT);
        contextData.put(AndroidDataRecordKey.HARDWARE, Build.HARDWARE);
        contextData.put(AndroidDataRecordKey.MODEL, Build.MODEL);
        contextData.put(AndroidDataRecordKey.PRODUCT, Build.PRODUCT);
        contextData.put(AndroidDataRecordKey.BUILD_TYPE, Build.TYPE);
        contextData.put(AndroidDataRecordKey.VERSION_RELEASE, Build.VERSION.RELEASE);
        contextData.put(AndroidDataRecordKey.VERSION_SDK, Build.VERSION.SDK);
        return contextData;
    }
}