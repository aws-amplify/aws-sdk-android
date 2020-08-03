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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AssociationOverview
 */
class AssociationOverviewJsonMarshaller {

    public void marshall(AssociationOverview associationOverview, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (associationOverview.getStatus() != null) {
            String status = associationOverview.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (associationOverview.getDetailedStatus() != null) {
            String detailedStatus = associationOverview.getDetailedStatus();
            jsonWriter.name("DetailedStatus");
            jsonWriter.value(detailedStatus);
        }
        if (associationOverview.getAssociationStatusAggregatedCount() != null) {
            java.util.Map<String, Integer> associationStatusAggregatedCount = associationOverview.getAssociationStatusAggregatedCount();
            jsonWriter.name("AssociationStatusAggregatedCount");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, Integer> associationStatusAggregatedCountEntry : associationStatusAggregatedCount.entrySet()) {
                Integer associationStatusAggregatedCountValue = associationStatusAggregatedCountEntry.getValue();
                if (associationStatusAggregatedCountValue != null) {
                    jsonWriter.name(associationStatusAggregatedCountEntry.getKey());
            jsonWriter.value(associationStatusAggregatedCountValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static AssociationOverviewJsonMarshaller instance;
    public static AssociationOverviewJsonMarshaller getInstance() {
        if (instance == null) instance = new AssociationOverviewJsonMarshaller();
        return instance;
    }
}
