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
 * JSON unmarshaller for response DescribeIpv6PoolsResult
 */
public class DescribeIpv6PoolsResultJsonUnmarshaller implements
        Unmarshaller<DescribeIpv6PoolsResult, JsonUnmarshallerContext> {

    public DescribeIpv6PoolsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeIpv6PoolsResult describeIpv6PoolsResult = new DescribeIpv6PoolsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Ipv6Pools")) {
                describeIpv6PoolsResult.setIpv6Pools(new ListUnmarshaller<Ipv6Pool>(
                        Ipv6PoolJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                describeIpv6PoolsResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeIpv6PoolsResult;
    }

    private static DescribeIpv6PoolsResultJsonUnmarshaller instance;

    public static DescribeIpv6PoolsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeIpv6PoolsResultJsonUnmarshaller();
        return instance;
    }
}
