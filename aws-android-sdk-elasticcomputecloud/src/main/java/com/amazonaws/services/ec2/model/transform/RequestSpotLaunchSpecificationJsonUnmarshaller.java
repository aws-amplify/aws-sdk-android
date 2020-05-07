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
 * JSON unmarshaller for POJO RequestSpotLaunchSpecification
 */
class RequestSpotLaunchSpecificationJsonUnmarshaller implements
        Unmarshaller<RequestSpotLaunchSpecification, JsonUnmarshallerContext> {

    public RequestSpotLaunchSpecification unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RequestSpotLaunchSpecification requestSpotLaunchSpecification = new RequestSpotLaunchSpecification();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("SecurityGroupIds")) {
                requestSpotLaunchSpecification.setSecurityGroupIds(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SecurityGroups")) {
                requestSpotLaunchSpecification.setSecurityGroups(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AddressingType")) {
                requestSpotLaunchSpecification.setAddressingType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("BlockDeviceMappings")) {
                requestSpotLaunchSpecification
                        .setBlockDeviceMappings(new ListUnmarshaller<BlockDeviceMapping>(
                                BlockDeviceMappingJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("EbsOptimized")) {
                requestSpotLaunchSpecification.setEbsOptimized(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("IamInstanceProfile")) {
                requestSpotLaunchSpecification
                        .setIamInstanceProfile(IamInstanceProfileSpecificationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("ImageId")) {
                requestSpotLaunchSpecification.setImageId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceType")) {
                requestSpotLaunchSpecification.setInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KernelId")) {
                requestSpotLaunchSpecification.setKernelId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KeyName")) {
                requestSpotLaunchSpecification.setKeyName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Monitoring")) {
                requestSpotLaunchSpecification
                        .setMonitoring(RunInstancesMonitoringEnabledJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("NetworkInterfaces")) {
                requestSpotLaunchSpecification
                        .setNetworkInterfaces(new ListUnmarshaller<InstanceNetworkInterfaceSpecification>(
                                InstanceNetworkInterfaceSpecificationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Placement")) {
                requestSpotLaunchSpecification.setPlacement(SpotPlacementJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RamdiskId")) {
                requestSpotLaunchSpecification.setRamdiskId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubnetId")) {
                requestSpotLaunchSpecification.setSubnetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UserData")) {
                requestSpotLaunchSpecification.setUserData(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return requestSpotLaunchSpecification;
    }

    private static RequestSpotLaunchSpecificationJsonUnmarshaller instance;

    public static RequestSpotLaunchSpecificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RequestSpotLaunchSpecificationJsonUnmarshaller();
        return instance;
    }
}
