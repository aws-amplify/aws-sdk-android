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
 * JSON marshaller for POJO TargetReservationValue
 */
class TargetReservationValueJsonMarshaller {

    public void marshall(TargetReservationValue targetReservationValue, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (targetReservationValue.getReservationValue() != null) {
            ReservationValue reservationValue = targetReservationValue.getReservationValue();
            jsonWriter.name("ReservationValue");
            ReservationValueJsonMarshaller.getInstance().marshall(reservationValue, jsonWriter);
        }
        if (targetReservationValue.getTargetConfiguration() != null) {
            TargetConfiguration targetConfiguration = targetReservationValue
                    .getTargetConfiguration();
            jsonWriter.name("TargetConfiguration");
            TargetConfigurationJsonMarshaller.getInstance().marshall(targetConfiguration,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TargetReservationValueJsonMarshaller instance;

    public static TargetReservationValueJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TargetReservationValueJsonMarshaller();
        return instance;
    }
}
