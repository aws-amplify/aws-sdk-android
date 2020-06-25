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
 * JSON unmarshaller for response DescribePublicIpv4PoolsResult
 */
public class DescribePublicIpv4PoolsResultJsonUnmarshaller implements
        Unmarshaller<DescribePublicIpv4PoolsResult, JsonUnmarshallerContext> {

    public DescribePublicIpv4PoolsResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribePublicIpv4PoolsResult describePublicIpv4PoolsResult = new DescribePublicIpv4PoolsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("PublicIpv4Pools")) {
                describePublicIpv4PoolsResult
                        .setPublicIpv4Pools(new ListUnmarshaller<PublicIpv4Pool>(
                                PublicIpv4PoolJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                describePublicIpv4PoolsResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describePublicIpv4PoolsResult;
    }

    private static DescribePublicIpv4PoolsResultJsonUnmarshaller instance;

    public static DescribePublicIpv4PoolsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribePublicIpv4PoolsResultJsonUnmarshaller();
        return instance;
    }
}
