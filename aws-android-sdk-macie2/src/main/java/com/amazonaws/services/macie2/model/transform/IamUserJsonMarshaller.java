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
 * JSON marshaller for POJO IamUser
 */
class IamUserJsonMarshaller {

    public void marshall(IamUser iamUser, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (iamUser.getAccountId() != null) {
            String accountId = iamUser.getAccountId();
            jsonWriter.name("accountId");
            jsonWriter.value(accountId);
        }
        if (iamUser.getArn() != null) {
            String arn = iamUser.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (iamUser.getPrincipalId() != null) {
            String principalId = iamUser.getPrincipalId();
            jsonWriter.name("principalId");
            jsonWriter.value(principalId);
        }
        if (iamUser.getUserName() != null) {
            String userName = iamUser.getUserName();
            jsonWriter.name("userName");
            jsonWriter.value(userName);
        }
        jsonWriter.endObject();
    }

    private static IamUserJsonMarshaller instance;

    public static IamUserJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IamUserJsonMarshaller();
        return instance;
    }
}
