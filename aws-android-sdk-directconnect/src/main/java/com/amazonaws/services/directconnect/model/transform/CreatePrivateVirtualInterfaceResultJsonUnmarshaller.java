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
 * JSON unmarshaller for response CreatePrivateVirtualInterfaceResult
 */
public class CreatePrivateVirtualInterfaceResultJsonUnmarshaller implements
        Unmarshaller<CreatePrivateVirtualInterfaceResult, JsonUnmarshallerContext> {

    public CreatePrivateVirtualInterfaceResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        CreatePrivateVirtualInterfaceResult createPrivateVirtualInterfaceResult = new CreatePrivateVirtualInterfaceResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ownerAccount")) {
                createPrivateVirtualInterfaceResult.setOwnerAccount(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceId")) {
                createPrivateVirtualInterfaceResult.setVirtualInterfaceId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                createPrivateVirtualInterfaceResult.setLocation(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionId")) {
                createPrivateVirtualInterfaceResult.setConnectionId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceType")) {
                createPrivateVirtualInterfaceResult.setVirtualInterfaceType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceName")) {
                createPrivateVirtualInterfaceResult.setVirtualInterfaceName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("vlan")) {
                createPrivateVirtualInterfaceResult.setVlan(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("asn")) {
                createPrivateVirtualInterfaceResult.setAsn(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("amazonSideAsn")) {
                createPrivateVirtualInterfaceResult.setAmazonSideAsn(LongJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("authKey")) {
                createPrivateVirtualInterfaceResult.setAuthKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("amazonAddress")) {
                createPrivateVirtualInterfaceResult.setAmazonAddress(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("customerAddress")) {
                createPrivateVirtualInterfaceResult.setCustomerAddress(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("addressFamily")) {
                createPrivateVirtualInterfaceResult.setAddressFamily(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceState")) {
                createPrivateVirtualInterfaceResult.setVirtualInterfaceState(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("customerRouterConfig")) {
                createPrivateVirtualInterfaceResult.setCustomerRouterConfig(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("mtu")) {
                createPrivateVirtualInterfaceResult.setMtu(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("jumboFrameCapable")) {
                createPrivateVirtualInterfaceResult.setJumboFrameCapable(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualGatewayId")) {
                createPrivateVirtualInterfaceResult.setVirtualGatewayId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("directConnectGatewayId")) {
                createPrivateVirtualInterfaceResult
                        .setDirectConnectGatewayId(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("routeFilterPrefixes")) {
                createPrivateVirtualInterfaceResult
                        .setRouteFilterPrefixes(new ListUnmarshaller<RouteFilterPrefix>(
                                RouteFilterPrefixJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("bgpPeers")) {
                createPrivateVirtualInterfaceResult.setBgpPeers(new ListUnmarshaller<BGPPeer>(
                        BGPPeerJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("region")) {
                createPrivateVirtualInterfaceResult.setRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsDeviceV2")) {
                createPrivateVirtualInterfaceResult.setAwsDeviceV2(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                createPrivateVirtualInterfaceResult.setTags(new ListUnmarshaller<Tag>(
                        TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createPrivateVirtualInterfaceResult;
    }

    private static CreatePrivateVirtualInterfaceResultJsonUnmarshaller instance;

    public static CreatePrivateVirtualInterfaceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreatePrivateVirtualInterfaceResultJsonUnmarshaller();
        return instance;
    }
}
