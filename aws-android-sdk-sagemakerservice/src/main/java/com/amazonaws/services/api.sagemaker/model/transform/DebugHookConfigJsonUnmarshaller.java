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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DebugHookConfig
 */
class DebugHookConfigJsonUnmarshaller implements
        Unmarshaller<DebugHookConfig, JsonUnmarshallerContext> {

    public DebugHookConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DebugHookConfig debugHookConfig = new DebugHookConfig();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("LocalPath")) {
                debugHookConfig.setLocalPath(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("S3OutputPath")) {
                debugHookConfig.setS3OutputPath(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HookParameters")) {
                debugHookConfig.setHookParameters(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("CollectionConfigurations")) {
                debugHookConfig
                        .setCollectionConfigurations(new ListUnmarshaller<CollectionConfiguration>(
                                CollectionConfigurationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return debugHookConfig;
    }

    private static DebugHookConfigJsonUnmarshaller instance;

    public static DebugHookConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DebugHookConfigJsonUnmarshaller();
        return instance;
    }
}
