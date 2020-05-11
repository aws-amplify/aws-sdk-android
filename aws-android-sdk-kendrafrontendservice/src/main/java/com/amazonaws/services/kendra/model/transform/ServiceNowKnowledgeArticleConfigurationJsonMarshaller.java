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
 * JSON marshaller for POJO ServiceNowKnowledgeArticleConfiguration
 */
class ServiceNowKnowledgeArticleConfigurationJsonMarshaller {

    public void marshall(
            ServiceNowKnowledgeArticleConfiguration serviceNowKnowledgeArticleConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (serviceNowKnowledgeArticleConfiguration.getCrawlAttachments() != null) {
            Boolean crawlAttachments = serviceNowKnowledgeArticleConfiguration
                    .getCrawlAttachments();
            jsonWriter.name("CrawlAttachments");
            jsonWriter.value(crawlAttachments);
        }
        if (serviceNowKnowledgeArticleConfiguration.getIncludeAttachmentFilePatterns() != null) {
            java.util.List<String> includeAttachmentFilePatterns = serviceNowKnowledgeArticleConfiguration
                    .getIncludeAttachmentFilePatterns();
            jsonWriter.name("IncludeAttachmentFilePatterns");
            jsonWriter.beginArray();
            for (String includeAttachmentFilePatternsItem : includeAttachmentFilePatterns) {
                if (includeAttachmentFilePatternsItem != null) {
                    jsonWriter.value(includeAttachmentFilePatternsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (serviceNowKnowledgeArticleConfiguration.getExcludeAttachmentFilePatterns() != null) {
            java.util.List<String> excludeAttachmentFilePatterns = serviceNowKnowledgeArticleConfiguration
                    .getExcludeAttachmentFilePatterns();
            jsonWriter.name("ExcludeAttachmentFilePatterns");
            jsonWriter.beginArray();
            for (String excludeAttachmentFilePatternsItem : excludeAttachmentFilePatterns) {
                if (excludeAttachmentFilePatternsItem != null) {
                    jsonWriter.value(excludeAttachmentFilePatternsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (serviceNowKnowledgeArticleConfiguration.getDocumentDataFieldName() != null) {
            String documentDataFieldName = serviceNowKnowledgeArticleConfiguration
                    .getDocumentDataFieldName();
            jsonWriter.name("DocumentDataFieldName");
            jsonWriter.value(documentDataFieldName);
        }
        if (serviceNowKnowledgeArticleConfiguration.getDocumentTitleFieldName() != null) {
            String documentTitleFieldName = serviceNowKnowledgeArticleConfiguration
                    .getDocumentTitleFieldName();
            jsonWriter.name("DocumentTitleFieldName");
            jsonWriter.value(documentTitleFieldName);
        }
        if (serviceNowKnowledgeArticleConfiguration.getFieldMappings() != null) {
            java.util.List<DataSourceToIndexFieldMapping> fieldMappings = serviceNowKnowledgeArticleConfiguration
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

    private static ServiceNowKnowledgeArticleConfigurationJsonMarshaller instance;

    public static ServiceNowKnowledgeArticleConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ServiceNowKnowledgeArticleConfigurationJsonMarshaller();
        return instance;
    }
}
