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

package com.amazonaws.services.elasticmapreduce.model.transform;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InstanceTimeline
 */
class InstanceTimelineJsonMarshaller {

    public void marshall(InstanceTimeline instanceTimeline, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instanceTimeline.getCreationDateTime() != null) {
            java.util.Date creationDateTime = instanceTimeline.getCreationDateTime();
            jsonWriter.name("CreationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (instanceTimeline.getReadyDateTime() != null) {
            java.util.Date readyDateTime = instanceTimeline.getReadyDateTime();
            jsonWriter.name("ReadyDateTime");
            jsonWriter.value(readyDateTime);
        }
        if (instanceTimeline.getEndDateTime() != null) {
            java.util.Date endDateTime = instanceTimeline.getEndDateTime();
            jsonWriter.name("EndDateTime");
            jsonWriter.value(endDateTime);
        }
        jsonWriter.endObject();
    }

    private static InstanceTimelineJsonMarshaller instance;

    public static InstanceTimelineJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceTimelineJsonMarshaller();
        return instance;
    }
}
