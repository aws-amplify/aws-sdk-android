/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RoutingProfile
 */
class RoutingProfileJsonMarshaller {

    public void marshall(RoutingProfile routingProfile, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (routingProfile.getInstanceId() != null) {
            String instanceId = routingProfile.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (routingProfile.getName() != null) {
            String name = routingProfile.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (routingProfile.getRoutingProfileArn() != null) {
            String routingProfileArn = routingProfile.getRoutingProfileArn();
            jsonWriter.name("RoutingProfileArn");
            jsonWriter.value(routingProfileArn);
        }
        if (routingProfile.getRoutingProfileId() != null) {
            String routingProfileId = routingProfile.getRoutingProfileId();
            jsonWriter.name("RoutingProfileId");
            jsonWriter.value(routingProfileId);
        }
        if (routingProfile.getDescription() != null) {
            String description = routingProfile.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (routingProfile.getMediaConcurrencies() != null) {
            java.util.List<MediaConcurrency> mediaConcurrencies = routingProfile
                    .getMediaConcurrencies();
            jsonWriter.name("MediaConcurrencies");
            jsonWriter.beginArray();
            for (MediaConcurrency mediaConcurrenciesItem : mediaConcurrencies) {
                if (mediaConcurrenciesItem != null) {
                    MediaConcurrencyJsonMarshaller.getInstance().marshall(mediaConcurrenciesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (routingProfile.getDefaultOutboundQueueId() != null) {
            String defaultOutboundQueueId = routingProfile.getDefaultOutboundQueueId();
            jsonWriter.name("DefaultOutboundQueueId");
            jsonWriter.value(defaultOutboundQueueId);
        }
        if (routingProfile.getTags() != null) {
            java.util.Map<String, String> tags = routingProfile.getTags();
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
        if (routingProfile.getNumberOfAssociatedQueues() != null) {
            Long numberOfAssociatedQueues = routingProfile.getNumberOfAssociatedQueues();
            jsonWriter.name("NumberOfAssociatedQueues");
            jsonWriter.value(numberOfAssociatedQueues);
        }
        if (routingProfile.getNumberOfAssociatedUsers() != null) {
            Long numberOfAssociatedUsers = routingProfile.getNumberOfAssociatedUsers();
            jsonWriter.name("NumberOfAssociatedUsers");
            jsonWriter.value(numberOfAssociatedUsers);
        }
        if (routingProfile.getAgentAvailabilityTimer() != null) {
            String agentAvailabilityTimer = routingProfile.getAgentAvailabilityTimer();
            jsonWriter.name("AgentAvailabilityTimer");
            jsonWriter.value(agentAvailabilityTimer);
        }
        if (routingProfile.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = routingProfile.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (routingProfile.getLastModifiedRegion() != null) {
            String lastModifiedRegion = routingProfile.getLastModifiedRegion();
            jsonWriter.name("LastModifiedRegion");
            jsonWriter.value(lastModifiedRegion);
        }
        if (routingProfile.getIsDefault() != null) {
            Boolean isDefault = routingProfile.getIsDefault();
            jsonWriter.name("IsDefault");
            jsonWriter.value(isDefault);
        }
        if (routingProfile.getAssociatedQueueIds() != null) {
            java.util.List<String> associatedQueueIds = routingProfile.getAssociatedQueueIds();
            jsonWriter.name("AssociatedQueueIds");
            jsonWriter.beginArray();
            for (String associatedQueueIdsItem : associatedQueueIds) {
                if (associatedQueueIdsItem != null) {
                    jsonWriter.value(associatedQueueIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static RoutingProfileJsonMarshaller instance;

    public static RoutingProfileJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RoutingProfileJsonMarshaller();
        return instance;
    }
}
