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
 * JSON marshaller for POJO LaunchTemplateInstanceNetworkInterfaceSpecification
 */
class LaunchTemplateInstanceNetworkInterfaceSpecificationJsonMarshaller {

    public void marshall(
            LaunchTemplateInstanceNetworkInterfaceSpecification launchTemplateInstanceNetworkInterfaceSpecification,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (launchTemplateInstanceNetworkInterfaceSpecification.getAssociatePublicIpAddress() != null) {
            Boolean associatePublicIpAddress = launchTemplateInstanceNetworkInterfaceSpecification
                    .getAssociatePublicIpAddress();
            jsonWriter.name("AssociatePublicIpAddress");
            jsonWriter.value(associatePublicIpAddress);
        }
        if (launchTemplateInstanceNetworkInterfaceSpecification.getDeleteOnTermination() != null) {
            Boolean deleteOnTermination = launchTemplateInstanceNetworkInterfaceSpecification
                    .getDeleteOnTermination();
            jsonWriter.name("DeleteOnTermination");
            jsonWriter.value(deleteOnTermination);
        }
        if (launchTemplateInstanceNetworkInterfaceSpecification.getDescription() != null) {
            String description = launchTemplateInstanceNetworkInterfaceSpecification
                    .getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (launchTemplateInstanceNetworkInterfaceSpecification.getDeviceIndex() != null) {
            Integer deviceIndex = launchTemplateInstanceNetworkInterfaceSpecification
                    .getDeviceIndex();
            jsonWriter.name("DeviceIndex");
            jsonWriter.value(deviceIndex);
        }
        if (launchTemplateInstanceNetworkInterfaceSpecification.getGroups() != null) {
            java.util.List<String> groups = launchTemplateInstanceNetworkInterfaceSpecification
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
        if (launchTemplateInstanceNetworkInterfaceSpecification.getInterfaceType() != null) {
            String interfaceType = launchTemplateInstanceNetworkInterfaceSpecification
                    .getInterfaceType();
            jsonWriter.name("InterfaceType");
            jsonWriter.value(interfaceType);
        }
        if (launchTemplateInstanceNetworkInterfaceSpecification.getIpv6AddressCount() != null) {
            Integer ipv6AddressCount = launchTemplateInstanceNetworkInterfaceSpecification
                    .getIpv6AddressCount();
            jsonWriter.name("Ipv6AddressCount");
            jsonWriter.value(ipv6AddressCount);
        }
        if (launchTemplateInstanceNetworkInterfaceSpecification.getIpv6Addresses() != null) {
            java.util.List<InstanceIpv6Address> ipv6Addresses = launchTemplateInstanceNetworkInterfaceSpecification
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
        if (launchTemplateInstanceNetworkInterfaceSpecification.getNetworkInterfaceId() != null) {
            String networkInterfaceId = launchTemplateInstanceNetworkInterfaceSpecification
                    .getNetworkInterfaceId();
            jsonWriter.name("NetworkInterfaceId");
            jsonWriter.value(networkInterfaceId);
        }
        if (launchTemplateInstanceNetworkInterfaceSpecification.getPrivateIpAddress() != null) {
            String privateIpAddress = launchTemplateInstanceNetworkInterfaceSpecification
                    .getPrivateIpAddress();
            jsonWriter.name("PrivateIpAddress");
            jsonWriter.value(privateIpAddress);
        }
        if (launchTemplateInstanceNetworkInterfaceSpecification.getPrivateIpAddresses() != null) {
            java.util.List<PrivateIpAddressSpecification> privateIpAddresses = launchTemplateInstanceNetworkInterfaceSpecification
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
        if (launchTemplateInstanceNetworkInterfaceSpecification.getSecondaryPrivateIpAddressCount() != null) {
            Integer secondaryPrivateIpAddressCount = launchTemplateInstanceNetworkInterfaceSpecification
                    .getSecondaryPrivateIpAddressCount();
            jsonWriter.name("SecondaryPrivateIpAddressCount");
            jsonWriter.value(secondaryPrivateIpAddressCount);
        }
        if (launchTemplateInstanceNetworkInterfaceSpecification.getSubnetId() != null) {
            String subnetId = launchTemplateInstanceNetworkInterfaceSpecification.getSubnetId();
            jsonWriter.name("SubnetId");
            jsonWriter.value(subnetId);
        }
        jsonWriter.endObject();
    }

    private static LaunchTemplateInstanceNetworkInterfaceSpecificationJsonMarshaller instance;

    public static LaunchTemplateInstanceNetworkInterfaceSpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateInstanceNetworkInterfaceSpecificationJsonMarshaller();
        return instance;
    }
}
