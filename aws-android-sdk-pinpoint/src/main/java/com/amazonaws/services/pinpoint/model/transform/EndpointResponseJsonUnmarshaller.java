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
 * JSON unmarshaller for POJO EndpointResponse
 */
class EndpointResponseJsonUnmarshaller implements
        Unmarshaller<EndpointResponse, JsonUnmarshallerContext> {

    public EndpointResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EndpointResponse endpointResponse = new EndpointResponse();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Address")) {
                endpointResponse.setAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ApplicationId")) {
                endpointResponse.setApplicationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Attributes")) {
                endpointResponse.setAttributes(new MapUnmarshaller<java.util.List<String>>(
                        new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                        )
                                .unmarshall(context));
            } else if (name.equals("ChannelType")) {
                endpointResponse.setChannelType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CohortId")) {
                endpointResponse.setCohortId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDate")) {
                endpointResponse.setCreationDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Demographic")) {
                endpointResponse.setDemographic(EndpointDemographicJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EffectiveDate")) {
                endpointResponse.setEffectiveDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndpointStatus")) {
                endpointResponse.setEndpointStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                endpointResponse.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Location")) {
                endpointResponse.setLocation(EndpointLocationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Metrics")) {
                endpointResponse.setMetrics(new MapUnmarshaller<Double>(DoubleJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("OptOut")) {
                endpointResponse.setOptOut(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequestId")) {
                endpointResponse.setRequestId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("User")) {
                endpointResponse.setUser(EndpointUserJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return endpointResponse;
    }

    private static EndpointResponseJsonUnmarshaller instance;

    public static EndpointResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EndpointResponseJsonUnmarshaller();
        return instance;
    }
}
