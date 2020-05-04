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
 * JSON marshaller for POJO InstanceNetworkInterfaceSpecification
 */
class InstanceNetworkInterfaceSpecificationJsonMarshaller {

    public void marshall(
            InstanceNetworkInterfaceSpecification instanceNetworkInterfaceSpecification,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instanceNetworkInterfaceSpecification.getAssociatePublicIpAddress() != null) {
            Boolean associatePublicIpAddress = instanceNetworkInterfaceSpecification
                    .getAssociatePublicIpAddress();
            jsonWriter.name("AssociatePublicIpAddress");
            jsonWriter.value(associatePublicIpAddress);
        }
        if (instanceNetworkInterfaceSpecification.getDeleteOnTermination() != null) {
            Boolean deleteOnTermination = instanceNetworkInterfaceSpecification
                    .getDeleteOnTermination();
            jsonWriter.name("DeleteOnTermination");
            jsonWriter.value(deleteOnTermination);
        }
        if (instanceNetworkInterfaceSpecification.getDescription() != null) {
            String description = instanceNetworkInterfaceSpecification.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (instanceNetworkInterfaceSpecification.getDeviceIndex() != null) {
            Integer deviceIndex = instanceNetworkInterfaceSpecification.getDeviceIndex();
            jsonWriter.name("DeviceIndex");
            jsonWriter.value(deviceIndex);
        }
        if (instanceNetworkInterfaceSpecification.getGroups() != null) {
            java.util.List<String> groups = instanceNetworkInterfaceSpecification.getGroups();
            jsonWriter.name("Groups");
            jsonWriter.beginArray();
            for (String groupsItem : groups) {
                if (groupsItem != null) {
                    jsonWriter.value(groupsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (instanceNetworkInterfaceSpecification.getIpv6AddressCount() != null) {
            Integer ipv6AddressCount = instanceNetworkInterfaceSpecification.getIpv6AddressCount();
            jsonWriter.name("Ipv6AddressCount");
            jsonWriter.value(ipv6AddressCount);
        }
        if (instanceNetworkInterfaceSpecification.getIpv6Addresses() != null) {
            java.util.List<InstanceIpv6Address> ipv6Addresses = instanceNetworkInterfaceSpecification
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
        if (instanceNetworkInterfaceSpecification.getNetworkInterfaceId() != null) {
            String networkInterfaceId = instanceNetworkInterfaceSpecification
                    .getNetworkInterfaceId();
            jsonWriter.name("NetworkInterfaceId");
            jsonWriter.value(networkInterfaceId);
        }
        if (instanceNetworkInterfaceSpecification.getPrivateIpAddress() != null) {
            String privateIpAddress = instanceNetworkInterfaceSpecification.getPrivateIpAddress();
            jsonWriter.name("PrivateIpAddress");
            jsonWriter.value(privateIpAddress);
        }
        if (instanceNetworkInterfaceSpecification.getPrivateIpAddresses() != null) {
            java.util.List<PrivateIpAddressSpecification> privateIpAddresses = instanceNetworkInterfaceSpecification
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
        if (instanceNetworkInterfaceSpecification.getSecondaryPrivateIpAddressCount() != null) {
            Integer secondaryPrivateIpAddressCount = instanceNetworkInterfaceSpecification
                    .getSecondaryPrivateIpAddressCount();
            jsonWriter.name("SecondaryPrivateIpAddressCount");
            jsonWriter.value(secondaryPrivateIpAddressCount);
        }
        if (instanceNetworkInterfaceSpecification.getSubnetId() != null) {
            String subnetId = instanceNetworkInterfaceSpecification.getSubnetId();
            jsonWriter.name("SubnetId");
            jsonWriter.value(subnetId);
        }
        if (instanceNetworkInterfaceSpecification.getInterfaceType() != null) {
            String interfaceType = instanceNetworkInterfaceSpecification.getInterfaceType();
            jsonWriter.name("InterfaceType");
            jsonWriter.value(interfaceType);
        }
        jsonWriter.endObject();
    }

    private static InstanceNetworkInterfaceSpecificationJsonMarshaller instance;

    public static InstanceNetworkInterfaceSpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceNetworkInterfaceSpecificationJsonMarshaller();
        return instance;
    }
}
