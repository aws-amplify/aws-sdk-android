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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AwsIamRoleDetails
 */
class AwsIamRoleDetailsJsonMarshaller {

    public void marshall(AwsIamRoleDetails awsIamRoleDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (awsIamRoleDetails.getAssumeRolePolicyDocument() != null) {
            String assumeRolePolicyDocument = awsIamRoleDetails.getAssumeRolePolicyDocument();
            jsonWriter.name("AssumeRolePolicyDocument");
            jsonWriter.value(assumeRolePolicyDocument);
        }
        if (awsIamRoleDetails.getCreateDate() != null) {
            String createDate = awsIamRoleDetails.getCreateDate();
            jsonWriter.name("CreateDate");
            jsonWriter.value(createDate);
        }
        if (awsIamRoleDetails.getRoleId() != null) {
            String roleId = awsIamRoleDetails.getRoleId();
            jsonWriter.name("RoleId");
            jsonWriter.value(roleId);
        }
        if (awsIamRoleDetails.getRoleName() != null) {
            String roleName = awsIamRoleDetails.getRoleName();
            jsonWriter.name("RoleName");
            jsonWriter.value(roleName);
        }
        if (awsIamRoleDetails.getMaxSessionDuration() != null) {
            Integer maxSessionDuration = awsIamRoleDetails.getMaxSessionDuration();
            jsonWriter.name("MaxSessionDuration");
            jsonWriter.value(maxSessionDuration);
        }
        if (awsIamRoleDetails.getPath() != null) {
            String path = awsIamRoleDetails.getPath();
            jsonWriter.name("Path");
            jsonWriter.value(path);
        }
        jsonWriter.endObject();
    }

    private static AwsIamRoleDetailsJsonMarshaller instance;

    public static AwsIamRoleDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsIamRoleDetailsJsonMarshaller();
        return instance;
    }
}
