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

package com.amazonaws.services.chime.model.transform;

import com.amazonaws.services.chime.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetVoiceConnectorStreamingConfigurationResult
 */
public class GetVoiceConnectorStreamingConfigurationResultJsonUnmarshaller implements
        Unmarshaller<GetVoiceConnectorStreamingConfigurationResult, JsonUnmarshallerContext> {

    public GetVoiceConnectorStreamingConfigurationResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetVoiceConnectorStreamingConfigurationResult getVoiceConnectorStreamingConfigurationResult = new GetVoiceConnectorStreamingConfigurationResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("StreamingConfiguration")) {
                getVoiceConnectorStreamingConfigurationResult
                        .setStreamingConfiguration(StreamingConfigurationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getVoiceConnectorStreamingConfigurationResult;
    }

    private static GetVoiceConnectorStreamingConfigurationResultJsonUnmarshaller instance;

    public static GetVoiceConnectorStreamingConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetVoiceConnectorStreamingConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
