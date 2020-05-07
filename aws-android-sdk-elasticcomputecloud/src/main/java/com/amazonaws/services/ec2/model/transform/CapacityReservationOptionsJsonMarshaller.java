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
 * JSON marshaller for POJO CapacityReservationOptions
 */
class CapacityReservationOptionsJsonMarshaller {

    public void marshall(CapacityReservationOptions capacityReservationOptions,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (capacityReservationOptions.getUsageStrategy() != null) {
            String usageStrategy = capacityReservationOptions.getUsageStrategy();
            jsonWriter.name("UsageStrategy");
            jsonWriter.value(usageStrategy);
        }
        jsonWriter.endObject();
    }

    private static CapacityReservationOptionsJsonMarshaller instance;

    public static CapacityReservationOptionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CapacityReservationOptionsJsonMarshaller();
        return instance;
    }
}
