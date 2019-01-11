/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.autoscaling.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO LaunchConfiguration
 */
class LaunchConfigurationStaxMarshaller {

    public void marshall(LaunchConfiguration _launchConfiguration, Request<?> request,
            String _prefix) {
        String prefix;
        if (_launchConfiguration.getLaunchConfigurationName() != null) {
            prefix = _prefix + "LaunchConfigurationName";
            String launchConfigurationName = _launchConfiguration.getLaunchConfigurationName();
            request.addParameter(prefix, StringUtils.fromString(launchConfigurationName));
        }
        if (_launchConfiguration.getLaunchConfigurationARN() != null) {
            prefix = _prefix + "LaunchConfigurationARN";
            String launchConfigurationARN = _launchConfiguration.getLaunchConfigurationARN();
            request.addParameter(prefix, StringUtils.fromString(launchConfigurationARN));
        }
        if (_launchConfiguration.getImageId() != null) {
            prefix = _prefix + "ImageId";
            String imageId = _launchConfiguration.getImageId();
            request.addParameter(prefix, StringUtils.fromString(imageId));
        }
        if (_launchConfiguration.getKeyName() != null) {
            prefix = _prefix + "KeyName";
            String keyName = _launchConfiguration.getKeyName();
            request.addParameter(prefix, StringUtils.fromString(keyName));
        }
        if (_launchConfiguration.getSecurityGroups() != null) {
            prefix = _prefix + "SecurityGroups";
            java.util.List<String> securityGroups = _launchConfiguration.getSecurityGroups();
            int securityGroupsIndex = 1;
            String securityGroupsPrefix = prefix;
            for (String securityGroupsItem : securityGroups) {
                prefix = securityGroupsPrefix + ".member." + securityGroupsIndex;
                if (securityGroupsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(securityGroupsItem));
                }
                securityGroupsIndex++;
            }
            prefix = securityGroupsPrefix;
        }
        if (_launchConfiguration.getClassicLinkVPCId() != null) {
            prefix = _prefix + "ClassicLinkVPCId";
            String classicLinkVPCId = _launchConfiguration.getClassicLinkVPCId();
            request.addParameter(prefix, StringUtils.fromString(classicLinkVPCId));
        }
        if (_launchConfiguration.getClassicLinkVPCSecurityGroups() != null) {
            prefix = _prefix + "ClassicLinkVPCSecurityGroups";
            java.util.List<String> classicLinkVPCSecurityGroups = _launchConfiguration
                    .getClassicLinkVPCSecurityGroups();
            int classicLinkVPCSecurityGroupsIndex = 1;
            String classicLinkVPCSecurityGroupsPrefix = prefix;
            for (String classicLinkVPCSecurityGroupsItem : classicLinkVPCSecurityGroups) {
                prefix = classicLinkVPCSecurityGroupsPrefix + ".member."
                        + classicLinkVPCSecurityGroupsIndex;
                if (classicLinkVPCSecurityGroupsItem != null) {
                    request.addParameter(prefix,
                            StringUtils.fromString(classicLinkVPCSecurityGroupsItem));
                }
                classicLinkVPCSecurityGroupsIndex++;
            }
            prefix = classicLinkVPCSecurityGroupsPrefix;
        }
        if (_launchConfiguration.getUserData() != null) {
            prefix = _prefix + "UserData";
            String userData = _launchConfiguration.getUserData();
            request.addParameter(prefix, StringUtils.fromString(userData));
        }
        if (_launchConfiguration.getInstanceType() != null) {
            prefix = _prefix + "InstanceType";
            String instanceType = _launchConfiguration.getInstanceType();
            request.addParameter(prefix, StringUtils.fromString(instanceType));
        }
        if (_launchConfiguration.getKernelId() != null) {
            prefix = _prefix + "KernelId";
            String kernelId = _launchConfiguration.getKernelId();
            request.addParameter(prefix, StringUtils.fromString(kernelId));
        }
        if (_launchConfiguration.getRamdiskId() != null) {
            prefix = _prefix + "RamdiskId";
            String ramdiskId = _launchConfiguration.getRamdiskId();
            request.addParameter(prefix, StringUtils.fromString(ramdiskId));
        }
        if (_launchConfiguration.getBlockDeviceMappings() != null) {
            prefix = _prefix + "BlockDeviceMappings";
            java.util.List<BlockDeviceMapping> blockDeviceMappings = _launchConfiguration
                    .getBlockDeviceMappings();
            int blockDeviceMappingsIndex = 1;
            String blockDeviceMappingsPrefix = prefix;
            for (BlockDeviceMapping blockDeviceMappingsItem : blockDeviceMappings) {
                prefix = blockDeviceMappingsPrefix + ".member." + blockDeviceMappingsIndex;
                if (blockDeviceMappingsItem != null) {
                    BlockDeviceMappingStaxMarshaller.getInstance().marshall(
                            blockDeviceMappingsItem, request, prefix + ".");
                }
                blockDeviceMappingsIndex++;
            }
            prefix = blockDeviceMappingsPrefix;
        }
        if (_launchConfiguration.getInstanceMonitoring() != null) {
            prefix = _prefix + "InstanceMonitoring";
            InstanceMonitoring instanceMonitoring = _launchConfiguration.getInstanceMonitoring();
            InstanceMonitoringStaxMarshaller.getInstance().marshall(instanceMonitoring, request,
                    prefix + ".");
        }
        if (_launchConfiguration.getSpotPrice() != null) {
            prefix = _prefix + "SpotPrice";
            String spotPrice = _launchConfiguration.getSpotPrice();
            request.addParameter(prefix, StringUtils.fromString(spotPrice));
        }
        if (_launchConfiguration.getIamInstanceProfile() != null) {
            prefix = _prefix + "IamInstanceProfile";
            String iamInstanceProfile = _launchConfiguration.getIamInstanceProfile();
            request.addParameter(prefix, StringUtils.fromString(iamInstanceProfile));
        }
        if (_launchConfiguration.getCreatedTime() != null) {
            prefix = _prefix + "CreatedTime";
            java.util.Date createdTime = _launchConfiguration.getCreatedTime();
            request.addParameter(prefix, StringUtils.fromDate(createdTime));
        }
        if (_launchConfiguration.getEbsOptimized() != null) {
            prefix = _prefix + "EbsOptimized";
            Boolean ebsOptimized = _launchConfiguration.getEbsOptimized();
            request.addParameter(prefix, StringUtils.fromBoolean(ebsOptimized));
        }
        if (_launchConfiguration.getAssociatePublicIpAddress() != null) {
            prefix = _prefix + "AssociatePublicIpAddress";
            Boolean associatePublicIpAddress = _launchConfiguration.getAssociatePublicIpAddress();
            request.addParameter(prefix, StringUtils.fromBoolean(associatePublicIpAddress));
        }
        if (_launchConfiguration.getPlacementTenancy() != null) {
            prefix = _prefix + "PlacementTenancy";
            String placementTenancy = _launchConfiguration.getPlacementTenancy();
            request.addParameter(prefix, StringUtils.fromString(placementTenancy));
        }
    }

    private static LaunchConfigurationStaxMarshaller instance;

    public static LaunchConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new LaunchConfigurationStaxMarshaller();
        return instance;
    }
}
