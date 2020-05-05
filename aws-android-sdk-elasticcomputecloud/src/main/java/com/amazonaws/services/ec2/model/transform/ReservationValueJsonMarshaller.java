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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ReservationValue
 */
class ReservationValueJsonMarshaller {

    public void marshall(ReservationValue reservationValue, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (reservationValue.getHourlyPrice() != null) {
            String hourlyPrice = reservationValue.getHourlyPrice();
            jsonWriter.name("HourlyPrice");
            jsonWriter.value(hourlyPrice);
        }
        if (reservationValue.getRemainingTotalValue() != null) {
            String remainingTotalValue = reservationValue.getRemainingTotalValue();
            jsonWriter.name("RemainingTotalValue");
            jsonWriter.value(remainingTotalValue);
        }
        if (reservationValue.getRemainingUpfrontValue() != null) {
            String remainingUpfrontValue = reservationValue.getRemainingUpfrontValue();
            jsonWriter.name("RemainingUpfrontValue");
            jsonWriter.value(remainingUpfrontValue);
        }
        jsonWriter.endObject();
    }

    private static ReservationValueJsonMarshaller instance;

    public static ReservationValueJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReservationValueJsonMarshaller();
        return instance;
    }
}
