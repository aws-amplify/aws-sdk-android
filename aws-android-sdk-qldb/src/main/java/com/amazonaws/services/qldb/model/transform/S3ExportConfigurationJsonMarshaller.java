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

package com.amazonaws.services.qldb.model.transform;

import com.amazonaws.services.qldb.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO S3ExportConfiguration
 */
class S3ExportConfigurationJsonMarshaller {

    public void marshall(S3ExportConfiguration s3ExportConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (s3ExportConfiguration.getBucket() != null) {
            String bucket = s3ExportConfiguration.getBucket();
            jsonWriter.name("Bucket");
            jsonWriter.value(bucket);
        }
        if (s3ExportConfiguration.getPrefix() != null) {
            String prefix = s3ExportConfiguration.getPrefix();
            jsonWriter.name("Prefix");
            jsonWriter.value(prefix);
        }
        if (s3ExportConfiguration.getEncryptionConfiguration() != null) {
            S3EncryptionConfiguration encryptionConfiguration = s3ExportConfiguration
                    .getEncryptionConfiguration();
            jsonWriter.name("EncryptionConfiguration");
            S3EncryptionConfigurationJsonMarshaller.getInstance().marshall(encryptionConfiguration,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static S3ExportConfigurationJsonMarshaller instance;

    public static S3ExportConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3ExportConfigurationJsonMarshaller();
        return instance;
    }
}
