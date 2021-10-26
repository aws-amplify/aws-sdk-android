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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ChannelFlowSummary
 */
class ChannelFlowSummaryJsonUnmarshaller implements
        Unmarshaller<ChannelFlowSummary, JsonUnmarshallerContext> {

    public ChannelFlowSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ChannelFlowSummary channelFlowSummary = new ChannelFlowSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ChannelFlowArn")) {
                channelFlowSummary.setChannelFlowArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                channelFlowSummary.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Processors")) {
                channelFlowSummary.setProcessors(new ListUnmarshaller<Processor>(
                        ProcessorJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return channelFlowSummary;
    }

    private static ChannelFlowSummaryJsonUnmarshaller instance;

    public static ChannelFlowSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ChannelFlowSummaryJsonUnmarshaller();
        return instance;
    }
}
