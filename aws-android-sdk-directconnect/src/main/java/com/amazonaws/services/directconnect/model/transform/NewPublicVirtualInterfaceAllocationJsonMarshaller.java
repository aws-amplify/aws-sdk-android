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
 * JSON marshaller for POJO NewPublicVirtualInterfaceAllocation
 */
class NewPublicVirtualInterfaceAllocationJsonMarshaller {

    public void marshall(NewPublicVirtualInterfaceAllocation newPublicVirtualInterfaceAllocation,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (newPublicVirtualInterfaceAllocation.getVirtualInterfaceName() != null) {
            String virtualInterfaceName = newPublicVirtualInterfaceAllocation
                    .getVirtualInterfaceName();
            jsonWriter.name("virtualInterfaceName");
            jsonWriter.value(virtualInterfaceName);
        }
        if (newPublicVirtualInterfaceAllocation.getVlan() != null) {
            Integer vlan = newPublicVirtualInterfaceAllocation.getVlan();
            jsonWriter.name("vlan");
            jsonWriter.value(vlan);
        }
        if (newPublicVirtualInterfaceAllocation.getAsn() != null) {
            Integer asn = newPublicVirtualInterfaceAllocation.getAsn();
            jsonWriter.name("asn");
            jsonWriter.value(asn);
        }
        if (newPublicVirtualInterfaceAllocation.getAuthKey() != null) {
            String authKey = newPublicVirtualInterfaceAllocation.getAuthKey();
            jsonWriter.name("authKey");
            jsonWriter.value(authKey);
        }
        if (newPublicVirtualInterfaceAllocation.getAmazonAddress() != null) {
            String amazonAddress = newPublicVirtualInterfaceAllocation.getAmazonAddress();
            jsonWriter.name("amazonAddress");
            jsonWriter.value(amazonAddress);
        }
        if (newPublicVirtualInterfaceAllocation.getCustomerAddress() != null) {
            String customerAddress = newPublicVirtualInterfaceAllocation.getCustomerAddress();
            jsonWriter.name("customerAddress");
            jsonWriter.value(customerAddress);
        }
        if (newPublicVirtualInterfaceAllocation.getAddressFamily() != null) {
            String addressFamily = newPublicVirtualInterfaceAllocation.getAddressFamily();
            jsonWriter.name("addressFamily");
            jsonWriter.value(addressFamily);
        }
        if (newPublicVirtualInterfaceAllocation.getRouteFilterPrefixes() != null) {
            java.util.List<RouteFilterPrefix> routeFilterPrefixes = newPublicVirtualInterfaceAllocation
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
        if (newPublicVirtualInterfaceAllocation.getTags() != null) {
            java.util.List<Tag> tags = newPublicVirtualInterfaceAllocation.getTags();
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

    private static NewPublicVirtualInterfaceAllocationJsonMarshaller instance;

    public static NewPublicVirtualInterfaceAllocationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NewPublicVirtualInterfaceAllocationJsonMarshaller();
        return instance;
    }
}
