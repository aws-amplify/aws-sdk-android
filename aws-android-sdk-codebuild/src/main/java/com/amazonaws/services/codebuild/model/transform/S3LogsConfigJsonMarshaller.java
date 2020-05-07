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

package com.amazonaws.services.codebuild.model.transform;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO S3LogsConfig
 */
class S3LogsConfigJsonMarshaller {

    public void marshall(S3LogsConfig s3LogsConfig, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (s3LogsConfig.getStatus() != null) {
            String status = s3LogsConfig.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (s3LogsConfig.getLocation() != null) {
            String location = s3LogsConfig.getLocation();
            jsonWriter.name("location");
            jsonWriter.value(location);
        }
        if (s3LogsConfig.getEncryptionDisabled() != null) {
            Boolean encryptionDisabled = s3LogsConfig.getEncryptionDisabled();
            jsonWriter.name("encryptionDisabled");
            jsonWriter.value(encryptionDisabled);
        }
        jsonWriter.endObject();
    }

    private static S3LogsConfigJsonMarshaller instance;

    public static S3LogsConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3LogsConfigJsonMarshaller();
        return instance;
    }
}
