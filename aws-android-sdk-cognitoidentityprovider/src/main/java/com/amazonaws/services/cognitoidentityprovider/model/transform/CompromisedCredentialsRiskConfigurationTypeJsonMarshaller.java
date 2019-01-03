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
 * JSON marshaller for POJO CompromisedCredentialsRiskConfigurationType
 */
class CompromisedCredentialsRiskConfigurationTypeJsonMarshaller {

    public void marshall(
            CompromisedCredentialsRiskConfigurationType compromisedCredentialsRiskConfigurationType,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (compromisedCredentialsRiskConfigurationType.getEventFilter() != null) {
            java.util.List<String> eventFilter = compromisedCredentialsRiskConfigurationType
                    .getEventFilter();
            jsonWriter.name("EventFilter");
            jsonWriter.beginArray();
            for (String eventFilterItem : eventFilter) {
                if (eventFilterItem != null) {
                    jsonWriter.value(eventFilterItem);
                }
            }
            jsonWriter.endArray();
        }
        if (compromisedCredentialsRiskConfigurationType.getActions() != null) {
            CompromisedCredentialsActionsType actions = compromisedCredentialsRiskConfigurationType
                    .getActions();
            jsonWriter.name("Actions");
            CompromisedCredentialsActionsTypeJsonMarshaller.getInstance().marshall(actions,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static CompromisedCredentialsRiskConfigurationTypeJsonMarshaller instance;

    public static CompromisedCredentialsRiskConfigurationTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CompromisedCredentialsRiskConfigurationTypeJsonMarshaller();
        return instance;
    }
}
