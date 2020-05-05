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
 * JSON marshaller for POJO TrustedAdvisorCheckResult
 */
class TrustedAdvisorCheckResultJsonMarshaller {

    public void marshall(TrustedAdvisorCheckResult trustedAdvisorCheckResult,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (trustedAdvisorCheckResult.getCheckId() != null) {
            String checkId = trustedAdvisorCheckResult.getCheckId();
            jsonWriter.name("checkId");
            jsonWriter.value(checkId);
        }
        if (trustedAdvisorCheckResult.getTimestamp() != null) {
            String timestamp = trustedAdvisorCheckResult.getTimestamp();
            jsonWriter.name("timestamp");
            jsonWriter.value(timestamp);
        }
        if (trustedAdvisorCheckResult.getStatus() != null) {
            String status = trustedAdvisorCheckResult.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (trustedAdvisorCheckResult.getResourcesSummary() != null) {
            TrustedAdvisorResourcesSummary resourcesSummary = trustedAdvisorCheckResult
                    .getResourcesSummary();
            jsonWriter.name("resourcesSummary");
            TrustedAdvisorResourcesSummaryJsonMarshaller.getInstance().marshall(resourcesSummary,
                    jsonWriter);
        }
        if (trustedAdvisorCheckResult.getCategorySpecificSummary() != null) {
            TrustedAdvisorCategorySpecificSummary categorySpecificSummary = trustedAdvisorCheckResult
                    .getCategorySpecificSummary();
            jsonWriter.name("categorySpecificSummary");
            TrustedAdvisorCategorySpecificSummaryJsonMarshaller.getInstance().marshall(
                    categorySpecificSummary, jsonWriter);
        }
        if (trustedAdvisorCheckResult.getFlaggedResources() != null) {
            java.util.List<TrustedAdvisorResourceDetail> flaggedResources = trustedAdvisorCheckResult
                    .getFlaggedResources();
            jsonWriter.name("flaggedResources");
            jsonWriter.beginArray();
            for (TrustedAdvisorResourceDetail flaggedResourcesItem : flaggedResources) {
                if (flaggedResourcesItem != null) {
                    TrustedAdvisorResourceDetailJsonMarshaller.getInstance().marshall(
                            flaggedResourcesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static TrustedAdvisorCheckResultJsonMarshaller instance;

    public static TrustedAdvisorCheckResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrustedAdvisorCheckResultJsonMarshaller();
        return instance;
    }
}
