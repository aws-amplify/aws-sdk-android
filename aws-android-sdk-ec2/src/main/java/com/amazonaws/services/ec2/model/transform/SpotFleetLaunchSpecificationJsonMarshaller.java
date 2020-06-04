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
 * JSON marshaller for POJO SpotFleetLaunchSpecification
 */
class SpotFleetLaunchSpecificationJsonMarshaller {

    public void marshall(SpotFleetLaunchSpecification spotFleetLaunchSpecification,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (spotFleetLaunchSpecification.getSecurityGroups() != null) {
            java.util.List<GroupIdentifier> securityGroups = spotFleetLaunchSpecification
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
        if (spotFleetLaunchSpecification.getAddressingType() != null) {
            String addressingType = spotFleetLaunchSpecification.getAddressingType();
            jsonWriter.name("AddressingType");
            jsonWriter.value(addressingType);
        }
        if (spotFleetLaunchSpecification.getBlockDeviceMappings() != null) {
            java.util.List<BlockDeviceMapping> blockDeviceMappings = spotFleetLaunchSpecification
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
        if (spotFleetLaunchSpecification.getEbsOptimized() != null) {
            Boolean ebsOptimized = spotFleetLaunchSpecification.getEbsOptimized();
            jsonWriter.name("EbsOptimized");
            jsonWriter.value(ebsOptimized);
        }
        if (spotFleetLaunchSpecification.getIamInstanceProfile() != null) {
            IamInstanceProfileSpecification iamInstanceProfile = spotFleetLaunchSpecification
                    .getIamInstanceProfile();
            jsonWriter.name("IamInstanceProfile");
            IamInstanceProfileSpecificationJsonMarshaller.getInstance().marshall(
                    iamInstanceProfile, jsonWriter);
        }
        if (spotFleetLaunchSpecification.getImageId() != null) {
            String imageId = spotFleetLaunchSpecification.getImageId();
            jsonWriter.name("ImageId");
            jsonWriter.value(imageId);
        }
        if (spotFleetLaunchSpecification.getInstanceType() != null) {
            String instanceType = spotFleetLaunchSpecification.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (spotFleetLaunchSpecification.getKernelId() != null) {
            String kernelId = spotFleetLaunchSpecification.getKernelId();
            jsonWriter.name("KernelId");
            jsonWriter.value(kernelId);
        }
        if (spotFleetLaunchSpecification.getKeyName() != null) {
            String keyName = spotFleetLaunchSpecification.getKeyName();
            jsonWriter.name("KeyName");
            jsonWriter.value(keyName);
        }
        if (spotFleetLaunchSpecification.getMonitoring() != null) {
            SpotFleetMonitoring monitoring = spotFleetLaunchSpecification.getMonitoring();
            jsonWriter.name("Monitoring");
            SpotFleetMonitoringJsonMarshaller.getInstance().marshall(monitoring, jsonWriter);
        }
        if (spotFleetLaunchSpecification.getNetworkInterfaces() != null) {
            java.util.List<InstanceNetworkInterfaceSpecification> networkInterfaces = spotFleetLaunchSpecification
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
        if (spotFleetLaunchSpecification.getPlacement() != null) {
            SpotPlacement placement = spotFleetLaunchSpecification.getPlacement();
            jsonWriter.name("Placement");
            SpotPlacementJsonMarshaller.getInstance().marshall(placement, jsonWriter);
        }
        if (spotFleetLaunchSpecification.getRamdiskId() != null) {
            String ramdiskId = spotFleetLaunchSpecification.getRamdiskId();
            jsonWriter.name("RamdiskId");
            jsonWriter.value(ramdiskId);
        }
        if (spotFleetLaunchSpecification.getSpotPrice() != null) {
            String spotPrice = spotFleetLaunchSpecification.getSpotPrice();
            jsonWriter.name("SpotPrice");
            jsonWriter.value(spotPrice);
        }
        if (spotFleetLaunchSpecification.getSubnetId() != null) {
            String subnetId = spotFleetLaunchSpecification.getSubnetId();
            jsonWriter.name("SubnetId");
            jsonWriter.value(subnetId);
        }
        if (spotFleetLaunchSpecification.getUserData() != null) {
            String userData = spotFleetLaunchSpecification.getUserData();
            jsonWriter.name("UserData");
            jsonWriter.value(userData);
        }
        if (spotFleetLaunchSpecification.getWeightedCapacity() != null) {
            Double weightedCapacity = spotFleetLaunchSpecification.getWeightedCapacity();
            jsonWriter.name("WeightedCapacity");
            jsonWriter.value(weightedCapacity);
        }
        if (spotFleetLaunchSpecification.getTagSpecifications() != null) {
            java.util.List<SpotFleetTagSpecification> tagSpecifications = spotFleetLaunchSpecification
                    .getTagSpecifications();
            jsonWriter.name("TagSpecifications");
            jsonWriter.beginArray();
            for (SpotFleetTagSpecification tagSpecificationsItem : tagSpecifications) {
                if (tagSpecificationsItem != null) {
                    SpotFleetTagSpecificationJsonMarshaller.getInstance().marshall(
                            tagSpecificationsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static SpotFleetLaunchSpecificationJsonMarshaller instance;

    public static SpotFleetLaunchSpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SpotFleetLaunchSpecificationJsonMarshaller();
        return instance;
    }
}
