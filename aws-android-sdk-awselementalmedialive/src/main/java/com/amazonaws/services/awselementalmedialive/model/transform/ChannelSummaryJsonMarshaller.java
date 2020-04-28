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
 * JSON marshaller for POJO ChannelSummary
 */
class ChannelSummaryJsonMarshaller {

    public void marshall(ChannelSummary channelSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (channelSummary.getArn() != null) {
            String arn = channelSummary.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (channelSummary.getChannelClass() != null) {
            String channelClass = channelSummary.getChannelClass();
            jsonWriter.name("ChannelClass");
            jsonWriter.value(channelClass);
        }
        if (channelSummary.getDestinations() != null) {
            java.util.List<OutputDestination> destinations = channelSummary.getDestinations();
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
        if (channelSummary.getEgressEndpoints() != null) {
            java.util.List<ChannelEgressEndpoint> egressEndpoints = channelSummary
                    .getEgressEndpoints();
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
        if (channelSummary.getId() != null) {
            String id = channelSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (channelSummary.getInputAttachments() != null) {
            java.util.List<InputAttachment> inputAttachments = channelSummary.getInputAttachments();
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
        if (channelSummary.getInputSpecification() != null) {
            InputSpecification inputSpecification = channelSummary.getInputSpecification();
            jsonWriter.name("InputSpecification");
            InputSpecificationJsonMarshaller.getInstance().marshall(inputSpecification, jsonWriter);
        }
        if (channelSummary.getLogLevel() != null) {
            String logLevel = channelSummary.getLogLevel();
            jsonWriter.name("LogLevel");
            jsonWriter.value(logLevel);
        }
        if (channelSummary.getName() != null) {
            String name = channelSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (channelSummary.getPipelinesRunningCount() != null) {
            Integer pipelinesRunningCount = channelSummary.getPipelinesRunningCount();
            jsonWriter.name("PipelinesRunningCount");
            jsonWriter.value(pipelinesRunningCount);
        }
        if (channelSummary.getRoleArn() != null) {
            String roleArn = channelSummary.getRoleArn();
            jsonWriter.name("RoleArn");
            jsonWriter.value(roleArn);
        }
        if (channelSummary.getState() != null) {
            String state = channelSummary.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (channelSummary.getTags() != null) {
            java.util.Map<String, String> tags = channelSummary.getTags();
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

    private static ChannelSummaryJsonMarshaller instance;

    public static ChannelSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ChannelSummaryJsonMarshaller();
        return instance;
    }
}
