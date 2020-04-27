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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO CognitoMemberDefinition
 */
class CognitoMemberDefinitionJsonUnmarshaller implements
        Unmarshaller<CognitoMemberDefinition, JsonUnmarshallerContext> {

    public CognitoMemberDefinition unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CognitoMemberDefinition cognitoMemberDefinition = new CognitoMemberDefinition();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("UserPool")) {
                cognitoMemberDefinition.setUserPool(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UserGroup")) {
                cognitoMemberDefinition.setUserGroup(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ClientId")) {
                cognitoMemberDefinition.setClientId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return cognitoMemberDefinition;
    }

    private static CognitoMemberDefinitionJsonUnmarshaller instance;

    public static CognitoMemberDefinitionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CognitoMemberDefinitionJsonUnmarshaller();
        return instance;
    }
}
