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
 * JSON marshaller for POJO ChannelInfo
 */
class ChannelInfoJsonMarshaller {

    public void marshall(ChannelInfo channelInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (channelInfo.getChannelName() != null) {
            String channelName = channelInfo.getChannelName();
            jsonWriter.name("ChannelName");
            jsonWriter.value(channelName);
        }
        if (channelInfo.getChannelARN() != null) {
            String channelARN = channelInfo.getChannelARN();
            jsonWriter.name("ChannelARN");
            jsonWriter.value(channelARN);
        }
        if (channelInfo.getChannelType() != null) {
            String channelType = channelInfo.getChannelType();
            jsonWriter.name("ChannelType");
            jsonWriter.value(channelType);
        }
        if (channelInfo.getChannelStatus() != null) {
            String channelStatus = channelInfo.getChannelStatus();
            jsonWriter.name("ChannelStatus");
            jsonWriter.value(channelStatus);
        }
        if (channelInfo.getCreationTime() != null) {
            java.util.Date creationTime = channelInfo.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (channelInfo.getSingleMasterConfiguration() != null) {
            SingleMasterConfiguration singleMasterConfiguration = channelInfo
                    .getSingleMasterConfiguration();
            jsonWriter.name("SingleMasterConfiguration");
            SingleMasterConfigurationJsonMarshaller.getInstance().marshall(
                    singleMasterConfiguration, jsonWriter);
        }
        if (channelInfo.getVersion() != null) {
            String version = channelInfo.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        jsonWriter.endObject();
    }

    private static ChannelInfoJsonMarshaller instance;

    public static ChannelInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ChannelInfoJsonMarshaller();
        return instance;
    }
}
