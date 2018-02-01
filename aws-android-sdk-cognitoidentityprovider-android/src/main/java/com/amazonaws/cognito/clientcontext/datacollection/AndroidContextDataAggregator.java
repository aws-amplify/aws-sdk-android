package com.amazonaws.cognito.clientcontext.datacollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;

/**
 * It collect all the user context data.
 */
public class AndroidContextDataAggregator implements DataAggregator {

    private final List<AndroidDataCollector> dataCollectors;
    private final Map<String, String> lastAggregatedData = new HashMap<>();


    @Override
    public Map<String, String> getAggregatedData() {
        return lastAggregatedData;
    }
    
    public void refreshAggregatedData(Context context) {
        lastAggregatedData.clear();
        lastAggregatedData.putAll(getAggregatedData(context));
    }

    /**
     * Private class to store an instance. This is used to ensure a singleton
     * instance of the class.
     */
    private static class InstanceHolder {
        private static final AndroidContextDataAggregator INSTANCE = new AndroidContextDataAggregator();
    }

    private AndroidContextDataAggregator() {
        this.dataCollectors = getDataCollectors();
    }

    /**
     * Protected constructor to instantiate a class object for unit testing.
     * 
     * @param dataCollectors
     *            collectors for user context data.
     */
    protected AndroidContextDataAggregator(List<AndroidDataCollector> dataCollectors) {
        this.dataCollectors = dataCollectors;
    }

    /**
     * @return instance of the class
     */
    public static AndroidContextDataAggregator getInstance() {
        return InstanceHolder.INSTANCE;
    }

    /**
     * It invokes collect for all the data collectors and create user context
     * data.
     * 
     * @param context
     *            Android application context.
     * @return key-value pair of the collected user context data.
     */
    public Map<String, String> getAggregatedData(Context context) {
        Map<String, String> userContextData = new HashMap<String, String>();
        for (AndroidDataCollector collector : dataCollectors) {
            Map<String, String> data = collector.collect(context);
            userContextData.putAll(data);
        }
        removerNullEntries(userContextData);
        return userContextData;
    }

    private void removerNullEntries(Map<String, String> data) {
        for (Map.Entry<String, String> entry : data.entrySet()) {
            if (entry.getValue() == null) {
                data.remove(entry.getKey());
            }
        }
    }

    private List<AndroidDataCollector> getDataCollectors() {
        List<AndroidDataCollector> availableDataCollectors = new ArrayList<AndroidDataCollector>();
        availableDataCollectors.add(new AndroidApplicationDataCollector());
        availableDataCollectors.add(new AndroidBuildDataCollector());
        availableDataCollectors.add(new AndroidDeviceDataCollector());
        availableDataCollectors.add(new AndroidTelephonyDataCollector());
        return availableDataCollectors;
    }
}