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
 * JSON marshaller for POJO FleetLaunchTemplateOverrides
 */
class FleetLaunchTemplateOverridesJsonMarshaller {

    public void marshall(FleetLaunchTemplateOverrides fleetLaunchTemplateOverrides,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (fleetLaunchTemplateOverrides.getInstanceType() != null) {
            String instanceType = fleetLaunchTemplateOverrides.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (fleetLaunchTemplateOverrides.getMaxPrice() != null) {
            String maxPrice = fleetLaunchTemplateOverrides.getMaxPrice();
            jsonWriter.name("MaxPrice");
            jsonWriter.value(maxPrice);
        }
        if (fleetLaunchTemplateOverrides.getSubnetId() != null) {
            String subnetId = fleetLaunchTemplateOverrides.getSubnetId();
            jsonWriter.name("SubnetId");
            jsonWriter.value(subnetId);
        }
        if (fleetLaunchTemplateOverrides.getAvailabilityZone() != null) {
            String availabilityZone = fleetLaunchTemplateOverrides.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (fleetLaunchTemplateOverrides.getWeightedCapacity() != null) {
            Double weightedCapacity = fleetLaunchTemplateOverrides.getWeightedCapacity();
            jsonWriter.name("WeightedCapacity");
            jsonWriter.value(weightedCapacity);
        }
        if (fleetLaunchTemplateOverrides.getPriority() != null) {
            Double priority = fleetLaunchTemplateOverrides.getPriority();
            jsonWriter.name("Priority");
            jsonWriter.value(priority);
        }
        if (fleetLaunchTemplateOverrides.getPlacement() != null) {
            PlacementResponse placement = fleetLaunchTemplateOverrides.getPlacement();
            jsonWriter.name("Placement");
            PlacementResponseJsonMarshaller.getInstance().marshall(placement, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static FleetLaunchTemplateOverridesJsonMarshaller instance;

    public static FleetLaunchTemplateOverridesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FleetLaunchTemplateOverridesJsonMarshaller();
        return instance;
    }
}
