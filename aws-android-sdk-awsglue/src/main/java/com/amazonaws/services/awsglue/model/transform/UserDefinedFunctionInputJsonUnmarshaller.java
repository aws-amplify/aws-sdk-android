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
 * JSON unmarshaller for POJO UserDefinedFunctionInput
 */
class UserDefinedFunctionInputJsonUnmarshaller implements
        Unmarshaller<UserDefinedFunctionInput, JsonUnmarshallerContext> {

    public UserDefinedFunctionInput unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        UserDefinedFunctionInput userDefinedFunctionInput = new UserDefinedFunctionInput();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("FunctionName")) {
                userDefinedFunctionInput.setFunctionName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ClassName")) {
                userDefinedFunctionInput.setClassName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OwnerName")) {
                userDefinedFunctionInput.setOwnerName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OwnerType")) {
                userDefinedFunctionInput.setOwnerType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceUris")) {
                userDefinedFunctionInput.setResourceUris(new ListUnmarshaller<ResourceUri>(
                        ResourceUriJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return userDefinedFunctionInput;
    }

    private static UserDefinedFunctionInputJsonUnmarshaller instance;

    public static UserDefinedFunctionInputJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UserDefinedFunctionInputJsonUnmarshaller();
        return instance;
    }
}
