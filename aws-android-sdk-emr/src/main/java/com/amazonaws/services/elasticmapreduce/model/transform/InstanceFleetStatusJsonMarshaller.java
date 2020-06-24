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
 * JSON marshaller for POJO InstanceFleetStatus
 */
class InstanceFleetStatusJsonMarshaller {

    public void marshall(InstanceFleetStatus instanceFleetStatus, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instanceFleetStatus.getState() != null) {
            String state = instanceFleetStatus.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (instanceFleetStatus.getStateChangeReason() != null) {
            InstanceFleetStateChangeReason stateChangeReason = instanceFleetStatus
                    .getStateChangeReason();
            jsonWriter.name("StateChangeReason");
            InstanceFleetStateChangeReasonJsonMarshaller.getInstance().marshall(stateChangeReason,
                    jsonWriter);
        }
        if (instanceFleetStatus.getTimeline() != null) {
            InstanceFleetTimeline timeline = instanceFleetStatus.getTimeline();
            jsonWriter.name("Timeline");
            InstanceFleetTimelineJsonMarshaller.getInstance().marshall(timeline, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static InstanceFleetStatusJsonMarshaller instance;

    public static InstanceFleetStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceFleetStatusJsonMarshaller();
        return instance;
    }
}
