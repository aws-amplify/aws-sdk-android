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
 * JSON unmarshaller for response AllocateAddressResult
 */
public class AllocateAddressResultJsonUnmarshaller implements
        Unmarshaller<AllocateAddressResult, JsonUnmarshallerContext> {

    public AllocateAddressResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        AllocateAddressResult allocateAddressResult = new AllocateAddressResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("PublicIp")) {
                allocateAddressResult.setPublicIp(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AllocationId")) {
                allocateAddressResult.setAllocationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PublicIpv4Pool")) {
                allocateAddressResult.setPublicIpv4Pool(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NetworkBorderGroup")) {
                allocateAddressResult.setNetworkBorderGroup(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Domain")) {
                allocateAddressResult.setDomain(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CustomerOwnedIp")) {
                allocateAddressResult.setCustomerOwnedIp(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CustomerOwnedIpv4Pool")) {
                allocateAddressResult.setCustomerOwnedIpv4Pool(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return allocateAddressResult;
    }

    private static AllocateAddressResultJsonUnmarshaller instance;

    public static AllocateAddressResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AllocateAddressResultJsonUnmarshaller();
        return instance;
    }
}
