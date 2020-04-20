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

package com.amazonaws.services.synthetics.model.transform;

import com.amazonaws.services.synthetics.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CanaryRunTimeline
 */
class CanaryRunTimelineJsonMarshaller {

    public void marshall(CanaryRunTimeline canaryRunTimeline, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (canaryRunTimeline.getStarted() != null) {
            java.util.Date started = canaryRunTimeline.getStarted();
            jsonWriter.name("Started");
            jsonWriter.value(started);
        }
        if (canaryRunTimeline.getCompleted() != null) {
            java.util.Date completed = canaryRunTimeline.getCompleted();
            jsonWriter.name("Completed");
            jsonWriter.value(completed);
        }
        jsonWriter.endObject();
    }

    private static CanaryRunTimelineJsonMarshaller instance;

    public static CanaryRunTimelineJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CanaryRunTimelineJsonMarshaller();
        return instance;
    }
}
