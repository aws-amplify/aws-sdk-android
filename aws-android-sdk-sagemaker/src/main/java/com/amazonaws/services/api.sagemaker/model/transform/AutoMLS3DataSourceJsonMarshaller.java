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
 * JSON marshaller for POJO AutoMLS3DataSource
 */
class AutoMLS3DataSourceJsonMarshaller {

    public void marshall(AutoMLS3DataSource autoMLS3DataSource, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (autoMLS3DataSource.getS3DataType() != null) {
            String s3DataType = autoMLS3DataSource.getS3DataType();
            jsonWriter.name("S3DataType");
            jsonWriter.value(s3DataType);
        }
        if (autoMLS3DataSource.getS3Uri() != null) {
            String s3Uri = autoMLS3DataSource.getS3Uri();
            jsonWriter.name("S3Uri");
            jsonWriter.value(s3Uri);
        }
        jsonWriter.endObject();
    }

    private static AutoMLS3DataSourceJsonMarshaller instance;

    public static AutoMLS3DataSourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AutoMLS3DataSourceJsonMarshaller();
        return instance;
    }
}
