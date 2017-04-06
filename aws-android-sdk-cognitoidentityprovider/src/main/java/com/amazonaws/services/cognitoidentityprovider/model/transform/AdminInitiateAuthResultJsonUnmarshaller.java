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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response AdminInitiateAuthResult
 */
public class AdminInitiateAuthResultJsonUnmarshaller implements
        Unmarshaller<AdminInitiateAuthResult, JsonUnmarshallerContext> {

    public AdminInitiateAuthResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        AdminInitiateAuthResult adminInitiateAuthResult = new AdminInitiateAuthResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ChallengeName")) {
                adminInitiateAuthResult.setChallengeName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Session")) {
                adminInitiateAuthResult.setSession(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ChallengeParameters")) {
                adminInitiateAuthResult.setChallengeParameters(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AuthenticationResult")) {
                adminInitiateAuthResult
                        .setAuthenticationResult(AuthenticationResultTypeJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return adminInitiateAuthResult;
    }

    private static AdminInitiateAuthResultJsonUnmarshaller instance;

    public static AdminInitiateAuthResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AdminInitiateAuthResultJsonUnmarshaller();
        return instance;
    }
}
