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
 * JSON unmarshaller for response AllocatePublicVirtualInterfaceResult
 */
public class AllocatePublicVirtualInterfaceResultJsonUnmarshaller implements
        Unmarshaller<AllocatePublicVirtualInterfaceResult, JsonUnmarshallerContext> {

    public AllocatePublicVirtualInterfaceResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AllocatePublicVirtualInterfaceResult allocatePublicVirtualInterfaceResult = new AllocatePublicVirtualInterfaceResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ownerAccount")) {
                allocatePublicVirtualInterfaceResult.setOwnerAccount(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceId")) {
                allocatePublicVirtualInterfaceResult.setVirtualInterfaceId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                allocatePublicVirtualInterfaceResult.setLocation(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionId")) {
                allocatePublicVirtualInterfaceResult.setConnectionId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceType")) {
                allocatePublicVirtualInterfaceResult.setVirtualInterfaceType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceName")) {
                allocatePublicVirtualInterfaceResult.setVirtualInterfaceName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("vlan")) {
                allocatePublicVirtualInterfaceResult.setVlan(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("asn")) {
                allocatePublicVirtualInterfaceResult.setAsn(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("amazonSideAsn")) {
                allocatePublicVirtualInterfaceResult.setAmazonSideAsn(LongJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("authKey")) {
                allocatePublicVirtualInterfaceResult.setAuthKey(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("amazonAddress")) {
                allocatePublicVirtualInterfaceResult.setAmazonAddress(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("customerAddress")) {
                allocatePublicVirtualInterfaceResult.setCustomerAddress(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("addressFamily")) {
                allocatePublicVirtualInterfaceResult.setAddressFamily(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceState")) {
                allocatePublicVirtualInterfaceResult
                        .setVirtualInterfaceState(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("customerRouterConfig")) {
                allocatePublicVirtualInterfaceResult.setCustomerRouterConfig(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("mtu")) {
                allocatePublicVirtualInterfaceResult.setMtu(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("jumboFrameCapable")) {
                allocatePublicVirtualInterfaceResult.setJumboFrameCapable(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualGatewayId")) {
                allocatePublicVirtualInterfaceResult.setVirtualGatewayId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("directConnectGatewayId")) {
                allocatePublicVirtualInterfaceResult
                        .setDirectConnectGatewayId(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("routeFilterPrefixes")) {
                allocatePublicVirtualInterfaceResult
                        .setRouteFilterPrefixes(new ListUnmarshaller<RouteFilterPrefix>(
                                RouteFilterPrefixJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("bgpPeers")) {
                allocatePublicVirtualInterfaceResult.setBgpPeers(new ListUnmarshaller<BGPPeer>(
                        BGPPeerJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("region")) {
                allocatePublicVirtualInterfaceResult.setRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsDeviceV2")) {
                allocatePublicVirtualInterfaceResult.setAwsDeviceV2(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                allocatePublicVirtualInterfaceResult.setTags(new ListUnmarshaller<Tag>(
                        TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return allocatePublicVirtualInterfaceResult;
    }

    private static AllocatePublicVirtualInterfaceResultJsonUnmarshaller instance;

    public static AllocatePublicVirtualInterfaceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AllocatePublicVirtualInterfaceResultJsonUnmarshaller();
        return instance;
    }
}
