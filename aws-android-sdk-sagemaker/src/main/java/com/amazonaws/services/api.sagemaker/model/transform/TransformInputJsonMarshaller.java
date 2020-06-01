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
 * JSON marshaller for POJO TransformInput
 */
class TransformInputJsonMarshaller {

    public void marshall(TransformInput transformInput, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (transformInput.getDataSource() != null) {
            TransformDataSource dataSource = transformInput.getDataSource();
            jsonWriter.name("DataSource");
            TransformDataSourceJsonMarshaller.getInstance().marshall(dataSource, jsonWriter);
        }
        if (transformInput.getContentType() != null) {
            String contentType = transformInput.getContentType();
            jsonWriter.name("ContentType");
            jsonWriter.value(contentType);
        }
        if (transformInput.getCompressionType() != null) {
            String compressionType = transformInput.getCompressionType();
            jsonWriter.name("CompressionType");
            jsonWriter.value(compressionType);
        }
        if (transformInput.getSplitType() != null) {
            String splitType = transformInput.getSplitType();
            jsonWriter.name("SplitType");
            jsonWriter.value(splitType);
        }
        jsonWriter.endObject();
    }

    private static TransformInputJsonMarshaller instance;

    public static TransformInputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TransformInputJsonMarshaller();
        return instance;
    }
}
