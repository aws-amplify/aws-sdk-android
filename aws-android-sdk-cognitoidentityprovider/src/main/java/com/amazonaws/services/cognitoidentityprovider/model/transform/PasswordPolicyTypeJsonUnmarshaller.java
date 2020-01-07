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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO PasswordPolicyType
 */
class PasswordPolicyTypeJsonUnmarshaller implements
        Unmarshaller<PasswordPolicyType, JsonUnmarshallerContext> {

    public PasswordPolicyType unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PasswordPolicyType passwordPolicyType = new PasswordPolicyType();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("MinimumLength")) {
                passwordPolicyType.setMinimumLength(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequireUppercase")) {
                passwordPolicyType.setRequireUppercase(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequireLowercase")) {
                passwordPolicyType.setRequireLowercase(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequireNumbers")) {
                passwordPolicyType.setRequireNumbers(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequireSymbols")) {
                passwordPolicyType.setRequireSymbols(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TemporaryPasswordValidityDays")) {
                passwordPolicyType.setTemporaryPasswordValidityDays(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return passwordPolicyType;
    }

    private static PasswordPolicyTypeJsonUnmarshaller instance;

    public static PasswordPolicyTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PasswordPolicyTypeJsonUnmarshaller();
        return instance;
    }
}
