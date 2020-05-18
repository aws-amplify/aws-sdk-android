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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Account
 */
class AccountJsonUnmarshaller implements Unmarshaller<Account, JsonUnmarshallerContext> {

    public Account unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Account account = new Account();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AwsAccountId")) {
                account.setAwsAccountId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AccountId")) {
                account.setAccountId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                account.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AccountType")) {
                account.setAccountType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedTimestamp")) {
                account.setCreatedTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefaultLicense")) {
                account.setDefaultLicense(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SupportedLicenses")) {
                account.setSupportedLicenses(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SigninDelegateGroups")) {
                account.setSigninDelegateGroups(new ListUnmarshaller<SigninDelegateGroup>(
                        SigninDelegateGroupJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return account;
    }

    private static AccountJsonUnmarshaller instance;

    public static AccountJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AccountJsonUnmarshaller();
        return instance;
    }
}
