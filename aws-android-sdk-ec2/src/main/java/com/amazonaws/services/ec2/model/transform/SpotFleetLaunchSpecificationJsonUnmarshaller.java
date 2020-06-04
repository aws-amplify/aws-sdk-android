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
 * JSON unmarshaller for POJO SpotFleetLaunchSpecification
 */
class SpotFleetLaunchSpecificationJsonUnmarshaller implements
        Unmarshaller<SpotFleetLaunchSpecification, JsonUnmarshallerContext> {

    public SpotFleetLaunchSpecification unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SpotFleetLaunchSpecification spotFleetLaunchSpecification = new SpotFleetLaunchSpecification();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("SecurityGroups")) {
                spotFleetLaunchSpecification
                        .setSecurityGroups(new ListUnmarshaller<GroupIdentifier>(
                                GroupIdentifierJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AddressingType")) {
                spotFleetLaunchSpecification.setAddressingType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BlockDeviceMappings")) {
                spotFleetLaunchSpecification
                        .setBlockDeviceMappings(new ListUnmarshaller<BlockDeviceMapping>(
                                BlockDeviceMappingJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("EbsOptimized")) {
                spotFleetLaunchSpecification.setEbsOptimized(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IamInstanceProfile")) {
                spotFleetLaunchSpecification
                        .setIamInstanceProfile(IamInstanceProfileSpecificationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("ImageId")) {
                spotFleetLaunchSpecification.setImageId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceType")) {
                spotFleetLaunchSpecification.setInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KernelId")) {
                spotFleetLaunchSpecification.setKernelId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KeyName")) {
                spotFleetLaunchSpecification.setKeyName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Monitoring")) {
                spotFleetLaunchSpecification.setMonitoring(SpotFleetMonitoringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("NetworkInterfaces")) {
                spotFleetLaunchSpecification
                        .setNetworkInterfaces(new ListUnmarshaller<InstanceNetworkInterfaceSpecification>(
                                InstanceNetworkInterfaceSpecificationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Placement")) {
                spotFleetLaunchSpecification.setPlacement(SpotPlacementJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RamdiskId")) {
                spotFleetLaunchSpecification.setRamdiskId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SpotPrice")) {
                spotFleetLaunchSpecification.setSpotPrice(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubnetId")) {
                spotFleetLaunchSpecification.setSubnetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UserData")) {
                spotFleetLaunchSpecification.setUserData(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WeightedCapacity")) {
                spotFleetLaunchSpecification.setWeightedCapacity(DoubleJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TagSpecifications")) {
                spotFleetLaunchSpecification
                        .setTagSpecifications(new ListUnmarshaller<SpotFleetTagSpecification>(
                                SpotFleetTagSpecificationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return spotFleetLaunchSpecification;
    }

    private static SpotFleetLaunchSpecificationJsonUnmarshaller instance;

    public static SpotFleetLaunchSpecificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SpotFleetLaunchSpecificationJsonUnmarshaller();
        return instance;
    }
}
