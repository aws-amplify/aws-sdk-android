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

package com.amazonaws.services.appmesh.model.transform;

import com.amazonaws.services.appmesh.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO GrpcTimeout
 */
class GrpcTimeoutJsonUnmarshaller implements Unmarshaller<GrpcTimeout, JsonUnmarshallerContext> {

    public GrpcTimeout unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        GrpcTimeout grpcTimeout = new GrpcTimeout();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("idle")) {
                grpcTimeout.setIdle(DurationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("perRequest")) {
                grpcTimeout.setPerRequest(DurationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return grpcTimeout;
    }

    private static GrpcTimeoutJsonUnmarshaller instance;

    public static GrpcTimeoutJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GrpcTimeoutJsonUnmarshaller();
        return instance;
    }
}
