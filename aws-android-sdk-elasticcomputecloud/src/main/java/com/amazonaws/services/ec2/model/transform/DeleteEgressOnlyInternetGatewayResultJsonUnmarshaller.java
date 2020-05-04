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
 * JSON unmarshaller for response DeleteEgressOnlyInternetGatewayResult
 */
public class DeleteEgressOnlyInternetGatewayResultJsonUnmarshaller implements
        Unmarshaller<DeleteEgressOnlyInternetGatewayResult, JsonUnmarshallerContext> {

    public DeleteEgressOnlyInternetGatewayResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DeleteEgressOnlyInternetGatewayResult deleteEgressOnlyInternetGatewayResult = new DeleteEgressOnlyInternetGatewayResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ReturnCode")) {
                deleteEgressOnlyInternetGatewayResult.setReturnCode(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return deleteEgressOnlyInternetGatewayResult;
    }

    private static DeleteEgressOnlyInternetGatewayResultJsonUnmarshaller instance;

    public static DeleteEgressOnlyInternetGatewayResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteEgressOnlyInternetGatewayResultJsonUnmarshaller();
        return instance;
    }
}
