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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ReservationAggregates
 */
class ReservationAggregatesJsonUnmarshaller implements
        Unmarshaller<ReservationAggregates, JsonUnmarshallerContext> {

    public ReservationAggregates unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ReservationAggregates reservationAggregates = new ReservationAggregates();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("UtilizationPercentage")) {
                reservationAggregates.setUtilizationPercentage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UtilizationPercentageInUnits")) {
                reservationAggregates.setUtilizationPercentageInUnits(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PurchasedHours")) {
                reservationAggregates.setPurchasedHours(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PurchasedUnits")) {
                reservationAggregates.setPurchasedUnits(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TotalActualHours")) {
                reservationAggregates.setTotalActualHours(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TotalActualUnits")) {
                reservationAggregates.setTotalActualUnits(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UnusedHours")) {
                reservationAggregates.setUnusedHours(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UnusedUnits")) {
                reservationAggregates.setUnusedUnits(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OnDemandCostOfRIHoursUsed")) {
                reservationAggregates.setOnDemandCostOfRIHoursUsed(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("NetRISavings")) {
                reservationAggregates.setNetRISavings(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TotalPotentialRISavings")) {
                reservationAggregates.setTotalPotentialRISavings(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AmortizedUpfrontFee")) {
                reservationAggregates.setAmortizedUpfrontFee(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AmortizedRecurringFee")) {
                reservationAggregates.setAmortizedRecurringFee(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TotalAmortizedFee")) {
                reservationAggregates.setTotalAmortizedFee(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return reservationAggregates;
    }

    private static ReservationAggregatesJsonUnmarshaller instance;

    public static ReservationAggregatesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservationAggregatesJsonUnmarshaller();
        return instance;
    }
}
