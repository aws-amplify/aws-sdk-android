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
 * JSON unmarshaller for POJO EdgeConfig
 */
class EdgeConfigJsonUnmarshaller implements Unmarshaller<EdgeConfig, JsonUnmarshallerContext> {

    public EdgeConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EdgeConfig edgeConfig = new EdgeConfig();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("HubDeviceArn")) {
                edgeConfig.setHubDeviceArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RecorderConfig")) {
                edgeConfig.setRecorderConfig(RecorderConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UploaderConfig")) {
                edgeConfig.setUploaderConfig(UploaderConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeletionConfig")) {
                edgeConfig.setDeletionConfig(DeletionConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return edgeConfig;
    }

    private static EdgeConfigJsonUnmarshaller instance;

    public static EdgeConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EdgeConfigJsonUnmarshaller();
        return instance;
    }
}
