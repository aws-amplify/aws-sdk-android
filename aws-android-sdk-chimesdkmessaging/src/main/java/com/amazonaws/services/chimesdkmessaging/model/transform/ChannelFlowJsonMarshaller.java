/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkmessaging.model.transform;

import com.amazonaws.services.chimesdkmessaging.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ChannelFlow
 */
class ChannelFlowJsonMarshaller {

    public void marshall(ChannelFlow channelFlow, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (channelFlow.getChannelFlowArn() != null) {
            String channelFlowArn = channelFlow.getChannelFlowArn();
            jsonWriter.name("ChannelFlowArn");
            jsonWriter.value(channelFlowArn);
        }
        if (channelFlow.getProcessors() != null) {
            java.util.List<Processor> processors = channelFlow.getProcessors();
            jsonWriter.name("Processors");
            jsonWriter.beginArray();
            for (Processor processorsItem : processors) {
                if (processorsItem != null) {
                    ProcessorJsonMarshaller.getInstance().marshall(processorsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (channelFlow.getName() != null) {
            String name = channelFlow.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (channelFlow.getCreatedTimestamp() != null) {
            java.util.Date createdTimestamp = channelFlow.getCreatedTimestamp();
            jsonWriter.name("CreatedTimestamp");
            jsonWriter.value(createdTimestamp);
        }
        if (channelFlow.getLastUpdatedTimestamp() != null) {
            java.util.Date lastUpdatedTimestamp = channelFlow.getLastUpdatedTimestamp();
            jsonWriter.name("LastUpdatedTimestamp");
            jsonWriter.value(lastUpdatedTimestamp);
        }
        jsonWriter.endObject();
    }

    private static ChannelFlowJsonMarshaller instance;

    public static ChannelFlowJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ChannelFlowJsonMarshaller();
        return instance;
    }
}
