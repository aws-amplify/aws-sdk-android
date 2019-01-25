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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO S3Location
 */
class S3LocationJsonMarshaller {

    public void marshall(S3Location s3Location, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (s3Location.getBucket() != null) {
            String bucket = s3Location.getBucket();
            jsonWriter.name("bucket");
            jsonWriter.value(bucket);
        }
        if (s3Location.getKey() != null) {
            String key = s3Location.getKey();
            jsonWriter.name("key");
            jsonWriter.value(key);
        }
        if (s3Location.getVersion() != null) {
            String version = s3Location.getVersion();
            jsonWriter.name("version");
            jsonWriter.value(version);
        }
        jsonWriter.endObject();
    }

    private static S3LocationJsonMarshaller instance;

    public static S3LocationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3LocationJsonMarshaller();
        return instance;
    }
}
