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

package com.amazonaws.services.iotsitewise.model.transform;

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeGatewayResult
 */
public class DescribeGatewayResultJsonUnmarshaller implements
        Unmarshaller<DescribeGatewayResult, JsonUnmarshallerContext> {

    public DescribeGatewayResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeGatewayResult describeGatewayResult = new DescribeGatewayResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("gatewayId")) {
                describeGatewayResult.setGatewayId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("gatewayName")) {
                describeGatewayResult.setGatewayName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("gatewayArn")) {
                describeGatewayResult.setGatewayArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("gatewayPlatform")) {
                describeGatewayResult.setGatewayPlatform(GatewayPlatformJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("gatewayCapabilitySummaries")) {
                describeGatewayResult
                        .setGatewayCapabilitySummaries(new ListUnmarshaller<GatewayCapabilitySummary>(
                                GatewayCapabilitySummaryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("creationDate")) {
                describeGatewayResult.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdateDate")) {
                describeGatewayResult.setLastUpdateDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeGatewayResult;
    }

    private static DescribeGatewayResultJsonUnmarshaller instance;

    public static DescribeGatewayResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeGatewayResultJsonUnmarshaller();
        return instance;
    }
}
