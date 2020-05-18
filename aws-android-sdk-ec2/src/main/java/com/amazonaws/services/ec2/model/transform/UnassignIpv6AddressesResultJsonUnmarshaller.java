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
 * JSON unmarshaller for response UnassignIpv6AddressesResult
 */
public class UnassignIpv6AddressesResultJsonUnmarshaller implements
        Unmarshaller<UnassignIpv6AddressesResult, JsonUnmarshallerContext> {

    public UnassignIpv6AddressesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UnassignIpv6AddressesResult unassignIpv6AddressesResult = new UnassignIpv6AddressesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("NetworkInterfaceId")) {
                unassignIpv6AddressesResult.setNetworkInterfaceId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("UnassignedIpv6Addresses")) {
                unassignIpv6AddressesResult
                        .setUnassignedIpv6Addresses(new ListUnmarshaller<String>(
                                StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return unassignIpv6AddressesResult;
    }

    private static UnassignIpv6AddressesResultJsonUnmarshaller instance;

    public static UnassignIpv6AddressesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UnassignIpv6AddressesResultJsonUnmarshaller();
        return instance;
    }
}
