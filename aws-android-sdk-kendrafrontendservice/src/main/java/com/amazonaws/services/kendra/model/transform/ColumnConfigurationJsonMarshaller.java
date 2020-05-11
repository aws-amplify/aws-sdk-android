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
 * JSON marshaller for POJO ColumnConfiguration
 */
class ColumnConfigurationJsonMarshaller {

    public void marshall(ColumnConfiguration columnConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (columnConfiguration.getDocumentIdColumnName() != null) {
            String documentIdColumnName = columnConfiguration.getDocumentIdColumnName();
            jsonWriter.name("DocumentIdColumnName");
            jsonWriter.value(documentIdColumnName);
        }
        if (columnConfiguration.getDocumentDataColumnName() != null) {
            String documentDataColumnName = columnConfiguration.getDocumentDataColumnName();
            jsonWriter.name("DocumentDataColumnName");
            jsonWriter.value(documentDataColumnName);
        }
        if (columnConfiguration.getDocumentTitleColumnName() != null) {
            String documentTitleColumnName = columnConfiguration.getDocumentTitleColumnName();
            jsonWriter.name("DocumentTitleColumnName");
            jsonWriter.value(documentTitleColumnName);
        }
        if (columnConfiguration.getFieldMappings() != null) {
            java.util.List<DataSourceToIndexFieldMapping> fieldMappings = columnConfiguration
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
        if (columnConfiguration.getChangeDetectingColumns() != null) {
            java.util.List<String> changeDetectingColumns = columnConfiguration
                    .getChangeDetectingColumns();
            jsonWriter.name("ChangeDetectingColumns");
            jsonWriter.beginArray();
            for (String changeDetectingColumnsItem : changeDetectingColumns) {
                if (changeDetectingColumnsItem != null) {
                    jsonWriter.value(changeDetectingColumnsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ColumnConfigurationJsonMarshaller instance;

    public static ColumnConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ColumnConfigurationJsonMarshaller();
        return instance;
    }
}
