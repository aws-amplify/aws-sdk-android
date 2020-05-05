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
 * JSON unmarshaller for response AssociateSubnetCidrBlockResult
 */
public class AssociateSubnetCidrBlockResultJsonUnmarshaller implements
        Unmarshaller<AssociateSubnetCidrBlockResult, JsonUnmarshallerContext> {

    public AssociateSubnetCidrBlockResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AssociateSubnetCidrBlockResult associateSubnetCidrBlockResult = new AssociateSubnetCidrBlockResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Ipv6CidrBlockAssociation")) {
                associateSubnetCidrBlockResult
                        .setIpv6CidrBlockAssociation(SubnetIpv6CidrBlockAssociationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("SubnetId")) {
                associateSubnetCidrBlockResult.setSubnetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return associateSubnetCidrBlockResult;
    }

    private static AssociateSubnetCidrBlockResultJsonUnmarshaller instance;

    public static AssociateSubnetCidrBlockResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssociateSubnetCidrBlockResultJsonUnmarshaller();
        return instance;
    }
}
