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
 * JSON marshaller for POJO FederatedUser
 */
class FederatedUserJsonMarshaller {

    public void marshall(FederatedUser federatedUser, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (federatedUser.getAccessKeyId() != null) {
            String accessKeyId = federatedUser.getAccessKeyId();
            jsonWriter.name("accessKeyId");
            jsonWriter.value(accessKeyId);
        }
        if (federatedUser.getAccountId() != null) {
            String accountId = federatedUser.getAccountId();
            jsonWriter.name("accountId");
            jsonWriter.value(accountId);
        }
        if (federatedUser.getArn() != null) {
            String arn = federatedUser.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (federatedUser.getPrincipalId() != null) {
            String principalId = federatedUser.getPrincipalId();
            jsonWriter.name("principalId");
            jsonWriter.value(principalId);
        }
        if (federatedUser.getSessionContext() != null) {
            SessionContext sessionContext = federatedUser.getSessionContext();
            jsonWriter.name("sessionContext");
            SessionContextJsonMarshaller.getInstance().marshall(sessionContext, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static FederatedUserJsonMarshaller instance;

    public static FederatedUserJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FederatedUserJsonMarshaller();
        return instance;
    }
}
