/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for response SetUserPoolMfaConfigResult
 */
public class SetUserPoolMfaConfigResultJsonUnmarshaller implements
        Unmarshaller<SetUserPoolMfaConfigResult, JsonUnmarshallerContext> {

    public SetUserPoolMfaConfigResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        SetUserPoolMfaConfigResult setUserPoolMfaConfigResult = new SetUserPoolMfaConfigResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("SmsMfaConfiguration")) {
                setUserPoolMfaConfigResult.setSmsMfaConfiguration(SmsMfaConfigTypeJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SoftwareTokenMfaConfiguration")) {
                setUserPoolMfaConfigResult
                        .setSoftwareTokenMfaConfiguration(SoftwareTokenMfaConfigTypeJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("MfaConfiguration")) {
                setUserPoolMfaConfigResult.setMfaConfiguration(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return setUserPoolMfaConfigResult;
    }

    private static SetUserPoolMfaConfigResultJsonUnmarshaller instance;

    public static SetUserPoolMfaConfigResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SetUserPoolMfaConfigResultJsonUnmarshaller();
        return instance;
    }
}
