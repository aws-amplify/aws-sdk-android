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
 * JSON unmarshaller for POJO EndpointsResponse
 */
class EndpointsResponseJsonUnmarshaller implements
        Unmarshaller<EndpointsResponse, JsonUnmarshallerContext> {

    public EndpointsResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EndpointsResponse endpointsResponse = new EndpointsResponse();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Item")) {
                endpointsResponse.setItem(new ListUnmarshaller<EndpointResponse>(
                        EndpointResponseJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return endpointsResponse;
    }

    private static EndpointsResponseJsonUnmarshaller instance;

    public static EndpointsResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EndpointsResponseJsonUnmarshaller();
        return instance;
    }
}
