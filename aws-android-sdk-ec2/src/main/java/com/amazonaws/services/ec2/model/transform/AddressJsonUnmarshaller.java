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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Address
 */
class AddressJsonUnmarshaller implements Unmarshaller<Address, JsonUnmarshallerContext> {

    public Address unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Address address = new Address();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("InstanceId")) {
                address.setInstanceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PublicIp")) {
                address.setPublicIp(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AllocationId")) {
                address.setAllocationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AssociationId")) {
                address.setAssociationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Domain")) {
                address.setDomain(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NetworkInterfaceId")) {
                address.setNetworkInterfaceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NetworkInterfaceOwnerId")) {
                address.setNetworkInterfaceOwnerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PrivateIpAddress")) {
                address.setPrivateIpAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                address.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PublicIpv4Pool")) {
                address.setPublicIpv4Pool(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NetworkBorderGroup")) {
                address.setNetworkBorderGroup(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CustomerOwnedIp")) {
                address.setCustomerOwnedIp(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CustomerOwnedIpv4Pool")) {
                address.setCustomerOwnedIpv4Pool(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return address;
    }

    private static AddressJsonUnmarshaller instance;

    public static AddressJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AddressJsonUnmarshaller();
        return instance;
    }
}
