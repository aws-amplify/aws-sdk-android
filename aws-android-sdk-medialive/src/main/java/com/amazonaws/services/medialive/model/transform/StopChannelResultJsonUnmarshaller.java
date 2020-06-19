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
 * JSON unmarshaller for response StopChannelResult
 */
public class StopChannelResultJsonUnmarshaller implements
        Unmarshaller<StopChannelResult, JsonUnmarshallerContext> {

    public StopChannelResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        StopChannelResult stopChannelResult = new StopChannelResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                stopChannelResult.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ChannelClass")) {
                stopChannelResult.setChannelClass(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Destinations")) {
                stopChannelResult.setDestinations(new ListUnmarshaller<OutputDestination>(
                        OutputDestinationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("EgressEndpoints")) {
                stopChannelResult.setEgressEndpoints(new ListUnmarshaller<ChannelEgressEndpoint>(
                        ChannelEgressEndpointJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("EncoderSettings")) {
                stopChannelResult.setEncoderSettings(EncoderSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                stopChannelResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputAttachments")) {
                stopChannelResult.setInputAttachments(new ListUnmarshaller<InputAttachment>(
                        InputAttachmentJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("InputSpecification")) {
                stopChannelResult.setInputSpecification(InputSpecificationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LogLevel")) {
                stopChannelResult.setLogLevel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                stopChannelResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PipelineDetails")) {
                stopChannelResult.setPipelineDetails(new ListUnmarshaller<PipelineDetail>(
                        PipelineDetailJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PipelinesRunningCount")) {
                stopChannelResult.setPipelinesRunningCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoleArn")) {
                stopChannelResult.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                stopChannelResult.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                stopChannelResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return stopChannelResult;
    }

    private static StopChannelResultJsonUnmarshaller instance;

    public static StopChannelResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StopChannelResultJsonUnmarshaller();
        return instance;
    }
}
