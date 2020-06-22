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
 * JSON marshaller for POJO SpotOptionsRequest
 */
class SpotOptionsRequestJsonMarshaller {

    public void marshall(SpotOptionsRequest spotOptionsRequest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (spotOptionsRequest.getAllocationStrategy() != null) {
            String allocationStrategy = spotOptionsRequest.getAllocationStrategy();
            jsonWriter.name("AllocationStrategy");
            jsonWriter.value(allocationStrategy);
        }
        if (spotOptionsRequest.getInstanceInterruptionBehavior() != null) {
            String instanceInterruptionBehavior = spotOptionsRequest
                    .getInstanceInterruptionBehavior();
            jsonWriter.name("InstanceInterruptionBehavior");
            jsonWriter.value(instanceInterruptionBehavior);
        }
        if (spotOptionsRequest.getInstancePoolsToUseCount() != null) {
            Integer instancePoolsToUseCount = spotOptionsRequest.getInstancePoolsToUseCount();
            jsonWriter.name("InstancePoolsToUseCount");
            jsonWriter.value(instancePoolsToUseCount);
        }
        if (spotOptionsRequest.getSingleInstanceType() != null) {
            Boolean singleInstanceType = spotOptionsRequest.getSingleInstanceType();
            jsonWriter.name("SingleInstanceType");
            jsonWriter.value(singleInstanceType);
        }
        if (spotOptionsRequest.getSingleAvailabilityZone() != null) {
            Boolean singleAvailabilityZone = spotOptionsRequest.getSingleAvailabilityZone();
            jsonWriter.name("SingleAvailabilityZone");
            jsonWriter.value(singleAvailabilityZone);
        }
        if (spotOptionsRequest.getMinTargetCapacity() != null) {
            Integer minTargetCapacity = spotOptionsRequest.getMinTargetCapacity();
            jsonWriter.name("MinTargetCapacity");
            jsonWriter.value(minTargetCapacity);
        }
        if (spotOptionsRequest.getMaxTotalPrice() != null) {
            String maxTotalPrice = spotOptionsRequest.getMaxTotalPrice();
            jsonWriter.name("MaxTotalPrice");
            jsonWriter.value(maxTotalPrice);
        }
        jsonWriter.endObject();
    }

    private static SpotOptionsRequestJsonMarshaller instance;

    public static SpotOptionsRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SpotOptionsRequestJsonMarshaller();
        return instance;
    }
}
