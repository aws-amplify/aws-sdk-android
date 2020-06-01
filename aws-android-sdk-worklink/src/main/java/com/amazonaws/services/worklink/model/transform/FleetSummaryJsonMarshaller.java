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

package com.amazonaws.services.worklink.model.transform;

import com.amazonaws.services.worklink.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FleetSummary
 */
class FleetSummaryJsonMarshaller {

    public void marshall(FleetSummary fleetSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (fleetSummary.getFleetArn() != null) {
            String fleetArn = fleetSummary.getFleetArn();
            jsonWriter.name("FleetArn");
            jsonWriter.value(fleetArn);
        }
        if (fleetSummary.getCreatedTime() != null) {
            java.util.Date createdTime = fleetSummary.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (fleetSummary.getLastUpdatedTime() != null) {
            java.util.Date lastUpdatedTime = fleetSummary.getLastUpdatedTime();
            jsonWriter.name("LastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        if (fleetSummary.getFleetName() != null) {
            String fleetName = fleetSummary.getFleetName();
            jsonWriter.name("FleetName");
            jsonWriter.value(fleetName);
        }
        if (fleetSummary.getDisplayName() != null) {
            String displayName = fleetSummary.getDisplayName();
            jsonWriter.name("DisplayName");
            jsonWriter.value(displayName);
        }
        if (fleetSummary.getCompanyCode() != null) {
            String companyCode = fleetSummary.getCompanyCode();
            jsonWriter.name("CompanyCode");
            jsonWriter.value(companyCode);
        }
        if (fleetSummary.getFleetStatus() != null) {
            String fleetStatus = fleetSummary.getFleetStatus();
            jsonWriter.name("FleetStatus");
            jsonWriter.value(fleetStatus);
        }
        if (fleetSummary.getTags() != null) {
            java.util.Map<String, String> tags = fleetSummary.getTags();
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

    private static FleetSummaryJsonMarshaller instance;

    public static FleetSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FleetSummaryJsonMarshaller();
        return instance;
    }
}
