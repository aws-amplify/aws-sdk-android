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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Channel
 */
class ChannelJsonMarshaller {

    public void marshall(Channel channel, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (channel.getArn() != null) {
            String arn = channel.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (channel.getChannelClass() != null) {
            String channelClass = channel.getChannelClass();
            jsonWriter.name("ChannelClass");
            jsonWriter.value(channelClass);
        }
        if (channel.getDestinations() != null) {
            java.util.List<OutputDestination> destinations = channel.getDestinations();
            jsonWriter.name("Destinations");
            jsonWriter.beginArray();
            for (OutputDestination destinationsItem : destinations) {
                if (destinationsItem != null) {
                    OutputDestinationJsonMarshaller.getInstance().marshall(destinationsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (channel.getEgressEndpoints() != null) {
            java.util.List<ChannelEgressEndpoint> egressEndpoints = channel.getEgressEndpoints();
            jsonWriter.name("EgressEndpoints");
            jsonWriter.beginArray();
            for (ChannelEgressEndpoint egressEndpointsItem : egressEndpoints) {
                if (egressEndpointsItem != null) {
                    ChannelEgressEndpointJsonMarshaller.getInstance().marshall(egressEndpointsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (channel.getEncoderSettings() != null) {
            EncoderSettings encoderSettings = channel.getEncoderSettings();
            jsonWriter.name("EncoderSettings");
            EncoderSettingsJsonMarshaller.getInstance().marshall(encoderSettings, jsonWriter);
        }
        if (channel.getId() != null) {
            String id = channel.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (channel.getInputAttachments() != null) {
            java.util.List<InputAttachment> inputAttachments = channel.getInputAttachments();
            jsonWriter.name("InputAttachments");
            jsonWriter.beginArray();
            for (InputAttachment inputAttachmentsItem : inputAttachments) {
                if (inputAttachmentsItem != null) {
                    InputAttachmentJsonMarshaller.getInstance().marshall(inputAttachmentsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (channel.getInputSpecification() != null) {
            InputSpecification inputSpecification = channel.getInputSpecification();
            jsonWriter.name("InputSpecification");
            InputSpecificationJsonMarshaller.getInstance().marshall(inputSpecification, jsonWriter);
        }
        if (channel.getLogLevel() != null) {
            String logLevel = channel.getLogLevel();
            jsonWriter.name("LogLevel");
            jsonWriter.value(logLevel);
        }
        if (channel.getName() != null) {
            String name = channel.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (channel.getPipelineDetails() != null) {
            java.util.List<PipelineDetail> pipelineDetails = channel.getPipelineDetails();
            jsonWriter.name("PipelineDetails");
            jsonWriter.beginArray();
            for (PipelineDetail pipelineDetailsItem : pipelineDetails) {
                if (pipelineDetailsItem != null) {
                    PipelineDetailJsonMarshaller.getInstance().marshall(pipelineDetailsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (channel.getPipelinesRunningCount() != null) {
            Integer pipelinesRunningCount = channel.getPipelinesRunningCount();
            jsonWriter.name("PipelinesRunningCount");
            jsonWriter.value(pipelinesRunningCount);
        }
        if (channel.getRoleArn() != null) {
            String roleArn = channel.getRoleArn();
            jsonWriter.name("RoleArn");
            jsonWriter.value(roleArn);
        }
        if (channel.getState() != null) {
            String state = channel.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (channel.getTags() != null) {
            java.util.Map<String, String> tags = channel.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static ChannelJsonMarshaller instance;

    public static ChannelJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ChannelJsonMarshaller();
        return instance;
    }
}
