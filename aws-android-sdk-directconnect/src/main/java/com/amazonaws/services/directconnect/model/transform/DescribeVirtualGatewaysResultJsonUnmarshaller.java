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

package com.amazonaws.services.directconnect.model.transform;

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeVirtualGatewaysResult
 */
public class DescribeVirtualGatewaysResultJsonUnmarshaller implements
        Unmarshaller<DescribeVirtualGatewaysResult, JsonUnmarshallerContext> {

    public DescribeVirtualGatewaysResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeVirtualGatewaysResult describeVirtualGatewaysResult = new DescribeVirtualGatewaysResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("virtualGateways")) {
                describeVirtualGatewaysResult
                        .setVirtualGateways(new ListUnmarshaller<VirtualGateway>(
                                VirtualGatewayJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeVirtualGatewaysResult;
    }

    private static DescribeVirtualGatewaysResultJsonUnmarshaller instance;

    public static DescribeVirtualGatewaysResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeVirtualGatewaysResultJsonUnmarshaller();
        return instance;
    }
}
