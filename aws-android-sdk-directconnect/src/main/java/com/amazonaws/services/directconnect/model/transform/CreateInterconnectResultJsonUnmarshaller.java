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

package com.amazonaws.services.directconnect.model.transform;

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response CreateInterconnectResult
 */
public class CreateInterconnectResultJsonUnmarshaller implements
        Unmarshaller<CreateInterconnectResult, JsonUnmarshallerContext> {

    public CreateInterconnectResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateInterconnectResult createInterconnectResult = new CreateInterconnectResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("interconnectId")) {
                createInterconnectResult.setInterconnectId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("interconnectName")) {
                createInterconnectResult.setInterconnectName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("interconnectState")) {
                createInterconnectResult.setInterconnectState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("region")) {
                createInterconnectResult.setRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                createInterconnectResult.setLocation(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("bandwidth")) {
                createInterconnectResult.setBandwidth(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("loaIssueTime")) {
                createInterconnectResult.setLoaIssueTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lagId")) {
                createInterconnectResult.setLagId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsDevice")) {
                createInterconnectResult.setAwsDevice(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("jumboFrameCapable")) {
                createInterconnectResult.setJumboFrameCapable(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsDeviceV2")) {
                createInterconnectResult.setAwsDeviceV2(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("hasLogicalRedundancy")) {
                createInterconnectResult.setHasLogicalRedundancy(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                createInterconnectResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("providerName")) {
                createInterconnectResult.setProviderName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createInterconnectResult;
    }

    private static CreateInterconnectResultJsonUnmarshaller instance;

    public static CreateInterconnectResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateInterconnectResultJsonUnmarshaller();
        return instance;
    }
}
