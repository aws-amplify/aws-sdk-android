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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO User
 */
class UserJsonMarshaller {

    public void marshall(User user, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (user.getArn() != null) {
            String arn = user.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (user.getUserName() != null) {
            String userName = user.getUserName();
            jsonWriter.name("UserName");
            jsonWriter.value(userName);
        }
        if (user.getEmail() != null) {
            String email = user.getEmail();
            jsonWriter.name("Email");
            jsonWriter.value(email);
        }
        if (user.getRole() != null) {
            String role = user.getRole();
            jsonWriter.name("Role");
            jsonWriter.value(role);
        }
        if (user.getIdentityType() != null) {
            String identityType = user.getIdentityType();
            jsonWriter.name("IdentityType");
            jsonWriter.value(identityType);
        }
        if (user.getActive() != null) {
            Boolean active = user.getActive();
            jsonWriter.name("Active");
            jsonWriter.value(active);
        }
        if (user.getPrincipalId() != null) {
            String principalId = user.getPrincipalId();
            jsonWriter.name("PrincipalId");
            jsonWriter.value(principalId);
        }
        jsonWriter.endObject();
    }

    private static UserJsonMarshaller instance;

    public static UserJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserJsonMarshaller();
        return instance;
    }
}
