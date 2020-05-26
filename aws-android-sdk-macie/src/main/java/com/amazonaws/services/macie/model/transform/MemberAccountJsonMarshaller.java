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

package com.amazonaws.services.macie.model.transform;

import com.amazonaws.services.macie.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MemberAccount
 */
class MemberAccountJsonMarshaller {

    public void marshall(MemberAccount memberAccount, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (memberAccount.getAccountId() != null) {
            String accountId = memberAccount.getAccountId();
            jsonWriter.name("accountId");
            jsonWriter.value(accountId);
        }
        jsonWriter.endObject();
    }

    private static MemberAccountJsonMarshaller instance;

    public static MemberAccountJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MemberAccountJsonMarshaller();
        return instance;
    }
}
