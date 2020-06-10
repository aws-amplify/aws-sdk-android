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
 * JSON marshaller for POJO ResponseLaunchTemplateData
 */
class ResponseLaunchTemplateDataJsonMarshaller {

    public void marshall(ResponseLaunchTemplateData responseLaunchTemplateData,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (responseLaunchTemplateData.getKernelId() != null) {
            String kernelId = responseLaunchTemplateData.getKernelId();
            jsonWriter.name("KernelId");
            jsonWriter.value(kernelId);
        }
        if (responseLaunchTemplateData.getEbsOptimized() != null) {
            Boolean ebsOptimized = responseLaunchTemplateData.getEbsOptimized();
            jsonWriter.name("EbsOptimized");
            jsonWriter.value(ebsOptimized);
        }
        if (responseLaunchTemplateData.getIamInstanceProfile() != null) {
            LaunchTemplateIamInstanceProfileSpecification iamInstanceProfile = responseLaunchTemplateData
                    .getIamInstanceProfile();
            jsonWriter.name("IamInstanceProfile");
            LaunchTemplateIamInstanceProfileSpecificationJsonMarshaller.getInstance().marshall(
                    iamInstanceProfile, jsonWriter);
        }
        if (responseLaunchTemplateData.getBlockDeviceMappings() != null) {
            java.util.List<LaunchTemplateBlockDeviceMapping> blockDeviceMappings = responseLaunchTemplateData
                    .getBlockDeviceMappings();
            jsonWriter.name("BlockDeviceMappings");
            jsonWriter.beginArray();
            for (LaunchTemplateBlockDeviceMapping blockDeviceMappingsItem : blockDeviceMappings) {
                if (blockDeviceMappingsItem != null) {
                    LaunchTemplateBlockDeviceMappingJsonMarshaller.getInstance().marshall(
                            blockDeviceMappingsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (responseLaunchTemplateData.getNetworkInterfaces() != null) {
            java.util.List<LaunchTemplateInstanceNetworkInterfaceSpecification> networkInterfaces = responseLaunchTemplateData
                    .getNetworkInterfaces();
            jsonWriter.name("NetworkInterfaces");
            jsonWriter.beginArray();
            for (LaunchTemplateInstanceNetworkInterfaceSpecification networkInterfacesItem : networkInterfaces) {
                if (networkInterfacesItem != null) {
                    LaunchTemplateInstanceNetworkInterfaceSpecificationJsonMarshaller.getInstance()
                            .marshall(networkInterfacesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (responseLaunchTemplateData.getImageId() != null) {
            String imageId = responseLaunchTemplateData.getImageId();
            jsonWriter.name("ImageId");
            jsonWriter.value(imageId);
        }
        if (responseLaunchTemplateData.getInstanceType() != null) {
            String instanceType = responseLaunchTemplateData.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (responseLaunchTemplateData.getKeyName() != null) {
            String keyName = responseLaunchTemplateData.getKeyName();
            jsonWriter.name("KeyName");
            jsonWriter.value(keyName);
        }
        if (responseLaunchTemplateData.getMonitoring() != null) {
            LaunchTemplatesMonitoring monitoring = responseLaunchTemplateData.getMonitoring();
            jsonWriter.name("Monitoring");
            LaunchTemplatesMonitoringJsonMarshaller.getInstance().marshall(monitoring, jsonWriter);
        }
        if (responseLaunchTemplateData.getPlacement() != null) {
            LaunchTemplatePlacement placement = responseLaunchTemplateData.getPlacement();
            jsonWriter.name("Placement");
            LaunchTemplatePlacementJsonMarshaller.getInstance().marshall(placement, jsonWriter);
        }
        if (responseLaunchTemplateData.getRamDiskId() != null) {
            String ramDiskId = responseLaunchTemplateData.getRamDiskId();
            jsonWriter.name("RamDiskId");
            jsonWriter.value(ramDiskId);
        }
        if (responseLaunchTemplateData.getDisableApiTermination() != null) {
            Boolean disableApiTermination = responseLaunchTemplateData.getDisableApiTermination();
            jsonWriter.name("DisableApiTermination");
            jsonWriter.value(disableApiTermination);
        }
        if (responseLaunchTemplateData.getInstanceInitiatedShutdownBehavior() != null) {
            String instanceInitiatedShutdownBehavior = responseLaunchTemplateData
                    .getInstanceInitiatedShutdownBehavior();
            jsonWriter.name("InstanceInitiatedShutdownBehavior");
            jsonWriter.value(instanceInitiatedShutdownBehavior);
        }
        if (responseLaunchTemplateData.getUserData() != null) {
            String userData = responseLaunchTemplateData.getUserData();
            jsonWriter.name("UserData");
            jsonWriter.value(userData);
        }
        if (responseLaunchTemplateData.getTagSpecifications() != null) {
            java.util.List<LaunchTemplateTagSpecification> tagSpecifications = responseLaunchTemplateData
                    .getTagSpecifications();
            jsonWriter.name("TagSpecifications");
            jsonWriter.beginArray();
            for (LaunchTemplateTagSpecification tagSpecificationsItem : tagSpecifications) {
                if (tagSpecificationsItem != null) {
                    LaunchTemplateTagSpecificationJsonMarshaller.getInstance().marshall(
                            tagSpecificationsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (responseLaunchTemplateData.getElasticGpuSpecifications() != null) {
            java.util.List<ElasticGpuSpecificationResponse> elasticGpuSpecifications = responseLaunchTemplateData
                    .getElasticGpuSpecifications();
            jsonWriter.name("ElasticGpuSpecifications");
            jsonWriter.beginArray();
            for (ElasticGpuSpecificationResponse elasticGpuSpecificationsItem : elasticGpuSpecifications) {
                if (elasticGpuSpecificationsItem != null) {
                    ElasticGpuSpecificationResponseJsonMarshaller.getInstance().marshall(
                            elasticGpuSpecificationsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (responseLaunchTemplateData.getElasticInferenceAccelerators() != null) {
            java.util.List<LaunchTemplateElasticInferenceAcceleratorResponse> elasticInferenceAccelerators = responseLaunchTemplateData
                    .getElasticInferenceAccelerators();
            jsonWriter.name("ElasticInferenceAccelerators");
            jsonWriter.beginArray();
            for (LaunchTemplateElasticInferenceAcceleratorResponse elasticInferenceAcceleratorsItem : elasticInferenceAccelerators) {
                if (elasticInferenceAcceleratorsItem != null) {
                    LaunchTemplateElasticInferenceAcceleratorResponseJsonMarshaller.getInstance()
                            .marshall(elasticInferenceAcceleratorsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (responseLaunchTemplateData.getSecurityGroupIds() != null) {
            java.util.List<String> securityGroupIds = responseLaunchTemplateData
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
        if (responseLaunchTemplateData.getSecurityGroups() != null) {
            java.util.List<String> securityGroups = responseLaunchTemplateData.getSecurityGroups();
            jsonWriter.name("SecurityGroups");
            jsonWriter.beginArray();
            for (String securityGroupsItem : securityGroups) {
                if (securityGroupsItem != null) {
                    jsonWriter.value(securityGroupsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (responseLaunchTemplateData.getInstanceMarketOptions() != null) {
            LaunchTemplateInstanceMarketOptions instanceMarketOptions = responseLaunchTemplateData
                    .getInstanceMarketOptions();
            jsonWriter.name("InstanceMarketOptions");
            LaunchTemplateInstanceMarketOptionsJsonMarshaller.getInstance().marshall(
                    instanceMarketOptions, jsonWriter);
        }
        if (responseLaunchTemplateData.getCreditSpecification() != null) {
            CreditSpecification creditSpecification = responseLaunchTemplateData
                    .getCreditSpecification();
            jsonWriter.name("CreditSpecification");
            CreditSpecificationJsonMarshaller.getInstance().marshall(creditSpecification,
                    jsonWriter);
        }
        if (responseLaunchTemplateData.getCpuOptions() != null) {
            LaunchTemplateCpuOptions cpuOptions = responseLaunchTemplateData.getCpuOptions();
            jsonWriter.name("CpuOptions");
            LaunchTemplateCpuOptionsJsonMarshaller.getInstance().marshall(cpuOptions, jsonWriter);
        }
        if (responseLaunchTemplateData.getCapacityReservationSpecification() != null) {
            LaunchTemplateCapacityReservationSpecificationResponse capacityReservationSpecification = responseLaunchTemplateData
                    .getCapacityReservationSpecification();
            jsonWriter.name("CapacityReservationSpecification");
            LaunchTemplateCapacityReservationSpecificationResponseJsonMarshaller.getInstance()
                    .marshall(capacityReservationSpecification, jsonWriter);
        }
        if (responseLaunchTemplateData.getLicenseSpecifications() != null) {
            java.util.List<LaunchTemplateLicenseConfiguration> licenseSpecifications = responseLaunchTemplateData
                    .getLicenseSpecifications();
            jsonWriter.name("LicenseSpecifications");
            jsonWriter.beginArray();
            for (LaunchTemplateLicenseConfiguration licenseSpecificationsItem : licenseSpecifications) {
                if (licenseSpecificationsItem != null) {
                    LaunchTemplateLicenseConfigurationJsonMarshaller.getInstance().marshall(
                            licenseSpecificationsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (responseLaunchTemplateData.getHibernationOptions() != null) {
            LaunchTemplateHibernationOptions hibernationOptions = responseLaunchTemplateData
                    .getHibernationOptions();
            jsonWriter.name("HibernationOptions");
            LaunchTemplateHibernationOptionsJsonMarshaller.getInstance().marshall(
                    hibernationOptions, jsonWriter);
        }
        if (responseLaunchTemplateData.getMetadataOptions() != null) {
            LaunchTemplateInstanceMetadataOptions metadataOptions = responseLaunchTemplateData
                    .getMetadataOptions();
            jsonWriter.name("MetadataOptions");
            LaunchTemplateInstanceMetadataOptionsJsonMarshaller.getInstance().marshall(
                    metadataOptions, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ResponseLaunchTemplateDataJsonMarshaller instance;

    public static ResponseLaunchTemplateDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResponseLaunchTemplateDataJsonMarshaller();
        return instance;
    }
}
