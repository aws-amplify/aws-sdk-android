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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ParameterHistory
 */
class ParameterHistoryJsonMarshaller {

    public void marshall(ParameterHistory parameterHistory, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (parameterHistory.getName() != null) {
            String name = parameterHistory.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (parameterHistory.getType() != null) {
            String type = parameterHistory.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (parameterHistory.getKeyId() != null) {
            String keyId = parameterHistory.getKeyId();
            jsonWriter.name("KeyId");
            jsonWriter.value(keyId);
        }
        if (parameterHistory.getLastModifiedDate() != null) {
            java.util.Date lastModifiedDate = parameterHistory.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (parameterHistory.getLastModifiedUser() != null) {
            String lastModifiedUser = parameterHistory.getLastModifiedUser();
            jsonWriter.name("LastModifiedUser");
            jsonWriter.value(lastModifiedUser);
        }
        if (parameterHistory.getDescription() != null) {
            String description = parameterHistory.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (parameterHistory.getValue() != null) {
            String value = parameterHistory.getValue();
            jsonWriter.name("Value");
            jsonWriter.value(value);
        }
        if (parameterHistory.getAllowedPattern() != null) {
            String allowedPattern = parameterHistory.getAllowedPattern();
            jsonWriter.name("AllowedPattern");
            jsonWriter.value(allowedPattern);
        }
        if (parameterHistory.getVersion() != null) {
            Long version = parameterHistory.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        if (parameterHistory.getLabels() != null) {
            java.util.List<String> labels = parameterHistory.getLabels();
            jsonWriter.name("Labels");
            jsonWriter.beginArray();
            for (String labelsItem : labels) {
                if (labelsItem != null) {
            jsonWriter.value(labelsItem);
                    }
            }
            jsonWriter.endArray();
        }
        if (parameterHistory.getTier() != null) {
            String tier = parameterHistory.getTier();
            jsonWriter.name("Tier");
            jsonWriter.value(tier);
        }
        if (parameterHistory.getPolicies() != null) {
            java.util.List<ParameterInlinePolicy> policies = parameterHistory.getPolicies();
            jsonWriter.name("Policies");
            jsonWriter.beginArray();
            for (ParameterInlinePolicy policiesItem : policies) {
                if (policiesItem != null) {
            ParameterInlinePolicyJsonMarshaller.getInstance().marshall(policiesItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        if (parameterHistory.getDataType() != null) {
            String dataType = parameterHistory.getDataType();
            jsonWriter.name("DataType");
            jsonWriter.value(dataType);
        }
        jsonWriter.endObject();
    }

    private static ParameterHistoryJsonMarshaller instance;
    public static ParameterHistoryJsonMarshaller getInstance() {
        if (instance == null) instance = new ParameterHistoryJsonMarshaller();
        return instance;
    }
}
