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
 * JSON unmarshaller for response GetAssociatedIpv6PoolCidrsResult
 */
public class GetAssociatedIpv6PoolCidrsResultJsonUnmarshaller implements
        Unmarshaller<GetAssociatedIpv6PoolCidrsResult, JsonUnmarshallerContext> {

    public GetAssociatedIpv6PoolCidrsResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetAssociatedIpv6PoolCidrsResult getAssociatedIpv6PoolCidrsResult = new GetAssociatedIpv6PoolCidrsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Ipv6CidrAssociations")) {
                getAssociatedIpv6PoolCidrsResult
                        .setIpv6CidrAssociations(new ListUnmarshaller<Ipv6CidrAssociation>(
                                Ipv6CidrAssociationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                getAssociatedIpv6PoolCidrsResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getAssociatedIpv6PoolCidrsResult;
    }

    private static GetAssociatedIpv6PoolCidrsResultJsonUnmarshaller instance;

    public static GetAssociatedIpv6PoolCidrsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetAssociatedIpv6PoolCidrsResultJsonUnmarshaller();
        return instance;
    }
}
