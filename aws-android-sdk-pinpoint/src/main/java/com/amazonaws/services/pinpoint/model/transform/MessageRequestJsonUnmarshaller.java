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
 * JSON unmarshaller for POJO MessageRequest
 */
class MessageRequestJsonUnmarshaller implements
        Unmarshaller<MessageRequest, JsonUnmarshallerContext> {

    public MessageRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MessageRequest messageRequest = new MessageRequest();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Addresses")) {
                messageRequest.setAddresses(new MapUnmarshaller<AddressConfiguration>(
                        AddressConfigurationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Context")) {
                messageRequest.setContext(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Endpoints")) {
                messageRequest.setEndpoints(new MapUnmarshaller<EndpointSendConfiguration>(
                        EndpointSendConfigurationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("MessageConfiguration")) {
                messageRequest.setMessageConfiguration(DirectMessageConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TraceId")) {
                messageRequest.setTraceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return messageRequest;
    }

    private static MessageRequestJsonUnmarshaller instance;

    public static MessageRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MessageRequestJsonUnmarshaller();
        return instance;
    }
}
