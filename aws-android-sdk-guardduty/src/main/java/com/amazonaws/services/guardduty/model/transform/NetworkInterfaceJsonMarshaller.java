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

package com.amazonaws.services.guardduty.model.transform;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NetworkInterface
 */
class NetworkInterfaceJsonMarshaller {

    public void marshall(NetworkInterface networkInterface, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (networkInterface.getIpv6Addresses() != null) {
            java.util.List<String> ipv6Addresses = networkInterface.getIpv6Addresses();
            jsonWriter.name("Ipv6Addresses");
            jsonWriter.beginArray();
            for (String ipv6AddressesItem : ipv6Addresses) {
                if (ipv6AddressesItem != null) {
                    jsonWriter.value(ipv6AddressesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (networkInterface.getNetworkInterfaceId() != null) {
            String networkInterfaceId = networkInterface.getNetworkInterfaceId();
            jsonWriter.name("NetworkInterfaceId");
            jsonWriter.value(networkInterfaceId);
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
            java.util.List<PrivateIpAddressDetails> privateIpAddresses = networkInterface
                    .getPrivateIpAddresses();
            jsonWriter.name("PrivateIpAddresses");
            jsonWriter.beginArray();
            for (PrivateIpAddressDetails privateIpAddressesItem : privateIpAddresses) {
                if (privateIpAddressesItem != null) {
                    PrivateIpAddressDetailsJsonMarshaller.getInstance().marshall(
                            privateIpAddressesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (networkInterface.getPublicDnsName() != null) {
            String publicDnsName = networkInterface.getPublicDnsName();
            jsonWriter.name("PublicDnsName");
            jsonWriter.value(publicDnsName);
        }
        if (networkInterface.getPublicIp() != null) {
            String publicIp = networkInterface.getPublicIp();
            jsonWriter.name("PublicIp");
            jsonWriter.value(publicIp);
        }
        if (networkInterface.getSecurityGroups() != null) {
            java.util.List<SecurityGroup> securityGroups = networkInterface.getSecurityGroups();
            jsonWriter.name("SecurityGroups");
            jsonWriter.beginArray();
            for (SecurityGroup securityGroupsItem : securityGroups) {
                if (securityGroupsItem != null) {
                    SecurityGroupJsonMarshaller.getInstance().marshall(securityGroupsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (networkInterface.getSubnetId() != null) {
            String subnetId = networkInterface.getSubnetId();
            jsonWriter.name("SubnetId");
            jsonWriter.value(subnetId);
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
