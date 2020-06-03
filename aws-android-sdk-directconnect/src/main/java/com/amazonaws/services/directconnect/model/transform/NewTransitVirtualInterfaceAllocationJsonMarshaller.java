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
 * JSON marshaller for POJO NewTransitVirtualInterfaceAllocation
 */
class NewTransitVirtualInterfaceAllocationJsonMarshaller {

    public void marshall(NewTransitVirtualInterfaceAllocation newTransitVirtualInterfaceAllocation,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (newTransitVirtualInterfaceAllocation.getVirtualInterfaceName() != null) {
            String virtualInterfaceName = newTransitVirtualInterfaceAllocation
                    .getVirtualInterfaceName();
            jsonWriter.name("virtualInterfaceName");
            jsonWriter.value(virtualInterfaceName);
        }
        if (newTransitVirtualInterfaceAllocation.getVlan() != null) {
            Integer vlan = newTransitVirtualInterfaceAllocation.getVlan();
            jsonWriter.name("vlan");
            jsonWriter.value(vlan);
        }
        if (newTransitVirtualInterfaceAllocation.getAsn() != null) {
            Integer asn = newTransitVirtualInterfaceAllocation.getAsn();
            jsonWriter.name("asn");
            jsonWriter.value(asn);
        }
        if (newTransitVirtualInterfaceAllocation.getMtu() != null) {
            Integer mtu = newTransitVirtualInterfaceAllocation.getMtu();
            jsonWriter.name("mtu");
            jsonWriter.value(mtu);
        }
        if (newTransitVirtualInterfaceAllocation.getAuthKey() != null) {
            String authKey = newTransitVirtualInterfaceAllocation.getAuthKey();
            jsonWriter.name("authKey");
            jsonWriter.value(authKey);
        }
        if (newTransitVirtualInterfaceAllocation.getAmazonAddress() != null) {
            String amazonAddress = newTransitVirtualInterfaceAllocation.getAmazonAddress();
            jsonWriter.name("amazonAddress");
            jsonWriter.value(amazonAddress);
        }
        if (newTransitVirtualInterfaceAllocation.getCustomerAddress() != null) {
            String customerAddress = newTransitVirtualInterfaceAllocation.getCustomerAddress();
            jsonWriter.name("customerAddress");
            jsonWriter.value(customerAddress);
        }
        if (newTransitVirtualInterfaceAllocation.getAddressFamily() != null) {
            String addressFamily = newTransitVirtualInterfaceAllocation.getAddressFamily();
            jsonWriter.name("addressFamily");
            jsonWriter.value(addressFamily);
        }
        if (newTransitVirtualInterfaceAllocation.getTags() != null) {
            java.util.List<Tag> tags = newTransitVirtualInterfaceAllocation.getTags();
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

    private static NewTransitVirtualInterfaceAllocationJsonMarshaller instance;

    public static NewTransitVirtualInterfaceAllocationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NewTransitVirtualInterfaceAllocationJsonMarshaller();
        return instance;
    }
}
