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
 * JSON unmarshaller for POJO ChannelAssociatedWithFlowSummary
 */
class ChannelAssociatedWithFlowSummaryJsonUnmarshaller implements
        Unmarshaller<ChannelAssociatedWithFlowSummary, JsonUnmarshallerContext> {

    public ChannelAssociatedWithFlowSummary unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ChannelAssociatedWithFlowSummary channelAssociatedWithFlowSummary = new ChannelAssociatedWithFlowSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                channelAssociatedWithFlowSummary.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ChannelArn")) {
                channelAssociatedWithFlowSummary.setChannelArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Mode")) {
                channelAssociatedWithFlowSummary.setMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Privacy")) {
                channelAssociatedWithFlowSummary.setPrivacy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Metadata")) {
                channelAssociatedWithFlowSummary.setMetadata(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return channelAssociatedWithFlowSummary;
    }

    private static ChannelAssociatedWithFlowSummaryJsonUnmarshaller instance;

    public static ChannelAssociatedWithFlowSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ChannelAssociatedWithFlowSummaryJsonUnmarshaller();
        return instance;
    }
}
