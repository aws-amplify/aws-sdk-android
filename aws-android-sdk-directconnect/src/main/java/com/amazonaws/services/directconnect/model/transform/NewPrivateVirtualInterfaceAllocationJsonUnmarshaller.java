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
 * JSON unmarshaller for POJO NewPrivateVirtualInterfaceAllocation
 */
class NewPrivateVirtualInterfaceAllocationJsonUnmarshaller implements
        Unmarshaller<NewPrivateVirtualInterfaceAllocation, JsonUnmarshallerContext> {

    public NewPrivateVirtualInterfaceAllocation unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        NewPrivateVirtualInterfaceAllocation newPrivateVirtualInterfaceAllocation = new NewPrivateVirtualInterfaceAllocation();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("virtualInterfaceName")) {
                newPrivateVirtualInterfaceAllocation.setVirtualInterfaceName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("vlan")) {
                newPrivateVirtualInterfaceAllocation.setVlan(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("asn")) {
                newPrivateVirtualInterfaceAllocation.setAsn(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("mtu")) {
                newPrivateVirtualInterfaceAllocation.setMtu(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("authKey")) {
                newPrivateVirtualInterfaceAllocation.setAuthKey(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("amazonAddress")) {
                newPrivateVirtualInterfaceAllocation.setAmazonAddress(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("addressFamily")) {
                newPrivateVirtualInterfaceAllocation.setAddressFamily(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("customerAddress")) {
                newPrivateVirtualInterfaceAllocation.setCustomerAddress(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                newPrivateVirtualInterfaceAllocation.setTags(new ListUnmarshaller<Tag>(
                        TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return newPrivateVirtualInterfaceAllocation;
    }

    private static NewPrivateVirtualInterfaceAllocationJsonUnmarshaller instance;

    public static NewPrivateVirtualInterfaceAllocationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NewPrivateVirtualInterfaceAllocationJsonUnmarshaller();
        return instance;
    }
}
