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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CapacityProvider
 */
class CapacityProviderJsonMarshaller {

    public void marshall(CapacityProvider capacityProvider, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (capacityProvider.getCapacityProviderArn() != null) {
            String capacityProviderArn = capacityProvider.getCapacityProviderArn();
            jsonWriter.name("capacityProviderArn");
            jsonWriter.value(capacityProviderArn);
        }
        if (capacityProvider.getName() != null) {
            String name = capacityProvider.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (capacityProvider.getStatus() != null) {
            String status = capacityProvider.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (capacityProvider.getAutoScalingGroupProvider() != null) {
            AutoScalingGroupProvider autoScalingGroupProvider = capacityProvider
                    .getAutoScalingGroupProvider();
            jsonWriter.name("autoScalingGroupProvider");
            AutoScalingGroupProviderJsonMarshaller.getInstance().marshall(autoScalingGroupProvider,
                    jsonWriter);
        }
        if (capacityProvider.getUpdateStatus() != null) {
            String updateStatus = capacityProvider.getUpdateStatus();
            jsonWriter.name("updateStatus");
            jsonWriter.value(updateStatus);
        }
        if (capacityProvider.getUpdateStatusReason() != null) {
            String updateStatusReason = capacityProvider.getUpdateStatusReason();
            jsonWriter.name("updateStatusReason");
            jsonWriter.value(updateStatusReason);
        }
        if (capacityProvider.getTags() != null) {
            java.util.List<Tag> tags = capacityProvider.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static CapacityProviderJsonMarshaller instance;

    public static CapacityProviderJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CapacityProviderJsonMarshaller();
        return instance;
    }
}
