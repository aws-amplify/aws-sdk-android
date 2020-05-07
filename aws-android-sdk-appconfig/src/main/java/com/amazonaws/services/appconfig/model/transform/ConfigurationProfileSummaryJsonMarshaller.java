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

package com.amazonaws.services.appconfig.model.transform;

import com.amazonaws.services.appconfig.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ConfigurationProfileSummary
 */
class ConfigurationProfileSummaryJsonMarshaller {

    public void marshall(ConfigurationProfileSummary configurationProfileSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (configurationProfileSummary.getApplicationId() != null) {
            String applicationId = configurationProfileSummary.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (configurationProfileSummary.getId() != null) {
            String id = configurationProfileSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (configurationProfileSummary.getName() != null) {
            String name = configurationProfileSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (configurationProfileSummary.getLocationUri() != null) {
            String locationUri = configurationProfileSummary.getLocationUri();
            jsonWriter.name("LocationUri");
            jsonWriter.value(locationUri);
        }
        if (configurationProfileSummary.getValidatorTypes() != null) {
            java.util.List<String> validatorTypes = configurationProfileSummary.getValidatorTypes();
            jsonWriter.name("ValidatorTypes");
            jsonWriter.beginArray();
            for (String validatorTypesItem : validatorTypes) {
                if (validatorTypesItem != null) {
                    jsonWriter.value(validatorTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ConfigurationProfileSummaryJsonMarshaller instance;

    public static ConfigurationProfileSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConfigurationProfileSummaryJsonMarshaller();
        return instance;
    }
}
