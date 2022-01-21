/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ChatStreamingConfiguration
 */
class ChatStreamingConfigurationJsonMarshaller {

    public void marshall(ChatStreamingConfiguration chatStreamingConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (chatStreamingConfiguration.getStreamingEndpointArn() != null) {
            String streamingEndpointArn = chatStreamingConfiguration.getStreamingEndpointArn();
            jsonWriter.name("StreamingEndpointArn");
            jsonWriter.value(streamingEndpointArn);
        }
        jsonWriter.endObject();
    }

    private static ChatStreamingConfigurationJsonMarshaller instance;

    public static ChatStreamingConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ChatStreamingConfigurationJsonMarshaller();
        return instance;
    }
}
