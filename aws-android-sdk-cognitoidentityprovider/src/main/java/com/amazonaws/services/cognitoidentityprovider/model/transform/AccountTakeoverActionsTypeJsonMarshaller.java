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
 * JSON marshaller for POJO AccountTakeoverActionsType
 */
class AccountTakeoverActionsTypeJsonMarshaller {

    public void marshall(AccountTakeoverActionsType accountTakeoverActionsType,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (accountTakeoverActionsType.getLowAction() != null) {
            AccountTakeoverActionType lowAction = accountTakeoverActionsType.getLowAction();
            jsonWriter.name("LowAction");
            AccountTakeoverActionTypeJsonMarshaller.getInstance().marshall(lowAction, jsonWriter);
        }
        if (accountTakeoverActionsType.getMediumAction() != null) {
            AccountTakeoverActionType mediumAction = accountTakeoverActionsType.getMediumAction();
            jsonWriter.name("MediumAction");
            AccountTakeoverActionTypeJsonMarshaller.getInstance()
                    .marshall(mediumAction, jsonWriter);
        }
        if (accountTakeoverActionsType.getHighAction() != null) {
            AccountTakeoverActionType highAction = accountTakeoverActionsType.getHighAction();
            jsonWriter.name("HighAction");
            AccountTakeoverActionTypeJsonMarshaller.getInstance().marshall(highAction, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AccountTakeoverActionsTypeJsonMarshaller instance;

    public static AccountTakeoverActionsTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AccountTakeoverActionsTypeJsonMarshaller();
        return instance;
    }
}
