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

package com.amazonaws.services.mediaconvert.model.transform;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ReservationPlan
 */
class ReservationPlanJsonUnmarshaller implements
        Unmarshaller<ReservationPlan, JsonUnmarshallerContext> {

    public ReservationPlan unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ReservationPlan reservationPlan = new ReservationPlan();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Commitment")) {
                reservationPlan.setCommitment(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExpiresAt")) {
                reservationPlan.setExpiresAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PurchasedAt")) {
                reservationPlan.setPurchasedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RenewalType")) {
                reservationPlan.setRenewalType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReservedSlots")) {
                reservationPlan.setReservedSlots(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                reservationPlan.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return reservationPlan;
    }

    private static ReservationPlanJsonUnmarshaller instance;

    public static ReservationPlanJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservationPlanJsonUnmarshaller();
        return instance;
    }
}
