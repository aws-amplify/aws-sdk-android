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

package com.amazonaws.services.awselementalmediaconvert.model.transform;

import com.amazonaws.services.awselementalmediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO S3DestinationSettings
 */
class S3DestinationSettingsJsonUnmarshaller implements
        Unmarshaller<S3DestinationSettings, JsonUnmarshallerContext> {

    public S3DestinationSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        S3DestinationSettings s3DestinationSettings = new S3DestinationSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AccessControl")) {
                s3DestinationSettings.setAccessControl(S3DestinationAccessControlJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Encryption")) {
                s3DestinationSettings.setEncryption(S3EncryptionSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return s3DestinationSettings;
    }

    private static S3DestinationSettingsJsonUnmarshaller instance;

    public static S3DestinationSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3DestinationSettingsJsonUnmarshaller();
        return instance;
    }
}
