/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response CreatePolicyVersionResult
 */
public class CreatePolicyVersionResultJsonUnmarshaller implements
        Unmarshaller<CreatePolicyVersionResult, JsonUnmarshallerContext> {

    public CreatePolicyVersionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreatePolicyVersionResult createPolicyVersionResult = new CreatePolicyVersionResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("policyArn")) {
                createPolicyVersionResult.setPolicyArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("policyDocument")) {
                createPolicyVersionResult.setPolicyDocument(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("policyVersionId")) {
                createPolicyVersionResult.setPolicyVersionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("isDefaultVersion")) {
                createPolicyVersionResult.setIsDefaultVersion(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createPolicyVersionResult;
    }

    private static CreatePolicyVersionResultJsonUnmarshaller instance;

    public static CreatePolicyVersionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreatePolicyVersionResultJsonUnmarshaller();
        return instance;
    }
}
