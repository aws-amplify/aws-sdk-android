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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SharingSettings
 */
class SharingSettingsJsonMarshaller {

    public void marshall(SharingSettings sharingSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (sharingSettings.getNotebookOutputOption() != null) {
            String notebookOutputOption = sharingSettings.getNotebookOutputOption();
            jsonWriter.name("NotebookOutputOption");
            jsonWriter.value(notebookOutputOption);
        }
        if (sharingSettings.getS3OutputPath() != null) {
            String s3OutputPath = sharingSettings.getS3OutputPath();
            jsonWriter.name("S3OutputPath");
            jsonWriter.value(s3OutputPath);
        }
        if (sharingSettings.getS3KmsKeyId() != null) {
            String s3KmsKeyId = sharingSettings.getS3KmsKeyId();
            jsonWriter.name("S3KmsKeyId");
            jsonWriter.value(s3KmsKeyId);
        }
        jsonWriter.endObject();
    }

    private static SharingSettingsJsonMarshaller instance;

    public static SharingSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SharingSettingsJsonMarshaller();
        return instance;
    }
}
