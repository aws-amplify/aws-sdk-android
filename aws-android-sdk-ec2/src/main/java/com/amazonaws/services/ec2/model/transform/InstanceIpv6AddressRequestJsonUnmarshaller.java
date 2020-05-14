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
 * JSON unmarshaller for POJO InstanceIpv6AddressRequest
 */
class InstanceIpv6AddressRequestJsonUnmarshaller implements
        Unmarshaller<InstanceIpv6AddressRequest, JsonUnmarshallerContext> {

    public InstanceIpv6AddressRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InstanceIpv6AddressRequest instanceIpv6AddressRequest = new InstanceIpv6AddressRequest();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Ipv6Address")) {
                instanceIpv6AddressRequest.setIpv6Address(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return instanceIpv6AddressRequest;
    }

    private static InstanceIpv6AddressRequestJsonUnmarshaller instance;

    public static InstanceIpv6AddressRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceIpv6AddressRequestJsonUnmarshaller();
        return instance;
    }
}
