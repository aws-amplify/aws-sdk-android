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
 * JSON unmarshaller for POJO NewPublicVirtualInterface
 */
class NewPublicVirtualInterfaceJsonUnmarshaller implements
        Unmarshaller<NewPublicVirtualInterface, JsonUnmarshallerContext> {

    public NewPublicVirtualInterface unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        NewPublicVirtualInterface newPublicVirtualInterface = new NewPublicVirtualInterface();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("virtualInterfaceName")) {
                newPublicVirtualInterface.setVirtualInterfaceName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("vlan")) {
                newPublicVirtualInterface.setVlan(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("asn")) {
                newPublicVirtualInterface.setAsn(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("authKey")) {
                newPublicVirtualInterface.setAuthKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("amazonAddress")) {
                newPublicVirtualInterface.setAmazonAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("customerAddress")) {
                newPublicVirtualInterface.setCustomerAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("addressFamily")) {
                newPublicVirtualInterface.setAddressFamily(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("routeFilterPrefixes")) {
                newPublicVirtualInterface
                        .setRouteFilterPrefixes(new ListUnmarshaller<RouteFilterPrefix>(
                                RouteFilterPrefixJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("tags")) {
                newPublicVirtualInterface.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return newPublicVirtualInterface;
    }

    private static NewPublicVirtualInterfaceJsonUnmarshaller instance;

    public static NewPublicVirtualInterfaceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NewPublicVirtualInterfaceJsonUnmarshaller();
        return instance;
    }
}
