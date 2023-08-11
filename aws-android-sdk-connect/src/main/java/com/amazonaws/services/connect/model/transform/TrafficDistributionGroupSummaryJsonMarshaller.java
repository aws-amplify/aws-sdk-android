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
 * JSON marshaller for POJO TrafficDistributionGroupSummary
 */
class TrafficDistributionGroupSummaryJsonMarshaller {

    public void marshall(TrafficDistributionGroupSummary trafficDistributionGroupSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (trafficDistributionGroupSummary.getId() != null) {
            String id = trafficDistributionGroupSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (trafficDistributionGroupSummary.getArn() != null) {
            String arn = trafficDistributionGroupSummary.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (trafficDistributionGroupSummary.getName() != null) {
            String name = trafficDistributionGroupSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (trafficDistributionGroupSummary.getInstanceArn() != null) {
            String instanceArn = trafficDistributionGroupSummary.getInstanceArn();
            jsonWriter.name("InstanceArn");
            jsonWriter.value(instanceArn);
        }
        if (trafficDistributionGroupSummary.getStatus() != null) {
            String status = trafficDistributionGroupSummary.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (trafficDistributionGroupSummary.getIsDefault() != null) {
            Boolean isDefault = trafficDistributionGroupSummary.getIsDefault();
            jsonWriter.name("IsDefault");
            jsonWriter.value(isDefault);
        }
        jsonWriter.endObject();
    }

    private static TrafficDistributionGroupSummaryJsonMarshaller instance;

    public static TrafficDistributionGroupSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrafficDistributionGroupSummaryJsonMarshaller();
        return instance;
    }
}
