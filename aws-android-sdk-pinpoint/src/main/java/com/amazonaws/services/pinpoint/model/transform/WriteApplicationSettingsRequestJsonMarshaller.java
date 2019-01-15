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
 * JSON marshaller for POJO WriteApplicationSettingsRequest
 */
class WriteApplicationSettingsRequestJsonMarshaller {

    public void marshall(WriteApplicationSettingsRequest writeApplicationSettingsRequest,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (writeApplicationSettingsRequest.getCampaignHook() != null) {
            CampaignHook campaignHook = writeApplicationSettingsRequest.getCampaignHook();
            jsonWriter.name("CampaignHook");
            CampaignHookJsonMarshaller.getInstance().marshall(campaignHook, jsonWriter);
        }
        if (writeApplicationSettingsRequest.getCloudWatchMetricsEnabled() != null) {
            Boolean cloudWatchMetricsEnabled = writeApplicationSettingsRequest
                    .getCloudWatchMetricsEnabled();
            jsonWriter.name("CloudWatchMetricsEnabled");
            jsonWriter.value(cloudWatchMetricsEnabled);
        }
        if (writeApplicationSettingsRequest.getLimits() != null) {
            CampaignLimits limits = writeApplicationSettingsRequest.getLimits();
            jsonWriter.name("Limits");
            CampaignLimitsJsonMarshaller.getInstance().marshall(limits, jsonWriter);
        }
        if (writeApplicationSettingsRequest.getQuietTime() != null) {
            QuietTime quietTime = writeApplicationSettingsRequest.getQuietTime();
            jsonWriter.name("QuietTime");
            QuietTimeJsonMarshaller.getInstance().marshall(quietTime, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static WriteApplicationSettingsRequestJsonMarshaller instance;

    public static WriteApplicationSettingsRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WriteApplicationSettingsRequestJsonMarshaller();
        return instance;
    }
}
