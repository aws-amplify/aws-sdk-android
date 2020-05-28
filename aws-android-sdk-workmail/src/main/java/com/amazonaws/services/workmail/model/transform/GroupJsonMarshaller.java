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
 * JSON marshaller for POJO Group
 */
class GroupJsonMarshaller {

    public void marshall(Group group, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (group.getId() != null) {
            String id = group.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (group.getEmail() != null) {
            String email = group.getEmail();
            jsonWriter.name("Email");
            jsonWriter.value(email);
        }
        if (group.getName() != null) {
            String name = group.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (group.getState() != null) {
            String state = group.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (group.getEnabledDate() != null) {
            java.util.Date enabledDate = group.getEnabledDate();
            jsonWriter.name("EnabledDate");
            jsonWriter.value(enabledDate);
        }
        if (group.getDisabledDate() != null) {
            java.util.Date disabledDate = group.getDisabledDate();
            jsonWriter.name("DisabledDate");
            jsonWriter.value(disabledDate);
        }
        jsonWriter.endObject();
    }

    private static GroupJsonMarshaller instance;

    public static GroupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GroupJsonMarshaller();
        return instance;
    }
}
