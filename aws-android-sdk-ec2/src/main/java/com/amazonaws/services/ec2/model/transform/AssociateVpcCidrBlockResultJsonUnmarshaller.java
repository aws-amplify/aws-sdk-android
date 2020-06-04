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
 * JSON unmarshaller for response AssociateVpcCidrBlockResult
 */
public class AssociateVpcCidrBlockResultJsonUnmarshaller implements
        Unmarshaller<AssociateVpcCidrBlockResult, JsonUnmarshallerContext> {

    public AssociateVpcCidrBlockResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        AssociateVpcCidrBlockResult associateVpcCidrBlockResult = new AssociateVpcCidrBlockResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Ipv6CidrBlockAssociation")) {
                associateVpcCidrBlockResult
                        .setIpv6CidrBlockAssociation(VpcIpv6CidrBlockAssociationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("CidrBlockAssociation")) {
                associateVpcCidrBlockResult
                        .setCidrBlockAssociation(VpcCidrBlockAssociationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("VpcId")) {
                associateVpcCidrBlockResult.setVpcId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return associateVpcCidrBlockResult;
    }

    private static AssociateVpcCidrBlockResultJsonUnmarshaller instance;

    public static AssociateVpcCidrBlockResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssociateVpcCidrBlockResultJsonUnmarshaller();
        return instance;
    }
}
