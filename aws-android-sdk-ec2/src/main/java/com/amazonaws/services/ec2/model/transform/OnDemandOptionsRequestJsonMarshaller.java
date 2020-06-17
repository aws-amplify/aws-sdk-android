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
 * JSON marshaller for POJO OnDemandOptionsRequest
 */
class OnDemandOptionsRequestJsonMarshaller {

    public void marshall(OnDemandOptionsRequest onDemandOptionsRequest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (onDemandOptionsRequest.getAllocationStrategy() != null) {
            String allocationStrategy = onDemandOptionsRequest.getAllocationStrategy();
            jsonWriter.name("AllocationStrategy");
            jsonWriter.value(allocationStrategy);
        }
        if (onDemandOptionsRequest.getCapacityReservationOptions() != null) {
            CapacityReservationOptionsRequest capacityReservationOptions = onDemandOptionsRequest
                    .getCapacityReservationOptions();
            jsonWriter.name("CapacityReservationOptions");
            CapacityReservationOptionsRequestJsonMarshaller.getInstance().marshall(
                    capacityReservationOptions, jsonWriter);
        }
        if (onDemandOptionsRequest.getSingleInstanceType() != null) {
            Boolean singleInstanceType = onDemandOptionsRequest.getSingleInstanceType();
            jsonWriter.name("SingleInstanceType");
            jsonWriter.value(singleInstanceType);
        }
        if (onDemandOptionsRequest.getSingleAvailabilityZone() != null) {
            Boolean singleAvailabilityZone = onDemandOptionsRequest.getSingleAvailabilityZone();
            jsonWriter.name("SingleAvailabilityZone");
            jsonWriter.value(singleAvailabilityZone);
        }
        if (onDemandOptionsRequest.getMinTargetCapacity() != null) {
            Integer minTargetCapacity = onDemandOptionsRequest.getMinTargetCapacity();
            jsonWriter.name("MinTargetCapacity");
            jsonWriter.value(minTargetCapacity);
        }
        if (onDemandOptionsRequest.getMaxTotalPrice() != null) {
            String maxTotalPrice = onDemandOptionsRequest.getMaxTotalPrice();
            jsonWriter.name("MaxTotalPrice");
            jsonWriter.value(maxTotalPrice);
        }
        jsonWriter.endObject();
    }

    private static OnDemandOptionsRequestJsonMarshaller instance;

    public static OnDemandOptionsRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OnDemandOptionsRequestJsonMarshaller();
        return instance;
    }
}
