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
 * JSON marshaller for POJO NewPrivateVirtualInterface
 */
class NewPrivateVirtualInterfaceJsonMarshaller {

    public void marshall(NewPrivateVirtualInterface newPrivateVirtualInterface,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (newPrivateVirtualInterface.getVirtualInterfaceName() != null) {
            String virtualInterfaceName = newPrivateVirtualInterface.getVirtualInterfaceName();
            jsonWriter.name("virtualInterfaceName");
            jsonWriter.value(virtualInterfaceName);
        }
        if (newPrivateVirtualInterface.getVlan() != null) {
            Integer vlan = newPrivateVirtualInterface.getVlan();
            jsonWriter.name("vlan");
            jsonWriter.value(vlan);
        }
        if (newPrivateVirtualInterface.getAsn() != null) {
            Integer asn = newPrivateVirtualInterface.getAsn();
            jsonWriter.name("asn");
            jsonWriter.value(asn);
        }
        if (newPrivateVirtualInterface.getMtu() != null) {
            Integer mtu = newPrivateVirtualInterface.getMtu();
            jsonWriter.name("mtu");
            jsonWriter.value(mtu);
        }
        if (newPrivateVirtualInterface.getAuthKey() != null) {
            String authKey = newPrivateVirtualInterface.getAuthKey();
            jsonWriter.name("authKey");
            jsonWriter.value(authKey);
        }
        if (newPrivateVirtualInterface.getAmazonAddress() != null) {
            String amazonAddress = newPrivateVirtualInterface.getAmazonAddress();
            jsonWriter.name("amazonAddress");
            jsonWriter.value(amazonAddress);
        }
        if (newPrivateVirtualInterface.getCustomerAddress() != null) {
            String customerAddress = newPrivateVirtualInterface.getCustomerAddress();
            jsonWriter.name("customerAddress");
            jsonWriter.value(customerAddress);
        }
        if (newPrivateVirtualInterface.getAddressFamily() != null) {
            String addressFamily = newPrivateVirtualInterface.getAddressFamily();
            jsonWriter.name("addressFamily");
            jsonWriter.value(addressFamily);
        }
        if (newPrivateVirtualInterface.getVirtualGatewayId() != null) {
            String virtualGatewayId = newPrivateVirtualInterface.getVirtualGatewayId();
            jsonWriter.name("virtualGatewayId");
            jsonWriter.value(virtualGatewayId);
        }
        if (newPrivateVirtualInterface.getDirectConnectGatewayId() != null) {
            String directConnectGatewayId = newPrivateVirtualInterface.getDirectConnectGatewayId();
            jsonWriter.name("directConnectGatewayId");
            jsonWriter.value(directConnectGatewayId);
        }
        if (newPrivateVirtualInterface.getTags() != null) {
            java.util.List<Tag> tags = newPrivateVirtualInterface.getTags();
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

    private static NewPrivateVirtualInterfaceJsonMarshaller instance;

    public static NewPrivateVirtualInterfaceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NewPrivateVirtualInterfaceJsonMarshaller();
        return instance;
    }
}
