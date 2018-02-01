package com.amazonaws.cognito.clientcontext.datacollection;

import java.util.Map;

import android.content.Context;

/**
 * Base class for the data collectors. Data collectors provide logic to collect
 * context data.
 */
public abstract class AndroidDataCollector {

    /**
     * Actual logic to collect a category of data from device.
     * 
     * @param context
     *            android application context.
     * @return return key-value pair of user-context data.
     */
    public abstract Map<String, String> collect(Context context);
}
