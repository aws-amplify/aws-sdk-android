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

package com.amazonaws.services.mediaconvert.model.transform;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO S3DestinationSettings
 */
class S3DestinationSettingsJsonMarshaller {

    public void marshall(S3DestinationSettings s3DestinationSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (s3DestinationSettings.getAccessControl() != null) {
            S3DestinationAccessControl accessControl = s3DestinationSettings.getAccessControl();
            jsonWriter.name("AccessControl");
            S3DestinationAccessControlJsonMarshaller.getInstance().marshall(accessControl,
                    jsonWriter);
        }
        if (s3DestinationSettings.getEncryption() != null) {
            S3EncryptionSettings encryption = s3DestinationSettings.getEncryption();
            jsonWriter.name("Encryption");
            S3EncryptionSettingsJsonMarshaller.getInstance().marshall(encryption, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static S3DestinationSettingsJsonMarshaller instance;

    public static S3DestinationSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3DestinationSettingsJsonMarshaller();
        return instance;
    }
}
