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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO FleetLaunchTemplateOverridesRequest
 */
class FleetLaunchTemplateOverridesRequestJsonUnmarshaller implements
        Unmarshaller<FleetLaunchTemplateOverridesRequest, JsonUnmarshallerContext> {

    public FleetLaunchTemplateOverridesRequest unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        FleetLaunchTemplateOverridesRequest fleetLaunchTemplateOverridesRequest = new FleetLaunchTemplateOverridesRequest();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("InstanceType")) {
                fleetLaunchTemplateOverridesRequest.setInstanceType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxPrice")) {
                fleetLaunchTemplateOverridesRequest.setMaxPrice(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubnetId")) {
                fleetLaunchTemplateOverridesRequest.setSubnetId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailabilityZone")) {
                fleetLaunchTemplateOverridesRequest.setAvailabilityZone(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("WeightedCapacity")) {
                fleetLaunchTemplateOverridesRequest.setWeightedCapacity(DoubleJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Priority")) {
                fleetLaunchTemplateOverridesRequest.setPriority(DoubleJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Placement")) {
                fleetLaunchTemplateOverridesRequest.setPlacement(PlacementJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return fleetLaunchTemplateOverridesRequest;
    }

    private static FleetLaunchTemplateOverridesRequestJsonUnmarshaller instance;

    public static FleetLaunchTemplateOverridesRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FleetLaunchTemplateOverridesRequestJsonUnmarshaller();
        return instance;
    }
}
