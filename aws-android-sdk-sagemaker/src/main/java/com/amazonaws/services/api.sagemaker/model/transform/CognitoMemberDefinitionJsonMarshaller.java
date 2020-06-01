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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CognitoMemberDefinition
 */
class CognitoMemberDefinitionJsonMarshaller {

    public void marshall(CognitoMemberDefinition cognitoMemberDefinition, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (cognitoMemberDefinition.getUserPool() != null) {
            String userPool = cognitoMemberDefinition.getUserPool();
            jsonWriter.name("UserPool");
            jsonWriter.value(userPool);
        }
        if (cognitoMemberDefinition.getUserGroup() != null) {
            String userGroup = cognitoMemberDefinition.getUserGroup();
            jsonWriter.name("UserGroup");
            jsonWriter.value(userGroup);
        }
        if (cognitoMemberDefinition.getClientId() != null) {
            String clientId = cognitoMemberDefinition.getClientId();
            jsonWriter.name("ClientId");
            jsonWriter.value(clientId);
        }
        jsonWriter.endObject();
    }

    private static CognitoMemberDefinitionJsonMarshaller instance;

    public static CognitoMemberDefinitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CognitoMemberDefinitionJsonMarshaller();
        return instance;
    }
}
