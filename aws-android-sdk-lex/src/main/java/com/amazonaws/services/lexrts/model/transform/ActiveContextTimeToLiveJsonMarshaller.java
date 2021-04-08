/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.lexrts.model.transform;

import com.amazonaws.services.lexrts.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ActiveContextTimeToLive
 */
class ActiveContextTimeToLiveJsonMarshaller {

    public void marshall(ActiveContextTimeToLive activeContextTimeToLive, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (activeContextTimeToLive.getTimeToLiveInSeconds() != null) {
            Integer timeToLiveInSeconds = activeContextTimeToLive.getTimeToLiveInSeconds();
            jsonWriter.name("timeToLiveInSeconds");
            jsonWriter.value(timeToLiveInSeconds);
        }
        if (activeContextTimeToLive.getTurnsToLive() != null) {
            Integer turnsToLive = activeContextTimeToLive.getTurnsToLive();
            jsonWriter.name("turnsToLive");
            jsonWriter.value(turnsToLive);
        }
        jsonWriter.endObject();
    }

    private static ActiveContextTimeToLiveJsonMarshaller instance;

    public static ActiveContextTimeToLiveJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActiveContextTimeToLiveJsonMarshaller();
        return instance;
    }
}
