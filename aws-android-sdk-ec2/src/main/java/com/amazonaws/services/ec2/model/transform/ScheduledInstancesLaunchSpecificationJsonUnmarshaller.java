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
 * JSON unmarshaller for POJO ScheduledInstancesLaunchSpecification
 */
class ScheduledInstancesLaunchSpecificationJsonUnmarshaller implements
        Unmarshaller<ScheduledInstancesLaunchSpecification, JsonUnmarshallerContext> {

    public ScheduledInstancesLaunchSpecification unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ScheduledInstancesLaunchSpecification scheduledInstancesLaunchSpecification = new ScheduledInstancesLaunchSpecification();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("BlockDeviceMappings")) {
                scheduledInstancesLaunchSpecification
                        .setBlockDeviceMappings(new ListUnmarshaller<ScheduledInstancesBlockDeviceMapping>(
                                ScheduledInstancesBlockDeviceMappingJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("EbsOptimized")) {
                scheduledInstancesLaunchSpecification.setEbsOptimized(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("IamInstanceProfile")) {
                scheduledInstancesLaunchSpecification
                        .setIamInstanceProfile(ScheduledInstancesIamInstanceProfileJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("ImageId")) {
                scheduledInstancesLaunchSpecification.setImageId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceType")) {
                scheduledInstancesLaunchSpecification.setInstanceType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("KernelId")) {
                scheduledInstancesLaunchSpecification.setKernelId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("KeyName")) {
                scheduledInstancesLaunchSpecification.setKeyName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Monitoring")) {
                scheduledInstancesLaunchSpecification
                        .setMonitoring(ScheduledInstancesMonitoringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("NetworkInterfaces")) {
                scheduledInstancesLaunchSpecification
                        .setNetworkInterfaces(new ListUnmarshaller<ScheduledInstancesNetworkInterface>(
                                ScheduledInstancesNetworkInterfaceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Placement")) {
                scheduledInstancesLaunchSpecification
                        .setPlacement(ScheduledInstancesPlacementJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("RamdiskId")) {
                scheduledInstancesLaunchSpecification.setRamdiskId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SecurityGroupIds")) {
                scheduledInstancesLaunchSpecification
                        .setSecurityGroupIds(new ListUnmarshaller<String>(StringJsonUnmarshaller
                                .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SubnetId")) {
                scheduledInstancesLaunchSpecification.setSubnetId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("UserData")) {
                scheduledInstancesLaunchSpecification.setUserData(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return scheduledInstancesLaunchSpecification;
    }

    private static ScheduledInstancesLaunchSpecificationJsonUnmarshaller instance;

    public static ScheduledInstancesLaunchSpecificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledInstancesLaunchSpecificationJsonUnmarshaller();
        return instance;
    }
}
