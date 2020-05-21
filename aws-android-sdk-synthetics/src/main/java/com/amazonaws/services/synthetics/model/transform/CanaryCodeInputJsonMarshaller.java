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

package com.amazonaws.services.synthetics.model.transform;

import com.amazonaws.services.synthetics.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CanaryCodeInput
 */
class CanaryCodeInputJsonMarshaller {

    public void marshall(CanaryCodeInput canaryCodeInput, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (canaryCodeInput.getS3Bucket() != null) {
            String s3Bucket = canaryCodeInput.getS3Bucket();
            jsonWriter.name("S3Bucket");
            jsonWriter.value(s3Bucket);
        }
        if (canaryCodeInput.getS3Key() != null) {
            String s3Key = canaryCodeInput.getS3Key();
            jsonWriter.name("S3Key");
            jsonWriter.value(s3Key);
        }
        if (canaryCodeInput.getS3Version() != null) {
            String s3Version = canaryCodeInput.getS3Version();
            jsonWriter.name("S3Version");
            jsonWriter.value(s3Version);
        }
        if (canaryCodeInput.getZipFile() != null) {
            java.nio.ByteBuffer zipFile = canaryCodeInput.getZipFile();
            jsonWriter.name("ZipFile");
            jsonWriter.value(zipFile);
        }
        if (canaryCodeInput.getHandler() != null) {
            String handler = canaryCodeInput.getHandler();
            jsonWriter.name("Handler");
            jsonWriter.value(handler);
        }
        jsonWriter.endObject();
    }

    private static CanaryCodeInputJsonMarshaller instance;

    public static CanaryCodeInputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CanaryCodeInputJsonMarshaller();
        return instance;
    }
}
