/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideo.model.transform;

import com.amazonaws.services.kinesisvideo.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EdgeConfig
 */
class EdgeConfigJsonMarshaller {

    public void marshall(EdgeConfig edgeConfig, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (edgeConfig.getHubDeviceArn() != null) {
            String hubDeviceArn = edgeConfig.getHubDeviceArn();
            jsonWriter.name("HubDeviceArn");
            jsonWriter.value(hubDeviceArn);
        }
        if (edgeConfig.getRecorderConfig() != null) {
            RecorderConfig recorderConfig = edgeConfig.getRecorderConfig();
            jsonWriter.name("RecorderConfig");
            RecorderConfigJsonMarshaller.getInstance().marshall(recorderConfig, jsonWriter);
        }
        if (edgeConfig.getUploaderConfig() != null) {
            UploaderConfig uploaderConfig = edgeConfig.getUploaderConfig();
            jsonWriter.name("UploaderConfig");
            UploaderConfigJsonMarshaller.getInstance().marshall(uploaderConfig, jsonWriter);
        }
        if (edgeConfig.getDeletionConfig() != null) {
            DeletionConfig deletionConfig = edgeConfig.getDeletionConfig();
            jsonWriter.name("DeletionConfig");
            DeletionConfigJsonMarshaller.getInstance().marshall(deletionConfig, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static EdgeConfigJsonMarshaller instance;

    public static EdgeConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EdgeConfigJsonMarshaller();
        return instance;
    }
}
