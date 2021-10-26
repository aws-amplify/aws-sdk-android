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
 * JSON marshaller for POJO ChannelFlowSummary
 */
class ChannelFlowSummaryJsonMarshaller {

    public void marshall(ChannelFlowSummary channelFlowSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (channelFlowSummary.getChannelFlowArn() != null) {
            String channelFlowArn = channelFlowSummary.getChannelFlowArn();
            jsonWriter.name("ChannelFlowArn");
            jsonWriter.value(channelFlowArn);
        }
        if (channelFlowSummary.getName() != null) {
            String name = channelFlowSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (channelFlowSummary.getProcessors() != null) {
            java.util.List<Processor> processors = channelFlowSummary.getProcessors();
            jsonWriter.name("Processors");
            jsonWriter.beginArray();
            for (Processor processorsItem : processors) {
                if (processorsItem != null) {
                    ProcessorJsonMarshaller.getInstance().marshall(processorsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ChannelFlowSummaryJsonMarshaller instance;

    public static ChannelFlowSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ChannelFlowSummaryJsonMarshaller();
        return instance;
    }
}
