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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO S3DataSource
 */
class S3DataSourceJsonMarshaller {

    public void marshall(S3DataSource s3DataSource, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (s3DataSource.getS3DataType() != null) {
            String s3DataType = s3DataSource.getS3DataType();
            jsonWriter.name("S3DataType");
            jsonWriter.value(s3DataType);
        }
        if (s3DataSource.getS3Uri() != null) {
            String s3Uri = s3DataSource.getS3Uri();
            jsonWriter.name("S3Uri");
            jsonWriter.value(s3Uri);
        }
        if (s3DataSource.getS3DataDistributionType() != null) {
            String s3DataDistributionType = s3DataSource.getS3DataDistributionType();
            jsonWriter.name("S3DataDistributionType");
            jsonWriter.value(s3DataDistributionType);
        }
        if (s3DataSource.getAttributeNames() != null) {
            java.util.List<String> attributeNames = s3DataSource.getAttributeNames();
            jsonWriter.name("AttributeNames");
            jsonWriter.beginArray();
            for (String attributeNamesItem : attributeNames) {
                if (attributeNamesItem != null) {
                    jsonWriter.value(attributeNamesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static S3DataSourceJsonMarshaller instance;

    public static S3DataSourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3DataSourceJsonMarshaller();
        return instance;
    }
}
