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
 * JSON marshaller for POJO ScheduledInstancesLaunchSpecification
 */
class ScheduledInstancesLaunchSpecificationJsonMarshaller {

    public void marshall(
            ScheduledInstancesLaunchSpecification scheduledInstancesLaunchSpecification,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (scheduledInstancesLaunchSpecification.getBlockDeviceMappings() != null) {
            java.util.List<ScheduledInstancesBlockDeviceMapping> blockDeviceMappings = scheduledInstancesLaunchSpecification
                    .getBlockDeviceMappings();
            jsonWriter.name("BlockDeviceMappings");
            jsonWriter.beginArray();
            for (ScheduledInstancesBlockDeviceMapping blockDeviceMappingsItem : blockDeviceMappings) {
                if (blockDeviceMappingsItem != null) {
                    ScheduledInstancesBlockDeviceMappingJsonMarshaller.getInstance().marshall(
                            blockDeviceMappingsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (scheduledInstancesLaunchSpecification.getEbsOptimized() != null) {
            Boolean ebsOptimized = scheduledInstancesLaunchSpecification.getEbsOptimized();
            jsonWriter.name("EbsOptimized");
            jsonWriter.value(ebsOptimized);
        }
        if (scheduledInstancesLaunchSpecification.getIamInstanceProfile() != null) {
            ScheduledInstancesIamInstanceProfile iamInstanceProfile = scheduledInstancesLaunchSpecification
                    .getIamInstanceProfile();
            jsonWriter.name("IamInstanceProfile");
            ScheduledInstancesIamInstanceProfileJsonMarshaller.getInstance().marshall(
                    iamInstanceProfile, jsonWriter);
        }
        if (scheduledInstancesLaunchSpecification.getImageId() != null) {
            String imageId = scheduledInstancesLaunchSpecification.getImageId();
            jsonWriter.name("ImageId");
            jsonWriter.value(imageId);
        }
        if (scheduledInstancesLaunchSpecification.getInstanceType() != null) {
            String instanceType = scheduledInstancesLaunchSpecification.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (scheduledInstancesLaunchSpecification.getKernelId() != null) {
            String kernelId = scheduledInstancesLaunchSpecification.getKernelId();
            jsonWriter.name("KernelId");
            jsonWriter.value(kernelId);
        }
        if (scheduledInstancesLaunchSpecification.getKeyName() != null) {
            String keyName = scheduledInstancesLaunchSpecification.getKeyName();
            jsonWriter.name("KeyName");
            jsonWriter.value(keyName);
        }
        if (scheduledInstancesLaunchSpecification.getMonitoring() != null) {
            ScheduledInstancesMonitoring monitoring = scheduledInstancesLaunchSpecification
                    .getMonitoring();
            jsonWriter.name("Monitoring");
            ScheduledInstancesMonitoringJsonMarshaller.getInstance().marshall(monitoring,
                    jsonWriter);
        }
        if (scheduledInstancesLaunchSpecification.getNetworkInterfaces() != null) {
            java.util.List<ScheduledInstancesNetworkInterface> networkInterfaces = scheduledInstancesLaunchSpecification
                    .getNetworkInterfaces();
            jsonWriter.name("NetworkInterfaces");
            jsonWriter.beginArray();
            for (ScheduledInstancesNetworkInterface networkInterfacesItem : networkInterfaces) {
                if (networkInterfacesItem != null) {
                    ScheduledInstancesNetworkInterfaceJsonMarshaller.getInstance().marshall(
                            networkInterfacesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (scheduledInstancesLaunchSpecification.getPlacement() != null) {
            ScheduledInstancesPlacement placement = scheduledInstancesLaunchSpecification
                    .getPlacement();
            jsonWriter.name("Placement");
            ScheduledInstancesPlacementJsonMarshaller.getInstance().marshall(placement, jsonWriter);
        }
        if (scheduledInstancesLaunchSpecification.getRamdiskId() != null) {
            String ramdiskId = scheduledInstancesLaunchSpecification.getRamdiskId();
            jsonWriter.name("RamdiskId");
            jsonWriter.value(ramdiskId);
        }
        if (scheduledInstancesLaunchSpecification.getSecurityGroupIds() != null) {
            java.util.List<String> securityGroupIds = scheduledInstancesLaunchSpecification
                    .getSecurityGroupIds();
            jsonWriter.name("SecurityGroupIds");
            jsonWriter.beginArray();
            for (String securityGroupIdsItem : securityGroupIds) {
                if (securityGroupIdsItem != null) {
                    jsonWriter.value(securityGroupIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (scheduledInstancesLaunchSpecification.getSubnetId() != null) {
            String subnetId = scheduledInstancesLaunchSpecification.getSubnetId();
            jsonWriter.name("SubnetId");
            jsonWriter.value(subnetId);
        }
        if (scheduledInstancesLaunchSpecification.getUserData() != null) {
            String userData = scheduledInstancesLaunchSpecification.getUserData();
            jsonWriter.name("UserData");
            jsonWriter.value(userData);
        }
        jsonWriter.endObject();
    }

    private static ScheduledInstancesLaunchSpecificationJsonMarshaller instance;

    public static ScheduledInstancesLaunchSpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledInstancesLaunchSpecificationJsonMarshaller();
        return instance;
    }
}
