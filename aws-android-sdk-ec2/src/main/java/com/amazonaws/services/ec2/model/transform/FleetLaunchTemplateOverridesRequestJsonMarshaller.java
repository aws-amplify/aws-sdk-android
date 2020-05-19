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
 * JSON marshaller for POJO FleetLaunchTemplateOverridesRequest
 */
class FleetLaunchTemplateOverridesRequestJsonMarshaller {

    public void marshall(FleetLaunchTemplateOverridesRequest fleetLaunchTemplateOverridesRequest,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (fleetLaunchTemplateOverridesRequest.getInstanceType() != null) {
            String instanceType = fleetLaunchTemplateOverridesRequest.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (fleetLaunchTemplateOverridesRequest.getMaxPrice() != null) {
            String maxPrice = fleetLaunchTemplateOverridesRequest.getMaxPrice();
            jsonWriter.name("MaxPrice");
            jsonWriter.value(maxPrice);
        }
        if (fleetLaunchTemplateOverridesRequest.getSubnetId() != null) {
            String subnetId = fleetLaunchTemplateOverridesRequest.getSubnetId();
            jsonWriter.name("SubnetId");
            jsonWriter.value(subnetId);
        }
        if (fleetLaunchTemplateOverridesRequest.getAvailabilityZone() != null) {
            String availabilityZone = fleetLaunchTemplateOverridesRequest.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (fleetLaunchTemplateOverridesRequest.getWeightedCapacity() != null) {
            Double weightedCapacity = fleetLaunchTemplateOverridesRequest.getWeightedCapacity();
            jsonWriter.name("WeightedCapacity");
            jsonWriter.value(weightedCapacity);
        }
        if (fleetLaunchTemplateOverridesRequest.getPriority() != null) {
            Double priority = fleetLaunchTemplateOverridesRequest.getPriority();
            jsonWriter.name("Priority");
            jsonWriter.value(priority);
        }
        if (fleetLaunchTemplateOverridesRequest.getPlacement() != null) {
            Placement placement = fleetLaunchTemplateOverridesRequest.getPlacement();
            jsonWriter.name("Placement");
            PlacementJsonMarshaller.getInstance().marshall(placement, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static FleetLaunchTemplateOverridesRequestJsonMarshaller instance;

    public static FleetLaunchTemplateOverridesRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FleetLaunchTemplateOverridesRequestJsonMarshaller();
        return instance;
    }
}
