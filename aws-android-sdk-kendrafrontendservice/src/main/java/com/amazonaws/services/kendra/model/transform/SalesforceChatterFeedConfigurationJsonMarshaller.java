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
 * JSON marshaller for POJO SalesforceChatterFeedConfiguration
 */
class SalesforceChatterFeedConfigurationJsonMarshaller {

    public void marshall(SalesforceChatterFeedConfiguration salesforceChatterFeedConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (salesforceChatterFeedConfiguration.getDocumentDataFieldName() != null) {
            String documentDataFieldName = salesforceChatterFeedConfiguration
                    .getDocumentDataFieldName();
            jsonWriter.name("DocumentDataFieldName");
            jsonWriter.value(documentDataFieldName);
        }
        if (salesforceChatterFeedConfiguration.getDocumentTitleFieldName() != null) {
            String documentTitleFieldName = salesforceChatterFeedConfiguration
                    .getDocumentTitleFieldName();
            jsonWriter.name("DocumentTitleFieldName");
            jsonWriter.value(documentTitleFieldName);
        }
        if (salesforceChatterFeedConfiguration.getFieldMappings() != null) {
            java.util.List<DataSourceToIndexFieldMapping> fieldMappings = salesforceChatterFeedConfiguration
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
        if (salesforceChatterFeedConfiguration.getIncludeFilterTypes() != null) {
            java.util.List<String> includeFilterTypes = salesforceChatterFeedConfiguration
                    .getIncludeFilterTypes();
            jsonWriter.name("IncludeFilterTypes");
            jsonWriter.beginArray();
            for (String includeFilterTypesItem : includeFilterTypes) {
                if (includeFilterTypesItem != null) {
                    jsonWriter.value(includeFilterTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static SalesforceChatterFeedConfigurationJsonMarshaller instance;

    public static SalesforceChatterFeedConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SalesforceChatterFeedConfigurationJsonMarshaller();
        return instance;
    }
}
