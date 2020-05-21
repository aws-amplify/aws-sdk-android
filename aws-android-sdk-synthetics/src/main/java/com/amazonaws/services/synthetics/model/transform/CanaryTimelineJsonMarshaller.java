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
 * JSON marshaller for POJO CanaryTimeline
 */
class CanaryTimelineJsonMarshaller {

    public void marshall(CanaryTimeline canaryTimeline, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (canaryTimeline.getCreated() != null) {
            java.util.Date created = canaryTimeline.getCreated();
            jsonWriter.name("Created");
            jsonWriter.value(created);
        }
        if (canaryTimeline.getLastModified() != null) {
            java.util.Date lastModified = canaryTimeline.getLastModified();
            jsonWriter.name("LastModified");
            jsonWriter.value(lastModified);
        }
        if (canaryTimeline.getLastStarted() != null) {
            java.util.Date lastStarted = canaryTimeline.getLastStarted();
            jsonWriter.name("LastStarted");
            jsonWriter.value(lastStarted);
        }
        if (canaryTimeline.getLastStopped() != null) {
            java.util.Date lastStopped = canaryTimeline.getLastStopped();
            jsonWriter.name("LastStopped");
            jsonWriter.value(lastStopped);
        }
        jsonWriter.endObject();
    }

    private static CanaryTimelineJsonMarshaller instance;

    public static CanaryTimelineJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CanaryTimelineJsonMarshaller();
        return instance;
    }
}
