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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO RealtimeEndpointInfo
 */
class RealtimeEndpointInfoJsonUnmarshaller implements
        Unmarshaller<RealtimeEndpointInfo, JsonUnmarshallerContext> {

    public RealtimeEndpointInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RealtimeEndpointInfo realtimeEndpointInfo = new RealtimeEndpointInfo();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("PeakRequestsPerSecond")) {
                realtimeEndpointInfo.setPeakRequestsPerSecond(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedAt")) {
                realtimeEndpointInfo.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndpointUrl")) {
                realtimeEndpointInfo.setEndpointUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndpointStatus")) {
                realtimeEndpointInfo.setEndpointStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realtimeEndpointInfo;
    }

    private static RealtimeEndpointInfoJsonUnmarshaller instance;

    public static RealtimeEndpointInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RealtimeEndpointInfoJsonUnmarshaller();
        return instance;
    }
}
