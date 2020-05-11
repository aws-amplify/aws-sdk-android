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
 * JSON unmarshaller for POJO Vpc
 */
class VpcJsonUnmarshaller implements Unmarshaller<Vpc, JsonUnmarshallerContext> {

    public Vpc unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Vpc vpc = new Vpc();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CidrBlock")) {
                vpc.setCidrBlock(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DhcpOptionsId")) {
                vpc.setDhcpOptionsId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                vpc.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcId")) {
                vpc.setVpcId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OwnerId")) {
                vpc.setOwnerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceTenancy")) {
                vpc.setInstanceTenancy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Ipv6CidrBlockAssociationSet")) {
                vpc.setIpv6CidrBlockAssociationSet(new ListUnmarshaller<VpcIpv6CidrBlockAssociation>(
                        VpcIpv6CidrBlockAssociationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("CidrBlockAssociationSet")) {
                vpc.setCidrBlockAssociationSet(new ListUnmarshaller<VpcCidrBlockAssociation>(
                        VpcCidrBlockAssociationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("IsDefault")) {
                vpc.setIsDefault(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                vpc.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return vpc;
    }

    private static VpcJsonUnmarshaller instance;

    public static VpcJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VpcJsonUnmarshaller();
        return instance;
    }
}
