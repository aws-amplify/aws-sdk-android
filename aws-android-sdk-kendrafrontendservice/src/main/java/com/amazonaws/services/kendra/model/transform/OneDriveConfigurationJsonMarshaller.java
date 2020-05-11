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

package com.amazonaws.services.kendra.model.transform;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO OneDriveConfiguration
 */
class OneDriveConfigurationJsonMarshaller {

    public void marshall(OneDriveConfiguration oneDriveConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (oneDriveConfiguration.getTenantDomain() != null) {
            String tenantDomain = oneDriveConfiguration.getTenantDomain();
            jsonWriter.name("TenantDomain");
            jsonWriter.value(tenantDomain);
        }
        if (oneDriveConfiguration.getSecretArn() != null) {
            String secretArn = oneDriveConfiguration.getSecretArn();
            jsonWriter.name("SecretArn");
            jsonWriter.value(secretArn);
        }
        if (oneDriveConfiguration.getOneDriveUsers() != null) {
            OneDriveUsers oneDriveUsers = oneDriveConfiguration.getOneDriveUsers();
            jsonWriter.name("OneDriveUsers");
            OneDriveUsersJsonMarshaller.getInstance().marshall(oneDriveUsers, jsonWriter);
        }
        if (oneDriveConfiguration.getInclusionPatterns() != null) {
            java.util.List<String> inclusionPatterns = oneDriveConfiguration.getInclusionPatterns();
            jsonWriter.name("InclusionPatterns");
            jsonWriter.beginArray();
            for (String inclusionPatternsItem : inclusionPatterns) {
                if (inclusionPatternsItem != null) {
                    jsonWriter.value(inclusionPatternsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (oneDriveConfiguration.getExclusionPatterns() != null) {
            java.util.List<String> exclusionPatterns = oneDriveConfiguration.getExclusionPatterns();
            jsonWriter.name("ExclusionPatterns");
            jsonWriter.beginArray();
            for (String exclusionPatternsItem : exclusionPatterns) {
                if (exclusionPatternsItem != null) {
                    jsonWriter.value(exclusionPatternsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (oneDriveConfiguration.getFieldMappings() != null) {
            java.util.List<DataSourceToIndexFieldMapping> fieldMappings = oneDriveConfiguration
                    .getFieldMappings();
            jsonWriter.name("FieldMappings");
            jsonWriter.beginArray();
            for (DataSourceToIndexFieldMapping fieldMappingsItem : fieldMappings) {
                if (fieldMappingsItem != null) {
                    DataSourceToIndexFieldMappingJsonMarshaller.getInstance().marshall(
                            fieldMappingsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static OneDriveConfigurationJsonMarshaller instance;

    public static OneDriveConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OneDriveConfigurationJsonMarshaller();
        return instance;
    }
}
