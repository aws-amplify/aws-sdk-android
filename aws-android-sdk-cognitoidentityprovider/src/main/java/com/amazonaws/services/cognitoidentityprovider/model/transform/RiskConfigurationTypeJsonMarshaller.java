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
 * JSON marshaller for POJO RiskConfigurationType
 */
class RiskConfigurationTypeJsonMarshaller {

    public void marshall(RiskConfigurationType riskConfigurationType, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (riskConfigurationType.getUserPoolId() != null) {
            String userPoolId = riskConfigurationType.getUserPoolId();
            jsonWriter.name("UserPoolId");
            jsonWriter.value(userPoolId);
        }
        if (riskConfigurationType.getClientId() != null) {
            String clientId = riskConfigurationType.getClientId();
            jsonWriter.name("ClientId");
            jsonWriter.value(clientId);
        }
        if (riskConfigurationType.getCompromisedCredentialsRiskConfiguration() != null) {
            CompromisedCredentialsRiskConfigurationType compromisedCredentialsRiskConfiguration = riskConfigurationType
                    .getCompromisedCredentialsRiskConfiguration();
            jsonWriter.name("CompromisedCredentialsRiskConfiguration");
            CompromisedCredentialsRiskConfigurationTypeJsonMarshaller.getInstance().marshall(
                    compromisedCredentialsRiskConfiguration, jsonWriter);
        }
        if (riskConfigurationType.getAccountTakeoverRiskConfiguration() != null) {
            AccountTakeoverRiskConfigurationType accountTakeoverRiskConfiguration = riskConfigurationType
                    .getAccountTakeoverRiskConfiguration();
            jsonWriter.name("AccountTakeoverRiskConfiguration");
            AccountTakeoverRiskConfigurationTypeJsonMarshaller.getInstance().marshall(
                    accountTakeoverRiskConfiguration, jsonWriter);
        }
        if (riskConfigurationType.getRiskExceptionConfiguration() != null) {
            RiskExceptionConfigurationType riskExceptionConfiguration = riskConfigurationType
                    .getRiskExceptionConfiguration();
            jsonWriter.name("RiskExceptionConfiguration");
            RiskExceptionConfigurationTypeJsonMarshaller.getInstance().marshall(
                    riskExceptionConfiguration, jsonWriter);
        }
        if (riskConfigurationType.getLastModifiedDate() != null) {
            java.util.Date lastModifiedDate = riskConfigurationType.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        jsonWriter.endObject();
    }

    private static RiskConfigurationTypeJsonMarshaller instance;

    public static RiskConfigurationTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RiskConfigurationTypeJsonMarshaller();
        return instance;
    }
}
