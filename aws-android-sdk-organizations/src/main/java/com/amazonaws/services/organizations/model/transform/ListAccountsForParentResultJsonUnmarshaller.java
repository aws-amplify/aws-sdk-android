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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListAccountsForParentResult
 */
public class ListAccountsForParentResultJsonUnmarshaller implements
        Unmarshaller<ListAccountsForParentResult, JsonUnmarshallerContext> {

    public ListAccountsForParentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListAccountsForParentResult listAccountsForParentResult = new ListAccountsForParentResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Accounts")) {
                listAccountsForParentResult.setAccounts(new ListUnmarshaller<Account>(
                        AccountJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                listAccountsForParentResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listAccountsForParentResult;
    }

    private static ListAccountsForParentResultJsonUnmarshaller instance;

    public static ListAccountsForParentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListAccountsForParentResultJsonUnmarshaller();
        return instance;
    }
}
