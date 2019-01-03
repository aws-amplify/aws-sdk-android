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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UserPoolClientDescription
 */
class UserPoolClientDescriptionJsonMarshaller {

    public void marshall(UserPoolClientDescription userPoolClientDescription,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (userPoolClientDescription.getClientId() != null) {
            String clientId = userPoolClientDescription.getClientId();
            jsonWriter.name("ClientId");
            jsonWriter.value(clientId);
        }
        if (userPoolClientDescription.getUserPoolId() != null) {
            String userPoolId = userPoolClientDescription.getUserPoolId();
            jsonWriter.name("UserPoolId");
            jsonWriter.value(userPoolId);
        }
        if (userPoolClientDescription.getClientName() != null) {
            String clientName = userPoolClientDescription.getClientName();
            jsonWriter.name("ClientName");
            jsonWriter.value(clientName);
        }
        jsonWriter.endObject();
    }

    private static UserPoolClientDescriptionJsonMarshaller instance;

    public static UserPoolClientDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserPoolClientDescriptionJsonMarshaller();
        return instance;
    }
}
