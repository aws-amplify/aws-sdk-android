/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for POJO LambdaConfigType
 */
class LambdaConfigTypeJsonUnmarshaller implements
        Unmarshaller<LambdaConfigType, JsonUnmarshallerContext> {

    public LambdaConfigType unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        LambdaConfigType lambdaConfigType = new LambdaConfigType();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("PreSignUp")) {
                lambdaConfigType.setPreSignUp(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CustomMessage")) {
                lambdaConfigType.setCustomMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PostConfirmation")) {
                lambdaConfigType.setPostConfirmation(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PreAuthentication")) {
                lambdaConfigType.setPreAuthentication(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PostAuthentication")) {
                lambdaConfigType.setPostAuthentication(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefineAuthChallenge")) {
                lambdaConfigType.setDefineAuthChallenge(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreateAuthChallenge")) {
                lambdaConfigType.setCreateAuthChallenge(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VerifyAuthChallengeResponse")) {
                lambdaConfigType.setVerifyAuthChallengeResponse(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PreTokenGeneration")) {
                lambdaConfigType.setPreTokenGeneration(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UserMigration")) {
                lambdaConfigType.setUserMigration(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CustomSMSSender")) {
                lambdaConfigType
                        .setCustomSMSSender(CustomSMSLambdaVersionConfigTypeJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("CustomEmailSender")) {
                lambdaConfigType
                        .setCustomEmailSender(CustomEmailLambdaVersionConfigTypeJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("KMSKeyID")) {
                lambdaConfigType.setKMSKeyID(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return lambdaConfigType;
    }

    private static LambdaConfigTypeJsonUnmarshaller instance;

    public static LambdaConfigTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LambdaConfigTypeJsonUnmarshaller();
        return instance;
    }
}
