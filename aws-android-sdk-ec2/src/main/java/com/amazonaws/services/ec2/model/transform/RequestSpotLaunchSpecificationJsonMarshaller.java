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
 * JSON marshaller for POJO RequestSpotLaunchSpecification
 */
class RequestSpotLaunchSpecificationJsonMarshaller {

    public void marshall(RequestSpotLaunchSpecification requestSpotLaunchSpecification,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (requestSpotLaunchSpecification.getSecurityGroupIds() != null) {
            java.util.List<String> securityGroupIds = requestSpotLaunchSpecification
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
        if (requestSpotLaunchSpecification.getSecurityGroups() != null) {
            java.util.List<String> securityGroups = requestSpotLaunchSpecification
                    .getSecurityGroups();
            jsonWriter.name("SecurityGroups");
            jsonWriter.beginArray();
            for (String securityGroupsItem : securityGroups) {
                if (securityGroupsItem != null) {
                    jsonWriter.value(securityGroupsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (requestSpotLaunchSpecification.getAddressingType() != null) {
            String addressingType = requestSpotLaunchSpecification.getAddressingType();
            jsonWriter.name("AddressingType");
            jsonWriter.value(addressingType);
        }
        if (requestSpotLaunchSpecification.getBlockDeviceMappings() != null) {
            java.util.List<BlockDeviceMapping> blockDeviceMappings = requestSpotLaunchSpecification
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
        if (requestSpotLaunchSpecification.getEbsOptimized() != null) {
            Boolean ebsOptimized = requestSpotLaunchSpecification.getEbsOptimized();
            jsonWriter.name("EbsOptimized");
            jsonWriter.value(ebsOptimized);
        }
        if (requestSpotLaunchSpecification.getIamInstanceProfile() != null) {
            IamInstanceProfileSpecification iamInstanceProfile = requestSpotLaunchSpecification
                    .getIamInstanceProfile();
            jsonWriter.name("IamInstanceProfile");
            IamInstanceProfileSpecificationJsonMarshaller.getInstance().marshall(
                    iamInstanceProfile, jsonWriter);
        }
        if (requestSpotLaunchSpecification.getImageId() != null) {
            String imageId = requestSpotLaunchSpecification.getImageId();
            jsonWriter.name("ImageId");
            jsonWriter.value(imageId);
        }
        if (requestSpotLaunchSpecification.getInstanceType() != null) {
            String instanceType = requestSpotLaunchSpecification.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (requestSpotLaunchSpecification.getKernelId() != null) {
            String kernelId = requestSpotLaunchSpecification.getKernelId();
            jsonWriter.name("KernelId");
            jsonWriter.value(kernelId);
        }
        if (requestSpotLaunchSpecification.getKeyName() != null) {
            String keyName = requestSpotLaunchSpecification.getKeyName();
            jsonWriter.name("KeyName");
            jsonWriter.value(keyName);
        }
        if (requestSpotLaunchSpecification.getMonitoring() != null) {
            RunInstancesMonitoringEnabled monitoring = requestSpotLaunchSpecification
                    .getMonitoring();
            jsonWriter.name("Monitoring");
            RunInstancesMonitoringEnabledJsonMarshaller.getInstance().marshall(monitoring,
                    jsonWriter);
        }
        if (requestSpotLaunchSpecification.getNetworkInterfaces() != null) {
            java.util.List<InstanceNetworkInterfaceSpecification> networkInterfaces = requestSpotLaunchSpecification
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
        if (requestSpotLaunchSpecification.getPlacement() != null) {
            SpotPlacement placement = requestSpotLaunchSpecification.getPlacement();
            jsonWriter.name("Placement");
            SpotPlacementJsonMarshaller.getInstance().marshall(placement, jsonWriter);
        }
        if (requestSpotLaunchSpecification.getRamdiskId() != null) {
            String ramdiskId = requestSpotLaunchSpecification.getRamdiskId();
            jsonWriter.name("RamdiskId");
            jsonWriter.value(ramdiskId);
        }
        if (requestSpotLaunchSpecification.getSubnetId() != null) {
            String subnetId = requestSpotLaunchSpecification.getSubnetId();
            jsonWriter.name("SubnetId");
            jsonWriter.value(subnetId);
        }
        if (requestSpotLaunchSpecification.getUserData() != null) {
            String userData = requestSpotLaunchSpecification.getUserData();
            jsonWriter.name("UserData");
            jsonWriter.value(userData);
        }
        jsonWriter.endObject();
    }

    private static RequestSpotLaunchSpecificationJsonMarshaller instance;

    public static RequestSpotLaunchSpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RequestSpotLaunchSpecificationJsonMarshaller();
        return instance;
    }
}
