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
 * JSON unmarshaller for POJO S3ExportConfiguration
 */
class S3ExportConfigurationJsonUnmarshaller implements
        Unmarshaller<S3ExportConfiguration, JsonUnmarshallerContext> {

    public S3ExportConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        S3ExportConfiguration s3ExportConfiguration = new S3ExportConfiguration();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Bucket")) {
                s3ExportConfiguration.setBucket(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Prefix")) {
                s3ExportConfiguration.setPrefix(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EncryptionConfiguration")) {
                s3ExportConfiguration
                        .setEncryptionConfiguration(S3EncryptionConfigurationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return s3ExportConfiguration;
    }

    private static S3ExportConfigurationJsonUnmarshaller instance;

    public static S3ExportConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3ExportConfigurationJsonUnmarshaller();
        return instance;
    }
}
