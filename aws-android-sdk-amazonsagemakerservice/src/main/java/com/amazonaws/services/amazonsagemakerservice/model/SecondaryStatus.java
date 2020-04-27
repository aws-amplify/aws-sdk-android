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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Secondary Status
 */
public enum SecondaryStatus {

    Starting("Starting"),
    LaunchingMLInstances("LaunchingMLInstances"),
    PreparingTrainingStack("PreparingTrainingStack"),
    Downloading("Downloading"),
    DownloadingTrainingImage("DownloadingTrainingImage"),
    Training("Training"),
    Uploading("Uploading"),
    Stopping("Stopping"),
    Stopped("Stopped"),
    MaxRuntimeExceeded("MaxRuntimeExceeded"),
    Completed("Completed"),
    Failed("Failed"),
    Interrupted("Interrupted"),
    MaxWaitTimeExceeded("MaxWaitTimeExceeded");

    private String value;

    private SecondaryStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, SecondaryStatus> enumMap;
    static {
        enumMap = new HashMap<String, SecondaryStatus>();
        enumMap.put("Starting", Starting);
        enumMap.put("LaunchingMLInstances", LaunchingMLInstances);
        enumMap.put("PreparingTrainingStack", PreparingTrainingStack);
        enumMap.put("Downloading", Downloading);
        enumMap.put("DownloadingTrainingImage", DownloadingTrainingImage);
        enumMap.put("Training", Training);
        enumMap.put("Uploading", Uploading);
        enumMap.put("Stopping", Stopping);
        enumMap.put("Stopped", Stopped);
        enumMap.put("MaxRuntimeExceeded", MaxRuntimeExceeded);
        enumMap.put("Completed", Completed);
        enumMap.put("Failed", Failed);
        enumMap.put("Interrupted", Interrupted);
        enumMap.put("MaxWaitTimeExceeded", MaxWaitTimeExceeded);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return SecondaryStatus corresponding to the value
     */
    public static SecondaryStatus fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
