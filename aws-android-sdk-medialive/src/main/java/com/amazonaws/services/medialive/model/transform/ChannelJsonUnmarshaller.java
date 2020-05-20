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
 * JSON unmarshaller for POJO Channel
 */
class ChannelJsonUnmarshaller implements Unmarshaller<Channel, JsonUnmarshallerContext> {

    public Channel unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Channel channel = new Channel();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                channel.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ChannelClass")) {
                channel.setChannelClass(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Destinations")) {
                channel.setDestinations(new ListUnmarshaller<OutputDestination>(
                        OutputDestinationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("EgressEndpoints")) {
                channel.setEgressEndpoints(new ListUnmarshaller<ChannelEgressEndpoint>(
                        ChannelEgressEndpointJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("EncoderSettings")) {
                channel.setEncoderSettings(EncoderSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                channel.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputAttachments")) {
                channel.setInputAttachments(new ListUnmarshaller<InputAttachment>(
                        InputAttachmentJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("InputSpecification")) {
                channel.setInputSpecification(InputSpecificationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LogLevel")) {
                channel.setLogLevel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                channel.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PipelineDetails")) {
                channel.setPipelineDetails(new ListUnmarshaller<PipelineDetail>(
                        PipelineDetailJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PipelinesRunningCount")) {
                channel.setPipelinesRunningCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoleArn")) {
                channel.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                channel.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                channel.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return channel;
    }

    private static ChannelJsonUnmarshaller instance;

    public static ChannelJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ChannelJsonUnmarshaller();
        return instance;
    }
}
