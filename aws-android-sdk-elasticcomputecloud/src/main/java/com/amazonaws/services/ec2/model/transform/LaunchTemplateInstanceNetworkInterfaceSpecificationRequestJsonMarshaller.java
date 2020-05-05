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
 * JSON marshaller for POJO
 * LaunchTemplateInstanceNetworkInterfaceSpecificationRequest
 */
class LaunchTemplateInstanceNetworkInterfaceSpecificationRequestJsonMarshaller {

    public void marshall(
            LaunchTemplateInstanceNetworkInterfaceSpecificationRequest launchTemplateInstanceNetworkInterfaceSpecificationRequest,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (launchTemplateInstanceNetworkInterfaceSpecificationRequest
                .getAssociatePublicIpAddress() != null) {
            Boolean associatePublicIpAddress = launchTemplateInstanceNetworkInterfaceSpecificationRequest
                    .getAssociatePublicIpAddress();
            jsonWriter.name("AssociatePublicIpAddress");
            jsonWriter.value(associatePublicIpAddress);
        }
        if (launchTemplateInstanceNetworkInterfaceSpecificationRequest.getDeleteOnTermination() != null) {
            Boolean deleteOnTermination = launchTemplateInstanceNetworkInterfaceSpecificationRequest
                    .getDeleteOnTermination();
            jsonWriter.name("DeleteOnTermination");
            jsonWriter.value(deleteOnTermination);
        }
        if (launchTemplateInstanceNetworkInterfaceSpecificationRequest.getDescription() != null) {
            String description = launchTemplateInstanceNetworkInterfaceSpecificationRequest
                    .getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (launchTemplateInstanceNetworkInterfaceSpecificationRequest.getDeviceIndex() != null) {
            Integer deviceIndex = launchTemplateInstanceNetworkInterfaceSpecificationRequest
                    .getDeviceIndex();
            jsonWriter.name("DeviceIndex");
            jsonWriter.value(deviceIndex);
        }
        if (launchTemplateInstanceNetworkInterfaceSpecificationRequest.getGroups() != null) {
            java.util.List<String> groups = launchTemplateInstanceNetworkInterfaceSpecificationRequest
                    .getGroups();
            jsonWriter.name("Groups");
            jsonWriter.beginArray();
            for (String groupsItem : groups) {
                if (groupsItem != null) {
                    jsonWriter.value(groupsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (launchTemplateInstanceNetworkInterfaceSpecificationRequest.getInterfaceType() != null) {
            String interfaceType = launchTemplateInstanceNetworkInterfaceSpecificationRequest
                    .getInterfaceType();
            jsonWriter.name("InterfaceType");
            jsonWriter.value(interfaceType);
        }
        if (launchTemplateInstanceNetworkInterfaceSpecificationRequest.getIpv6AddressCount() != null) {
            Integer ipv6AddressCount = launchTemplateInstanceNetworkInterfaceSpecificationRequest
                    .getIpv6AddressCount();
            jsonWriter.name("Ipv6AddressCount");
            jsonWriter.value(ipv6AddressCount);
        }
        if (launchTemplateInstanceNetworkInterfaceSpecificationRequest.getIpv6Addresses() != null) {
            java.util.List<InstanceIpv6AddressRequest> ipv6Addresses = launchTemplateInstanceNetworkInterfaceSpecificationRequest
                    .getIpv6Addresses();
            jsonWriter.name("Ipv6Addresses");
            jsonWriter.beginArray();
            for (InstanceIpv6AddressRequest ipv6AddressesItem : ipv6Addresses) {
                if (ipv6AddressesItem != null) {
                    InstanceIpv6AddressRequestJsonMarshaller.getInstance().marshall(
                            ipv6AddressesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (launchTemplateInstanceNetworkInterfaceSpecificationRequest.getNetworkInterfaceId() != null) {
            String networkInterfaceId = launchTemplateInstanceNetworkInterfaceSpecificationRequest
                    .getNetworkInterfaceId();
            jsonWriter.name("NetworkInterfaceId");
            jsonWriter.value(networkInterfaceId);
        }
        if (launchTemplateInstanceNetworkInterfaceSpecificationRequest.getPrivateIpAddress() != null) {
            String privateIpAddress = launchTemplateInstanceNetworkInterfaceSpecificationRequest
                    .getPrivateIpAddress();
            jsonWriter.name("PrivateIpAddress");
            jsonWriter.value(privateIpAddress);
        }
        if (launchTemplateInstanceNetworkInterfaceSpecificationRequest.getPrivateIpAddresses() != null) {
            java.util.List<PrivateIpAddressSpecification> privateIpAddresses = launchTemplateInstanceNetworkInterfaceSpecificationRequest
                    .getPrivateIpAddresses();
            jsonWriter.name("PrivateIpAddresses");
            jsonWriter.beginArray();
            for (PrivateIpAddressSpecification privateIpAddressesItem : privateIpAddresses) {
                if (privateIpAddressesItem != null) {
                    PrivateIpAddressSpecificationJsonMarshaller.getInstance().marshall(
                            privateIpAddressesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (launchTemplateInstanceNetworkInterfaceSpecificationRequest
                .getSecondaryPrivateIpAddressCount() != null) {
            Integer secondaryPrivateIpAddressCount = launchTemplateInstanceNetworkInterfaceSpecificationRequest
                    .getSecondaryPrivateIpAddressCount();
            jsonWriter.name("SecondaryPrivateIpAddressCount");
            jsonWriter.value(secondaryPrivateIpAddressCount);
        }
        if (launchTemplateInstanceNetworkInterfaceSpecificationRequest.getSubnetId() != null) {
            String subnetId = launchTemplateInstanceNetworkInterfaceSpecificationRequest
                    .getSubnetId();
            jsonWriter.name("SubnetId");
            jsonWriter.value(subnetId);
        }
        jsonWriter.endObject();
    }

    private static LaunchTemplateInstanceNetworkInterfaceSpecificationRequestJsonMarshaller instance;

    public static LaunchTemplateInstanceNetworkInterfaceSpecificationRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateInstanceNetworkInterfaceSpecificationRequestJsonMarshaller();
        return instance;
    }
}
