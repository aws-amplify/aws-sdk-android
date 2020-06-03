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
 * JSON unmarshaller for response UpdateVirtualInterfaceAttributesResult
 */
public class UpdateVirtualInterfaceAttributesResultJsonUnmarshaller implements
        Unmarshaller<UpdateVirtualInterfaceAttributesResult, JsonUnmarshallerContext> {

    public UpdateVirtualInterfaceAttributesResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        UpdateVirtualInterfaceAttributesResult updateVirtualInterfaceAttributesResult = new UpdateVirtualInterfaceAttributesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ownerAccount")) {
                updateVirtualInterfaceAttributesResult.setOwnerAccount(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceId")) {
                updateVirtualInterfaceAttributesResult.setVirtualInterfaceId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                updateVirtualInterfaceAttributesResult.setLocation(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionId")) {
                updateVirtualInterfaceAttributesResult.setConnectionId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceType")) {
                updateVirtualInterfaceAttributesResult
                        .setVirtualInterfaceType(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("virtualInterfaceName")) {
                updateVirtualInterfaceAttributesResult
                        .setVirtualInterfaceName(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("vlan")) {
                updateVirtualInterfaceAttributesResult.setVlan(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("asn")) {
                updateVirtualInterfaceAttributesResult.setAsn(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("amazonSideAsn")) {
                updateVirtualInterfaceAttributesResult.setAmazonSideAsn(LongJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("authKey")) {
                updateVirtualInterfaceAttributesResult.setAuthKey(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("amazonAddress")) {
                updateVirtualInterfaceAttributesResult.setAmazonAddress(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("customerAddress")) {
                updateVirtualInterfaceAttributesResult.setCustomerAddress(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("addressFamily")) {
                updateVirtualInterfaceAttributesResult.setAddressFamily(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceState")) {
                updateVirtualInterfaceAttributesResult
                        .setVirtualInterfaceState(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("customerRouterConfig")) {
                updateVirtualInterfaceAttributesResult
                        .setCustomerRouterConfig(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("mtu")) {
                updateVirtualInterfaceAttributesResult.setMtu(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("jumboFrameCapable")) {
                updateVirtualInterfaceAttributesResult.setJumboFrameCapable(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualGatewayId")) {
                updateVirtualInterfaceAttributesResult.setVirtualGatewayId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("directConnectGatewayId")) {
                updateVirtualInterfaceAttributesResult
                        .setDirectConnectGatewayId(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("routeFilterPrefixes")) {
                updateVirtualInterfaceAttributesResult
                        .setRouteFilterPrefixes(new ListUnmarshaller<RouteFilterPrefix>(
                                RouteFilterPrefixJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("bgpPeers")) {
                updateVirtualInterfaceAttributesResult.setBgpPeers(new ListUnmarshaller<BGPPeer>(
                        BGPPeerJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("region")) {
                updateVirtualInterfaceAttributesResult.setRegion(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsDeviceV2")) {
                updateVirtualInterfaceAttributesResult.setAwsDeviceV2(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                updateVirtualInterfaceAttributesResult.setTags(new ListUnmarshaller<Tag>(
                        TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateVirtualInterfaceAttributesResult;
    }

    private static UpdateVirtualInterfaceAttributesResultJsonUnmarshaller instance;

    public static UpdateVirtualInterfaceAttributesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateVirtualInterfaceAttributesResultJsonUnmarshaller();
        return instance;
    }
}
