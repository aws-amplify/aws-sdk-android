/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.machinelearning.model.transform;

import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RealtimeEndpointInfo
 */
class RealtimeEndpointInfoJsonMarshaller {

    public void marshall(RealtimeEndpointInfo realtimeEndpointInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (realtimeEndpointInfo.getPeakRequestsPerSecond() != null) {
            Integer peakRequestsPerSecond = realtimeEndpointInfo.getPeakRequestsPerSecond();
            jsonWriter.name("PeakRequestsPerSecond");
            jsonWriter.value(peakRequestsPerSecond);
        }
        if (realtimeEndpointInfo.getCreatedAt() != null) {
            java.util.Date createdAt = realtimeEndpointInfo.getCreatedAt();
            jsonWriter.name("CreatedAt");
            jsonWriter.value(createdAt);
        }
        if (realtimeEndpointInfo.getEndpointUrl() != null) {
            String endpointUrl = realtimeEndpointInfo.getEndpointUrl();
            jsonWriter.name("EndpointUrl");
            jsonWriter.value(endpointUrl);
        }
        if (realtimeEndpointInfo.getEndpointStatus() != null) {
            String endpointStatus = realtimeEndpointInfo.getEndpointStatus();
            jsonWriter.name("EndpointStatus");
            jsonWriter.value(endpointStatus);
        }
        jsonWriter.endObject();
    }

    private static RealtimeEndpointInfoJsonMarshaller instance;

    public static RealtimeEndpointInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RealtimeEndpointInfoJsonMarshaller();
        return instance;
    }
}
