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

package com.amazonaws.services.workmail.model.transform;

import com.amazonaws.services.workmail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO User
 */
class UserJsonMarshaller {

    public void marshall(User user, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (user.getId() != null) {
            String id = user.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (user.getEmail() != null) {
            String email = user.getEmail();
            jsonWriter.name("Email");
            jsonWriter.value(email);
        }
        if (user.getName() != null) {
            String name = user.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (user.getDisplayName() != null) {
            String displayName = user.getDisplayName();
            jsonWriter.name("DisplayName");
            jsonWriter.value(displayName);
        }
        if (user.getState() != null) {
            String state = user.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (user.getUserRole() != null) {
            String userRole = user.getUserRole();
            jsonWriter.name("UserRole");
            jsonWriter.value(userRole);
        }
        if (user.getEnabledDate() != null) {
            java.util.Date enabledDate = user.getEnabledDate();
            jsonWriter.name("EnabledDate");
            jsonWriter.value(enabledDate);
        }
        if (user.getDisabledDate() != null) {
            java.util.Date disabledDate = user.getDisabledDate();
            jsonWriter.name("DisabledDate");
            jsonWriter.value(disabledDate);
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
