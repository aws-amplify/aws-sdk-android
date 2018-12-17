/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for POJO PublicEndpoint
 */
class PublicEndpointJsonUnmarshaller implements
        Unmarshaller<PublicEndpoint, JsonUnmarshallerContext> {

    public PublicEndpoint unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PublicEndpoint publicEndpoint = new PublicEndpoint();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Address")) {
                publicEndpoint.setAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Attributes")) {
                publicEndpoint.setAttributes(new MapUnmarshaller<java.util.List<String>>(
                        new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                        )
                                .unmarshall(context));
            } else if (name.equals("ChannelType")) {
                publicEndpoint.setChannelType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Demographic")) {
                publicEndpoint.setDemographic(EndpointDemographicJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EffectiveDate")) {
                publicEndpoint.setEffectiveDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndpointStatus")) {
                publicEndpoint.setEndpointStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Location")) {
                publicEndpoint.setLocation(EndpointLocationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Metrics")) {
                publicEndpoint.setMetrics(new MapUnmarshaller<Double>(DoubleJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("OptOut")) {
                publicEndpoint.setOptOut(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequestId")) {
                publicEndpoint.setRequestId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("User")) {
                publicEndpoint.setUser(EndpointUserJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return publicEndpoint;
    }

    private static PublicEndpointJsonUnmarshaller instance;

    public static PublicEndpointJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PublicEndpointJsonUnmarshaller();
        return instance;
    }
}
