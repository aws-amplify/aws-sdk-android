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
 * JSON unmarshaller for response AllocatePrivateVirtualInterfaceResult
 */
public class AllocatePrivateVirtualInterfaceResultJsonUnmarshaller implements
        Unmarshaller<AllocatePrivateVirtualInterfaceResult, JsonUnmarshallerContext> {

    public AllocatePrivateVirtualInterfaceResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AllocatePrivateVirtualInterfaceResult allocatePrivateVirtualInterfaceResult = new AllocatePrivateVirtualInterfaceResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ownerAccount")) {
                allocatePrivateVirtualInterfaceResult.setOwnerAccount(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceId")) {
                allocatePrivateVirtualInterfaceResult.setVirtualInterfaceId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                allocatePrivateVirtualInterfaceResult.setLocation(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionId")) {
                allocatePrivateVirtualInterfaceResult.setConnectionId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceType")) {
                allocatePrivateVirtualInterfaceResult
                        .setVirtualInterfaceType(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("virtualInterfaceName")) {
                allocatePrivateVirtualInterfaceResult
                        .setVirtualInterfaceName(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("vlan")) {
                allocatePrivateVirtualInterfaceResult.setVlan(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("asn")) {
                allocatePrivateVirtualInterfaceResult.setAsn(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("amazonSideAsn")) {
                allocatePrivateVirtualInterfaceResult.setAmazonSideAsn(LongJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("authKey")) {
                allocatePrivateVirtualInterfaceResult.setAuthKey(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("amazonAddress")) {
                allocatePrivateVirtualInterfaceResult.setAmazonAddress(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("customerAddress")) {
                allocatePrivateVirtualInterfaceResult.setCustomerAddress(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("addressFamily")) {
                allocatePrivateVirtualInterfaceResult.setAddressFamily(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceState")) {
                allocatePrivateVirtualInterfaceResult
                        .setVirtualInterfaceState(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("customerRouterConfig")) {
                allocatePrivateVirtualInterfaceResult
                        .setCustomerRouterConfig(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("mtu")) {
                allocatePrivateVirtualInterfaceResult.setMtu(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("jumboFrameCapable")) {
                allocatePrivateVirtualInterfaceResult.setJumboFrameCapable(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualGatewayId")) {
                allocatePrivateVirtualInterfaceResult.setVirtualGatewayId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("directConnectGatewayId")) {
                allocatePrivateVirtualInterfaceResult
                        .setDirectConnectGatewayId(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("routeFilterPrefixes")) {
                allocatePrivateVirtualInterfaceResult
                        .setRouteFilterPrefixes(new ListUnmarshaller<RouteFilterPrefix>(
                                RouteFilterPrefixJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("bgpPeers")) {
                allocatePrivateVirtualInterfaceResult.setBgpPeers(new ListUnmarshaller<BGPPeer>(
                        BGPPeerJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("region")) {
                allocatePrivateVirtualInterfaceResult.setRegion(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsDeviceV2")) {
                allocatePrivateVirtualInterfaceResult.setAwsDeviceV2(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                allocatePrivateVirtualInterfaceResult.setTags(new ListUnmarshaller<Tag>(
                        TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return allocatePrivateVirtualInterfaceResult;
    }

    private static AllocatePrivateVirtualInterfaceResultJsonUnmarshaller instance;

    public static AllocatePrivateVirtualInterfaceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AllocatePrivateVirtualInterfaceResultJsonUnmarshaller();
        return instance;
    }
}
