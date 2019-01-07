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
 * JSON marshaller for POJO AnalyticsConfigurationType
 */
class AnalyticsConfigurationTypeJsonMarshaller {

    public void marshall(AnalyticsConfigurationType analyticsConfigurationType,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (analyticsConfigurationType.getApplicationId() != null) {
            String applicationId = analyticsConfigurationType.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (analyticsConfigurationType.getRoleArn() != null) {
            String roleArn = analyticsConfigurationType.getRoleArn();
            jsonWriter.name("RoleArn");
            jsonWriter.value(roleArn);
        }
        if (analyticsConfigurationType.getExternalId() != null) {
            String externalId = analyticsConfigurationType.getExternalId();
            jsonWriter.name("ExternalId");
            jsonWriter.value(externalId);
        }
        if (analyticsConfigurationType.getUserDataShared() != null) {
            Boolean userDataShared = analyticsConfigurationType.getUserDataShared();
            jsonWriter.name("UserDataShared");
            jsonWriter.value(userDataShared);
        }
        jsonWriter.endObject();
    }

    private static AnalyticsConfigurationTypeJsonMarshaller instance;

    public static AnalyticsConfigurationTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AnalyticsConfigurationTypeJsonMarshaller();
        return instance;
    }
}
