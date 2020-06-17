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
 * JSON marshaller for POJO LaunchTemplateOverrides
 */
class LaunchTemplateOverridesJsonMarshaller {

    public void marshall(LaunchTemplateOverrides launchTemplateOverrides, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (launchTemplateOverrides.getInstanceType() != null) {
            String instanceType = launchTemplateOverrides.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (launchTemplateOverrides.getSpotPrice() != null) {
            String spotPrice = launchTemplateOverrides.getSpotPrice();
            jsonWriter.name("SpotPrice");
            jsonWriter.value(spotPrice);
        }
        if (launchTemplateOverrides.getSubnetId() != null) {
            String subnetId = launchTemplateOverrides.getSubnetId();
            jsonWriter.name("SubnetId");
            jsonWriter.value(subnetId);
        }
        if (launchTemplateOverrides.getAvailabilityZone() != null) {
            String availabilityZone = launchTemplateOverrides.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (launchTemplateOverrides.getWeightedCapacity() != null) {
            Double weightedCapacity = launchTemplateOverrides.getWeightedCapacity();
            jsonWriter.name("WeightedCapacity");
            jsonWriter.value(weightedCapacity);
        }
        if (launchTemplateOverrides.getPriority() != null) {
            Double priority = launchTemplateOverrides.getPriority();
            jsonWriter.name("Priority");
            jsonWriter.value(priority);
        }
        jsonWriter.endObject();
    }

    private static LaunchTemplateOverridesJsonMarshaller instance;

    public static LaunchTemplateOverridesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateOverridesJsonMarshaller();
        return instance;
    }
}
