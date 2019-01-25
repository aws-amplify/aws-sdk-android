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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO EndpointRequest
 */
class EndpointRequestJsonUnmarshaller implements
        Unmarshaller<EndpointRequest, JsonUnmarshallerContext> {

    public EndpointRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EndpointRequest endpointRequest = new EndpointRequest();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Address")) {
                endpointRequest.setAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Attributes")) {
                endpointRequest.setAttributes(new MapUnmarshaller<java.util.List<String>>(
                        new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                        )
                                .unmarshall(context));
            } else if (name.equals("ChannelType")) {
                endpointRequest.setChannelType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Demographic")) {
                endpointRequest.setDemographic(EndpointDemographicJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EffectiveDate")) {
                endpointRequest.setEffectiveDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndpointStatus")) {
                endpointRequest.setEndpointStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Location")) {
                endpointRequest.setLocation(EndpointLocationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Metrics")) {
                endpointRequest.setMetrics(new MapUnmarshaller<Double>(DoubleJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("OptOut")) {
                endpointRequest.setOptOut(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequestId")) {
                endpointRequest.setRequestId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("User")) {
                endpointRequest.setUser(EndpointUserJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return endpointRequest;
    }

    private static EndpointRequestJsonUnmarshaller instance;

    public static EndpointRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EndpointRequestJsonUnmarshaller();
        return instance;
    }
}
