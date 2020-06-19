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
 * JSON unmarshaller for POJO Ipv6CidrBlock
 */
class Ipv6CidrBlockJsonUnmarshaller implements Unmarshaller<Ipv6CidrBlock, JsonUnmarshallerContext> {

    public Ipv6CidrBlock unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Ipv6CidrBlock ipv6CidrBlock = new Ipv6CidrBlock();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Ipv6CidrBlock")) {
                ipv6CidrBlock.setIpv6CidrBlock(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return ipv6CidrBlock;
    }

    private static Ipv6CidrBlockJsonUnmarshaller instance;

    public static Ipv6CidrBlockJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Ipv6CidrBlockJsonUnmarshaller();
        return instance;
    }
}
