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
 * JSON marshaller for POJO GroupType
 */
class GroupTypeJsonMarshaller {

    public void marshall(GroupType groupType, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (groupType.getGroupName() != null) {
            String groupName = groupType.getGroupName();
            jsonWriter.name("GroupName");
            jsonWriter.value(groupName);
        }
        if (groupType.getUserPoolId() != null) {
            String userPoolId = groupType.getUserPoolId();
            jsonWriter.name("UserPoolId");
            jsonWriter.value(userPoolId);
        }
        if (groupType.getDescription() != null) {
            String description = groupType.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (groupType.getRoleArn() != null) {
            String roleArn = groupType.getRoleArn();
            jsonWriter.name("RoleArn");
            jsonWriter.value(roleArn);
        }
        if (groupType.getPrecedence() != null) {
            Integer precedence = groupType.getPrecedence();
            jsonWriter.name("Precedence");
            jsonWriter.value(precedence);
        }
        if (groupType.getLastModifiedDate() != null) {
            java.util.Date lastModifiedDate = groupType.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (groupType.getCreationDate() != null) {
            java.util.Date creationDate = groupType.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        jsonWriter.endObject();
    }

    private static GroupTypeJsonMarshaller instance;

    public static GroupTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GroupTypeJsonMarshaller();
        return instance;
    }
}
