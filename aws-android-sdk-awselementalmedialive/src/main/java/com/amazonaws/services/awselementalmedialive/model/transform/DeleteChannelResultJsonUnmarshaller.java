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
 * JSON unmarshaller for response DeleteChannelResult
 */
public class DeleteChannelResultJsonUnmarshaller implements
        Unmarshaller<DeleteChannelResult, JsonUnmarshallerContext> {

    public DeleteChannelResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteChannelResult deleteChannelResult = new DeleteChannelResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                deleteChannelResult.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ChannelClass")) {
                deleteChannelResult.setChannelClass(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Destinations")) {
                deleteChannelResult.setDestinations(new ListUnmarshaller<OutputDestination>(
                        OutputDestinationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("EgressEndpoints")) {
                deleteChannelResult.setEgressEndpoints(new ListUnmarshaller<ChannelEgressEndpoint>(
                        ChannelEgressEndpointJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("EncoderSettings")) {
                deleteChannelResult.setEncoderSettings(EncoderSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                deleteChannelResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputAttachments")) {
                deleteChannelResult.setInputAttachments(new ListUnmarshaller<InputAttachment>(
                        InputAttachmentJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("InputSpecification")) {
                deleteChannelResult.setInputSpecification(InputSpecificationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LogLevel")) {
                deleteChannelResult.setLogLevel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                deleteChannelResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PipelineDetails")) {
                deleteChannelResult.setPipelineDetails(new ListUnmarshaller<PipelineDetail>(
                        PipelineDetailJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PipelinesRunningCount")) {
                deleteChannelResult.setPipelinesRunningCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoleArn")) {
                deleteChannelResult.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                deleteChannelResult.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                deleteChannelResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return deleteChannelResult;
    }

    private static DeleteChannelResultJsonUnmarshaller instance;

    public static DeleteChannelResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteChannelResultJsonUnmarshaller();
        return instance;
    }
}
