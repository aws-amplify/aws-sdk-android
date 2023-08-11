/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO TrafficDistributionGroup
 */
class TrafficDistributionGroupJsonMarshaller {

    public void marshall(TrafficDistributionGroup trafficDistributionGroup, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (trafficDistributionGroup.getId() != null) {
            String id = trafficDistributionGroup.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (trafficDistributionGroup.getArn() != null) {
            String arn = trafficDistributionGroup.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (trafficDistributionGroup.getName() != null) {
            String name = trafficDistributionGroup.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (trafficDistributionGroup.getDescription() != null) {
            String description = trafficDistributionGroup.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (trafficDistributionGroup.getInstanceArn() != null) {
            String instanceArn = trafficDistributionGroup.getInstanceArn();
            jsonWriter.name("InstanceArn");
            jsonWriter.value(instanceArn);
        }
        if (trafficDistributionGroup.getStatus() != null) {
            String status = trafficDistributionGroup.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (trafficDistributionGroup.getTags() != null) {
            java.util.Map<String, String> tags = trafficDistributionGroup.getTags();
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
        if (trafficDistributionGroup.getIsDefault() != null) {
            Boolean isDefault = trafficDistributionGroup.getIsDefault();
            jsonWriter.name("IsDefault");
            jsonWriter.value(isDefault);
        }
        jsonWriter.endObject();
    }

    private static TrafficDistributionGroupJsonMarshaller instance;

    public static TrafficDistributionGroupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrafficDistributionGroupJsonMarshaller();
        return instance;
    }
}
