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
 * JSON marshaller for POJO Channel
 */
class ChannelJsonMarshaller {

    public void marshall(Channel channel, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (channel.getChannelName() != null) {
            String channelName = channel.getChannelName();
            jsonWriter.name("ChannelName");
            jsonWriter.value(channelName);
        }
        if (channel.getDataSource() != null) {
            DataSource dataSource = channel.getDataSource();
            jsonWriter.name("DataSource");
            DataSourceJsonMarshaller.getInstance().marshall(dataSource, jsonWriter);
        }
        if (channel.getContentType() != null) {
            String contentType = channel.getContentType();
            jsonWriter.name("ContentType");
            jsonWriter.value(contentType);
        }
        if (channel.getCompressionType() != null) {
            String compressionType = channel.getCompressionType();
            jsonWriter.name("CompressionType");
            jsonWriter.value(compressionType);
        }
        if (channel.getRecordWrapperType() != null) {
            String recordWrapperType = channel.getRecordWrapperType();
            jsonWriter.name("RecordWrapperType");
            jsonWriter.value(recordWrapperType);
        }
        if (channel.getInputMode() != null) {
            String inputMode = channel.getInputMode();
            jsonWriter.name("InputMode");
            jsonWriter.value(inputMode);
        }
        if (channel.getShuffleConfig() != null) {
            ShuffleConfig shuffleConfig = channel.getShuffleConfig();
            jsonWriter.name("ShuffleConfig");
            ShuffleConfigJsonMarshaller.getInstance().marshall(shuffleConfig, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ChannelJsonMarshaller instance;

    public static ChannelJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ChannelJsonMarshaller();
        return instance;
    }
}
