package com.amazonaws.cognito.clientcontext.datacollection;

import java.util.Map;

public interface DataAggregator {

    /**
     * @return map of device configuration properties
     */
    Map<String, String> getAggregatedData();
}
