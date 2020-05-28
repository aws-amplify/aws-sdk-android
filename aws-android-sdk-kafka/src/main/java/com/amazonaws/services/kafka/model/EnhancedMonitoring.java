/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.kafka.model;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 <p>
 * Specifies which metrics are gathered for the MSK cluster. This property has
 * three possible values: DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER. For a
 * list of the metrics associated with each of these three levels of monitoring,
 * see <a href=
 * "https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html"
 * >Monitoring</a>.
 * </p>
 */
public enum EnhancedMonitoring {

    DEFAULT("DEFAULT"),
    PER_BROKER("PER_BROKER"),
    PER_TOPIC_PER_BROKER("PER_TOPIC_PER_BROKER");

    private String value;

    private EnhancedMonitoring(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, EnhancedMonitoring> enumMap;
    static {
        enumMap = new HashMap<String, EnhancedMonitoring>();
        enumMap.put("DEFAULT", DEFAULT);
        enumMap.put("PER_BROKER", PER_BROKER);
        enumMap.put("PER_TOPIC_PER_BROKER", PER_TOPIC_PER_BROKER);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return EnhancedMonitoring corresponding to the value
     */
    public static EnhancedMonitoring fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
