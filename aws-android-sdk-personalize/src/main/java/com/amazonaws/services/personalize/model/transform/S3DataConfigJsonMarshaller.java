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

package com.amazonaws.services.personalize.model.transform;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO S3DataConfig
 */
class S3DataConfigJsonMarshaller {

    public void marshall(S3DataConfig s3DataConfig, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (s3DataConfig.getPath() != null) {
            String path = s3DataConfig.getPath();
            jsonWriter.name("path");
            jsonWriter.value(path);
        }
        if (s3DataConfig.getKmsKeyArn() != null) {
            String kmsKeyArn = s3DataConfig.getKmsKeyArn();
            jsonWriter.name("kmsKeyArn");
            jsonWriter.value(kmsKeyArn);
        }
        jsonWriter.endObject();
    }

    private static S3DataConfigJsonMarshaller instance;

    public static S3DataConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3DataConfigJsonMarshaller();
        return instance;
    }
}
