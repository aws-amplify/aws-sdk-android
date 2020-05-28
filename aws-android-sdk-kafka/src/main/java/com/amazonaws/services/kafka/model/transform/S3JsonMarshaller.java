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

package com.amazonaws.services.kafka.model.transform;

import com.amazonaws.services.kafka.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO S3
 */
class S3JsonMarshaller {

    public void marshall(S3 s3, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (s3.getBucket() != null) {
            String bucket = s3.getBucket();
            jsonWriter.name("Bucket");
            jsonWriter.value(bucket);
        }
        if (s3.getEnabled() != null) {
            Boolean enabled = s3.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        if (s3.getPrefix() != null) {
            String prefix = s3.getPrefix();
            jsonWriter.name("Prefix");
            jsonWriter.value(prefix);
        }
        jsonWriter.endObject();
    }

    private static S3JsonMarshaller instance;

    public static S3JsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3JsonMarshaller();
        return instance;
    }
}
