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
 * JSON marshaller for POJO DelegatedAdministrator
 */
class DelegatedAdministratorJsonMarshaller {

    public void marshall(DelegatedAdministrator delegatedAdministrator, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (delegatedAdministrator.getId() != null) {
            String id = delegatedAdministrator.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (delegatedAdministrator.getArn() != null) {
            String arn = delegatedAdministrator.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (delegatedAdministrator.getEmail() != null) {
            String email = delegatedAdministrator.getEmail();
            jsonWriter.name("Email");
            jsonWriter.value(email);
        }
        if (delegatedAdministrator.getName() != null) {
            String name = delegatedAdministrator.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (delegatedAdministrator.getStatus() != null) {
            String status = delegatedAdministrator.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (delegatedAdministrator.getJoinedMethod() != null) {
            String joinedMethod = delegatedAdministrator.getJoinedMethod();
            jsonWriter.name("JoinedMethod");
            jsonWriter.value(joinedMethod);
        }
        if (delegatedAdministrator.getJoinedTimestamp() != null) {
            java.util.Date joinedTimestamp = delegatedAdministrator.getJoinedTimestamp();
            jsonWriter.name("JoinedTimestamp");
            jsonWriter.value(joinedTimestamp);
        }
        if (delegatedAdministrator.getDelegationEnabledDate() != null) {
            java.util.Date delegationEnabledDate = delegatedAdministrator
                    .getDelegationEnabledDate();
            jsonWriter.name("DelegationEnabledDate");
            jsonWriter.value(delegationEnabledDate);
        }
        jsonWriter.endObject();
    }

    private static DelegatedAdministratorJsonMarshaller instance;

    public static DelegatedAdministratorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DelegatedAdministratorJsonMarshaller();
        return instance;
    }
}
