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
 * JSON marshaller for POJO NewPublicVirtualInterface
 */
class NewPublicVirtualInterfaceJsonMarshaller {

    public void marshall(NewPublicVirtualInterface newPublicVirtualInterface,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (newPublicVirtualInterface.getVirtualInterfaceName() != null) {
            String virtualInterfaceName = newPublicVirtualInterface.getVirtualInterfaceName();
            jsonWriter.name("virtualInterfaceName");
            jsonWriter.value(virtualInterfaceName);
        }
        if (newPublicVirtualInterface.getVlan() != null) {
            Integer vlan = newPublicVirtualInterface.getVlan();
            jsonWriter.name("vlan");
            jsonWriter.value(vlan);
        }
        if (newPublicVirtualInterface.getAsn() != null) {
            Integer asn = newPublicVirtualInterface.getAsn();
            jsonWriter.name("asn");
            jsonWriter.value(asn);
        }
        if (newPublicVirtualInterface.getAuthKey() != null) {
            String authKey = newPublicVirtualInterface.getAuthKey();
            jsonWriter.name("authKey");
            jsonWriter.value(authKey);
        }
        if (newPublicVirtualInterface.getAmazonAddress() != null) {
            String amazonAddress = newPublicVirtualInterface.getAmazonAddress();
            jsonWriter.name("amazonAddress");
            jsonWriter.value(amazonAddress);
        }
        if (newPublicVirtualInterface.getCustomerAddress() != null) {
            String customerAddress = newPublicVirtualInterface.getCustomerAddress();
            jsonWriter.name("customerAddress");
            jsonWriter.value(customerAddress);
        }
        if (newPublicVirtualInterface.getAddressFamily() != null) {
            String addressFamily = newPublicVirtualInterface.getAddressFamily();
            jsonWriter.name("addressFamily");
            jsonWriter.value(addressFamily);
        }
        if (newPublicVirtualInterface.getRouteFilterPrefixes() != null) {
            java.util.List<RouteFilterPrefix> routeFilterPrefixes = newPublicVirtualInterface
                    .getRouteFilterPrefixes();
            jsonWriter.name("routeFilterPrefixes");
            jsonWriter.beginArray();
            for (RouteFilterPrefix routeFilterPrefixesItem : routeFilterPrefixes) {
                if (routeFilterPrefixesItem != null) {
                    RouteFilterPrefixJsonMarshaller.getInstance().marshall(routeFilterPrefixesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (newPublicVirtualInterface.getTags() != null) {
            java.util.List<Tag> tags = newPublicVirtualInterface.getTags();
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

    private static NewPublicVirtualInterfaceJsonMarshaller instance;

    public static NewPublicVirtualInterfaceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NewPublicVirtualInterfaceJsonMarshaller();
        return instance;
    }
}
