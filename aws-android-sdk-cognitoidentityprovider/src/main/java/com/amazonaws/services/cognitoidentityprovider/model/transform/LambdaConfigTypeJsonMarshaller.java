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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LambdaConfigType
 */
class LambdaConfigTypeJsonMarshaller {

    public void marshall(LambdaConfigType lambdaConfigType, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (lambdaConfigType.getPreSignUp() != null) {
            String preSignUp = lambdaConfigType.getPreSignUp();
            jsonWriter.name("PreSignUp");
            jsonWriter.value(preSignUp);
        }
        if (lambdaConfigType.getCustomMessage() != null) {
            String customMessage = lambdaConfigType.getCustomMessage();
            jsonWriter.name("CustomMessage");
            jsonWriter.value(customMessage);
        }
        if (lambdaConfigType.getPostConfirmation() != null) {
            String postConfirmation = lambdaConfigType.getPostConfirmation();
            jsonWriter.name("PostConfirmation");
            jsonWriter.value(postConfirmation);
        }
        if (lambdaConfigType.getPreAuthentication() != null) {
            String preAuthentication = lambdaConfigType.getPreAuthentication();
            jsonWriter.name("PreAuthentication");
            jsonWriter.value(preAuthentication);
        }
        if (lambdaConfigType.getPostAuthentication() != null) {
            String postAuthentication = lambdaConfigType.getPostAuthentication();
            jsonWriter.name("PostAuthentication");
            jsonWriter.value(postAuthentication);
        }
        if (lambdaConfigType.getDefineAuthChallenge() != null) {
            String defineAuthChallenge = lambdaConfigType.getDefineAuthChallenge();
            jsonWriter.name("DefineAuthChallenge");
            jsonWriter.value(defineAuthChallenge);
        }
        if (lambdaConfigType.getCreateAuthChallenge() != null) {
            String createAuthChallenge = lambdaConfigType.getCreateAuthChallenge();
            jsonWriter.name("CreateAuthChallenge");
            jsonWriter.value(createAuthChallenge);
        }
        if (lambdaConfigType.getVerifyAuthChallengeResponse() != null) {
            String verifyAuthChallengeResponse = lambdaConfigType.getVerifyAuthChallengeResponse();
            jsonWriter.name("VerifyAuthChallengeResponse");
            jsonWriter.value(verifyAuthChallengeResponse);
        }
        if (lambdaConfigType.getPreTokenGeneration() != null) {
            String preTokenGeneration = lambdaConfigType.getPreTokenGeneration();
            jsonWriter.name("PreTokenGeneration");
            jsonWriter.value(preTokenGeneration);
        }
        if (lambdaConfigType.getUserMigration() != null) {
            String userMigration = lambdaConfigType.getUserMigration();
            jsonWriter.name("UserMigration");
            jsonWriter.value(userMigration);
        }
        jsonWriter.endObject();
    }

    private static LambdaConfigTypeJsonMarshaller instance;

    public static LambdaConfigTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LambdaConfigTypeJsonMarshaller();
        return instance;
    }
}
