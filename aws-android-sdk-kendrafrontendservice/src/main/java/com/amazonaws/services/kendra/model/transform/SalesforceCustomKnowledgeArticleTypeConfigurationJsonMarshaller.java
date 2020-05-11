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
 * JSON marshaller for POJO SalesforceCustomKnowledgeArticleTypeConfiguration
 */
class SalesforceCustomKnowledgeArticleTypeConfigurationJsonMarshaller {

    public void marshall(
            SalesforceCustomKnowledgeArticleTypeConfiguration salesforceCustomKnowledgeArticleTypeConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (salesforceCustomKnowledgeArticleTypeConfiguration.getName() != null) {
            String name = salesforceCustomKnowledgeArticleTypeConfiguration.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (salesforceCustomKnowledgeArticleTypeConfiguration.getDocumentDataFieldName() != null) {
            String documentDataFieldName = salesforceCustomKnowledgeArticleTypeConfiguration
                    .getDocumentDataFieldName();
            jsonWriter.name("DocumentDataFieldName");
            jsonWriter.value(documentDataFieldName);
        }
        if (salesforceCustomKnowledgeArticleTypeConfiguration.getDocumentTitleFieldName() != null) {
            String documentTitleFieldName = salesforceCustomKnowledgeArticleTypeConfiguration
                    .getDocumentTitleFieldName();
            jsonWriter.name("DocumentTitleFieldName");
            jsonWriter.value(documentTitleFieldName);
        }
        if (salesforceCustomKnowledgeArticleTypeConfiguration.getFieldMappings() != null) {
            java.util.List<DataSourceToIndexFieldMapping> fieldMappings = salesforceCustomKnowledgeArticleTypeConfiguration
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

    private static SalesforceCustomKnowledgeArticleTypeConfigurationJsonMarshaller instance;

    public static SalesforceCustomKnowledgeArticleTypeConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SalesforceCustomKnowledgeArticleTypeConfigurationJsonMarshaller();
        return instance;
    }
}
