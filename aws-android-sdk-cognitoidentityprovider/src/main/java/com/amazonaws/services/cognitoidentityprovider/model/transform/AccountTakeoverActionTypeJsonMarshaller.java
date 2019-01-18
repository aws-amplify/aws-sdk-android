/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AccountTakeoverActionType
 */
class AccountTakeoverActionTypeJsonMarshaller {

    public void marshall(AccountTakeoverActionType accountTakeoverActionType,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (accountTakeoverActionType.getNotify() != null) {
            Boolean notify = accountTakeoverActionType.getNotify();
            jsonWriter.name("Notify");
            jsonWriter.value(notify);
        }
        if (accountTakeoverActionType.getEventAction() != null) {
            String eventAction = accountTakeoverActionType.getEventAction();
            jsonWriter.name("EventAction");
            jsonWriter.value(eventAction);
        }
        jsonWriter.endObject();
    }

    private static AccountTakeoverActionTypeJsonMarshaller instance;

    public static AccountTakeoverActionTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AccountTakeoverActionTypeJsonMarshaller();
        return instance;
    }
}
