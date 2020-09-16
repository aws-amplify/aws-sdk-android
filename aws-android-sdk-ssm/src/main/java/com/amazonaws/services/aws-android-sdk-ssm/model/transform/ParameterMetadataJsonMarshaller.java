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
 * JSON marshaller for POJO ParameterMetadata
 */
class ParameterMetadataJsonMarshaller {

    public void marshall(ParameterMetadata parameterMetadata, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (parameterMetadata.getName() != null) {
            String name = parameterMetadata.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (parameterMetadata.getType() != null) {
            String type = parameterMetadata.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (parameterMetadata.getKeyId() != null) {
            String keyId = parameterMetadata.getKeyId();
            jsonWriter.name("KeyId");
            jsonWriter.value(keyId);
        }
        if (parameterMetadata.getLastModifiedDate() != null) {
            java.util.Date lastModifiedDate = parameterMetadata.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (parameterMetadata.getLastModifiedUser() != null) {
            String lastModifiedUser = parameterMetadata.getLastModifiedUser();
            jsonWriter.name("LastModifiedUser");
            jsonWriter.value(lastModifiedUser);
        }
        if (parameterMetadata.getDescription() != null) {
            String description = parameterMetadata.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (parameterMetadata.getAllowedPattern() != null) {
            String allowedPattern = parameterMetadata.getAllowedPattern();
            jsonWriter.name("AllowedPattern");
            jsonWriter.value(allowedPattern);
        }
        if (parameterMetadata.getVersion() != null) {
            Long version = parameterMetadata.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        if (parameterMetadata.getTier() != null) {
            String tier = parameterMetadata.getTier();
            jsonWriter.name("Tier");
            jsonWriter.value(tier);
        }
        if (parameterMetadata.getPolicies() != null) {
            java.util.List<ParameterInlinePolicy> policies = parameterMetadata.getPolicies();
            jsonWriter.name("Policies");
            jsonWriter.beginArray();
            for (ParameterInlinePolicy policiesItem : policies) {
                if (policiesItem != null) {
            ParameterInlinePolicyJsonMarshaller.getInstance().marshall(policiesItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        if (parameterMetadata.getDataType() != null) {
            String dataType = parameterMetadata.getDataType();
            jsonWriter.name("DataType");
            jsonWriter.value(dataType);
        }
        jsonWriter.endObject();
    }

    private static ParameterMetadataJsonMarshaller instance;
    public static ParameterMetadataJsonMarshaller getInstance() {
        if (instance == null) instance = new ParameterMetadataJsonMarshaller();
        return instance;
    }
}
