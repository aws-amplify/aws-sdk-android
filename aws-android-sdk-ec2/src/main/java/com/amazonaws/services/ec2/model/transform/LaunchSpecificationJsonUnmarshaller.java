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
 * JSON unmarshaller for POJO LaunchSpecification
 */
class LaunchSpecificationJsonUnmarshaller implements
        Unmarshaller<LaunchSpecification, JsonUnmarshallerContext> {

    public LaunchSpecification unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        LaunchSpecification launchSpecification = new LaunchSpecification();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("UserData")) {
                launchSpecification.setUserData(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SecurityGroups")) {
                launchSpecification.setSecurityGroups(new ListUnmarshaller<GroupIdentifier>(
                        GroupIdentifierJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AddressingType")) {
                launchSpecification.setAddressingType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BlockDeviceMappings")) {
                launchSpecification
                        .setBlockDeviceMappings(new ListUnmarshaller<BlockDeviceMapping>(
                                BlockDeviceMappingJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("EbsOptimized")) {
                launchSpecification.setEbsOptimized(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IamInstanceProfile")) {
                launchSpecification
                        .setIamInstanceProfile(IamInstanceProfileSpecificationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("ImageId")) {
                launchSpecification.setImageId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceType")) {
                launchSpecification.setInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KernelId")) {
                launchSpecification.setKernelId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KeyName")) {
                launchSpecification.setKeyName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NetworkInterfaces")) {
                launchSpecification
                        .setNetworkInterfaces(new ListUnmarshaller<InstanceNetworkInterfaceSpecification>(
                                InstanceNetworkInterfaceSpecificationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Placement")) {
                launchSpecification.setPlacement(SpotPlacementJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RamdiskId")) {
                launchSpecification.setRamdiskId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubnetId")) {
                launchSpecification.setSubnetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Monitoring")) {
                launchSpecification.setMonitoring(RunInstancesMonitoringEnabledJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return launchSpecification;
    }

    private static LaunchSpecificationJsonUnmarshaller instance;

    public static LaunchSpecificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LaunchSpecificationJsonUnmarshaller();
        return instance;
    }
}
