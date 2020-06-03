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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO VirtualInterface
 */
class VirtualInterfaceJsonUnmarshaller implements
        Unmarshaller<VirtualInterface, JsonUnmarshallerContext> {

    public VirtualInterface unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        VirtualInterface virtualInterface = new VirtualInterface();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ownerAccount")) {
                virtualInterface.setOwnerAccount(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceId")) {
                virtualInterface.setVirtualInterfaceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                virtualInterface.setLocation(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionId")) {
                virtualInterface.setConnectionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceType")) {
                virtualInterface.setVirtualInterfaceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceName")) {
                virtualInterface.setVirtualInterfaceName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("vlan")) {
                virtualInterface.setVlan(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("asn")) {
                virtualInterface.setAsn(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("amazonSideAsn")) {
                virtualInterface.setAmazonSideAsn(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("authKey")) {
                virtualInterface.setAuthKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("amazonAddress")) {
                virtualInterface.setAmazonAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("customerAddress")) {
                virtualInterface.setCustomerAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("addressFamily")) {
                virtualInterface.setAddressFamily(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceState")) {
                virtualInterface.setVirtualInterfaceState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("customerRouterConfig")) {
                virtualInterface.setCustomerRouterConfig(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("mtu")) {
                virtualInterface.setMtu(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("jumboFrameCapable")) {
                virtualInterface.setJumboFrameCapable(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualGatewayId")) {
                virtualInterface.setVirtualGatewayId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("directConnectGatewayId")) {
                virtualInterface.setDirectConnectGatewayId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("routeFilterPrefixes")) {
                virtualInterface.setRouteFilterPrefixes(new ListUnmarshaller<RouteFilterPrefix>(
                        RouteFilterPrefixJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("bgpPeers")) {
                virtualInterface.setBgpPeers(new ListUnmarshaller<BGPPeer>(BGPPeerJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("region")) {
                virtualInterface.setRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsDeviceV2")) {
                virtualInterface.setAwsDeviceV2(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                virtualInterface.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return virtualInterface;
    }

    private static VirtualInterfaceJsonUnmarshaller instance;

    public static VirtualInterfaceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VirtualInterfaceJsonUnmarshaller();
        return instance;
    }
}
