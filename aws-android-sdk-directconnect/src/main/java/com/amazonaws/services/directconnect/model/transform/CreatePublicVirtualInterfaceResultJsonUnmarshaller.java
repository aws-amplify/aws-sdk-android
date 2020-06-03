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
 * JSON unmarshaller for response CreatePublicVirtualInterfaceResult
 */
public class CreatePublicVirtualInterfaceResultJsonUnmarshaller implements
        Unmarshaller<CreatePublicVirtualInterfaceResult, JsonUnmarshallerContext> {

    public CreatePublicVirtualInterfaceResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        CreatePublicVirtualInterfaceResult createPublicVirtualInterfaceResult = new CreatePublicVirtualInterfaceResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ownerAccount")) {
                createPublicVirtualInterfaceResult.setOwnerAccount(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceId")) {
                createPublicVirtualInterfaceResult.setVirtualInterfaceId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                createPublicVirtualInterfaceResult.setLocation(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionId")) {
                createPublicVirtualInterfaceResult.setConnectionId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceType")) {
                createPublicVirtualInterfaceResult.setVirtualInterfaceType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceName")) {
                createPublicVirtualInterfaceResult.setVirtualInterfaceName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("vlan")) {
                createPublicVirtualInterfaceResult.setVlan(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("asn")) {
                createPublicVirtualInterfaceResult.setAsn(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("amazonSideAsn")) {
                createPublicVirtualInterfaceResult.setAmazonSideAsn(LongJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("authKey")) {
                createPublicVirtualInterfaceResult.setAuthKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("amazonAddress")) {
                createPublicVirtualInterfaceResult.setAmazonAddress(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("customerAddress")) {
                createPublicVirtualInterfaceResult.setCustomerAddress(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("addressFamily")) {
                createPublicVirtualInterfaceResult.setAddressFamily(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceState")) {
                createPublicVirtualInterfaceResult.setVirtualInterfaceState(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("customerRouterConfig")) {
                createPublicVirtualInterfaceResult.setCustomerRouterConfig(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("mtu")) {
                createPublicVirtualInterfaceResult.setMtu(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("jumboFrameCapable")) {
                createPublicVirtualInterfaceResult.setJumboFrameCapable(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualGatewayId")) {
                createPublicVirtualInterfaceResult.setVirtualGatewayId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("directConnectGatewayId")) {
                createPublicVirtualInterfaceResult.setDirectConnectGatewayId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("routeFilterPrefixes")) {
                createPublicVirtualInterfaceResult
                        .setRouteFilterPrefixes(new ListUnmarshaller<RouteFilterPrefix>(
                                RouteFilterPrefixJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("bgpPeers")) {
                createPublicVirtualInterfaceResult.setBgpPeers(new ListUnmarshaller<BGPPeer>(
                        BGPPeerJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("region")) {
                createPublicVirtualInterfaceResult.setRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsDeviceV2")) {
                createPublicVirtualInterfaceResult.setAwsDeviceV2(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                createPublicVirtualInterfaceResult.setTags(new ListUnmarshaller<Tag>(
                        TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createPublicVirtualInterfaceResult;
    }

    private static CreatePublicVirtualInterfaceResultJsonUnmarshaller instance;

    public static CreatePublicVirtualInterfaceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreatePublicVirtualInterfaceResultJsonUnmarshaller();
        return instance;
    }
}
