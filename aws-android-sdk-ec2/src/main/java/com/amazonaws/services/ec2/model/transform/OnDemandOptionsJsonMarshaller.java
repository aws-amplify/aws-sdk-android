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
 * JSON marshaller for POJO OnDemandOptions
 */
class OnDemandOptionsJsonMarshaller {

    public void marshall(OnDemandOptions onDemandOptions, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (onDemandOptions.getAllocationStrategy() != null) {
            String allocationStrategy = onDemandOptions.getAllocationStrategy();
            jsonWriter.name("AllocationStrategy");
            jsonWriter.value(allocationStrategy);
        }
        if (onDemandOptions.getCapacityReservationOptions() != null) {
            CapacityReservationOptions capacityReservationOptions = onDemandOptions
                    .getCapacityReservationOptions();
            jsonWriter.name("CapacityReservationOptions");
            CapacityReservationOptionsJsonMarshaller.getInstance().marshall(
                    capacityReservationOptions, jsonWriter);
        }
        if (onDemandOptions.getSingleInstanceType() != null) {
            Boolean singleInstanceType = onDemandOptions.getSingleInstanceType();
            jsonWriter.name("SingleInstanceType");
            jsonWriter.value(singleInstanceType);
        }
        if (onDemandOptions.getSingleAvailabilityZone() != null) {
            Boolean singleAvailabilityZone = onDemandOptions.getSingleAvailabilityZone();
            jsonWriter.name("SingleAvailabilityZone");
            jsonWriter.value(singleAvailabilityZone);
        }
        if (onDemandOptions.getMinTargetCapacity() != null) {
            Integer minTargetCapacity = onDemandOptions.getMinTargetCapacity();
            jsonWriter.name("MinTargetCapacity");
            jsonWriter.value(minTargetCapacity);
        }
        if (onDemandOptions.getMaxTotalPrice() != null) {
            String maxTotalPrice = onDemandOptions.getMaxTotalPrice();
            jsonWriter.name("MaxTotalPrice");
            jsonWriter.value(maxTotalPrice);
        }
        jsonWriter.endObject();
    }

    private static OnDemandOptionsJsonMarshaller instance;

    public static OnDemandOptionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OnDemandOptionsJsonMarshaller();
        return instance;
    }
}
