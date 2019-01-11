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
 * JSON unmarshaller for POJO EndpointLocation
 */
class EndpointLocationJsonUnmarshaller implements
        Unmarshaller<EndpointLocation, JsonUnmarshallerContext> {

    public EndpointLocation unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EndpointLocation endpointLocation = new EndpointLocation();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("City")) {
                endpointLocation.setCity(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Country")) {
                endpointLocation.setCountry(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Latitude")) {
                endpointLocation.setLatitude(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Longitude")) {
                endpointLocation.setLongitude(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PostalCode")) {
                endpointLocation.setPostalCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Region")) {
                endpointLocation.setRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return endpointLocation;
    }

    private static EndpointLocationJsonUnmarshaller instance;

    public static EndpointLocationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EndpointLocationJsonUnmarshaller();
        return instance;
    }
}
