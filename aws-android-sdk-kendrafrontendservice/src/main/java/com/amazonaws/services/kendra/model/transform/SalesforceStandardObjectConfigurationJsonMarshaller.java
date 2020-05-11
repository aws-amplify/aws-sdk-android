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
 * JSON marshaller for POJO SalesforceStandardObjectConfiguration
 */
class SalesforceStandardObjectConfigurationJsonMarshaller {

    public void marshall(
            SalesforceStandardObjectConfiguration salesforceStandardObjectConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (salesforceStandardObjectConfiguration.getName() != null) {
            String name = salesforceStandardObjectConfiguration.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (salesforceStandardObjectConfiguration.getDocumentDataFieldName() != null) {
            String documentDataFieldName = salesforceStandardObjectConfiguration
                    .getDocumentDataFieldName();
            jsonWriter.name("DocumentDataFieldName");
            jsonWriter.value(documentDataFieldName);
        }
        if (salesforceStandardObjectConfiguration.getDocumentTitleFieldName() != null) {
            String documentTitleFieldName = salesforceStandardObjectConfiguration
                    .getDocumentTitleFieldName();
            jsonWriter.name("DocumentTitleFieldName");
            jsonWriter.value(documentTitleFieldName);
        }
        if (salesforceStandardObjectConfiguration.getFieldMappings() != null) {
            java.util.List<DataSourceToIndexFieldMapping> fieldMappings = salesforceStandardObjectConfiguration
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

    private static SalesforceStandardObjectConfigurationJsonMarshaller instance;

    public static SalesforceStandardObjectConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SalesforceStandardObjectConfigurationJsonMarshaller();
        return instance;
    }
}
