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

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for RunInstancesRequest
 */
public class RunInstancesRequestMarshaller implements
        Marshaller<Request<RunInstancesRequest>, RunInstancesRequest> {

    public Request<RunInstancesRequest> marshall(RunInstancesRequest runInstancesRequest) {
        if (runInstancesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RunInstancesRequest)");
        }

        Request<RunInstancesRequest> request = new DefaultRequest<RunInstancesRequest>(
                runInstancesRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (runInstancesRequest.getBlockDeviceMappings() != null) {
                java.util.List<BlockDeviceMapping> blockDeviceMappings = runInstancesRequest
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
            if (runInstancesRequest.getImageId() != null) {
                String imageId = runInstancesRequest.getImageId();
                jsonWriter.name("ImageId");
                jsonWriter.value(imageId);
            }
            if (runInstancesRequest.getInstanceType() != null) {
                String instanceType = runInstancesRequest.getInstanceType();
                jsonWriter.name("InstanceType");
                jsonWriter.value(instanceType);
            }
            if (runInstancesRequest.getIpv6AddressCount() != null) {
                Integer ipv6AddressCount = runInstancesRequest.getIpv6AddressCount();
                jsonWriter.name("Ipv6AddressCount");
                jsonWriter.value(ipv6AddressCount);
            }
            if (runInstancesRequest.getIpv6Addresses() != null) {
                java.util.List<InstanceIpv6Address> ipv6Addresses = runInstancesRequest
                        .getIpv6Addresses();
                jsonWriter.name("Ipv6Addresses");
                jsonWriter.beginArray();
                for (InstanceIpv6Address ipv6AddressesItem : ipv6Addresses) {
                    if (ipv6AddressesItem != null) {
                        InstanceIpv6AddressJsonMarshaller.getInstance().marshall(ipv6AddressesItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (runInstancesRequest.getKernelId() != null) {
                String kernelId = runInstancesRequest.getKernelId();
                jsonWriter.name("KernelId");
                jsonWriter.value(kernelId);
            }
            if (runInstancesRequest.getKeyName() != null) {
                String keyName = runInstancesRequest.getKeyName();
                jsonWriter.name("KeyName");
                jsonWriter.value(keyName);
            }
            if (runInstancesRequest.getMaxCount() != null) {
                Integer maxCount = runInstancesRequest.getMaxCount();
                jsonWriter.name("MaxCount");
                jsonWriter.value(maxCount);
            }
            if (runInstancesRequest.getMinCount() != null) {
                Integer minCount = runInstancesRequest.getMinCount();
                jsonWriter.name("MinCount");
                jsonWriter.value(minCount);
            }
            if (runInstancesRequest.getMonitoring() != null) {
                RunInstancesMonitoringEnabled monitoring = runInstancesRequest.getMonitoring();
                jsonWriter.name("Monitoring");
                RunInstancesMonitoringEnabledJsonMarshaller.getInstance().marshall(monitoring,
                        jsonWriter);
            }
            if (runInstancesRequest.getPlacement() != null) {
                Placement placement = runInstancesRequest.getPlacement();
                jsonWriter.name("Placement");
                PlacementJsonMarshaller.getInstance().marshall(placement, jsonWriter);
            }
            if (runInstancesRequest.getRamdiskId() != null) {
                String ramdiskId = runInstancesRequest.getRamdiskId();
                jsonWriter.name("RamdiskId");
                jsonWriter.value(ramdiskId);
            }
            if (runInstancesRequest.getSecurityGroupIds() != null) {
                java.util.List<String> securityGroupIds = runInstancesRequest.getSecurityGroupIds();
                jsonWriter.name("SecurityGroupIds");
                jsonWriter.beginArray();
                for (String securityGroupIdsItem : securityGroupIds) {
                    if (securityGroupIdsItem != null) {
                        jsonWriter.value(securityGroupIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (runInstancesRequest.getSecurityGroups() != null) {
                java.util.List<String> securityGroups = runInstancesRequest.getSecurityGroups();
                jsonWriter.name("SecurityGroups");
                jsonWriter.beginArray();
                for (String securityGroupsItem : securityGroups) {
                    if (securityGroupsItem != null) {
                        jsonWriter.value(securityGroupsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (runInstancesRequest.getSubnetId() != null) {
                String subnetId = runInstancesRequest.getSubnetId();
                jsonWriter.name("SubnetId");
                jsonWriter.value(subnetId);
            }
            if (runInstancesRequest.getUserData() != null) {
                String userData = runInstancesRequest.getUserData();
                jsonWriter.name("UserData");
                jsonWriter.value(userData);
            }
            if (runInstancesRequest.getAdditionalInfo() != null) {
                String additionalInfo = runInstancesRequest.getAdditionalInfo();
                jsonWriter.name("AdditionalInfo");
                jsonWriter.value(additionalInfo);
            }
            if (runInstancesRequest.getClientToken() != null) {
                String clientToken = runInstancesRequest.getClientToken();
                jsonWriter.name("ClientToken");
                jsonWriter.value(clientToken);
            }
            if (runInstancesRequest.getDisableApiTermination() != null) {
                Boolean disableApiTermination = runInstancesRequest.getDisableApiTermination();
                jsonWriter.name("DisableApiTermination");
                jsonWriter.value(disableApiTermination);
            }
            if (runInstancesRequest.getDryRun() != null) {
                Boolean dryRun = runInstancesRequest.getDryRun();
                jsonWriter.name("DryRun");
                jsonWriter.value(dryRun);
            }
            if (runInstancesRequest.getEbsOptimized() != null) {
                Boolean ebsOptimized = runInstancesRequest.getEbsOptimized();
                jsonWriter.name("EbsOptimized");
                jsonWriter.value(ebsOptimized);
            }
            if (runInstancesRequest.getIamInstanceProfile() != null) {
                IamInstanceProfileSpecification iamInstanceProfile = runInstancesRequest
                        .getIamInstanceProfile();
                jsonWriter.name("IamInstanceProfile");
                IamInstanceProfileSpecificationJsonMarshaller.getInstance().marshall(
                        iamInstanceProfile, jsonWriter);
            }
            if (runInstancesRequest.getInstanceInitiatedShutdownBehavior() != null) {
                String instanceInitiatedShutdownBehavior = runInstancesRequest
                        .getInstanceInitiatedShutdownBehavior();
                jsonWriter.name("InstanceInitiatedShutdownBehavior");
                jsonWriter.value(instanceInitiatedShutdownBehavior);
            }
            if (runInstancesRequest.getNetworkInterfaces() != null) {
                java.util.List<InstanceNetworkInterfaceSpecification> networkInterfaces = runInstancesRequest
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
            if (runInstancesRequest.getPrivateIpAddress() != null) {
                String privateIpAddress = runInstancesRequest.getPrivateIpAddress();
                jsonWriter.name("PrivateIpAddress");
                jsonWriter.value(privateIpAddress);
            }
            if (runInstancesRequest.getElasticGpuSpecification() != null) {
                java.util.List<ElasticGpuSpecification> elasticGpuSpecification = runInstancesRequest
                        .getElasticGpuSpecification();
                jsonWriter.name("ElasticGpuSpecification");
                jsonWriter.beginArray();
                for (ElasticGpuSpecification elasticGpuSpecificationItem : elasticGpuSpecification) {
                    if (elasticGpuSpecificationItem != null) {
                        ElasticGpuSpecificationJsonMarshaller.getInstance().marshall(
                                elasticGpuSpecificationItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (runInstancesRequest.getElasticInferenceAccelerators() != null) {
                java.util.List<ElasticInferenceAccelerator> elasticInferenceAccelerators = runInstancesRequest
                        .getElasticInferenceAccelerators();
                jsonWriter.name("ElasticInferenceAccelerators");
                jsonWriter.beginArray();
                for (ElasticInferenceAccelerator elasticInferenceAcceleratorsItem : elasticInferenceAccelerators) {
                    if (elasticInferenceAcceleratorsItem != null) {
                        ElasticInferenceAcceleratorJsonMarshaller.getInstance().marshall(
                                elasticInferenceAcceleratorsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (runInstancesRequest.getTagSpecifications() != null) {
                java.util.List<TagSpecification> tagSpecifications = runInstancesRequest
                        .getTagSpecifications();
                jsonWriter.name("TagSpecifications");
                jsonWriter.beginArray();
                for (TagSpecification tagSpecificationsItem : tagSpecifications) {
                    if (tagSpecificationsItem != null) {
                        TagSpecificationJsonMarshaller.getInstance().marshall(
                                tagSpecificationsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (runInstancesRequest.getLaunchTemplate() != null) {
                LaunchTemplateSpecification launchTemplate = runInstancesRequest
                        .getLaunchTemplate();
                jsonWriter.name("LaunchTemplate");
                LaunchTemplateSpecificationJsonMarshaller.getInstance().marshall(launchTemplate,
                        jsonWriter);
            }
            if (runInstancesRequest.getInstanceMarketOptions() != null) {
                InstanceMarketOptionsRequest instanceMarketOptions = runInstancesRequest
                        .getInstanceMarketOptions();
                jsonWriter.name("InstanceMarketOptions");
                InstanceMarketOptionsRequestJsonMarshaller.getInstance().marshall(
                        instanceMarketOptions, jsonWriter);
            }
            if (runInstancesRequest.getCreditSpecification() != null) {
                CreditSpecificationRequest creditSpecification = runInstancesRequest
                        .getCreditSpecification();
                jsonWriter.name("CreditSpecification");
                CreditSpecificationRequestJsonMarshaller.getInstance().marshall(
                        creditSpecification, jsonWriter);
            }
            if (runInstancesRequest.getCpuOptions() != null) {
                CpuOptionsRequest cpuOptions = runInstancesRequest.getCpuOptions();
                jsonWriter.name("CpuOptions");
                CpuOptionsRequestJsonMarshaller.getInstance().marshall(cpuOptions, jsonWriter);
            }
            if (runInstancesRequest.getCapacityReservationSpecification() != null) {
                CapacityReservationSpecification capacityReservationSpecification = runInstancesRequest
                        .getCapacityReservationSpecification();
                jsonWriter.name("CapacityReservationSpecification");
                CapacityReservationSpecificationJsonMarshaller.getInstance().marshall(
                        capacityReservationSpecification, jsonWriter);
            }
            if (runInstancesRequest.getHibernationOptions() != null) {
                HibernationOptionsRequest hibernationOptions = runInstancesRequest
                        .getHibernationOptions();
                jsonWriter.name("HibernationOptions");
                HibernationOptionsRequestJsonMarshaller.getInstance().marshall(hibernationOptions,
                        jsonWriter);
            }
            if (runInstancesRequest.getLicenseSpecifications() != null) {
                java.util.List<LicenseConfigurationRequest> licenseSpecifications = runInstancesRequest
                        .getLicenseSpecifications();
                jsonWriter.name("LicenseSpecifications");
                jsonWriter.beginArray();
                for (LicenseConfigurationRequest licenseSpecificationsItem : licenseSpecifications) {
                    if (licenseSpecificationsItem != null) {
                        LicenseConfigurationRequestJsonMarshaller.getInstance().marshall(
                                licenseSpecificationsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (runInstancesRequest.getMetadataOptions() != null) {
                InstanceMetadataOptionsRequest metadataOptions = runInstancesRequest
                        .getMetadataOptions();
                jsonWriter.name("MetadataOptions");
                InstanceMetadataOptionsRequestJsonMarshaller.getInstance().marshall(
                        metadataOptions, jsonWriter);
            }

            jsonWriter.endObject();
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
