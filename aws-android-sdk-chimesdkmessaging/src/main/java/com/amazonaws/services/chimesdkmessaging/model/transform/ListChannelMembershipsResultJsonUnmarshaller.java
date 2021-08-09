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
 * JSON unmarshaller for response ListChannelMembershipsResult
 */
public class ListChannelMembershipsResultJsonUnmarshaller implements
        Unmarshaller<ListChannelMembershipsResult, JsonUnmarshallerContext> {

    public ListChannelMembershipsResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        ListChannelMembershipsResult listChannelMembershipsResult = new ListChannelMembershipsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ChannelArn")) {
                listChannelMembershipsResult.setChannelArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ChannelMemberships")) {
                listChannelMembershipsResult
                        .setChannelMemberships(new ListUnmarshaller<ChannelMembershipSummary>(
                                ChannelMembershipSummaryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                listChannelMembershipsResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listChannelMembershipsResult;
    }

    private static ListChannelMembershipsResultJsonUnmarshaller instance;

    public static ListChannelMembershipsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListChannelMembershipsResultJsonUnmarshaller();
        return instance;
    }
}
