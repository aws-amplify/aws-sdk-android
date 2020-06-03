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

package com.amazonaws.services.mediaconvert.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Use Respond to AFD (RespondToAfd) to specify how the service changes the
 * video itself in response to AFD values in the input. * Choose Respond to clip
 * the input video frame according to the AFD value, input display aspect ratio,
 * and output display aspect ratio. * Choose Passthrough to include the input
 * AFD values. Do not choose this when AfdSignaling is set to (NONE). A
 * preferred implementation of this workflow is to set RespondToAfd to (NONE)
 * and set AfdSignaling to (AUTO). * Choose None to remove all input AFD values
 * from this output.
 */
public enum RespondToAfd {

    NONE("NONE"),
    RESPOND("RESPOND"),
    PASSTHROUGH("PASSTHROUGH");

    private String value;

    private RespondToAfd(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, RespondToAfd> enumMap;
    static {
        enumMap = new HashMap<String, RespondToAfd>();
        enumMap.put("NONE", NONE);
        enumMap.put("RESPOND", RESPOND);
        enumMap.put("PASSTHROUGH", PASSTHROUGH);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return RespondToAfd corresponding to the value
     */
    public static RespondToAfd fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
