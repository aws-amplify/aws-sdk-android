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
 * JSON unmarshaller for response DisassociateVpcCidrBlockResult
 */
public class DisassociateVpcCidrBlockResultJsonUnmarshaller implements
        Unmarshaller<DisassociateVpcCidrBlockResult, JsonUnmarshallerContext> {

    public DisassociateVpcCidrBlockResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DisassociateVpcCidrBlockResult disassociateVpcCidrBlockResult = new DisassociateVpcCidrBlockResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Ipv6CidrBlockAssociation")) {
                disassociateVpcCidrBlockResult
                        .setIpv6CidrBlockAssociation(VpcIpv6CidrBlockAssociationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("CidrBlockAssociation")) {
                disassociateVpcCidrBlockResult
                        .setCidrBlockAssociation(VpcCidrBlockAssociationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("VpcId")) {
                disassociateVpcCidrBlockResult.setVpcId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return disassociateVpcCidrBlockResult;
    }

    private static DisassociateVpcCidrBlockResultJsonUnmarshaller instance;

    public static DisassociateVpcCidrBlockResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DisassociateVpcCidrBlockResultJsonUnmarshaller();
        return instance;
    }
}
