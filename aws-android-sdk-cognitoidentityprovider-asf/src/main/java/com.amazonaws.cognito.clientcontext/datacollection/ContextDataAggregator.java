/*
 * Copyright 2017-2022 Amazon.com,
 * Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the
 * License. A copy of the License is located at
 *
 *     http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, express or implied. See the License
 * for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.cognito.clientcontext.datacollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;

/**
 * It collect all the user context data.
 */
public class ContextDataAggregator {

    private final List<DataCollector> dataCollectors;

    /**
     * Private class to store an instance. This is used to ensure a singleton
     * instance of the class.
     */
    private static class InstanceHolder {
        private static final ContextDataAggregator INSTANCE = new ContextDataAggregator();
    }

    private ContextDataAggregator() {
        this.dataCollectors = getDataCollectors();
    }

    /**
     * Protected constructor to instantiate a class object for unit testing.
     *
     * @param dataCollectors
     *            collectors for user context data.
     */
    protected ContextDataAggregator(List<DataCollector> dataCollectors) {
        this.dataCollectors = dataCollectors;
    }

    /**
     * @return instance of the class
     */
    public static ContextDataAggregator getInstance() {
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
        for (DataCollector collector : dataCollectors) {
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

    private List<DataCollector> getDataCollectors() {
        List<DataCollector> availableDataCollectors = new ArrayList<DataCollector>();
        availableDataCollectors.add(new ApplicationDataCollector());
        availableDataCollectors.add(new BuildDataCollector());
        availableDataCollectors.add(new DeviceDataCollector());
        return availableDataCollectors;
    }
}