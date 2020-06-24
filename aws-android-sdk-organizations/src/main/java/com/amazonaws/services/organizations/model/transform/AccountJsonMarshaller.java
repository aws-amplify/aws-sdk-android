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

package com.amazonaws.services.organizations.model.transform;

import com.amazonaws.services.organizations.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Account
 */
class AccountJsonMarshaller {

    public void marshall(Account account, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (account.getId() != null) {
            String id = account.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (account.getArn() != null) {
            String arn = account.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (account.getEmail() != null) {
            String email = account.getEmail();
            jsonWriter.name("Email");
            jsonWriter.value(email);
        }
        if (account.getName() != null) {
            String name = account.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (account.getStatus() != null) {
            String status = account.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (account.getJoinedMethod() != null) {
            String joinedMethod = account.getJoinedMethod();
            jsonWriter.name("JoinedMethod");
            jsonWriter.value(joinedMethod);
        }
        if (account.getJoinedTimestamp() != null) {
            java.util.Date joinedTimestamp = account.getJoinedTimestamp();
            jsonWriter.name("JoinedTimestamp");
            jsonWriter.value(joinedTimestamp);
        }
        jsonWriter.endObject();
    }

    private static AccountJsonMarshaller instance;

    public static AccountJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AccountJsonMarshaller();
        return instance;
    }
}
