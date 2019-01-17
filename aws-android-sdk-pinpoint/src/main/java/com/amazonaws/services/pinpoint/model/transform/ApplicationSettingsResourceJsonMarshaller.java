/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ApplicationSettingsResource
 */
class ApplicationSettingsResourceJsonMarshaller {

    public void marshall(ApplicationSettingsResource applicationSettingsResource,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (applicationSettingsResource.getApplicationId() != null) {
            String applicationId = applicationSettingsResource.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (applicationSettingsResource.getCampaignHook() != null) {
            CampaignHook campaignHook = applicationSettingsResource.getCampaignHook();
            jsonWriter.name("CampaignHook");
            CampaignHookJsonMarshaller.getInstance().marshall(campaignHook, jsonWriter);
        }
        if (applicationSettingsResource.getLastModifiedDate() != null) {
            String lastModifiedDate = applicationSettingsResource.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (applicationSettingsResource.getLimits() != null) {
            CampaignLimits limits = applicationSettingsResource.getLimits();
            jsonWriter.name("Limits");
            CampaignLimitsJsonMarshaller.getInstance().marshall(limits, jsonWriter);
        }
        if (applicationSettingsResource.getQuietTime() != null) {
            QuietTime quietTime = applicationSettingsResource.getQuietTime();
            jsonWriter.name("QuietTime");
            QuietTimeJsonMarshaller.getInstance().marshall(quietTime, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ApplicationSettingsResourceJsonMarshaller instance;

    public static ApplicationSettingsResourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ApplicationSettingsResourceJsonMarshaller();
        return instance;
    }
}
