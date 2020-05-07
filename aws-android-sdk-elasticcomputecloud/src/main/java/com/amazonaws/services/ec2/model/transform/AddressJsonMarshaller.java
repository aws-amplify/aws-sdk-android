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
 * JSON marshaller for POJO Address
 */
class AddressJsonMarshaller {

    public void marshall(Address address, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (address.getInstanceId() != null) {
            String instanceId = address.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (address.getPublicIp() != null) {
            String publicIp = address.getPublicIp();
            jsonWriter.name("PublicIp");
            jsonWriter.value(publicIp);
        }
        if (address.getAllocationId() != null) {
            String allocationId = address.getAllocationId();
            jsonWriter.name("AllocationId");
            jsonWriter.value(allocationId);
        }
        if (address.getAssociationId() != null) {
            String associationId = address.getAssociationId();
            jsonWriter.name("AssociationId");
            jsonWriter.value(associationId);
        }
        if (address.getDomain() != null) {
            String domain = address.getDomain();
            jsonWriter.name("Domain");
            jsonWriter.value(domain);
        }
        if (address.getNetworkInterfaceId() != null) {
            String networkInterfaceId = address.getNetworkInterfaceId();
            jsonWriter.name("NetworkInterfaceId");
            jsonWriter.value(networkInterfaceId);
        }
        if (address.getNetworkInterfaceOwnerId() != null) {
            String networkInterfaceOwnerId = address.getNetworkInterfaceOwnerId();
            jsonWriter.name("NetworkInterfaceOwnerId");
            jsonWriter.value(networkInterfaceOwnerId);
        }
        if (address.getPrivateIpAddress() != null) {
            String privateIpAddress = address.getPrivateIpAddress();
            jsonWriter.name("PrivateIpAddress");
            jsonWriter.value(privateIpAddress);
        }
        if (address.getTags() != null) {
            java.util.List<Tag> tags = address.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (address.getPublicIpv4Pool() != null) {
            String publicIpv4Pool = address.getPublicIpv4Pool();
            jsonWriter.name("PublicIpv4Pool");
            jsonWriter.value(publicIpv4Pool);
        }
        if (address.getNetworkBorderGroup() != null) {
            String networkBorderGroup = address.getNetworkBorderGroup();
            jsonWriter.name("NetworkBorderGroup");
            jsonWriter.value(networkBorderGroup);
        }
        if (address.getCustomerOwnedIp() != null) {
            String customerOwnedIp = address.getCustomerOwnedIp();
            jsonWriter.name("CustomerOwnedIp");
            jsonWriter.value(customerOwnedIp);
        }
        if (address.getCustomerOwnedIpv4Pool() != null) {
            String customerOwnedIpv4Pool = address.getCustomerOwnedIpv4Pool();
            jsonWriter.name("CustomerOwnedIpv4Pool");
            jsonWriter.value(customerOwnedIpv4Pool);
        }
        jsonWriter.endObject();
    }

    private static AddressJsonMarshaller instance;

    public static AddressJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AddressJsonMarshaller();
        return instance;
    }
}
