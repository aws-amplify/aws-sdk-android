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
 * JSON marshaller for POJO ServiceNowServiceCatalogConfiguration
 */
class ServiceNowServiceCatalogConfigurationJsonMarshaller {

    public void marshall(
            ServiceNowServiceCatalogConfiguration serviceNowServiceCatalogConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (serviceNowServiceCatalogConfiguration.getCrawlAttachments() != null) {
            Boolean crawlAttachments = serviceNowServiceCatalogConfiguration.getCrawlAttachments();
            jsonWriter.name("CrawlAttachments");
            jsonWriter.value(crawlAttachments);
        }
        if (serviceNowServiceCatalogConfiguration.getIncludeAttachmentFilePatterns() != null) {
            java.util.List<String> includeAttachmentFilePatterns = serviceNowServiceCatalogConfiguration
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
        if (serviceNowServiceCatalogConfiguration.getExcludeAttachmentFilePatterns() != null) {
            java.util.List<String> excludeAttachmentFilePatterns = serviceNowServiceCatalogConfiguration
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
        if (serviceNowServiceCatalogConfiguration.getDocumentDataFieldName() != null) {
            String documentDataFieldName = serviceNowServiceCatalogConfiguration
                    .getDocumentDataFieldName();
            jsonWriter.name("DocumentDataFieldName");
            jsonWriter.value(documentDataFieldName);
        }
        if (serviceNowServiceCatalogConfiguration.getDocumentTitleFieldName() != null) {
            String documentTitleFieldName = serviceNowServiceCatalogConfiguration
                    .getDocumentTitleFieldName();
            jsonWriter.name("DocumentTitleFieldName");
            jsonWriter.value(documentTitleFieldName);
        }
        if (serviceNowServiceCatalogConfiguration.getFieldMappings() != null) {
            java.util.List<DataSourceToIndexFieldMapping> fieldMappings = serviceNowServiceCatalogConfiguration
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

    private static ServiceNowServiceCatalogConfigurationJsonMarshaller instance;

    public static ServiceNowServiceCatalogConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ServiceNowServiceCatalogConfigurationJsonMarshaller();
        return instance;
    }
}
