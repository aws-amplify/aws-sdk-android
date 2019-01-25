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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO S3Object
 */
class S3ObjectJsonMarshaller {

    public void marshall(S3Object s3Object, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (s3Object.getBucket() != null) {
            String bucket = s3Object.getBucket();
            jsonWriter.name("Bucket");
            jsonWriter.value(bucket);
        }
        if (s3Object.getName() != null) {
            String name = s3Object.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (s3Object.getVersion() != null) {
            String version = s3Object.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        jsonWriter.endObject();
    }

    private static S3ObjectJsonMarshaller instance;

    public static S3ObjectJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3ObjectJsonMarshaller();
        return instance;
    }
}
