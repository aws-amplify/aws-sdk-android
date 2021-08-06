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
 * JSON unmarshaller for POJO ChannelModeratedByAppInstanceUserSummary
 */
class ChannelModeratedByAppInstanceUserSummaryJsonUnmarshaller implements
        Unmarshaller<ChannelModeratedByAppInstanceUserSummary, JsonUnmarshallerContext> {

    public ChannelModeratedByAppInstanceUserSummary unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ChannelModeratedByAppInstanceUserSummary channelModeratedByAppInstanceUserSummary = new ChannelModeratedByAppInstanceUserSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ChannelSummary")) {
                channelModeratedByAppInstanceUserSummary
                        .setChannelSummary(ChannelSummaryJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return channelModeratedByAppInstanceUserSummary;
    }

    private static ChannelModeratedByAppInstanceUserSummaryJsonUnmarshaller instance;

    public static ChannelModeratedByAppInstanceUserSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ChannelModeratedByAppInstanceUserSummaryJsonUnmarshaller();
        return instance;
    }
}
