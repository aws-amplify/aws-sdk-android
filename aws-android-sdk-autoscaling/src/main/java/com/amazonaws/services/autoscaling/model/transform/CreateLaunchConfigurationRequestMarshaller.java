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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for CreateLaunchConfigurationRequest
 */
public class CreateLaunchConfigurationRequestMarshaller implements
        Marshaller<Request<CreateLaunchConfigurationRequest>, CreateLaunchConfigurationRequest> {

    public Request<CreateLaunchConfigurationRequest> marshall(
            CreateLaunchConfigurationRequest createLaunchConfigurationRequest) {
        if (createLaunchConfigurationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateLaunchConfigurationRequest)");
        }

        Request<CreateLaunchConfigurationRequest> request = new DefaultRequest<CreateLaunchConfigurationRequest>(
                createLaunchConfigurationRequest, "AmazonAutoScaling");
        request.addParameter("Action", "CreateLaunchConfiguration");
        request.addParameter("Version", "2011-01-01");

        String prefix;
        if (createLaunchConfigurationRequest.getLaunchConfigurationName() != null) {
            prefix = "LaunchConfigurationName";
            String launchConfigurationName = createLaunchConfigurationRequest
                    .getLaunchConfigurationName();
            request.addParameter(prefix, StringUtils.fromString(launchConfigurationName));
        }
        if (createLaunchConfigurationRequest.getImageId() != null) {
            prefix = "ImageId";
            String imageId = createLaunchConfigurationRequest.getImageId();
            request.addParameter(prefix, StringUtils.fromString(imageId));
        }
        if (createLaunchConfigurationRequest.getKeyName() != null) {
            prefix = "KeyName";
            String keyName = createLaunchConfigurationRequest.getKeyName();
            request.addParameter(prefix, StringUtils.fromString(keyName));
        }
        if (createLaunchConfigurationRequest.getSecurityGroups() != null) {
            prefix = "SecurityGroups";
            java.util.List<String> securityGroups = createLaunchConfigurationRequest
                    .getSecurityGroups();
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
        if (createLaunchConfigurationRequest.getClassicLinkVPCId() != null) {
            prefix = "ClassicLinkVPCId";
            String classicLinkVPCId = createLaunchConfigurationRequest.getClassicLinkVPCId();
            request.addParameter(prefix, StringUtils.fromString(classicLinkVPCId));
        }
        if (createLaunchConfigurationRequest.getClassicLinkVPCSecurityGroups() != null) {
            prefix = "ClassicLinkVPCSecurityGroups";
            java.util.List<String> classicLinkVPCSecurityGroups = createLaunchConfigurationRequest
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
        if (createLaunchConfigurationRequest.getUserData() != null) {
            prefix = "UserData";
            String userData = createLaunchConfigurationRequest.getUserData();
            request.addParameter(prefix, StringUtils.fromString(userData));
        }
        if (createLaunchConfigurationRequest.getInstanceId() != null) {
            prefix = "InstanceId";
            String instanceId = createLaunchConfigurationRequest.getInstanceId();
            request.addParameter(prefix, StringUtils.fromString(instanceId));
        }
        if (createLaunchConfigurationRequest.getInstanceType() != null) {
            prefix = "InstanceType";
            String instanceType = createLaunchConfigurationRequest.getInstanceType();
            request.addParameter(prefix, StringUtils.fromString(instanceType));
        }
        if (createLaunchConfigurationRequest.getKernelId() != null) {
            prefix = "KernelId";
            String kernelId = createLaunchConfigurationRequest.getKernelId();
            request.addParameter(prefix, StringUtils.fromString(kernelId));
        }
        if (createLaunchConfigurationRequest.getRamdiskId() != null) {
            prefix = "RamdiskId";
            String ramdiskId = createLaunchConfigurationRequest.getRamdiskId();
            request.addParameter(prefix, StringUtils.fromString(ramdiskId));
        }
        if (createLaunchConfigurationRequest.getBlockDeviceMappings() != null) {
            prefix = "BlockDeviceMappings";
            java.util.List<BlockDeviceMapping> blockDeviceMappings = createLaunchConfigurationRequest
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
        if (createLaunchConfigurationRequest.getInstanceMonitoring() != null) {
            prefix = "InstanceMonitoring";
            InstanceMonitoring instanceMonitoring = createLaunchConfigurationRequest
                    .getInstanceMonitoring();
            InstanceMonitoringStaxMarshaller.getInstance().marshall(instanceMonitoring, request,
                    prefix + ".");
        }
        if (createLaunchConfigurationRequest.getSpotPrice() != null) {
            prefix = "SpotPrice";
            String spotPrice = createLaunchConfigurationRequest.getSpotPrice();
            request.addParameter(prefix, StringUtils.fromString(spotPrice));
        }
        if (createLaunchConfigurationRequest.getIamInstanceProfile() != null) {
            prefix = "IamInstanceProfile";
            String iamInstanceProfile = createLaunchConfigurationRequest.getIamInstanceProfile();
            request.addParameter(prefix, StringUtils.fromString(iamInstanceProfile));
        }
        if (createLaunchConfigurationRequest.getEbsOptimized() != null) {
            prefix = "EbsOptimized";
            Boolean ebsOptimized = createLaunchConfigurationRequest.getEbsOptimized();
            request.addParameter(prefix, StringUtils.fromBoolean(ebsOptimized));
        }
        if (createLaunchConfigurationRequest.getAssociatePublicIpAddress() != null) {
            prefix = "AssociatePublicIpAddress";
            Boolean associatePublicIpAddress = createLaunchConfigurationRequest
                    .getAssociatePublicIpAddress();
            request.addParameter(prefix, StringUtils.fromBoolean(associatePublicIpAddress));
        }
        if (createLaunchConfigurationRequest.getPlacementTenancy() != null) {
            prefix = "PlacementTenancy";
            String placementTenancy = createLaunchConfigurationRequest.getPlacementTenancy();
            request.addParameter(prefix, StringUtils.fromString(placementTenancy));
        }

        return request;
    }
}
