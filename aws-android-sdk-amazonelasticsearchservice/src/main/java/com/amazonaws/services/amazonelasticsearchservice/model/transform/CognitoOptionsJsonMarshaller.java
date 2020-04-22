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

package com.amazonaws.services.amazonelasticsearchservice.model.transform;

import com.amazonaws.services.amazonelasticsearchservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CognitoOptions
 */
class CognitoOptionsJsonMarshaller {

    public void marshall(CognitoOptions cognitoOptions, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (cognitoOptions.getEnabled() != null) {
            Boolean enabled = cognitoOptions.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        if (cognitoOptions.getUserPoolId() != null) {
            String userPoolId = cognitoOptions.getUserPoolId();
            jsonWriter.name("UserPoolId");
            jsonWriter.value(userPoolId);
        }
        if (cognitoOptions.getIdentityPoolId() != null) {
            String identityPoolId = cognitoOptions.getIdentityPoolId();
            jsonWriter.name("IdentityPoolId");
            jsonWriter.value(identityPoolId);
        }
        if (cognitoOptions.getRoleArn() != null) {
            String roleArn = cognitoOptions.getRoleArn();
            jsonWriter.name("RoleArn");
            jsonWriter.value(roleArn);
        }
        jsonWriter.endObject();
    }

    private static CognitoOptionsJsonMarshaller instance;

    public static CognitoOptionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CognitoOptionsJsonMarshaller();
        return instance;
    }
}
