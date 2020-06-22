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
 * JSON marshaller for POJO RequestLaunchTemplateData
 */
class RequestLaunchTemplateDataJsonMarshaller {

    public void marshall(RequestLaunchTemplateData requestLaunchTemplateData,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (requestLaunchTemplateData.getKernelId() != null) {
            String kernelId = requestLaunchTemplateData.getKernelId();
            jsonWriter.name("KernelId");
            jsonWriter.value(kernelId);
        }
        if (requestLaunchTemplateData.getEbsOptimized() != null) {
            Boolean ebsOptimized = requestLaunchTemplateData.getEbsOptimized();
            jsonWriter.name("EbsOptimized");
            jsonWriter.value(ebsOptimized);
        }
        if (requestLaunchTemplateData.getIamInstanceProfile() != null) {
            LaunchTemplateIamInstanceProfileSpecificationRequest iamInstanceProfile = requestLaunchTemplateData
                    .getIamInstanceProfile();
            jsonWriter.name("IamInstanceProfile");
            LaunchTemplateIamInstanceProfileSpecificationRequestJsonMarshaller.getInstance()
                    .marshall(iamInstanceProfile, jsonWriter);
        }
        if (requestLaunchTemplateData.getBlockDeviceMappings() != null) {
            java.util.List<LaunchTemplateBlockDeviceMappingRequest> blockDeviceMappings = requestLaunchTemplateData
                    .getBlockDeviceMappings();
            jsonWriter.name("BlockDeviceMappings");
            jsonWriter.beginArray();
            for (LaunchTemplateBlockDeviceMappingRequest blockDeviceMappingsItem : blockDeviceMappings) {
                if (blockDeviceMappingsItem != null) {
                    LaunchTemplateBlockDeviceMappingRequestJsonMarshaller.getInstance().marshall(
                            blockDeviceMappingsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (requestLaunchTemplateData.getNetworkInterfaces() != null) {
            java.util.List<LaunchTemplateInstanceNetworkInterfaceSpecificationRequest> networkInterfaces = requestLaunchTemplateData
                    .getNetworkInterfaces();
            jsonWriter.name("NetworkInterfaces");
            jsonWriter.beginArray();
            for (LaunchTemplateInstanceNetworkInterfaceSpecificationRequest networkInterfacesItem : networkInterfaces) {
                if (networkInterfacesItem != null) {
                    LaunchTemplateInstanceNetworkInterfaceSpecificationRequestJsonMarshaller
                            .getInstance().marshall(networkInterfacesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (requestLaunchTemplateData.getImageId() != null) {
            String imageId = requestLaunchTemplateData.getImageId();
            jsonWriter.name("ImageId");
            jsonWriter.value(imageId);
        }
        if (requestLaunchTemplateData.getInstanceType() != null) {
            String instanceType = requestLaunchTemplateData.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (requestLaunchTemplateData.getKeyName() != null) {
            String keyName = requestLaunchTemplateData.getKeyName();
            jsonWriter.name("KeyName");
            jsonWriter.value(keyName);
        }
        if (requestLaunchTemplateData.getMonitoring() != null) {
            LaunchTemplatesMonitoringRequest monitoring = requestLaunchTemplateData.getMonitoring();
            jsonWriter.name("Monitoring");
            LaunchTemplatesMonitoringRequestJsonMarshaller.getInstance().marshall(monitoring,
                    jsonWriter);
        }
        if (requestLaunchTemplateData.getPlacement() != null) {
            LaunchTemplatePlacementRequest placement = requestLaunchTemplateData.getPlacement();
            jsonWriter.name("Placement");
            LaunchTemplatePlacementRequestJsonMarshaller.getInstance().marshall(placement,
                    jsonWriter);
        }
        if (requestLaunchTemplateData.getRamDiskId() != null) {
            String ramDiskId = requestLaunchTemplateData.getRamDiskId();
            jsonWriter.name("RamDiskId");
            jsonWriter.value(ramDiskId);
        }
        if (requestLaunchTemplateData.getDisableApiTermination() != null) {
            Boolean disableApiTermination = requestLaunchTemplateData.getDisableApiTermination();
            jsonWriter.name("DisableApiTermination");
            jsonWriter.value(disableApiTermination);
        }
        if (requestLaunchTemplateData.getInstanceInitiatedShutdownBehavior() != null) {
            String instanceInitiatedShutdownBehavior = requestLaunchTemplateData
                    .getInstanceInitiatedShutdownBehavior();
            jsonWriter.name("InstanceInitiatedShutdownBehavior");
            jsonWriter.value(instanceInitiatedShutdownBehavior);
        }
        if (requestLaunchTemplateData.getUserData() != null) {
            String userData = requestLaunchTemplateData.getUserData();
            jsonWriter.name("UserData");
            jsonWriter.value(userData);
        }
        if (requestLaunchTemplateData.getTagSpecifications() != null) {
            java.util.List<LaunchTemplateTagSpecificationRequest> tagSpecifications = requestLaunchTemplateData
                    .getTagSpecifications();
            jsonWriter.name("TagSpecifications");
            jsonWriter.beginArray();
            for (LaunchTemplateTagSpecificationRequest tagSpecificationsItem : tagSpecifications) {
                if (tagSpecificationsItem != null) {
                    LaunchTemplateTagSpecificationRequestJsonMarshaller.getInstance().marshall(
                            tagSpecificationsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (requestLaunchTemplateData.getElasticGpuSpecifications() != null) {
            java.util.List<ElasticGpuSpecification> elasticGpuSpecifications = requestLaunchTemplateData
                    .getElasticGpuSpecifications();
            jsonWriter.name("ElasticGpuSpecifications");
            jsonWriter.beginArray();
            for (ElasticGpuSpecification elasticGpuSpecificationsItem : elasticGpuSpecifications) {
                if (elasticGpuSpecificationsItem != null) {
                    ElasticGpuSpecificationJsonMarshaller.getInstance().marshall(
                            elasticGpuSpecificationsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (requestLaunchTemplateData.getElasticInferenceAccelerators() != null) {
            java.util.List<LaunchTemplateElasticInferenceAccelerator> elasticInferenceAccelerators = requestLaunchTemplateData
                    .getElasticInferenceAccelerators();
            jsonWriter.name("ElasticInferenceAccelerators");
            jsonWriter.beginArray();
            for (LaunchTemplateElasticInferenceAccelerator elasticInferenceAcceleratorsItem : elasticInferenceAccelerators) {
                if (elasticInferenceAcceleratorsItem != null) {
                    LaunchTemplateElasticInferenceAcceleratorJsonMarshaller.getInstance().marshall(
                            elasticInferenceAcceleratorsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (requestLaunchTemplateData.getSecurityGroupIds() != null) {
            java.util.List<String> securityGroupIds = requestLaunchTemplateData
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
        if (requestLaunchTemplateData.getSecurityGroups() != null) {
            java.util.List<String> securityGroups = requestLaunchTemplateData.getSecurityGroups();
            jsonWriter.name("SecurityGroups");
            jsonWriter.beginArray();
            for (String securityGroupsItem : securityGroups) {
                if (securityGroupsItem != null) {
                    jsonWriter.value(securityGroupsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (requestLaunchTemplateData.getInstanceMarketOptions() != null) {
            LaunchTemplateInstanceMarketOptionsRequest instanceMarketOptions = requestLaunchTemplateData
                    .getInstanceMarketOptions();
            jsonWriter.name("InstanceMarketOptions");
            LaunchTemplateInstanceMarketOptionsRequestJsonMarshaller.getInstance().marshall(
                    instanceMarketOptions, jsonWriter);
        }
        if (requestLaunchTemplateData.getCreditSpecification() != null) {
            CreditSpecificationRequest creditSpecification = requestLaunchTemplateData
                    .getCreditSpecification();
            jsonWriter.name("CreditSpecification");
            CreditSpecificationRequestJsonMarshaller.getInstance().marshall(creditSpecification,
                    jsonWriter);
        }
        if (requestLaunchTemplateData.getCpuOptions() != null) {
            LaunchTemplateCpuOptionsRequest cpuOptions = requestLaunchTemplateData.getCpuOptions();
            jsonWriter.name("CpuOptions");
            LaunchTemplateCpuOptionsRequestJsonMarshaller.getInstance().marshall(cpuOptions,
                    jsonWriter);
        }
        if (requestLaunchTemplateData.getCapacityReservationSpecification() != null) {
            LaunchTemplateCapacityReservationSpecificationRequest capacityReservationSpecification = requestLaunchTemplateData
                    .getCapacityReservationSpecification();
            jsonWriter.name("CapacityReservationSpecification");
            LaunchTemplateCapacityReservationSpecificationRequestJsonMarshaller.getInstance()
                    .marshall(capacityReservationSpecification, jsonWriter);
        }
        if (requestLaunchTemplateData.getLicenseSpecifications() != null) {
            java.util.List<LaunchTemplateLicenseConfigurationRequest> licenseSpecifications = requestLaunchTemplateData
                    .getLicenseSpecifications();
            jsonWriter.name("LicenseSpecifications");
            jsonWriter.beginArray();
            for (LaunchTemplateLicenseConfigurationRequest licenseSpecificationsItem : licenseSpecifications) {
                if (licenseSpecificationsItem != null) {
                    LaunchTemplateLicenseConfigurationRequestJsonMarshaller.getInstance().marshall(
                            licenseSpecificationsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (requestLaunchTemplateData.getHibernationOptions() != null) {
            LaunchTemplateHibernationOptionsRequest hibernationOptions = requestLaunchTemplateData
                    .getHibernationOptions();
            jsonWriter.name("HibernationOptions");
            LaunchTemplateHibernationOptionsRequestJsonMarshaller.getInstance().marshall(
                    hibernationOptions, jsonWriter);
        }
        if (requestLaunchTemplateData.getMetadataOptions() != null) {
            LaunchTemplateInstanceMetadataOptionsRequest metadataOptions = requestLaunchTemplateData
                    .getMetadataOptions();
            jsonWriter.name("MetadataOptions");
            LaunchTemplateInstanceMetadataOptionsRequestJsonMarshaller.getInstance().marshall(
                    metadataOptions, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static RequestLaunchTemplateDataJsonMarshaller instance;

    public static RequestLaunchTemplateDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RequestLaunchTemplateDataJsonMarshaller();
        return instance;
    }
}
