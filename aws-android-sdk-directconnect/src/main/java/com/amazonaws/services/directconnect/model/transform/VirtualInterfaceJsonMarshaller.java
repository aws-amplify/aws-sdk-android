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
 * JSON marshaller for POJO VirtualInterface
 */
class VirtualInterfaceJsonMarshaller {

    public void marshall(VirtualInterface virtualInterface, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (virtualInterface.getOwnerAccount() != null) {
            String ownerAccount = virtualInterface.getOwnerAccount();
            jsonWriter.name("ownerAccount");
            jsonWriter.value(ownerAccount);
        }
        if (virtualInterface.getVirtualInterfaceId() != null) {
            String virtualInterfaceId = virtualInterface.getVirtualInterfaceId();
            jsonWriter.name("virtualInterfaceId");
            jsonWriter.value(virtualInterfaceId);
        }
        if (virtualInterface.getLocation() != null) {
            String location = virtualInterface.getLocation();
            jsonWriter.name("location");
            jsonWriter.value(location);
        }
        if (virtualInterface.getConnectionId() != null) {
            String connectionId = virtualInterface.getConnectionId();
            jsonWriter.name("connectionId");
            jsonWriter.value(connectionId);
        }
        if (virtualInterface.getVirtualInterfaceType() != null) {
            String virtualInterfaceType = virtualInterface.getVirtualInterfaceType();
            jsonWriter.name("virtualInterfaceType");
            jsonWriter.value(virtualInterfaceType);
        }
        if (virtualInterface.getVirtualInterfaceName() != null) {
            String virtualInterfaceName = virtualInterface.getVirtualInterfaceName();
            jsonWriter.name("virtualInterfaceName");
            jsonWriter.value(virtualInterfaceName);
        }
        if (virtualInterface.getVlan() != null) {
            Integer vlan = virtualInterface.getVlan();
            jsonWriter.name("vlan");
            jsonWriter.value(vlan);
        }
        if (virtualInterface.getAsn() != null) {
            Integer asn = virtualInterface.getAsn();
            jsonWriter.name("asn");
            jsonWriter.value(asn);
        }
        if (virtualInterface.getAmazonSideAsn() != null) {
            Long amazonSideAsn = virtualInterface.getAmazonSideAsn();
            jsonWriter.name("amazonSideAsn");
            jsonWriter.value(amazonSideAsn);
        }
        if (virtualInterface.getAuthKey() != null) {
            String authKey = virtualInterface.getAuthKey();
            jsonWriter.name("authKey");
            jsonWriter.value(authKey);
        }
        if (virtualInterface.getAmazonAddress() != null) {
            String amazonAddress = virtualInterface.getAmazonAddress();
            jsonWriter.name("amazonAddress");
            jsonWriter.value(amazonAddress);
        }
        if (virtualInterface.getCustomerAddress() != null) {
            String customerAddress = virtualInterface.getCustomerAddress();
            jsonWriter.name("customerAddress");
            jsonWriter.value(customerAddress);
        }
        if (virtualInterface.getAddressFamily() != null) {
            String addressFamily = virtualInterface.getAddressFamily();
            jsonWriter.name("addressFamily");
            jsonWriter.value(addressFamily);
        }
        if (virtualInterface.getVirtualInterfaceState() != null) {
            String virtualInterfaceState = virtualInterface.getVirtualInterfaceState();
            jsonWriter.name("virtualInterfaceState");
            jsonWriter.value(virtualInterfaceState);
        }
        if (virtualInterface.getCustomerRouterConfig() != null) {
            String customerRouterConfig = virtualInterface.getCustomerRouterConfig();
            jsonWriter.name("customerRouterConfig");
            jsonWriter.value(customerRouterConfig);
        }
        if (virtualInterface.getMtu() != null) {
            Integer mtu = virtualInterface.getMtu();
            jsonWriter.name("mtu");
            jsonWriter.value(mtu);
        }
        if (virtualInterface.getJumboFrameCapable() != null) {
            Boolean jumboFrameCapable = virtualInterface.getJumboFrameCapable();
            jsonWriter.name("jumboFrameCapable");
            jsonWriter.value(jumboFrameCapable);
        }
        if (virtualInterface.getVirtualGatewayId() != null) {
            String virtualGatewayId = virtualInterface.getVirtualGatewayId();
            jsonWriter.name("virtualGatewayId");
            jsonWriter.value(virtualGatewayId);
        }
        if (virtualInterface.getDirectConnectGatewayId() != null) {
            String directConnectGatewayId = virtualInterface.getDirectConnectGatewayId();
            jsonWriter.name("directConnectGatewayId");
            jsonWriter.value(directConnectGatewayId);
        }
        if (virtualInterface.getRouteFilterPrefixes() != null) {
            java.util.List<RouteFilterPrefix> routeFilterPrefixes = virtualInterface
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
        if (virtualInterface.getBgpPeers() != null) {
            java.util.List<BGPPeer> bgpPeers = virtualInterface.getBgpPeers();
            jsonWriter.name("bgpPeers");
            jsonWriter.beginArray();
            for (BGPPeer bgpPeersItem : bgpPeers) {
                if (bgpPeersItem != null) {
                    BGPPeerJsonMarshaller.getInstance().marshall(bgpPeersItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (virtualInterface.getRegion() != null) {
            String region = virtualInterface.getRegion();
            jsonWriter.name("region");
            jsonWriter.value(region);
        }
        if (virtualInterface.getAwsDeviceV2() != null) {
            String awsDeviceV2 = virtualInterface.getAwsDeviceV2();
            jsonWriter.name("awsDeviceV2");
            jsonWriter.value(awsDeviceV2);
        }
        if (virtualInterface.getTags() != null) {
            java.util.List<Tag> tags = virtualInterface.getTags();
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

    private static VirtualInterfaceJsonMarshaller instance;

    public static VirtualInterfaceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VirtualInterfaceJsonMarshaller();
        return instance;
    }
}
