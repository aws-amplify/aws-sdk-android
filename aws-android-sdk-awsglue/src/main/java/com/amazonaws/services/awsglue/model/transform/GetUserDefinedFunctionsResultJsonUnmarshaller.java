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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetUserDefinedFunctionsResult
 */
public class GetUserDefinedFunctionsResultJsonUnmarshaller implements
        Unmarshaller<GetUserDefinedFunctionsResult, JsonUnmarshallerContext> {

    public GetUserDefinedFunctionsResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetUserDefinedFunctionsResult getUserDefinedFunctionsResult = new GetUserDefinedFunctionsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("UserDefinedFunctions")) {
                getUserDefinedFunctionsResult
                        .setUserDefinedFunctions(new ListUnmarshaller<UserDefinedFunction>(
                                UserDefinedFunctionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                getUserDefinedFunctionsResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getUserDefinedFunctionsResult;
    }

    private static GetUserDefinedFunctionsResultJsonUnmarshaller instance;

    public static GetUserDefinedFunctionsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetUserDefinedFunctionsResultJsonUnmarshaller();
        return instance;
    }
}
