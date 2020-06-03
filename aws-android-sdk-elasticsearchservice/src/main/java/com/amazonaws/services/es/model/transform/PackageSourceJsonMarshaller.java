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

package com.amazonaws.services.es.model.transform;

import com.amazonaws.services.es.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PackageSource
 */
class PackageSourceJsonMarshaller {

    public void marshall(PackageSource packageSource, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (packageSource.getS3BucketName() != null) {
            String s3BucketName = packageSource.getS3BucketName();
            jsonWriter.name("S3BucketName");
            jsonWriter.value(s3BucketName);
        }
        if (packageSource.getS3Key() != null) {
            String s3Key = packageSource.getS3Key();
            jsonWriter.name("S3Key");
            jsonWriter.value(s3Key);
        }
        jsonWriter.endObject();
    }

    private static PackageSourceJsonMarshaller instance;

    public static PackageSourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PackageSourceJsonMarshaller();
        return instance;
    }
}
