/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iotdata.model.transform;

import com.amazonaws.services.iotdata.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetRetainedMessageResult
 */
public class GetRetainedMessageResultJsonUnmarshaller implements
        Unmarshaller<GetRetainedMessageResult, JsonUnmarshallerContext> {

    public GetRetainedMessageResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetRetainedMessageResult getRetainedMessageResult = new GetRetainedMessageResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("topic")) {
                getRetainedMessageResult.setTopic(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("payload")) {
                getRetainedMessageResult.setPayload(ByteBufferJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("qos")) {
                getRetainedMessageResult.setQos(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastModifiedTime")) {
                getRetainedMessageResult.setLastModifiedTime(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getRetainedMessageResult;
    }

    private static GetRetainedMessageResultJsonUnmarshaller instance;

    public static GetRetainedMessageResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetRetainedMessageResultJsonUnmarshaller();
        return instance;
    }
}
