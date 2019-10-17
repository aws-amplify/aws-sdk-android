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
 * JSON marshaller for POJO WriteCampaignRequest
 */
class WriteCampaignRequestJsonMarshaller {

    public void marshall(WriteCampaignRequest writeCampaignRequest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (writeCampaignRequest.getAdditionalTreatments() != null) {
            java.util.List<WriteTreatmentResource> additionalTreatments = writeCampaignRequest
                    .getAdditionalTreatments();
            jsonWriter.name("AdditionalTreatments");
            jsonWriter.beginArray();
            for (WriteTreatmentResource additionalTreatmentsItem : additionalTreatments) {
                if (additionalTreatmentsItem != null) {
                    WriteTreatmentResourceJsonMarshaller.getInstance().marshall(
                            additionalTreatmentsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (writeCampaignRequest.getDescription() != null) {
            String description = writeCampaignRequest.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (writeCampaignRequest.getHoldoutPercent() != null) {
            Integer holdoutPercent = writeCampaignRequest.getHoldoutPercent();
            jsonWriter.name("HoldoutPercent");
            jsonWriter.value(holdoutPercent);
        }
        if (writeCampaignRequest.getHook() != null) {
            CampaignHook hook = writeCampaignRequest.getHook();
            jsonWriter.name("Hook");
            CampaignHookJsonMarshaller.getInstance().marshall(hook, jsonWriter);
        }
        if (writeCampaignRequest.getIsPaused() != null) {
            Boolean isPaused = writeCampaignRequest.getIsPaused();
            jsonWriter.name("IsPaused");
            jsonWriter.value(isPaused);
        }
        if (writeCampaignRequest.getLimits() != null) {
            CampaignLimits limits = writeCampaignRequest.getLimits();
            jsonWriter.name("Limits");
            CampaignLimitsJsonMarshaller.getInstance().marshall(limits, jsonWriter);
        }
        if (writeCampaignRequest.getMessageConfiguration() != null) {
            MessageConfiguration messageConfiguration = writeCampaignRequest
                    .getMessageConfiguration();
            jsonWriter.name("MessageConfiguration");
            MessageConfigurationJsonMarshaller.getInstance().marshall(messageConfiguration,
                    jsonWriter);
        }
        if (writeCampaignRequest.getName() != null) {
            String name = writeCampaignRequest.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (writeCampaignRequest.getSchedule() != null) {
            Schedule schedule = writeCampaignRequest.getSchedule();
            jsonWriter.name("Schedule");
            ScheduleJsonMarshaller.getInstance().marshall(schedule, jsonWriter);
        }
        if (writeCampaignRequest.getSegmentId() != null) {
            String segmentId = writeCampaignRequest.getSegmentId();
            jsonWriter.name("SegmentId");
            jsonWriter.value(segmentId);
        }
        if (writeCampaignRequest.getSegmentVersion() != null) {
            Integer segmentVersion = writeCampaignRequest.getSegmentVersion();
            jsonWriter.name("SegmentVersion");
            jsonWriter.value(segmentVersion);
        }
        if (writeCampaignRequest.getTreatmentDescription() != null) {
            String treatmentDescription = writeCampaignRequest.getTreatmentDescription();
            jsonWriter.name("TreatmentDescription");
            jsonWriter.value(treatmentDescription);
        }
        if (writeCampaignRequest.getTreatmentName() != null) {
            String treatmentName = writeCampaignRequest.getTreatmentName();
            jsonWriter.name("TreatmentName");
            jsonWriter.value(treatmentName);
        }
        jsonWriter.endObject();
    }

    private static WriteCampaignRequestJsonMarshaller instance;

    public static WriteCampaignRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WriteCampaignRequestJsonMarshaller();
        return instance;
    }
}
