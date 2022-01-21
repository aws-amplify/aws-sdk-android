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
 * JSON marshaller for POJO InstanceStorageConfig
 */
class InstanceStorageConfigJsonMarshaller {

    public void marshall(InstanceStorageConfig instanceStorageConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instanceStorageConfig.getAssociationId() != null) {
            String associationId = instanceStorageConfig.getAssociationId();
            jsonWriter.name("AssociationId");
            jsonWriter.value(associationId);
        }
        if (instanceStorageConfig.getStorageType() != null) {
            String storageType = instanceStorageConfig.getStorageType();
            jsonWriter.name("StorageType");
            jsonWriter.value(storageType);
        }
        if (instanceStorageConfig.getS3Config() != null) {
            S3Config s3Config = instanceStorageConfig.getS3Config();
            jsonWriter.name("S3Config");
            S3ConfigJsonMarshaller.getInstance().marshall(s3Config, jsonWriter);
        }
        if (instanceStorageConfig.getKinesisVideoStreamConfig() != null) {
            KinesisVideoStreamConfig kinesisVideoStreamConfig = instanceStorageConfig
                    .getKinesisVideoStreamConfig();
            jsonWriter.name("KinesisVideoStreamConfig");
            KinesisVideoStreamConfigJsonMarshaller.getInstance().marshall(kinesisVideoStreamConfig,
                    jsonWriter);
        }
        if (instanceStorageConfig.getKinesisStreamConfig() != null) {
            KinesisStreamConfig kinesisStreamConfig = instanceStorageConfig
                    .getKinesisStreamConfig();
            jsonWriter.name("KinesisStreamConfig");
            KinesisStreamConfigJsonMarshaller.getInstance().marshall(kinesisStreamConfig,
                    jsonWriter);
        }
        if (instanceStorageConfig.getKinesisFirehoseConfig() != null) {
            KinesisFirehoseConfig kinesisFirehoseConfig = instanceStorageConfig
                    .getKinesisFirehoseConfig();
            jsonWriter.name("KinesisFirehoseConfig");
            KinesisFirehoseConfigJsonMarshaller.getInstance().marshall(kinesisFirehoseConfig,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static InstanceStorageConfigJsonMarshaller instance;

    public static InstanceStorageConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceStorageConfigJsonMarshaller();
        return instance;
    }
}
