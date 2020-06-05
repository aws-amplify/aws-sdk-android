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
 * JSON marshaller for POJO Campaign
 */
class CampaignJsonMarshaller {

    public void marshall(Campaign campaign, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (campaign.getName() != null) {
            String name = campaign.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (campaign.getCampaignArn() != null) {
            String campaignArn = campaign.getCampaignArn();
            jsonWriter.name("campaignArn");
            jsonWriter.value(campaignArn);
        }
        if (campaign.getSolutionVersionArn() != null) {
            String solutionVersionArn = campaign.getSolutionVersionArn();
            jsonWriter.name("solutionVersionArn");
            jsonWriter.value(solutionVersionArn);
        }
        if (campaign.getMinProvisionedTPS() != null) {
            Integer minProvisionedTPS = campaign.getMinProvisionedTPS();
            jsonWriter.name("minProvisionedTPS");
            jsonWriter.value(minProvisionedTPS);
        }
        if (campaign.getStatus() != null) {
            String status = campaign.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (campaign.getFailureReason() != null) {
            String failureReason = campaign.getFailureReason();
            jsonWriter.name("failureReason");
            jsonWriter.value(failureReason);
        }
        if (campaign.getCreationDateTime() != null) {
            java.util.Date creationDateTime = campaign.getCreationDateTime();
            jsonWriter.name("creationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (campaign.getLastUpdatedDateTime() != null) {
            java.util.Date lastUpdatedDateTime = campaign.getLastUpdatedDateTime();
            jsonWriter.name("lastUpdatedDateTime");
            jsonWriter.value(lastUpdatedDateTime);
        }
        if (campaign.getLatestCampaignUpdate() != null) {
            CampaignUpdateSummary latestCampaignUpdate = campaign.getLatestCampaignUpdate();
            jsonWriter.name("latestCampaignUpdate");
            CampaignUpdateSummaryJsonMarshaller.getInstance().marshall(latestCampaignUpdate,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static CampaignJsonMarshaller instance;

    public static CampaignJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CampaignJsonMarshaller();
        return instance;
    }
}
