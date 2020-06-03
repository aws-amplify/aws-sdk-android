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
 * JSON unmarshaller for response AssociateVirtualInterfaceResult
 */
public class AssociateVirtualInterfaceResultJsonUnmarshaller implements
        Unmarshaller<AssociateVirtualInterfaceResult, JsonUnmarshallerContext> {

    public AssociateVirtualInterfaceResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AssociateVirtualInterfaceResult associateVirtualInterfaceResult = new AssociateVirtualInterfaceResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ownerAccount")) {
                associateVirtualInterfaceResult.setOwnerAccount(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceId")) {
                associateVirtualInterfaceResult.setVirtualInterfaceId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                associateVirtualInterfaceResult.setLocation(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionId")) {
                associateVirtualInterfaceResult.setConnectionId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceType")) {
                associateVirtualInterfaceResult.setVirtualInterfaceType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceName")) {
                associateVirtualInterfaceResult.setVirtualInterfaceName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("vlan")) {
                associateVirtualInterfaceResult.setVlan(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("asn")) {
                associateVirtualInterfaceResult.setAsn(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("amazonSideAsn")) {
                associateVirtualInterfaceResult.setAmazonSideAsn(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("authKey")) {
                associateVirtualInterfaceResult.setAuthKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("amazonAddress")) {
                associateVirtualInterfaceResult.setAmazonAddress(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("customerAddress")) {
                associateVirtualInterfaceResult.setCustomerAddress(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("addressFamily")) {
                associateVirtualInterfaceResult.setAddressFamily(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceState")) {
                associateVirtualInterfaceResult.setVirtualInterfaceState(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("customerRouterConfig")) {
                associateVirtualInterfaceResult.setCustomerRouterConfig(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("mtu")) {
                associateVirtualInterfaceResult.setMtu(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("jumboFrameCapable")) {
                associateVirtualInterfaceResult.setJumboFrameCapable(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualGatewayId")) {
                associateVirtualInterfaceResult.setVirtualGatewayId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("directConnectGatewayId")) {
                associateVirtualInterfaceResult.setDirectConnectGatewayId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("routeFilterPrefixes")) {
                associateVirtualInterfaceResult
                        .setRouteFilterPrefixes(new ListUnmarshaller<RouteFilterPrefix>(
                                RouteFilterPrefixJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("bgpPeers")) {
                associateVirtualInterfaceResult.setBgpPeers(new ListUnmarshaller<BGPPeer>(
                        BGPPeerJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("region")) {
                associateVirtualInterfaceResult.setRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsDeviceV2")) {
                associateVirtualInterfaceResult.setAwsDeviceV2(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                associateVirtualInterfaceResult.setTags(new ListUnmarshaller<Tag>(
                        TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return associateVirtualInterfaceResult;
    }

    private static AssociateVirtualInterfaceResultJsonUnmarshaller instance;

    public static AssociateVirtualInterfaceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssociateVirtualInterfaceResultJsonUnmarshaller();
        return instance;
    }
}
