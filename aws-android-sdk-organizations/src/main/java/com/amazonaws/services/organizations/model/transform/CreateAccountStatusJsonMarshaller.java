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

package com.amazonaws.services.organizations.model.transform;

import com.amazonaws.services.organizations.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CreateAccountStatus
 */
class CreateAccountStatusJsonMarshaller {

    public void marshall(CreateAccountStatus createAccountStatus, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (createAccountStatus.getId() != null) {
            String id = createAccountStatus.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (createAccountStatus.getAccountName() != null) {
            String accountName = createAccountStatus.getAccountName();
            jsonWriter.name("AccountName");
            jsonWriter.value(accountName);
        }
        if (createAccountStatus.getState() != null) {
            String state = createAccountStatus.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (createAccountStatus.getRequestedTimestamp() != null) {
            java.util.Date requestedTimestamp = createAccountStatus.getRequestedTimestamp();
            jsonWriter.name("RequestedTimestamp");
            jsonWriter.value(requestedTimestamp);
        }
        if (createAccountStatus.getCompletedTimestamp() != null) {
            java.util.Date completedTimestamp = createAccountStatus.getCompletedTimestamp();
            jsonWriter.name("CompletedTimestamp");
            jsonWriter.value(completedTimestamp);
        }
        if (createAccountStatus.getAccountId() != null) {
            String accountId = createAccountStatus.getAccountId();
            jsonWriter.name("AccountId");
            jsonWriter.value(accountId);
        }
        if (createAccountStatus.getGovCloudAccountId() != null) {
            String govCloudAccountId = createAccountStatus.getGovCloudAccountId();
            jsonWriter.name("GovCloudAccountId");
            jsonWriter.value(govCloudAccountId);
        }
        if (createAccountStatus.getFailureReason() != null) {
            String failureReason = createAccountStatus.getFailureReason();
            jsonWriter.name("FailureReason");
            jsonWriter.value(failureReason);
        }
        jsonWriter.endObject();
    }

    private static CreateAccountStatusJsonMarshaller instance;

    public static CreateAccountStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CreateAccountStatusJsonMarshaller();
        return instance;
    }
}
