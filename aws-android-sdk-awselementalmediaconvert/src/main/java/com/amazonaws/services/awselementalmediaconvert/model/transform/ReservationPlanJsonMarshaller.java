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

package com.amazonaws.services.awselementalmediaconvert.model.transform;

import com.amazonaws.services.awselementalmediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ReservationPlan
 */
class ReservationPlanJsonMarshaller {

    public void marshall(ReservationPlan reservationPlan, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (reservationPlan.getCommitment() != null) {
            String commitment = reservationPlan.getCommitment();
            jsonWriter.name("Commitment");
            jsonWriter.value(commitment);
        }
        if (reservationPlan.getExpiresAt() != null) {
            java.util.Date expiresAt = reservationPlan.getExpiresAt();
            jsonWriter.name("ExpiresAt");
            jsonWriter.value(expiresAt);
        }
        if (reservationPlan.getPurchasedAt() != null) {
            java.util.Date purchasedAt = reservationPlan.getPurchasedAt();
            jsonWriter.name("PurchasedAt");
            jsonWriter.value(purchasedAt);
        }
        if (reservationPlan.getRenewalType() != null) {
            String renewalType = reservationPlan.getRenewalType();
            jsonWriter.name("RenewalType");
            jsonWriter.value(renewalType);
        }
        if (reservationPlan.getReservedSlots() != null) {
            Integer reservedSlots = reservationPlan.getReservedSlots();
            jsonWriter.name("ReservedSlots");
            jsonWriter.value(reservedSlots);
        }
        if (reservationPlan.getStatus() != null) {
            String status = reservationPlan.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        jsonWriter.endObject();
    }

    private static ReservationPlanJsonMarshaller instance;

    public static ReservationPlanJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReservationPlanJsonMarshaller();
        return instance;
    }
}
