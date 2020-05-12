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
 * JSON marshaller for POJO Member
 */
class MemberJsonMarshaller {

    public void marshall(Member member, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (member.getId() != null) {
            String id = member.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (member.getName() != null) {
            String name = member.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (member.getType() != null) {
            String type = member.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (member.getState() != null) {
            String state = member.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (member.getEnabledDate() != null) {
            java.util.Date enabledDate = member.getEnabledDate();
            jsonWriter.name("EnabledDate");
            jsonWriter.value(enabledDate);
        }
        if (member.getDisabledDate() != null) {
            java.util.Date disabledDate = member.getDisabledDate();
            jsonWriter.name("DisabledDate");
            jsonWriter.value(disabledDate);
        }
        jsonWriter.endObject();
    }

    private static MemberJsonMarshaller instance;

    public static MemberJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MemberJsonMarshaller();
        return instance;
    }
}
