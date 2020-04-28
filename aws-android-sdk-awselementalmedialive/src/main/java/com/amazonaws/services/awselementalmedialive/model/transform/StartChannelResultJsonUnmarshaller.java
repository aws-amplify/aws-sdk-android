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

package com.amazonaws.services.awselementalmedialive.model.transform;

import com.amazonaws.services.awselementalmedialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response StartChannelResult
 */
public class StartChannelResultJsonUnmarshaller implements
        Unmarshaller<StartChannelResult, JsonUnmarshallerContext> {

    public StartChannelResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        StartChannelResult startChannelResult = new StartChannelResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                startChannelResult.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ChannelClass")) {
                startChannelResult.setChannelClass(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Destinations")) {
                startChannelResult.setDestinations(new ListUnmarshaller<OutputDestination>(
                        OutputDestinationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("EgressEndpoints")) {
                startChannelResult.setEgressEndpoints(new ListUnmarshaller<ChannelEgressEndpoint>(
                        ChannelEgressEndpointJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("EncoderSettings")) {
                startChannelResult.setEncoderSettings(EncoderSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                startChannelResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputAttachments")) {
                startChannelResult.setInputAttachments(new ListUnmarshaller<InputAttachment>(
                        InputAttachmentJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("InputSpecification")) {
                startChannelResult.setInputSpecification(InputSpecificationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LogLevel")) {
                startChannelResult.setLogLevel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                startChannelResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PipelineDetails")) {
                startChannelResult.setPipelineDetails(new ListUnmarshaller<PipelineDetail>(
                        PipelineDetailJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PipelinesRunningCount")) {
                startChannelResult.setPipelinesRunningCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoleArn")) {
                startChannelResult.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                startChannelResult.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                startChannelResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return startChannelResult;
    }

    private static StartChannelResultJsonUnmarshaller instance;

    public static StartChannelResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartChannelResultJsonUnmarshaller();
        return instance;
    }
}
