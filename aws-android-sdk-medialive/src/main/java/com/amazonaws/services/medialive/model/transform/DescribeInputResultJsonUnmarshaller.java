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

package com.amazonaws.services.medialive.model.transform;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeInputResult
 */
public class DescribeInputResultJsonUnmarshaller implements
        Unmarshaller<DescribeInputResult, JsonUnmarshallerContext> {

    public DescribeInputResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeInputResult describeInputResult = new DescribeInputResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                describeInputResult.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AttachedChannels")) {
                describeInputResult.setAttachedChannels(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Destinations")) {
                describeInputResult.setDestinations(new ListUnmarshaller<InputDestination>(
                        InputDestinationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Id")) {
                describeInputResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputClass")) {
                describeInputResult.setInputClass(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputDevices")) {
                describeInputResult.setInputDevices(new ListUnmarshaller<InputDeviceSettings>(
                        InputDeviceSettingsJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("InputSourceType")) {
                describeInputResult.setInputSourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MediaConnectFlows")) {
                describeInputResult.setMediaConnectFlows(new ListUnmarshaller<MediaConnectFlow>(
                        MediaConnectFlowJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Name")) {
                describeInputResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoleArn")) {
                describeInputResult.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SecurityGroups")) {
                describeInputResult.setSecurityGroups(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Sources")) {
                describeInputResult.setSources(new ListUnmarshaller<InputSource>(
                        InputSourceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("State")) {
                describeInputResult.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                describeInputResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Type")) {
                describeInputResult.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeInputResult;
    }

    private static DescribeInputResultJsonUnmarshaller instance;

    public static DescribeInputResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeInputResultJsonUnmarshaller();
        return instance;
    }
}
