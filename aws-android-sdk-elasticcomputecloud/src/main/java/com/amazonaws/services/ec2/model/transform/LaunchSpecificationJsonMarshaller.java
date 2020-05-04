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
 * JSON marshaller for POJO LaunchSpecification
 */
class LaunchSpecificationJsonMarshaller {

    public void marshall(LaunchSpecification launchSpecification, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (launchSpecification.getUserData() != null) {
            String userData = launchSpecification.getUserData();
            jsonWriter.name("UserData");
            jsonWriter.value(userData);
        }
        if (launchSpecification.getSecurityGroups() != null) {
            java.util.List<GroupIdentifier> securityGroups = launchSpecification
                    .getSecurityGroups();
            jsonWriter.name("SecurityGroups");
            jsonWriter.beginArray();
            for (GroupIdentifier securityGroupsItem : securityGroups) {
                if (securityGroupsItem != null) {
                    GroupIdentifierJsonMarshaller.getInstance().marshall(securityGroupsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (launchSpecification.getAddressingType() != null) {
            String addressingType = launchSpecification.getAddressingType();
            jsonWriter.name("AddressingType");
            jsonWriter.value(addressingType);
        }
        if (launchSpecification.getBlockDeviceMappings() != null) {
            java.util.List<BlockDeviceMapping> blockDeviceMappings = launchSpecification
                    .getBlockDeviceMappings();
            jsonWriter.name("BlockDeviceMappings");
            jsonWriter.beginArray();
            for (BlockDeviceMapping blockDeviceMappingsItem : blockDeviceMappings) {
                if (blockDeviceMappingsItem != null) {
                    BlockDeviceMappingJsonMarshaller.getInstance().marshall(
                            blockDeviceMappingsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (launchSpecification.getEbsOptimized() != null) {
            Boolean ebsOptimized = launchSpecification.getEbsOptimized();
            jsonWriter.name("EbsOptimized");
            jsonWriter.value(ebsOptimized);
        }
        if (launchSpecification.getIamInstanceProfile() != null) {
            IamInstanceProfileSpecification iamInstanceProfile = launchSpecification
                    .getIamInstanceProfile();
            jsonWriter.name("IamInstanceProfile");
            IamInstanceProfileSpecificationJsonMarshaller.getInstance().marshall(
                    iamInstanceProfile, jsonWriter);
        }
        if (launchSpecification.getImageId() != null) {
            String imageId = launchSpecification.getImageId();
            jsonWriter.name("ImageId");
            jsonWriter.value(imageId);
        }
        if (launchSpecification.getInstanceType() != null) {
            String instanceType = launchSpecification.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (launchSpecification.getKernelId() != null) {
            String kernelId = launchSpecification.getKernelId();
            jsonWriter.name("KernelId");
            jsonWriter.value(kernelId);
        }
        if (launchSpecification.getKeyName() != null) {
            String keyName = launchSpecification.getKeyName();
            jsonWriter.name("KeyName");
            jsonWriter.value(keyName);
        }
        if (launchSpecification.getNetworkInterfaces() != null) {
            java.util.List<InstanceNetworkInterfaceSpecification> networkInterfaces = launchSpecification
                    .getNetworkInterfaces();
            jsonWriter.name("NetworkInterfaces");
            jsonWriter.beginArray();
            for (InstanceNetworkInterfaceSpecification networkInterfacesItem : networkInterfaces) {
                if (networkInterfacesItem != null) {
                    InstanceNetworkInterfaceSpecificationJsonMarshaller.getInstance().marshall(
                            networkInterfacesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (launchSpecification.getPlacement() != null) {
            SpotPlacement placement = launchSpecification.getPlacement();
            jsonWriter.name("Placement");
            SpotPlacementJsonMarshaller.getInstance().marshall(placement, jsonWriter);
        }
        if (launchSpecification.getRamdiskId() != null) {
            String ramdiskId = launchSpecification.getRamdiskId();
            jsonWriter.name("RamdiskId");
            jsonWriter.value(ramdiskId);
        }
        if (launchSpecification.getSubnetId() != null) {
            String subnetId = launchSpecification.getSubnetId();
            jsonWriter.name("SubnetId");
            jsonWriter.value(subnetId);
        }
        if (launchSpecification.getMonitoring() != null) {
            RunInstancesMonitoringEnabled monitoring = launchSpecification.getMonitoring();
            jsonWriter.name("Monitoring");
            RunInstancesMonitoringEnabledJsonMarshaller.getInstance().marshall(monitoring,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static LaunchSpecificationJsonMarshaller instance;

    public static LaunchSpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LaunchSpecificationJsonMarshaller();
        return instance;
    }
}
