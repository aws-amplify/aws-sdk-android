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
 * JSON marshaller for POJO ScheduledInstancesNetworkInterface
 */
class ScheduledInstancesNetworkInterfaceJsonMarshaller {

    public void marshall(ScheduledInstancesNetworkInterface scheduledInstancesNetworkInterface,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (scheduledInstancesNetworkInterface.getAssociatePublicIpAddress() != null) {
            Boolean associatePublicIpAddress = scheduledInstancesNetworkInterface
                    .getAssociatePublicIpAddress();
            jsonWriter.name("AssociatePublicIpAddress");
            jsonWriter.value(associatePublicIpAddress);
        }
        if (scheduledInstancesNetworkInterface.getDeleteOnTermination() != null) {
            Boolean deleteOnTermination = scheduledInstancesNetworkInterface
                    .getDeleteOnTermination();
            jsonWriter.name("DeleteOnTermination");
            jsonWriter.value(deleteOnTermination);
        }
        if (scheduledInstancesNetworkInterface.getDescription() != null) {
            String description = scheduledInstancesNetworkInterface.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (scheduledInstancesNetworkInterface.getDeviceIndex() != null) {
            Integer deviceIndex = scheduledInstancesNetworkInterface.getDeviceIndex();
            jsonWriter.name("DeviceIndex");
            jsonWriter.value(deviceIndex);
        }
        if (scheduledInstancesNetworkInterface.getGroups() != null) {
            java.util.List<String> groups = scheduledInstancesNetworkInterface.getGroups();
            jsonWriter.name("Groups");
            jsonWriter.beginArray();
            for (String groupsItem : groups) {
                if (groupsItem != null) {
                    jsonWriter.value(groupsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (scheduledInstancesNetworkInterface.getIpv6AddressCount() != null) {
            Integer ipv6AddressCount = scheduledInstancesNetworkInterface.getIpv6AddressCount();
            jsonWriter.name("Ipv6AddressCount");
            jsonWriter.value(ipv6AddressCount);
        }
        if (scheduledInstancesNetworkInterface.getIpv6Addresses() != null) {
            java.util.List<ScheduledInstancesIpv6Address> ipv6Addresses = scheduledInstancesNetworkInterface
                    .getIpv6Addresses();
            jsonWriter.name("Ipv6Addresses");
            jsonWriter.beginArray();
            for (ScheduledInstancesIpv6Address ipv6AddressesItem : ipv6Addresses) {
                if (ipv6AddressesItem != null) {
                    ScheduledInstancesIpv6AddressJsonMarshaller.getInstance().marshall(
                            ipv6AddressesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (scheduledInstancesNetworkInterface.getNetworkInterfaceId() != null) {
            String networkInterfaceId = scheduledInstancesNetworkInterface.getNetworkInterfaceId();
            jsonWriter.name("NetworkInterfaceId");
            jsonWriter.value(networkInterfaceId);
        }
        if (scheduledInstancesNetworkInterface.getPrivateIpAddress() != null) {
            String privateIpAddress = scheduledInstancesNetworkInterface.getPrivateIpAddress();
            jsonWriter.name("PrivateIpAddress");
            jsonWriter.value(privateIpAddress);
        }
        if (scheduledInstancesNetworkInterface.getPrivateIpAddressConfigs() != null) {
            java.util.List<ScheduledInstancesPrivateIpAddressConfig> privateIpAddressConfigs = scheduledInstancesNetworkInterface
                    .getPrivateIpAddressConfigs();
            jsonWriter.name("PrivateIpAddressConfigs");
            jsonWriter.beginArray();
            for (ScheduledInstancesPrivateIpAddressConfig privateIpAddressConfigsItem : privateIpAddressConfigs) {
                if (privateIpAddressConfigsItem != null) {
                    ScheduledInstancesPrivateIpAddressConfigJsonMarshaller.getInstance().marshall(
                            privateIpAddressConfigsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (scheduledInstancesNetworkInterface.getSecondaryPrivateIpAddressCount() != null) {
            Integer secondaryPrivateIpAddressCount = scheduledInstancesNetworkInterface
                    .getSecondaryPrivateIpAddressCount();
            jsonWriter.name("SecondaryPrivateIpAddressCount");
            jsonWriter.value(secondaryPrivateIpAddressCount);
        }
        if (scheduledInstancesNetworkInterface.getSubnetId() != null) {
            String subnetId = scheduledInstancesNetworkInterface.getSubnetId();
            jsonWriter.name("SubnetId");
            jsonWriter.value(subnetId);
        }
        jsonWriter.endObject();
    }

    private static ScheduledInstancesNetworkInterfaceJsonMarshaller instance;

    public static ScheduledInstancesNetworkInterfaceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledInstancesNetworkInterfaceJsonMarshaller();
        return instance;
    }
}
