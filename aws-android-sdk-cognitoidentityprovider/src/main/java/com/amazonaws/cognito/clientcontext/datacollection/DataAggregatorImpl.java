package com.amazonaws.cognito.clientcontext.datacollection;

import java.util.HashMap;
import java.util.Map;

public class DataAggregatorImpl implements DataAggregator {
    
    @Override
    public Map<String, String> getAggregatedData() {
        Map<String, String> data = new HashMap<>();
        data.put(DataRecordKey.JDK_VENDOR, getProp("java.vm.specification.vendor", "Java"));
        data.put(DataRecordKey.OS_ARCH, getProp("os.arch", "Java"));
        data.put(DataRecordKey.OS_NAME, getProp("os.name", "Java"));
        data.put(DataRecordKey.OS_VERSION, getProp("os.version", "Java"));
        return data;
    }
    
    private static String getProp(String property, String defaultValue) {
        String value = System.getProperty(property);
        return value == null ? defaultValue : value;
    }
}
