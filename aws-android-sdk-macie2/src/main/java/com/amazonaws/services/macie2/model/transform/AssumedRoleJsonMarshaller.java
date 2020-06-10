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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AssumedRole
 */
class AssumedRoleJsonMarshaller {

    public void marshall(AssumedRole assumedRole, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (assumedRole.getAccessKeyId() != null) {
            String accessKeyId = assumedRole.getAccessKeyId();
            jsonWriter.name("accessKeyId");
            jsonWriter.value(accessKeyId);
        }
        if (assumedRole.getAccountId() != null) {
            String accountId = assumedRole.getAccountId();
            jsonWriter.name("accountId");
            jsonWriter.value(accountId);
        }
        if (assumedRole.getArn() != null) {
            String arn = assumedRole.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (assumedRole.getPrincipalId() != null) {
            String principalId = assumedRole.getPrincipalId();
            jsonWriter.name("principalId");
            jsonWriter.value(principalId);
        }
        if (assumedRole.getSessionContext() != null) {
            SessionContext sessionContext = assumedRole.getSessionContext();
            jsonWriter.name("sessionContext");
            SessionContextJsonMarshaller.getInstance().marshall(sessionContext, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AssumedRoleJsonMarshaller instance;

    public static AssumedRoleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AssumedRoleJsonMarshaller();
        return instance;
    }
}
