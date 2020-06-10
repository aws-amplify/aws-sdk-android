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
package com.amazonaws.services.compute-optimizer.model.transform;

import com.amazonaws.services.compute-optimizer.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO S3DestinationConfig
 */
class S3DestinationConfigJsonMarshaller {

    public void marshall(S3DestinationConfig s3DestinationConfig, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (s3DestinationConfig.getBucket() != null) {
            String bucket = s3DestinationConfig.getBucket();
            jsonWriter.name("bucket");
            jsonWriter.value(bucket);
        }
        if (s3DestinationConfig.getKeyPrefix() != null) {
            String keyPrefix = s3DestinationConfig.getKeyPrefix();
            jsonWriter.name("keyPrefix");
            jsonWriter.value(keyPrefix);
        }
        jsonWriter.endObject();
    }

    private static S3DestinationConfigJsonMarshaller instance;
    public static S3DestinationConfigJsonMarshaller getInstance() {
        if (instance == null) instance = new S3DestinationConfigJsonMarshaller();
        return instance;
    }
}
