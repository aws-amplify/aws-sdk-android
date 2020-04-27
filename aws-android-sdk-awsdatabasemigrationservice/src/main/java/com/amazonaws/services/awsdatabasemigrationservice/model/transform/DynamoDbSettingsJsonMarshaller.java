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

package com.amazonaws.services.awsdatabasemigrationservice.model.transform;

import com.amazonaws.services.awsdatabasemigrationservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DynamoDbSettings
 */
class DynamoDbSettingsJsonMarshaller {

    public void marshall(DynamoDbSettings dynamoDbSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (dynamoDbSettings.getServiceAccessRoleArn() != null) {
            String serviceAccessRoleArn = dynamoDbSettings.getServiceAccessRoleArn();
            jsonWriter.name("ServiceAccessRoleArn");
            jsonWriter.value(serviceAccessRoleArn);
        }
        jsonWriter.endObject();
    }

    private static DynamoDbSettingsJsonMarshaller instance;

    public static DynamoDbSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DynamoDbSettingsJsonMarshaller();
        return instance;
    }
}
