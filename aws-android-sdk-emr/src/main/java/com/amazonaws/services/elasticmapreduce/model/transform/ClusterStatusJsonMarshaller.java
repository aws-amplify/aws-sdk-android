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
 * JSON marshaller for POJO ClusterStatus
 */
class ClusterStatusJsonMarshaller {

    public void marshall(ClusterStatus clusterStatus, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (clusterStatus.getState() != null) {
            String state = clusterStatus.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (clusterStatus.getStateChangeReason() != null) {
            ClusterStateChangeReason stateChangeReason = clusterStatus.getStateChangeReason();
            jsonWriter.name("StateChangeReason");
            ClusterStateChangeReasonJsonMarshaller.getInstance().marshall(stateChangeReason,
                    jsonWriter);
        }
        if (clusterStatus.getTimeline() != null) {
            ClusterTimeline timeline = clusterStatus.getTimeline();
            jsonWriter.name("Timeline");
            ClusterTimelineJsonMarshaller.getInstance().marshall(timeline, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ClusterStatusJsonMarshaller instance;

    public static ClusterStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClusterStatusJsonMarshaller();
        return instance;
    }
}
