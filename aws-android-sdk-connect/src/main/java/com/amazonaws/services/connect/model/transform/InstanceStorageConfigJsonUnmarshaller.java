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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO InstanceStorageConfig
 */
class InstanceStorageConfigJsonUnmarshaller implements
        Unmarshaller<InstanceStorageConfig, JsonUnmarshallerContext> {

    public InstanceStorageConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InstanceStorageConfig instanceStorageConfig = new InstanceStorageConfig();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AssociationId")) {
                instanceStorageConfig.setAssociationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StorageType")) {
                instanceStorageConfig.setStorageType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("S3Config")) {
                instanceStorageConfig.setS3Config(S3ConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KinesisVideoStreamConfig")) {
                instanceStorageConfig
                        .setKinesisVideoStreamConfig(KinesisVideoStreamConfigJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("KinesisStreamConfig")) {
                instanceStorageConfig.setKinesisStreamConfig(KinesisStreamConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("KinesisFirehoseConfig")) {
                instanceStorageConfig
                        .setKinesisFirehoseConfig(KinesisFirehoseConfigJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return instanceStorageConfig;
    }

    private static InstanceStorageConfigJsonUnmarshaller instance;

    public static InstanceStorageConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceStorageConfigJsonUnmarshaller();
        return instance;
    }
}
