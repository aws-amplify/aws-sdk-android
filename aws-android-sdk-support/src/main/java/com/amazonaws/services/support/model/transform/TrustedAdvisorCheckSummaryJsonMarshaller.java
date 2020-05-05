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

package com.amazonaws.services.support.model.transform;

import com.amazonaws.services.support.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TrustedAdvisorCheckSummary
 */
class TrustedAdvisorCheckSummaryJsonMarshaller {

    public void marshall(TrustedAdvisorCheckSummary trustedAdvisorCheckSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (trustedAdvisorCheckSummary.getCheckId() != null) {
            String checkId = trustedAdvisorCheckSummary.getCheckId();
            jsonWriter.name("checkId");
            jsonWriter.value(checkId);
        }
        if (trustedAdvisorCheckSummary.getTimestamp() != null) {
            String timestamp = trustedAdvisorCheckSummary.getTimestamp();
            jsonWriter.name("timestamp");
            jsonWriter.value(timestamp);
        }
        if (trustedAdvisorCheckSummary.getStatus() != null) {
            String status = trustedAdvisorCheckSummary.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (trustedAdvisorCheckSummary.getHasFlaggedResources() != null) {
            Boolean hasFlaggedResources = trustedAdvisorCheckSummary.getHasFlaggedResources();
            jsonWriter.name("hasFlaggedResources");
            jsonWriter.value(hasFlaggedResources);
        }
        if (trustedAdvisorCheckSummary.getResourcesSummary() != null) {
            TrustedAdvisorResourcesSummary resourcesSummary = trustedAdvisorCheckSummary
                    .getResourcesSummary();
            jsonWriter.name("resourcesSummary");
            TrustedAdvisorResourcesSummaryJsonMarshaller.getInstance().marshall(resourcesSummary,
                    jsonWriter);
        }
        if (trustedAdvisorCheckSummary.getCategorySpecificSummary() != null) {
            TrustedAdvisorCategorySpecificSummary categorySpecificSummary = trustedAdvisorCheckSummary
                    .getCategorySpecificSummary();
            jsonWriter.name("categorySpecificSummary");
            TrustedAdvisorCategorySpecificSummaryJsonMarshaller.getInstance().marshall(
                    categorySpecificSummary, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TrustedAdvisorCheckSummaryJsonMarshaller instance;

    public static TrustedAdvisorCheckSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrustedAdvisorCheckSummaryJsonMarshaller();
        return instance;
    }
}
