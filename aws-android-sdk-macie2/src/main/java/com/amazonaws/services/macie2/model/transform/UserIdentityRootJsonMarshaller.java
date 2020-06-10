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
 * JSON marshaller for POJO UserIdentityRoot
 */
class UserIdentityRootJsonMarshaller {

    public void marshall(UserIdentityRoot userIdentityRoot, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (userIdentityRoot.getAccountId() != null) {
            String accountId = userIdentityRoot.getAccountId();
            jsonWriter.name("accountId");
            jsonWriter.value(accountId);
        }
        if (userIdentityRoot.getArn() != null) {
            String arn = userIdentityRoot.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (userIdentityRoot.getPrincipalId() != null) {
            String principalId = userIdentityRoot.getPrincipalId();
            jsonWriter.name("principalId");
            jsonWriter.value(principalId);
        }
        jsonWriter.endObject();
    }

    private static UserIdentityRootJsonMarshaller instance;

    public static UserIdentityRootJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserIdentityRootJsonMarshaller();
        return instance;
    }
}
