/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideo.model.transform;

import com.amazonaws.services.kinesisvideo.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response StartEdgeConfigurationUpdateResult
 */
public class StartEdgeConfigurationUpdateResultJsonUnmarshaller implements
        Unmarshaller<StartEdgeConfigurationUpdateResult, JsonUnmarshallerContext> {

    public StartEdgeConfigurationUpdateResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        StartEdgeConfigurationUpdateResult startEdgeConfigurationUpdateResult = new StartEdgeConfigurationUpdateResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("StreamName")) {
                startEdgeConfigurationUpdateResult.setStreamName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("StreamARN")) {
                startEdgeConfigurationUpdateResult.setStreamARN(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                startEdgeConfigurationUpdateResult.setCreationTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdatedTime")) {
                startEdgeConfigurationUpdateResult.setLastUpdatedTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SyncStatus")) {
                startEdgeConfigurationUpdateResult.setSyncStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailedStatusDetails")) {
                startEdgeConfigurationUpdateResult.setFailedStatusDetails(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EdgeConfig")) {
                startEdgeConfigurationUpdateResult.setEdgeConfig(EdgeConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return startEdgeConfigurationUpdateResult;
    }

    private static StartEdgeConfigurationUpdateResultJsonUnmarshaller instance;

    public static StartEdgeConfigurationUpdateResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartEdgeConfigurationUpdateResultJsonUnmarshaller();
        return instance;
    }
}
