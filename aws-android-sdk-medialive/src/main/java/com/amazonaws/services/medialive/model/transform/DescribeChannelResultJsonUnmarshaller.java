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
 * JSON unmarshaller for response DescribeChannelResult
 */
public class DescribeChannelResultJsonUnmarshaller implements
        Unmarshaller<DescribeChannelResult, JsonUnmarshallerContext> {

    public DescribeChannelResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeChannelResult describeChannelResult = new DescribeChannelResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                describeChannelResult.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ChannelClass")) {
                describeChannelResult.setChannelClass(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Destinations")) {
                describeChannelResult.setDestinations(new ListUnmarshaller<OutputDestination>(
                        OutputDestinationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("EgressEndpoints")) {
                describeChannelResult
                        .setEgressEndpoints(new ListUnmarshaller<ChannelEgressEndpoint>(
                                ChannelEgressEndpointJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("EncoderSettings")) {
                describeChannelResult.setEncoderSettings(EncoderSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                describeChannelResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputAttachments")) {
                describeChannelResult.setInputAttachments(new ListUnmarshaller<InputAttachment>(
                        InputAttachmentJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("InputSpecification")) {
                describeChannelResult.setInputSpecification(InputSpecificationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LogLevel")) {
                describeChannelResult.setLogLevel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                describeChannelResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PipelineDetails")) {
                describeChannelResult.setPipelineDetails(new ListUnmarshaller<PipelineDetail>(
                        PipelineDetailJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PipelinesRunningCount")) {
                describeChannelResult.setPipelinesRunningCount(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoleArn")) {
                describeChannelResult.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                describeChannelResult.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                describeChannelResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeChannelResult;
    }

    private static DescribeChannelResultJsonUnmarshaller instance;

    public static DescribeChannelResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeChannelResultJsonUnmarshaller();
        return instance;
    }
}
