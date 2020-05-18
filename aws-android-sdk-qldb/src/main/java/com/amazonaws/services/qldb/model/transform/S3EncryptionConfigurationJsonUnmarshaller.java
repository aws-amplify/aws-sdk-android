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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO S3EncryptionConfiguration
 */
class S3EncryptionConfigurationJsonUnmarshaller implements
        Unmarshaller<S3EncryptionConfiguration, JsonUnmarshallerContext> {

    public S3EncryptionConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        S3EncryptionConfiguration s3EncryptionConfiguration = new S3EncryptionConfiguration();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ObjectEncryptionType")) {
                s3EncryptionConfiguration.setObjectEncryptionType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("KmsKeyArn")) {
                s3EncryptionConfiguration.setKmsKeyArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return s3EncryptionConfiguration;
    }

    private static S3EncryptionConfigurationJsonUnmarshaller instance;

    public static S3EncryptionConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3EncryptionConfigurationJsonUnmarshaller();
        return instance;
    }
}
