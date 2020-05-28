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
 * The distribution of broker nodes across Availability Zones. This is an
 * optional parameter. If you don't specify it, Amazon MSK gives it the value
 * DEFAULT. You can also explicitly set this parameter to the value DEFAULT. No
 * other values are currently allowed.
 * </p>
 * <p>
 * Amazon MSK distributes the broker nodes evenly across the Availability Zones
 * that correspond to the subnets you provide when you create the cluster.
 * </p>
 */
public enum BrokerAZDistribution {

    DEFAULT("DEFAULT");

    private String value;

    private BrokerAZDistribution(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, BrokerAZDistribution> enumMap;
    static {
        enumMap = new HashMap<String, BrokerAZDistribution>();
        enumMap.put("DEFAULT", DEFAULT);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return BrokerAZDistribution corresponding to the value
     */
    public static BrokerAZDistribution fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
