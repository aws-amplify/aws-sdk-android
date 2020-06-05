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

package com.amazonaws.services.personalize.model.transform;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CampaignSummary
 */
class CampaignSummaryJsonMarshaller {

    public void marshall(CampaignSummary campaignSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (campaignSummary.getName() != null) {
            String name = campaignSummary.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (campaignSummary.getCampaignArn() != null) {
            String campaignArn = campaignSummary.getCampaignArn();
            jsonWriter.name("campaignArn");
            jsonWriter.value(campaignArn);
        }
        if (campaignSummary.getStatus() != null) {
            String status = campaignSummary.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (campaignSummary.getCreationDateTime() != null) {
            java.util.Date creationDateTime = campaignSummary.getCreationDateTime();
            jsonWriter.name("creationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (campaignSummary.getLastUpdatedDateTime() != null) {
            java.util.Date lastUpdatedDateTime = campaignSummary.getLastUpdatedDateTime();
            jsonWriter.name("lastUpdatedDateTime");
            jsonWriter.value(lastUpdatedDateTime);
        }
        if (campaignSummary.getFailureReason() != null) {
            String failureReason = campaignSummary.getFailureReason();
            jsonWriter.name("failureReason");
            jsonWriter.value(failureReason);
        }
        jsonWriter.endObject();
    }

    private static CampaignSummaryJsonMarshaller instance;

    public static CampaignSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CampaignSummaryJsonMarshaller();
        return instance;
    }
}
