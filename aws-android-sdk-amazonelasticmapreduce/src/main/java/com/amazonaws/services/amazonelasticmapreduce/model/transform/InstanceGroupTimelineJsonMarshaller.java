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

package com.amazonaws.services.amazonelasticmapreduce.model.transform;

import com.amazonaws.services.amazonelasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InstanceGroupTimeline
 */
class InstanceGroupTimelineJsonMarshaller {

    public void marshall(InstanceGroupTimeline instanceGroupTimeline, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instanceGroupTimeline.getCreationDateTime() != null) {
            java.util.Date creationDateTime = instanceGroupTimeline.getCreationDateTime();
            jsonWriter.name("CreationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (instanceGroupTimeline.getReadyDateTime() != null) {
            java.util.Date readyDateTime = instanceGroupTimeline.getReadyDateTime();
            jsonWriter.name("ReadyDateTime");
            jsonWriter.value(readyDateTime);
        }
        if (instanceGroupTimeline.getEndDateTime() != null) {
            java.util.Date endDateTime = instanceGroupTimeline.getEndDateTime();
            jsonWriter.name("EndDateTime");
            jsonWriter.value(endDateTime);
        }
        jsonWriter.endObject();
    }

    private static InstanceGroupTimelineJsonMarshaller instance;

    public static InstanceGroupTimelineJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceGroupTimelineJsonMarshaller();
        return instance;
    }
}
