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
 * JSON marshaller for POJO UnprocessedAccount
 */
class UnprocessedAccountJsonMarshaller {

    public void marshall(UnprocessedAccount unprocessedAccount, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (unprocessedAccount.getAccountId() != null) {
            String accountId = unprocessedAccount.getAccountId();
            jsonWriter.name("accountId");
            jsonWriter.value(accountId);
        }
        if (unprocessedAccount.getErrorCode() != null) {
            String errorCode = unprocessedAccount.getErrorCode();
            jsonWriter.name("errorCode");
            jsonWriter.value(errorCode);
        }
        if (unprocessedAccount.getErrorMessage() != null) {
            String errorMessage = unprocessedAccount.getErrorMessage();
            jsonWriter.name("errorMessage");
            jsonWriter.value(errorMessage);
        }
        jsonWriter.endObject();
    }

    private static UnprocessedAccountJsonMarshaller instance;

    public static UnprocessedAccountJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UnprocessedAccountJsonMarshaller();
        return instance;
    }
}
