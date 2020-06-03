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
 * JSON unmarshaller for POJO NewPrivateVirtualInterface
 */
class NewPrivateVirtualInterfaceJsonUnmarshaller implements
        Unmarshaller<NewPrivateVirtualInterface, JsonUnmarshallerContext> {

    public NewPrivateVirtualInterface unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        NewPrivateVirtualInterface newPrivateVirtualInterface = new NewPrivateVirtualInterface();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("virtualInterfaceName")) {
                newPrivateVirtualInterface.setVirtualInterfaceName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("vlan")) {
                newPrivateVirtualInterface.setVlan(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("asn")) {
                newPrivateVirtualInterface.setAsn(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("mtu")) {
                newPrivateVirtualInterface.setMtu(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("authKey")) {
                newPrivateVirtualInterface.setAuthKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("amazonAddress")) {
                newPrivateVirtualInterface.setAmazonAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("customerAddress")) {
                newPrivateVirtualInterface.setCustomerAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("addressFamily")) {
                newPrivateVirtualInterface.setAddressFamily(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualGatewayId")) {
                newPrivateVirtualInterface.setVirtualGatewayId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("directConnectGatewayId")) {
                newPrivateVirtualInterface.setDirectConnectGatewayId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                newPrivateVirtualInterface.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return newPrivateVirtualInterface;
    }

    private static NewPrivateVirtualInterfaceJsonUnmarshaller instance;

    public static NewPrivateVirtualInterfaceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NewPrivateVirtualInterfaceJsonUnmarshaller();
        return instance;
    }
}
