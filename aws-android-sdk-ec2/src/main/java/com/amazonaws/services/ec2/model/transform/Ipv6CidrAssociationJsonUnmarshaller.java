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
 * JSON unmarshaller for POJO Ipv6CidrAssociation
 */
class Ipv6CidrAssociationJsonUnmarshaller implements
        Unmarshaller<Ipv6CidrAssociation, JsonUnmarshallerContext> {

    public Ipv6CidrAssociation unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Ipv6CidrAssociation ipv6CidrAssociation = new Ipv6CidrAssociation();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Ipv6Cidr")) {
                ipv6CidrAssociation.setIpv6Cidr(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AssociatedResource")) {
                ipv6CidrAssociation.setAssociatedResource(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return ipv6CidrAssociation;
    }

    private static Ipv6CidrAssociationJsonUnmarshaller instance;

    public static Ipv6CidrAssociationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Ipv6CidrAssociationJsonUnmarshaller();
        return instance;
    }
}
