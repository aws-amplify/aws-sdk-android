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

package com.amazonaws.services.kendra.model.transform;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO S3DataSourceConfiguration
 */
class S3DataSourceConfigurationJsonUnmarshaller implements
        Unmarshaller<S3DataSourceConfiguration, JsonUnmarshallerContext> {

    public S3DataSourceConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        S3DataSourceConfiguration s3DataSourceConfiguration = new S3DataSourceConfiguration();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("BucketName")) {
                s3DataSourceConfiguration.setBucketName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InclusionPrefixes")) {
                s3DataSourceConfiguration.setInclusionPrefixes(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ExclusionPatterns")) {
                s3DataSourceConfiguration.setExclusionPatterns(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DocumentsMetadataConfiguration")) {
                s3DataSourceConfiguration
                        .setDocumentsMetadataConfiguration(DocumentsMetadataConfigurationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("AccessControlListConfiguration")) {
                s3DataSourceConfiguration
                        .setAccessControlListConfiguration(AccessControlListConfigurationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return s3DataSourceConfiguration;
    }

    private static S3DataSourceConfigurationJsonUnmarshaller instance;

    public static S3DataSourceConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3DataSourceConfigurationJsonUnmarshaller();
        return instance;
    }
}
