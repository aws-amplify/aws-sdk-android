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
 * JSON marshaller for POJO TreatmentResource
 */
class TreatmentResourceJsonMarshaller {

    public void marshall(TreatmentResource treatmentResource, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (treatmentResource.getId() != null) {
            String id = treatmentResource.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (treatmentResource.getMessageConfiguration() != null) {
            MessageConfiguration messageConfiguration = treatmentResource.getMessageConfiguration();
            jsonWriter.name("MessageConfiguration");
            MessageConfigurationJsonMarshaller.getInstance().marshall(messageConfiguration,
                    jsonWriter);
        }
        if (treatmentResource.getSchedule() != null) {
            Schedule schedule = treatmentResource.getSchedule();
            jsonWriter.name("Schedule");
            ScheduleJsonMarshaller.getInstance().marshall(schedule, jsonWriter);
        }
        if (treatmentResource.getSizePercent() != null) {
            Integer sizePercent = treatmentResource.getSizePercent();
            jsonWriter.name("SizePercent");
            jsonWriter.value(sizePercent);
        }
        if (treatmentResource.getState() != null) {
            CampaignState state = treatmentResource.getState();
            jsonWriter.name("State");
            CampaignStateJsonMarshaller.getInstance().marshall(state, jsonWriter);
        }
        if (treatmentResource.getTreatmentDescription() != null) {
            String treatmentDescription = treatmentResource.getTreatmentDescription();
            jsonWriter.name("TreatmentDescription");
            jsonWriter.value(treatmentDescription);
        }
        if (treatmentResource.getTreatmentName() != null) {
            String treatmentName = treatmentResource.getTreatmentName();
            jsonWriter.name("TreatmentName");
            jsonWriter.value(treatmentName);
        }
        jsonWriter.endObject();
    }

    private static TreatmentResourceJsonMarshaller instance;

    public static TreatmentResourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TreatmentResourceJsonMarshaller();
        return instance;
    }
}
