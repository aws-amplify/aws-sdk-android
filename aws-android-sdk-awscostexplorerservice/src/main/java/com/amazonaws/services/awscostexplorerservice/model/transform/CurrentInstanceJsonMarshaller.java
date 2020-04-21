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

package com.amazonaws.services.awscostexplorerservice.model.transform;

import com.amazonaws.services.awscostexplorerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CurrentInstance
 */
class CurrentInstanceJsonMarshaller {

    public void marshall(CurrentInstance currentInstance, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (currentInstance.getResourceId() != null) {
            String resourceId = currentInstance.getResourceId();
            jsonWriter.name("ResourceId");
            jsonWriter.value(resourceId);
        }
        if (currentInstance.getTags() != null) {
            java.util.List<TagValues> tags = currentInstance.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (TagValues tagsItem : tags) {
                if (tagsItem != null) {
                    TagValuesJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (currentInstance.getResourceDetails() != null) {
            ResourceDetails resourceDetails = currentInstance.getResourceDetails();
            jsonWriter.name("ResourceDetails");
            ResourceDetailsJsonMarshaller.getInstance().marshall(resourceDetails, jsonWriter);
        }
        if (currentInstance.getResourceUtilization() != null) {
            ResourceUtilization resourceUtilization = currentInstance.getResourceUtilization();
            jsonWriter.name("ResourceUtilization");
            ResourceUtilizationJsonMarshaller.getInstance().marshall(resourceUtilization,
                    jsonWriter);
        }
        if (currentInstance.getReservationCoveredHoursInLookbackPeriod() != null) {
            String reservationCoveredHoursInLookbackPeriod = currentInstance
                    .getReservationCoveredHoursInLookbackPeriod();
            jsonWriter.name("ReservationCoveredHoursInLookbackPeriod");
            jsonWriter.value(reservationCoveredHoursInLookbackPeriod);
        }
        if (currentInstance.getSavingsPlansCoveredHoursInLookbackPeriod() != null) {
            String savingsPlansCoveredHoursInLookbackPeriod = currentInstance
                    .getSavingsPlansCoveredHoursInLookbackPeriod();
            jsonWriter.name("SavingsPlansCoveredHoursInLookbackPeriod");
            jsonWriter.value(savingsPlansCoveredHoursInLookbackPeriod);
        }
        if (currentInstance.getOnDemandHoursInLookbackPeriod() != null) {
            String onDemandHoursInLookbackPeriod = currentInstance
                    .getOnDemandHoursInLookbackPeriod();
            jsonWriter.name("OnDemandHoursInLookbackPeriod");
            jsonWriter.value(onDemandHoursInLookbackPeriod);
        }
        if (currentInstance.getTotalRunningHoursInLookbackPeriod() != null) {
            String totalRunningHoursInLookbackPeriod = currentInstance
                    .getTotalRunningHoursInLookbackPeriod();
            jsonWriter.name("TotalRunningHoursInLookbackPeriod");
            jsonWriter.value(totalRunningHoursInLookbackPeriod);
        }
        if (currentInstance.getMonthlyCost() != null) {
            String monthlyCost = currentInstance.getMonthlyCost();
            jsonWriter.name("MonthlyCost");
            jsonWriter.value(monthlyCost);
        }
        if (currentInstance.getCurrencyCode() != null) {
            String currencyCode = currentInstance.getCurrencyCode();
            jsonWriter.name("CurrencyCode");
            jsonWriter.value(currencyCode);
        }
        jsonWriter.endObject();
    }

    private static CurrentInstanceJsonMarshaller instance;

    public static CurrentInstanceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CurrentInstanceJsonMarshaller();
        return instance;
    }
}
