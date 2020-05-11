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

package com.amazonaws.services.kendra.model.transform;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO S3Path
 */
class S3PathJsonMarshaller {

    public void marshall(S3Path s3Path, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (s3Path.getBucket() != null) {
            String bucket = s3Path.getBucket();
            jsonWriter.name("Bucket");
            jsonWriter.value(bucket);
        }
        if (s3Path.getKey() != null) {
            String key = s3Path.getKey();
            jsonWriter.name("Key");
            jsonWriter.value(key);
        }
        jsonWriter.endObject();
    }

    private static S3PathJsonMarshaller instance;

    public static S3PathJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3PathJsonMarshaller();
        return instance;
    }
}
