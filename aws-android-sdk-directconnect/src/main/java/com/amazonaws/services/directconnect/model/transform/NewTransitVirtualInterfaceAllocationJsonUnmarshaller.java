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
 * JSON unmarshaller for POJO NewTransitVirtualInterfaceAllocation
 */
class NewTransitVirtualInterfaceAllocationJsonUnmarshaller implements
        Unmarshaller<NewTransitVirtualInterfaceAllocation, JsonUnmarshallerContext> {

    public NewTransitVirtualInterfaceAllocation unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        NewTransitVirtualInterfaceAllocation newTransitVirtualInterfaceAllocation = new NewTransitVirtualInterfaceAllocation();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("virtualInterfaceName")) {
                newTransitVirtualInterfaceAllocation.setVirtualInterfaceName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("vlan")) {
                newTransitVirtualInterfaceAllocation.setVlan(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("asn")) {
                newTransitVirtualInterfaceAllocation.setAsn(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("mtu")) {
                newTransitVirtualInterfaceAllocation.setMtu(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("authKey")) {
                newTransitVirtualInterfaceAllocation.setAuthKey(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("amazonAddress")) {
                newTransitVirtualInterfaceAllocation.setAmazonAddress(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("customerAddress")) {
                newTransitVirtualInterfaceAllocation.setCustomerAddress(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("addressFamily")) {
                newTransitVirtualInterfaceAllocation.setAddressFamily(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                newTransitVirtualInterfaceAllocation.setTags(new ListUnmarshaller<Tag>(
                        TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return newTransitVirtualInterfaceAllocation;
    }

    private static NewTransitVirtualInterfaceAllocationJsonUnmarshaller instance;

    public static NewTransitVirtualInterfaceAllocationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NewTransitVirtualInterfaceAllocationJsonUnmarshaller();
        return instance;
    }
}
