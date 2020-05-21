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
 * JSON marshaller for POJO NetworkInterface
 */
class NetworkInterfaceJsonMarshaller {

    public void marshall(NetworkInterface networkInterface, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (networkInterface.getAssociation() != null) {
            NetworkInterfaceAssociation association = networkInterface.getAssociation();
            jsonWriter.name("Association");
            NetworkInterfaceAssociationJsonMarshaller.getInstance().marshall(association,
                    jsonWriter);
        }
        if (networkInterface.getAttachment() != null) {
            NetworkInterfaceAttachment attachment = networkInterface.getAttachment();
            jsonWriter.name("Attachment");
            NetworkInterfaceAttachmentJsonMarshaller.getInstance().marshall(attachment, jsonWriter);
        }
        if (networkInterface.getAvailabilityZone() != null) {
            String availabilityZone = networkInterface.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (networkInterface.getDescription() != null) {
            String description = networkInterface.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (networkInterface.getGroups() != null) {
            java.util.List<GroupIdentifier> groups = networkInterface.getGroups();
            jsonWriter.name("Groups");
            jsonWriter.beginArray();
            for (GroupIdentifier groupsItem : groups) {
                if (groupsItem != null) {
                    GroupIdentifierJsonMarshaller.getInstance().marshall(groupsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (networkInterface.getInterfaceType() != null) {
            String interfaceType = networkInterface.getInterfaceType();
            jsonWriter.name("InterfaceType");
            jsonWriter.value(interfaceType);
        }
        if (networkInterface.getIpv6Addresses() != null) {
            java.util.List<NetworkInterfaceIpv6Address> ipv6Addresses = networkInterface
                    .getIpv6Addresses();
            jsonWriter.name("Ipv6Addresses");
            jsonWriter.beginArray();
            for (NetworkInterfaceIpv6Address ipv6AddressesItem : ipv6Addresses) {
                if (ipv6AddressesItem != null) {
                    NetworkInterfaceIpv6AddressJsonMarshaller.getInstance().marshall(
                            ipv6AddressesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (networkInterface.getMacAddress() != null) {
            String macAddress = networkInterface.getMacAddress();
            jsonWriter.name("MacAddress");
            jsonWriter.value(macAddress);
        }
        if (networkInterface.getNetworkInterfaceId() != null) {
            String networkInterfaceId = networkInterface.getNetworkInterfaceId();
            jsonWriter.name("NetworkInterfaceId");
            jsonWriter.value(networkInterfaceId);
        }
        if (networkInterface.getOutpostArn() != null) {
            String outpostArn = networkInterface.getOutpostArn();
            jsonWriter.name("OutpostArn");
            jsonWriter.value(outpostArn);
        }
        if (networkInterface.getOwnerId() != null) {
            String ownerId = networkInterface.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (networkInterface.getPrivateDnsName() != null) {
            String privateDnsName = networkInterface.getPrivateDnsName();
            jsonWriter.name("PrivateDnsName");
            jsonWriter.value(privateDnsName);
        }
        if (networkInterface.getPrivateIpAddress() != null) {
            String privateIpAddress = networkInterface.getPrivateIpAddress();
            jsonWriter.name("PrivateIpAddress");
            jsonWriter.value(privateIpAddress);
        }
        if (networkInterface.getPrivateIpAddresses() != null) {
            java.util.List<NetworkInterfacePrivateIpAddress> privateIpAddresses = networkInterface
                    .getPrivateIpAddresses();
            jsonWriter.name("PrivateIpAddresses");
            jsonWriter.beginArray();
            for (NetworkInterfacePrivateIpAddress privateIpAddressesItem : privateIpAddresses) {
                if (privateIpAddressesItem != null) {
                    NetworkInterfacePrivateIpAddressJsonMarshaller.getInstance().marshall(
                            privateIpAddressesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (networkInterface.getRequesterId() != null) {
            String requesterId = networkInterface.getRequesterId();
            jsonWriter.name("RequesterId");
            jsonWriter.value(requesterId);
        }
        if (networkInterface.getRequesterManaged() != null) {
            Boolean requesterManaged = networkInterface.getRequesterManaged();
            jsonWriter.name("RequesterManaged");
            jsonWriter.value(requesterManaged);
        }
        if (networkInterface.getSourceDestCheck() != null) {
            Boolean sourceDestCheck = networkInterface.getSourceDestCheck();
            jsonWriter.name("SourceDestCheck");
            jsonWriter.value(sourceDestCheck);
        }
        if (networkInterface.getStatus() != null) {
            String status = networkInterface.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (networkInterface.getSubnetId() != null) {
            String subnetId = networkInterface.getSubnetId();
            jsonWriter.name("SubnetId");
            jsonWriter.value(subnetId);
        }
        if (networkInterface.getTagSet() != null) {
            java.util.List<Tag> tagSet = networkInterface.getTagSet();
            jsonWriter.name("TagSet");
            jsonWriter.beginArray();
            for (Tag tagSetItem : tagSet) {
                if (tagSetItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagSetItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (networkInterface.getVpcId() != null) {
            String vpcId = networkInterface.getVpcId();
            jsonWriter.name("VpcId");
            jsonWriter.value(vpcId);
        }
        jsonWriter.endObject();
    }

    private static NetworkInterfaceJsonMarshaller instance;

    public static NetworkInterfaceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NetworkInterfaceJsonMarshaller();
        return instance;
    }
}
