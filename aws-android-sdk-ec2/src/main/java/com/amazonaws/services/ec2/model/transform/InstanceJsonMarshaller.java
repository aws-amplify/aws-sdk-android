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
 * JSON marshaller for POJO Instance
 */
class InstanceJsonMarshaller {

    public void marshall(Instance instance, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instance.getAmiLaunchIndex() != null) {
            Integer amiLaunchIndex = instance.getAmiLaunchIndex();
            jsonWriter.name("AmiLaunchIndex");
            jsonWriter.value(amiLaunchIndex);
        }
        if (instance.getImageId() != null) {
            String imageId = instance.getImageId();
            jsonWriter.name("ImageId");
            jsonWriter.value(imageId);
        }
        if (instance.getInstanceId() != null) {
            String instanceId = instance.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (instance.getInstanceType() != null) {
            String instanceType = instance.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (instance.getKernelId() != null) {
            String kernelId = instance.getKernelId();
            jsonWriter.name("KernelId");
            jsonWriter.value(kernelId);
        }
        if (instance.getKeyName() != null) {
            String keyName = instance.getKeyName();
            jsonWriter.name("KeyName");
            jsonWriter.value(keyName);
        }
        if (instance.getLaunchTime() != null) {
            java.util.Date launchTime = instance.getLaunchTime();
            jsonWriter.name("LaunchTime");
            jsonWriter.value(launchTime);
        }
        if (instance.getMonitoring() != null) {
            Monitoring monitoring = instance.getMonitoring();
            jsonWriter.name("Monitoring");
            MonitoringJsonMarshaller.getInstance().marshall(monitoring, jsonWriter);
        }
        if (instance.getPlacement() != null) {
            Placement placement = instance.getPlacement();
            jsonWriter.name("Placement");
            PlacementJsonMarshaller.getInstance().marshall(placement, jsonWriter);
        }
        if (instance.getPlatform() != null) {
            String platform = instance.getPlatform();
            jsonWriter.name("Platform");
            jsonWriter.value(platform);
        }
        if (instance.getPrivateDnsName() != null) {
            String privateDnsName = instance.getPrivateDnsName();
            jsonWriter.name("PrivateDnsName");
            jsonWriter.value(privateDnsName);
        }
        if (instance.getPrivateIpAddress() != null) {
            String privateIpAddress = instance.getPrivateIpAddress();
            jsonWriter.name("PrivateIpAddress");
            jsonWriter.value(privateIpAddress);
        }
        if (instance.getProductCodes() != null) {
            java.util.List<ProductCode> productCodes = instance.getProductCodes();
            jsonWriter.name("ProductCodes");
            jsonWriter.beginArray();
            for (ProductCode productCodesItem : productCodes) {
                if (productCodesItem != null) {
                    ProductCodeJsonMarshaller.getInstance().marshall(productCodesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (instance.getPublicDnsName() != null) {
            String publicDnsName = instance.getPublicDnsName();
            jsonWriter.name("PublicDnsName");
            jsonWriter.value(publicDnsName);
        }
        if (instance.getPublicIpAddress() != null) {
            String publicIpAddress = instance.getPublicIpAddress();
            jsonWriter.name("PublicIpAddress");
            jsonWriter.value(publicIpAddress);
        }
        if (instance.getRamdiskId() != null) {
            String ramdiskId = instance.getRamdiskId();
            jsonWriter.name("RamdiskId");
            jsonWriter.value(ramdiskId);
        }
        if (instance.getState() != null) {
            InstanceState state = instance.getState();
            jsonWriter.name("State");
            InstanceStateJsonMarshaller.getInstance().marshall(state, jsonWriter);
        }
        if (instance.getStateTransitionReason() != null) {
            String stateTransitionReason = instance.getStateTransitionReason();
            jsonWriter.name("StateTransitionReason");
            jsonWriter.value(stateTransitionReason);
        }
        if (instance.getSubnetId() != null) {
            String subnetId = instance.getSubnetId();
            jsonWriter.name("SubnetId");
            jsonWriter.value(subnetId);
        }
        if (instance.getVpcId() != null) {
            String vpcId = instance.getVpcId();
            jsonWriter.name("VpcId");
            jsonWriter.value(vpcId);
        }
        if (instance.getArchitecture() != null) {
            String architecture = instance.getArchitecture();
            jsonWriter.name("Architecture");
            jsonWriter.value(architecture);
        }
        if (instance.getBlockDeviceMappings() != null) {
            java.util.List<InstanceBlockDeviceMapping> blockDeviceMappings = instance
                    .getBlockDeviceMappings();
            jsonWriter.name("BlockDeviceMappings");
            jsonWriter.beginArray();
            for (InstanceBlockDeviceMapping blockDeviceMappingsItem : blockDeviceMappings) {
                if (blockDeviceMappingsItem != null) {
                    InstanceBlockDeviceMappingJsonMarshaller.getInstance().marshall(
                            blockDeviceMappingsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (instance.getClientToken() != null) {
            String clientToken = instance.getClientToken();
            jsonWriter.name("ClientToken");
            jsonWriter.value(clientToken);
        }
        if (instance.getEbsOptimized() != null) {
            Boolean ebsOptimized = instance.getEbsOptimized();
            jsonWriter.name("EbsOptimized");
            jsonWriter.value(ebsOptimized);
        }
        if (instance.getEnaSupport() != null) {
            Boolean enaSupport = instance.getEnaSupport();
            jsonWriter.name("EnaSupport");
            jsonWriter.value(enaSupport);
        }
        if (instance.getHypervisor() != null) {
            String hypervisor = instance.getHypervisor();
            jsonWriter.name("Hypervisor");
            jsonWriter.value(hypervisor);
        }
        if (instance.getIamInstanceProfile() != null) {
            IamInstanceProfile iamInstanceProfile = instance.getIamInstanceProfile();
            jsonWriter.name("IamInstanceProfile");
            IamInstanceProfileJsonMarshaller.getInstance().marshall(iamInstanceProfile, jsonWriter);
        }
        if (instance.getInstanceLifecycle() != null) {
            String instanceLifecycle = instance.getInstanceLifecycle();
            jsonWriter.name("InstanceLifecycle");
            jsonWriter.value(instanceLifecycle);
        }
        if (instance.getElasticGpuAssociations() != null) {
            java.util.List<ElasticGpuAssociation> elasticGpuAssociations = instance
                    .getElasticGpuAssociations();
            jsonWriter.name("ElasticGpuAssociations");
            jsonWriter.beginArray();
            for (ElasticGpuAssociation elasticGpuAssociationsItem : elasticGpuAssociations) {
                if (elasticGpuAssociationsItem != null) {
                    ElasticGpuAssociationJsonMarshaller.getInstance().marshall(
                            elasticGpuAssociationsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (instance.getElasticInferenceAcceleratorAssociations() != null) {
            java.util.List<ElasticInferenceAcceleratorAssociation> elasticInferenceAcceleratorAssociations = instance
                    .getElasticInferenceAcceleratorAssociations();
            jsonWriter.name("ElasticInferenceAcceleratorAssociations");
            jsonWriter.beginArray();
            for (ElasticInferenceAcceleratorAssociation elasticInferenceAcceleratorAssociationsItem : elasticInferenceAcceleratorAssociations) {
                if (elasticInferenceAcceleratorAssociationsItem != null) {
                    ElasticInferenceAcceleratorAssociationJsonMarshaller.getInstance().marshall(
                            elasticInferenceAcceleratorAssociationsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (instance.getNetworkInterfaces() != null) {
            java.util.List<InstanceNetworkInterface> networkInterfaces = instance
                    .getNetworkInterfaces();
            jsonWriter.name("NetworkInterfaces");
            jsonWriter.beginArray();
            for (InstanceNetworkInterface networkInterfacesItem : networkInterfaces) {
                if (networkInterfacesItem != null) {
                    InstanceNetworkInterfaceJsonMarshaller.getInstance().marshall(
                            networkInterfacesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (instance.getOutpostArn() != null) {
            String outpostArn = instance.getOutpostArn();
            jsonWriter.name("OutpostArn");
            jsonWriter.value(outpostArn);
        }
        if (instance.getRootDeviceName() != null) {
            String rootDeviceName = instance.getRootDeviceName();
            jsonWriter.name("RootDeviceName");
            jsonWriter.value(rootDeviceName);
        }
        if (instance.getRootDeviceType() != null) {
            String rootDeviceType = instance.getRootDeviceType();
            jsonWriter.name("RootDeviceType");
            jsonWriter.value(rootDeviceType);
        }
        if (instance.getSecurityGroups() != null) {
            java.util.List<GroupIdentifier> securityGroups = instance.getSecurityGroups();
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
        if (instance.getSourceDestCheck() != null) {
            Boolean sourceDestCheck = instance.getSourceDestCheck();
            jsonWriter.name("SourceDestCheck");
            jsonWriter.value(sourceDestCheck);
        }
        if (instance.getSpotInstanceRequestId() != null) {
            String spotInstanceRequestId = instance.getSpotInstanceRequestId();
            jsonWriter.name("SpotInstanceRequestId");
            jsonWriter.value(spotInstanceRequestId);
        }
        if (instance.getSriovNetSupport() != null) {
            String sriovNetSupport = instance.getSriovNetSupport();
            jsonWriter.name("SriovNetSupport");
            jsonWriter.value(sriovNetSupport);
        }
        if (instance.getStateReason() != null) {
            StateReason stateReason = instance.getStateReason();
            jsonWriter.name("StateReason");
            StateReasonJsonMarshaller.getInstance().marshall(stateReason, jsonWriter);
        }
        if (instance.getTags() != null) {
            java.util.List<Tag> tags = instance.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (instance.getVirtualizationType() != null) {
            String virtualizationType = instance.getVirtualizationType();
            jsonWriter.name("VirtualizationType");
            jsonWriter.value(virtualizationType);
        }
        if (instance.getCpuOptions() != null) {
            CpuOptions cpuOptions = instance.getCpuOptions();
            jsonWriter.name("CpuOptions");
            CpuOptionsJsonMarshaller.getInstance().marshall(cpuOptions, jsonWriter);
        }
        if (instance.getCapacityReservationId() != null) {
            String capacityReservationId = instance.getCapacityReservationId();
            jsonWriter.name("CapacityReservationId");
            jsonWriter.value(capacityReservationId);
        }
        if (instance.getCapacityReservationSpecification() != null) {
            CapacityReservationSpecificationResponse capacityReservationSpecification = instance
                    .getCapacityReservationSpecification();
            jsonWriter.name("CapacityReservationSpecification");
            CapacityReservationSpecificationResponseJsonMarshaller.getInstance().marshall(
                    capacityReservationSpecification, jsonWriter);
        }
        if (instance.getHibernationOptions() != null) {
            HibernationOptions hibernationOptions = instance.getHibernationOptions();
            jsonWriter.name("HibernationOptions");
            HibernationOptionsJsonMarshaller.getInstance().marshall(hibernationOptions, jsonWriter);
        }
        if (instance.getLicenses() != null) {
            java.util.List<LicenseConfiguration> licenses = instance.getLicenses();
            jsonWriter.name("Licenses");
            jsonWriter.beginArray();
            for (LicenseConfiguration licensesItem : licenses) {
                if (licensesItem != null) {
                    LicenseConfigurationJsonMarshaller.getInstance().marshall(licensesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (instance.getMetadataOptions() != null) {
            InstanceMetadataOptionsResponse metadataOptions = instance.getMetadataOptions();
            jsonWriter.name("MetadataOptions");
            InstanceMetadataOptionsResponseJsonMarshaller.getInstance().marshall(metadataOptions,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static InstanceJsonMarshaller instance;

    public static InstanceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceJsonMarshaller();
        return instance;
    }
}
