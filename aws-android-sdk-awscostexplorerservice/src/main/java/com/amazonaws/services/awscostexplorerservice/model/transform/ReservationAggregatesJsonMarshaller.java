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
 * JSON marshaller for POJO ReservationAggregates
 */
class ReservationAggregatesJsonMarshaller {

    public void marshall(ReservationAggregates reservationAggregates, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (reservationAggregates.getUtilizationPercentage() != null) {
            String utilizationPercentage = reservationAggregates.getUtilizationPercentage();
            jsonWriter.name("UtilizationPercentage");
            jsonWriter.value(utilizationPercentage);
        }
        if (reservationAggregates.getUtilizationPercentageInUnits() != null) {
            String utilizationPercentageInUnits = reservationAggregates
                    .getUtilizationPercentageInUnits();
            jsonWriter.name("UtilizationPercentageInUnits");
            jsonWriter.value(utilizationPercentageInUnits);
        }
        if (reservationAggregates.getPurchasedHours() != null) {
            String purchasedHours = reservationAggregates.getPurchasedHours();
            jsonWriter.name("PurchasedHours");
            jsonWriter.value(purchasedHours);
        }
        if (reservationAggregates.getPurchasedUnits() != null) {
            String purchasedUnits = reservationAggregates.getPurchasedUnits();
            jsonWriter.name("PurchasedUnits");
            jsonWriter.value(purchasedUnits);
        }
        if (reservationAggregates.getTotalActualHours() != null) {
            String totalActualHours = reservationAggregates.getTotalActualHours();
            jsonWriter.name("TotalActualHours");
            jsonWriter.value(totalActualHours);
        }
        if (reservationAggregates.getTotalActualUnits() != null) {
            String totalActualUnits = reservationAggregates.getTotalActualUnits();
            jsonWriter.name("TotalActualUnits");
            jsonWriter.value(totalActualUnits);
        }
        if (reservationAggregates.getUnusedHours() != null) {
            String unusedHours = reservationAggregates.getUnusedHours();
            jsonWriter.name("UnusedHours");
            jsonWriter.value(unusedHours);
        }
        if (reservationAggregates.getUnusedUnits() != null) {
            String unusedUnits = reservationAggregates.getUnusedUnits();
            jsonWriter.name("UnusedUnits");
            jsonWriter.value(unusedUnits);
        }
        if (reservationAggregates.getOnDemandCostOfRIHoursUsed() != null) {
            String onDemandCostOfRIHoursUsed = reservationAggregates.getOnDemandCostOfRIHoursUsed();
            jsonWriter.name("OnDemandCostOfRIHoursUsed");
            jsonWriter.value(onDemandCostOfRIHoursUsed);
        }
        if (reservationAggregates.getNetRISavings() != null) {
            String netRISavings = reservationAggregates.getNetRISavings();
            jsonWriter.name("NetRISavings");
            jsonWriter.value(netRISavings);
        }
        if (reservationAggregates.getTotalPotentialRISavings() != null) {
            String totalPotentialRISavings = reservationAggregates.getTotalPotentialRISavings();
            jsonWriter.name("TotalPotentialRISavings");
            jsonWriter.value(totalPotentialRISavings);
        }
        if (reservationAggregates.getAmortizedUpfrontFee() != null) {
            String amortizedUpfrontFee = reservationAggregates.getAmortizedUpfrontFee();
            jsonWriter.name("AmortizedUpfrontFee");
            jsonWriter.value(amortizedUpfrontFee);
        }
        if (reservationAggregates.getAmortizedRecurringFee() != null) {
            String amortizedRecurringFee = reservationAggregates.getAmortizedRecurringFee();
            jsonWriter.name("AmortizedRecurringFee");
            jsonWriter.value(amortizedRecurringFee);
        }
        if (reservationAggregates.getTotalAmortizedFee() != null) {
            String totalAmortizedFee = reservationAggregates.getTotalAmortizedFee();
            jsonWriter.name("TotalAmortizedFee");
            jsonWriter.value(totalAmortizedFee);
        }
        jsonWriter.endObject();
    }

    private static ReservationAggregatesJsonMarshaller instance;

    public static ReservationAggregatesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReservationAggregatesJsonMarshaller();
        return instance;
    }
}
