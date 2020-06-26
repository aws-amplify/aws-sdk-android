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
 * JSON marshaller for POJO AutoMLChannel
 */
class AutoMLChannelJsonMarshaller {

    public void marshall(AutoMLChannel autoMLChannel, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (autoMLChannel.getDataSource() != null) {
            AutoMLDataSource dataSource = autoMLChannel.getDataSource();
            jsonWriter.name("DataSource");
            AutoMLDataSourceJsonMarshaller.getInstance().marshall(dataSource, jsonWriter);
        }
        if (autoMLChannel.getCompressionType() != null) {
            String compressionType = autoMLChannel.getCompressionType();
            jsonWriter.name("CompressionType");
            jsonWriter.value(compressionType);
        }
        if (autoMLChannel.getTargetAttributeName() != null) {
            String targetAttributeName = autoMLChannel.getTargetAttributeName();
            jsonWriter.name("TargetAttributeName");
            jsonWriter.value(targetAttributeName);
        }
        jsonWriter.endObject();
    }

    private static AutoMLChannelJsonMarshaller instance;

    public static AutoMLChannelJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AutoMLChannelJsonMarshaller();
        return instance;
    }
}
