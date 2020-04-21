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

package com.amazonaws.services.amazonguardduty.model.transform;

import com.amazonaws.services.amazonguardduty.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AccountDetail
 */
class AccountDetailJsonMarshaller {

    public void marshall(AccountDetail accountDetail, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (accountDetail.getAccountId() != null) {
            String accountId = accountDetail.getAccountId();
            jsonWriter.name("AccountId");
            jsonWriter.value(accountId);
        }
        if (accountDetail.getEmail() != null) {
            String email = accountDetail.getEmail();
            jsonWriter.name("Email");
            jsonWriter.value(email);
        }
        jsonWriter.endObject();
    }

    private static AccountDetailJsonMarshaller instance;

    public static AccountDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AccountDetailJsonMarshaller();
        return instance;
    }
}
