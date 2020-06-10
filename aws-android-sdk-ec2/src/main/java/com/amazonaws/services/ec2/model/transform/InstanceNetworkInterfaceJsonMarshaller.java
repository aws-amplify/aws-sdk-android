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
 * JSON marshaller for POJO InstanceNetworkInterface
 */
class InstanceNetworkInterfaceJsonMarshaller {

    public void marshall(InstanceNetworkInterface instanceNetworkInterface, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instanceNetworkInterface.getAssociation() != null) {
            InstanceNetworkInterfaceAssociation association = instanceNetworkInterface
                    .getAssociation();
            jsonWriter.name("Association");
            InstanceNetworkInterfaceAssociationJsonMarshaller.getInstance().marshall(association,
                    jsonWriter);
        }
        if (instanceNetworkInterface.getAttachment() != null) {
            InstanceNetworkInterfaceAttachment attachment = instanceNetworkInterface
                    .getAttachment();
            jsonWriter.name("Attachment");
            InstanceNetworkInterfaceAttachmentJsonMarshaller.getInstance().marshall(attachment,
                    jsonWriter);
        }
        if (instanceNetworkInterface.getDescription() != null) {
            String description = instanceNetworkInterface.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (instanceNetworkInterface.getGroups() != null) {
            java.util.List<GroupIdentifier> groups = instanceNetworkInterface.getGroups();
            jsonWriter.name("Groups");
            jsonWriter.beginArray();
            for (GroupIdentifier groupsItem : groups) {
                if (groupsItem != null) {
                    GroupIdentifierJsonMarshaller.getInstance().marshall(groupsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (instanceNetworkInterface.getIpv6Addresses() != null) {
            java.util.List<InstanceIpv6Address> ipv6Addresses = instanceNetworkInterface
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
        if (instanceNetworkInterface.getMacAddress() != null) {
            String macAddress = instanceNetworkInterface.getMacAddress();
            jsonWriter.name("MacAddress");
            jsonWriter.value(macAddress);
        }
        if (instanceNetworkInterface.getNetworkInterfaceId() != null) {
            String networkInterfaceId = instanceNetworkInterface.getNetworkInterfaceId();
            jsonWriter.name("NetworkInterfaceId");
            jsonWriter.value(networkInterfaceId);
        }
        if (instanceNetworkInterface.getOwnerId() != null) {
            String ownerId = instanceNetworkInterface.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (instanceNetworkInterface.getPrivateDnsName() != null) {
            String privateDnsName = instanceNetworkInterface.getPrivateDnsName();
            jsonWriter.name("PrivateDnsName");
            jsonWriter.value(privateDnsName);
        }
        if (instanceNetworkInterface.getPrivateIpAddress() != null) {
            String privateIpAddress = instanceNetworkInterface.getPrivateIpAddress();
            jsonWriter.name("PrivateIpAddress");
            jsonWriter.value(privateIpAddress);
        }
        if (instanceNetworkInterface.getPrivateIpAddresses() != null) {
            java.util.List<InstancePrivateIpAddress> privateIpAddresses = instanceNetworkInterface
                    .getPrivateIpAddresses();
            jsonWriter.name("PrivateIpAddresses");
            jsonWriter.beginArray();
            for (InstancePrivateIpAddress privateIpAddressesItem : privateIpAddresses) {
                if (privateIpAddressesItem != null) {
                    InstancePrivateIpAddressJsonMarshaller.getInstance().marshall(
                            privateIpAddressesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (instanceNetworkInterface.getSourceDestCheck() != null) {
            Boolean sourceDestCheck = instanceNetworkInterface.getSourceDestCheck();
            jsonWriter.name("SourceDestCheck");
            jsonWriter.value(sourceDestCheck);
        }
        if (instanceNetworkInterface.getStatus() != null) {
            String status = instanceNetworkInterface.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (instanceNetworkInterface.getSubnetId() != null) {
            String subnetId = instanceNetworkInterface.getSubnetId();
            jsonWriter.name("SubnetId");
            jsonWriter.value(subnetId);
        }
        if (instanceNetworkInterface.getVpcId() != null) {
            String vpcId = instanceNetworkInterface.getVpcId();
            jsonWriter.name("VpcId");
            jsonWriter.value(vpcId);
        }
        if (instanceNetworkInterface.getInterfaceType() != null) {
            String interfaceType = instanceNetworkInterface.getInterfaceType();
            jsonWriter.name("InterfaceType");
            jsonWriter.value(interfaceType);
        }
        jsonWriter.endObject();
    }

    private static InstanceNetworkInterfaceJsonMarshaller instance;

    public static InstanceNetworkInterfaceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceNetworkInterfaceJsonMarshaller();
        return instance;
    }
}
