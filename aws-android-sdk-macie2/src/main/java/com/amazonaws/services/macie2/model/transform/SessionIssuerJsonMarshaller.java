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
 * JSON marshaller for POJO SessionIssuer
 */
class SessionIssuerJsonMarshaller {

    public void marshall(SessionIssuer sessionIssuer, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (sessionIssuer.getAccountId() != null) {
            String accountId = sessionIssuer.getAccountId();
            jsonWriter.name("accountId");
            jsonWriter.value(accountId);
        }
        if (sessionIssuer.getArn() != null) {
            String arn = sessionIssuer.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (sessionIssuer.getPrincipalId() != null) {
            String principalId = sessionIssuer.getPrincipalId();
            jsonWriter.name("principalId");
            jsonWriter.value(principalId);
        }
        if (sessionIssuer.getType() != null) {
            String type = sessionIssuer.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (sessionIssuer.getUserName() != null) {
            String userName = sessionIssuer.getUserName();
            jsonWriter.name("userName");
            jsonWriter.value(userName);
        }
        jsonWriter.endObject();
    }

    private static SessionIssuerJsonMarshaller instance;

    public static SessionIssuerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SessionIssuerJsonMarshaller();
        return instance;
    }
}
