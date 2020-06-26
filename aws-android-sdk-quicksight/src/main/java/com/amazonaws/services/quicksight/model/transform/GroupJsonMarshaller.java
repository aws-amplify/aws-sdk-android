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
 * JSON marshaller for POJO Group
 */
class GroupJsonMarshaller {

    public void marshall(Group group, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (group.getArn() != null) {
            String arn = group.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (group.getGroupName() != null) {
            String groupName = group.getGroupName();
            jsonWriter.name("GroupName");
            jsonWriter.value(groupName);
        }
        if (group.getDescription() != null) {
            String description = group.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (group.getPrincipalId() != null) {
            String principalId = group.getPrincipalId();
            jsonWriter.name("PrincipalId");
            jsonWriter.value(principalId);
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
