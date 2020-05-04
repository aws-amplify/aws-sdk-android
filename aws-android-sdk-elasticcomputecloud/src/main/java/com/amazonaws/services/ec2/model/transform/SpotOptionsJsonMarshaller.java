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
 * JSON marshaller for POJO SpotOptions
 */
class SpotOptionsJsonMarshaller {

    public void marshall(SpotOptions spotOptions, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (spotOptions.getAllocationStrategy() != null) {
            String allocationStrategy = spotOptions.getAllocationStrategy();
            jsonWriter.name("AllocationStrategy");
            jsonWriter.value(allocationStrategy);
        }
        if (spotOptions.getInstanceInterruptionBehavior() != null) {
            String instanceInterruptionBehavior = spotOptions.getInstanceInterruptionBehavior();
            jsonWriter.name("InstanceInterruptionBehavior");
            jsonWriter.value(instanceInterruptionBehavior);
        }
        if (spotOptions.getInstancePoolsToUseCount() != null) {
            Integer instancePoolsToUseCount = spotOptions.getInstancePoolsToUseCount();
            jsonWriter.name("InstancePoolsToUseCount");
            jsonWriter.value(instancePoolsToUseCount);
        }
        if (spotOptions.getSingleInstanceType() != null) {
            Boolean singleInstanceType = spotOptions.getSingleInstanceType();
            jsonWriter.name("SingleInstanceType");
            jsonWriter.value(singleInstanceType);
        }
        if (spotOptions.getSingleAvailabilityZone() != null) {
            Boolean singleAvailabilityZone = spotOptions.getSingleAvailabilityZone();
            jsonWriter.name("SingleAvailabilityZone");
            jsonWriter.value(singleAvailabilityZone);
        }
        if (spotOptions.getMinTargetCapacity() != null) {
            Integer minTargetCapacity = spotOptions.getMinTargetCapacity();
            jsonWriter.name("MinTargetCapacity");
            jsonWriter.value(minTargetCapacity);
        }
        if (spotOptions.getMaxTotalPrice() != null) {
            String maxTotalPrice = spotOptions.getMaxTotalPrice();
            jsonWriter.name("MaxTotalPrice");
            jsonWriter.value(maxTotalPrice);
        }
        jsonWriter.endObject();
    }

    private static SpotOptionsJsonMarshaller instance;

    public static SpotOptionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SpotOptionsJsonMarshaller();
        return instance;
    }
}
