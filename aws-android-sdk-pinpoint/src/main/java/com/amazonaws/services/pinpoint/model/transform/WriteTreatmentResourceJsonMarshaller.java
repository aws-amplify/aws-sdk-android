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
 * JSON marshaller for POJO WriteTreatmentResource
 */
class WriteTreatmentResourceJsonMarshaller {

    public void marshall(WriteTreatmentResource writeTreatmentResource, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (writeTreatmentResource.getMessageConfiguration() != null) {
            MessageConfiguration messageConfiguration = writeTreatmentResource
                    .getMessageConfiguration();
            jsonWriter.name("MessageConfiguration");
            MessageConfigurationJsonMarshaller.getInstance().marshall(messageConfiguration,
                    jsonWriter);
        }
        if (writeTreatmentResource.getSchedule() != null) {
            Schedule schedule = writeTreatmentResource.getSchedule();
            jsonWriter.name("Schedule");
            ScheduleJsonMarshaller.getInstance().marshall(schedule, jsonWriter);
        }
        if (writeTreatmentResource.getSizePercent() != null) {
            Integer sizePercent = writeTreatmentResource.getSizePercent();
            jsonWriter.name("SizePercent");
            jsonWriter.value(sizePercent);
        }
        if (writeTreatmentResource.getTreatmentDescription() != null) {
            String treatmentDescription = writeTreatmentResource.getTreatmentDescription();
            jsonWriter.name("TreatmentDescription");
            jsonWriter.value(treatmentDescription);
        }
        if (writeTreatmentResource.getTreatmentName() != null) {
            String treatmentName = writeTreatmentResource.getTreatmentName();
            jsonWriter.name("TreatmentName");
            jsonWriter.value(treatmentName);
        }
        jsonWriter.endObject();
    }

    private static WriteTreatmentResourceJsonMarshaller instance;

    public static WriteTreatmentResourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WriteTreatmentResourceJsonMarshaller();
        return instance;
    }
}
