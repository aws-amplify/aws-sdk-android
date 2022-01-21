/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
        jsonWriter.endObject();
    }

    private static RoutingProfileJsonMarshaller instance;

    public static RoutingProfileJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RoutingProfileJsonMarshaller();
        return instance;
    }
}
