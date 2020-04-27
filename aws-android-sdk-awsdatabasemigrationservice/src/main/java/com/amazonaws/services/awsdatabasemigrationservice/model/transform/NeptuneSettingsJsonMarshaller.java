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

package com.amazonaws.services.awsdatabasemigrationservice.model.transform;

import com.amazonaws.services.awsdatabasemigrationservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NeptuneSettings
 */
class NeptuneSettingsJsonMarshaller {

    public void marshall(NeptuneSettings neptuneSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (neptuneSettings.getServiceAccessRoleArn() != null) {
            String serviceAccessRoleArn = neptuneSettings.getServiceAccessRoleArn();
            jsonWriter.name("ServiceAccessRoleArn");
            jsonWriter.value(serviceAccessRoleArn);
        }
        if (neptuneSettings.getS3BucketName() != null) {
            String s3BucketName = neptuneSettings.getS3BucketName();
            jsonWriter.name("S3BucketName");
            jsonWriter.value(s3BucketName);
        }
        if (neptuneSettings.getS3BucketFolder() != null) {
            String s3BucketFolder = neptuneSettings.getS3BucketFolder();
            jsonWriter.name("S3BucketFolder");
            jsonWriter.value(s3BucketFolder);
        }
        if (neptuneSettings.getErrorRetryDuration() != null) {
            Integer errorRetryDuration = neptuneSettings.getErrorRetryDuration();
            jsonWriter.name("ErrorRetryDuration");
            jsonWriter.value(errorRetryDuration);
        }
        if (neptuneSettings.getMaxFileSize() != null) {
            Integer maxFileSize = neptuneSettings.getMaxFileSize();
            jsonWriter.name("MaxFileSize");
            jsonWriter.value(maxFileSize);
        }
        if (neptuneSettings.getMaxRetryCount() != null) {
            Integer maxRetryCount = neptuneSettings.getMaxRetryCount();
            jsonWriter.name("MaxRetryCount");
            jsonWriter.value(maxRetryCount);
        }
        if (neptuneSettings.getIamAuthEnabled() != null) {
            Boolean iamAuthEnabled = neptuneSettings.getIamAuthEnabled();
            jsonWriter.name("IamAuthEnabled");
            jsonWriter.value(iamAuthEnabled);
        }
        jsonWriter.endObject();
    }

    private static NeptuneSettingsJsonMarshaller instance;

    public static NeptuneSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NeptuneSettingsJsonMarshaller();
        return instance;
    }
}
