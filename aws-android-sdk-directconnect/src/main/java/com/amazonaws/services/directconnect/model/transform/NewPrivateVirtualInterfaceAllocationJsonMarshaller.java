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

package com.amazonaws.services.directconnect.model.transform;

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NewPrivateVirtualInterfaceAllocation
 */
class NewPrivateVirtualInterfaceAllocationJsonMarshaller {

    public void marshall(NewPrivateVirtualInterfaceAllocation newPrivateVirtualInterfaceAllocation,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (newPrivateVirtualInterfaceAllocation.getVirtualInterfaceName() != null) {
            String virtualInterfaceName = newPrivateVirtualInterfaceAllocation
                    .getVirtualInterfaceName();
            jsonWriter.name("virtualInterfaceName");
            jsonWriter.value(virtualInterfaceName);
        }
        if (newPrivateVirtualInterfaceAllocation.getVlan() != null) {
            Integer vlan = newPrivateVirtualInterfaceAllocation.getVlan();
            jsonWriter.name("vlan");
            jsonWriter.value(vlan);
        }
        if (newPrivateVirtualInterfaceAllocation.getAsn() != null) {
            Integer asn = newPrivateVirtualInterfaceAllocation.getAsn();
            jsonWriter.name("asn");
            jsonWriter.value(asn);
        }
        if (newPrivateVirtualInterfaceAllocation.getMtu() != null) {
            Integer mtu = newPrivateVirtualInterfaceAllocation.getMtu();
            jsonWriter.name("mtu");
            jsonWriter.value(mtu);
        }
        if (newPrivateVirtualInterfaceAllocation.getAuthKey() != null) {
            String authKey = newPrivateVirtualInterfaceAllocation.getAuthKey();
            jsonWriter.name("authKey");
            jsonWriter.value(authKey);
        }
        if (newPrivateVirtualInterfaceAllocation.getAmazonAddress() != null) {
            String amazonAddress = newPrivateVirtualInterfaceAllocation.getAmazonAddress();
            jsonWriter.name("amazonAddress");
            jsonWriter.value(amazonAddress);
        }
        if (newPrivateVirtualInterfaceAllocation.getAddressFamily() != null) {
            String addressFamily = newPrivateVirtualInterfaceAllocation.getAddressFamily();
            jsonWriter.name("addressFamily");
            jsonWriter.value(addressFamily);
        }
        if (newPrivateVirtualInterfaceAllocation.getCustomerAddress() != null) {
            String customerAddress = newPrivateVirtualInterfaceAllocation.getCustomerAddress();
            jsonWriter.name("customerAddress");
            jsonWriter.value(customerAddress);
        }
        if (newPrivateVirtualInterfaceAllocation.getTags() != null) {
            java.util.List<Tag> tags = newPrivateVirtualInterfaceAllocation.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static NewPrivateVirtualInterfaceAllocationJsonMarshaller instance;

    public static NewPrivateVirtualInterfaceAllocationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NewPrivateVirtualInterfaceAllocationJsonMarshaller();
        return instance;
    }
}
