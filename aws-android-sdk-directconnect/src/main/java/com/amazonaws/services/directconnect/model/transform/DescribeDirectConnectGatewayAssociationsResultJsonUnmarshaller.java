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
 * JSON unmarshaller for response DescribeDirectConnectGatewayAssociationsResult
 */
public class DescribeDirectConnectGatewayAssociationsResultJsonUnmarshaller implements
        Unmarshaller<DescribeDirectConnectGatewayAssociationsResult, JsonUnmarshallerContext> {

    public DescribeDirectConnectGatewayAssociationsResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeDirectConnectGatewayAssociationsResult describeDirectConnectGatewayAssociationsResult = new DescribeDirectConnectGatewayAssociationsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("directConnectGatewayAssociations")) {
                describeDirectConnectGatewayAssociationsResult
                        .setDirectConnectGatewayAssociations(new ListUnmarshaller<DirectConnectGatewayAssociation>(
                                DirectConnectGatewayAssociationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("nextToken")) {
                describeDirectConnectGatewayAssociationsResult.setNextToken(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeDirectConnectGatewayAssociationsResult;
    }

    private static DescribeDirectConnectGatewayAssociationsResultJsonUnmarshaller instance;

    public static DescribeDirectConnectGatewayAssociationsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDirectConnectGatewayAssociationsResultJsonUnmarshaller();
        return instance;
    }
}
