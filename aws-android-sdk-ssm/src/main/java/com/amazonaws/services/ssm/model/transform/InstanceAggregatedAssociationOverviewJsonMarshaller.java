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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InstanceAggregatedAssociationOverview
 */
class InstanceAggregatedAssociationOverviewJsonMarshaller {

    public void marshall(
            InstanceAggregatedAssociationOverview instanceAggregatedAssociationOverview,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instanceAggregatedAssociationOverview.getDetailedStatus() != null) {
            String detailedStatus = instanceAggregatedAssociationOverview.getDetailedStatus();
            jsonWriter.name("DetailedStatus");
            jsonWriter.value(detailedStatus);
        }
        if (instanceAggregatedAssociationOverview.getInstanceAssociationStatusAggregatedCount() != null) {
            java.util.Map<String, Integer> instanceAssociationStatusAggregatedCount = instanceAggregatedAssociationOverview
                    .getInstanceAssociationStatusAggregatedCount();
            jsonWriter.name("InstanceAssociationStatusAggregatedCount");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, Integer> instanceAssociationStatusAggregatedCountEntry : instanceAssociationStatusAggregatedCount
                    .entrySet()) {
                Integer instanceAssociationStatusAggregatedCountValue = instanceAssociationStatusAggregatedCountEntry
                        .getValue();
                if (instanceAssociationStatusAggregatedCountValue != null) {
                    jsonWriter.name(instanceAssociationStatusAggregatedCountEntry.getKey());
                    jsonWriter.value(instanceAssociationStatusAggregatedCountValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static InstanceAggregatedAssociationOverviewJsonMarshaller instance;

    public static InstanceAggregatedAssociationOverviewJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceAggregatedAssociationOverviewJsonMarshaller();
        return instance;
    }
}
