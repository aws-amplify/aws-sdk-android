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
 * JSON marshaller for POJO AccountTakeoverRiskConfigurationType
 */
class AccountTakeoverRiskConfigurationTypeJsonMarshaller {

    public void marshall(AccountTakeoverRiskConfigurationType accountTakeoverRiskConfigurationType,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (accountTakeoverRiskConfigurationType.getNotifyConfiguration() != null) {
            NotifyConfigurationType notifyConfiguration = accountTakeoverRiskConfigurationType
                    .getNotifyConfiguration();
            jsonWriter.name("NotifyConfiguration");
            NotifyConfigurationTypeJsonMarshaller.getInstance().marshall(notifyConfiguration,
                    jsonWriter);
        }
        if (accountTakeoverRiskConfigurationType.getActions() != null) {
            AccountTakeoverActionsType actions = accountTakeoverRiskConfigurationType.getActions();
            jsonWriter.name("Actions");
            AccountTakeoverActionsTypeJsonMarshaller.getInstance().marshall(actions, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AccountTakeoverRiskConfigurationTypeJsonMarshaller instance;

    public static AccountTakeoverRiskConfigurationTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AccountTakeoverRiskConfigurationTypeJsonMarshaller();
        return instance;
    }
}
