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

package com.amazonaws.services.elasticmapreduce.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Instance Group State
 */
public enum InstanceGroupState {

    PROVISIONING("PROVISIONING"),
    BOOTSTRAPPING("BOOTSTRAPPING"),
    RUNNING("RUNNING"),
    RECONFIGURING("RECONFIGURING"),
    RESIZING("RESIZING"),
    SUSPENDED("SUSPENDED"),
    TERMINATING("TERMINATING"),
    TERMINATED("TERMINATED"),
    ARRESTED("ARRESTED"),
    SHUTTING_DOWN("SHUTTING_DOWN"),
    ENDED("ENDED");

    private String value;

    private InstanceGroupState(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, InstanceGroupState> enumMap;
    static {
        enumMap = new HashMap<String, InstanceGroupState>();
        enumMap.put("PROVISIONING", PROVISIONING);
        enumMap.put("BOOTSTRAPPING", BOOTSTRAPPING);
        enumMap.put("RUNNING", RUNNING);
        enumMap.put("RECONFIGURING", RECONFIGURING);
        enumMap.put("RESIZING", RESIZING);
        enumMap.put("SUSPENDED", SUSPENDED);
        enumMap.put("TERMINATING", TERMINATING);
        enumMap.put("TERMINATED", TERMINATED);
        enumMap.put("ARRESTED", ARRESTED);
        enumMap.put("SHUTTING_DOWN", SHUTTING_DOWN);
        enumMap.put("ENDED", ENDED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return InstanceGroupState corresponding to the value
     */
    public static InstanceGroupState fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
