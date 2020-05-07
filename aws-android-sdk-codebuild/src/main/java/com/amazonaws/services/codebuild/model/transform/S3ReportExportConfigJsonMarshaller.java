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
 * JSON marshaller for POJO S3ReportExportConfig
 */
class S3ReportExportConfigJsonMarshaller {

    public void marshall(S3ReportExportConfig s3ReportExportConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (s3ReportExportConfig.getBucket() != null) {
            String bucket = s3ReportExportConfig.getBucket();
            jsonWriter.name("bucket");
            jsonWriter.value(bucket);
        }
        if (s3ReportExportConfig.getPath() != null) {
            String path = s3ReportExportConfig.getPath();
            jsonWriter.name("path");
            jsonWriter.value(path);
        }
        if (s3ReportExportConfig.getPackaging() != null) {
            String packaging = s3ReportExportConfig.getPackaging();
            jsonWriter.name("packaging");
            jsonWriter.value(packaging);
        }
        if (s3ReportExportConfig.getEncryptionKey() != null) {
            String encryptionKey = s3ReportExportConfig.getEncryptionKey();
            jsonWriter.name("encryptionKey");
            jsonWriter.value(encryptionKey);
        }
        if (s3ReportExportConfig.getEncryptionDisabled() != null) {
            Boolean encryptionDisabled = s3ReportExportConfig.getEncryptionDisabled();
            jsonWriter.name("encryptionDisabled");
            jsonWriter.value(encryptionDisabled);
        }
        jsonWriter.endObject();
    }

    private static S3ReportExportConfigJsonMarshaller instance;

    public static S3ReportExportConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3ReportExportConfigJsonMarshaller();
        return instance;
    }
}
