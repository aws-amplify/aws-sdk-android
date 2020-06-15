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

package com.amazonaws.services.chime.model.transform;

import com.amazonaws.services.chime.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Account
 */
class AccountJsonMarshaller {

    public void marshall(Account account, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (account.getAwsAccountId() != null) {
            String awsAccountId = account.getAwsAccountId();
            jsonWriter.name("AwsAccountId");
            jsonWriter.value(awsAccountId);
        }
        if (account.getAccountId() != null) {
            String accountId = account.getAccountId();
            jsonWriter.name("AccountId");
            jsonWriter.value(accountId);
        }
        if (account.getName() != null) {
            String name = account.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (account.getAccountType() != null) {
            String accountType = account.getAccountType();
            jsonWriter.name("AccountType");
            jsonWriter.value(accountType);
        }
        if (account.getCreatedTimestamp() != null) {
            java.util.Date createdTimestamp = account.getCreatedTimestamp();
            jsonWriter.name("CreatedTimestamp");
            jsonWriter.value(createdTimestamp);
        }
        if (account.getDefaultLicense() != null) {
            String defaultLicense = account.getDefaultLicense();
            jsonWriter.name("DefaultLicense");
            jsonWriter.value(defaultLicense);
        }
        if (account.getSupportedLicenses() != null) {
            java.util.List<String> supportedLicenses = account.getSupportedLicenses();
            jsonWriter.name("SupportedLicenses");
            jsonWriter.beginArray();
            for (String supportedLicensesItem : supportedLicenses) {
                if (supportedLicensesItem != null) {
                    jsonWriter.value(supportedLicensesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (account.getSigninDelegateGroups() != null) {
            java.util.List<SigninDelegateGroup> signinDelegateGroups = account
                    .getSigninDelegateGroups();
            jsonWriter.name("SigninDelegateGroups");
            jsonWriter.beginArray();
            for (SigninDelegateGroup signinDelegateGroupsItem : signinDelegateGroups) {
                if (signinDelegateGroupsItem != null) {
                    SigninDelegateGroupJsonMarshaller.getInstance().marshall(
                            signinDelegateGroupsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AccountJsonMarshaller instance;

    public static AccountJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AccountJsonMarshaller();
        return instance;
    }
}
