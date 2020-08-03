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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AccountSharingInfo
 */
class AccountSharingInfoJsonMarshaller {

    public void marshall(AccountSharingInfo accountSharingInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (accountSharingInfo.getAccountId() != null) {
            String accountId = accountSharingInfo.getAccountId();
            jsonWriter.name("AccountId");
            jsonWriter.value(accountId);
        }
        if (accountSharingInfo.getSharedDocumentVersion() != null) {
            String sharedDocumentVersion = accountSharingInfo.getSharedDocumentVersion();
            jsonWriter.name("SharedDocumentVersion");
            jsonWriter.value(sharedDocumentVersion);
        }
        jsonWriter.endObject();
    }

    private static AccountSharingInfoJsonMarshaller instance;
    public static AccountSharingInfoJsonMarshaller getInstance() {
        if (instance == null) instance = new AccountSharingInfoJsonMarshaller();
        return instance;
    }
}
