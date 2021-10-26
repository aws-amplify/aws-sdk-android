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
 * JSON unmarshaller for response ListChannelsAssociatedWithChannelFlowResult
 */
public class ListChannelsAssociatedWithChannelFlowResultJsonUnmarshaller implements
        Unmarshaller<ListChannelsAssociatedWithChannelFlowResult, JsonUnmarshallerContext> {

    public ListChannelsAssociatedWithChannelFlowResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        ListChannelsAssociatedWithChannelFlowResult listChannelsAssociatedWithChannelFlowResult = new ListChannelsAssociatedWithChannelFlowResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Channels")) {
                listChannelsAssociatedWithChannelFlowResult
                        .setChannels(new ListUnmarshaller<ChannelAssociatedWithFlowSummary>(
                                ChannelAssociatedWithFlowSummaryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                listChannelsAssociatedWithChannelFlowResult.setNextToken(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listChannelsAssociatedWithChannelFlowResult;
    }

    private static ListChannelsAssociatedWithChannelFlowResultJsonUnmarshaller instance;

    public static ListChannelsAssociatedWithChannelFlowResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListChannelsAssociatedWithChannelFlowResultJsonUnmarshaller();
        return instance;
    }
}
