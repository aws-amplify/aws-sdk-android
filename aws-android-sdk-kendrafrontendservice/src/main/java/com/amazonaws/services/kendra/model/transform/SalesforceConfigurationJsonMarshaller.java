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
 * JSON marshaller for POJO SalesforceConfiguration
 */
class SalesforceConfigurationJsonMarshaller {

    public void marshall(SalesforceConfiguration salesforceConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (salesforceConfiguration.getServerUrl() != null) {
            String serverUrl = salesforceConfiguration.getServerUrl();
            jsonWriter.name("ServerUrl");
            jsonWriter.value(serverUrl);
        }
        if (salesforceConfiguration.getSecretArn() != null) {
            String secretArn = salesforceConfiguration.getSecretArn();
            jsonWriter.name("SecretArn");
            jsonWriter.value(secretArn);
        }
        if (salesforceConfiguration.getStandardObjectConfigurations() != null) {
            java.util.List<SalesforceStandardObjectConfiguration> standardObjectConfigurations = salesforceConfiguration
                    .getStandardObjectConfigurations();
            jsonWriter.name("StandardObjectConfigurations");
            jsonWriter.beginArray();
            for (SalesforceStandardObjectConfiguration standardObjectConfigurationsItem : standardObjectConfigurations) {
                if (standardObjectConfigurationsItem != null) {
                    SalesforceStandardObjectConfigurationJsonMarshaller.getInstance().marshall(
                            standardObjectConfigurationsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (salesforceConfiguration.getKnowledgeArticleConfiguration() != null) {
            SalesforceKnowledgeArticleConfiguration knowledgeArticleConfiguration = salesforceConfiguration
                    .getKnowledgeArticleConfiguration();
            jsonWriter.name("KnowledgeArticleConfiguration");
            SalesforceKnowledgeArticleConfigurationJsonMarshaller.getInstance().marshall(
                    knowledgeArticleConfiguration, jsonWriter);
        }
        if (salesforceConfiguration.getChatterFeedConfiguration() != null) {
            SalesforceChatterFeedConfiguration chatterFeedConfiguration = salesforceConfiguration
                    .getChatterFeedConfiguration();
            jsonWriter.name("ChatterFeedConfiguration");
            SalesforceChatterFeedConfigurationJsonMarshaller.getInstance().marshall(
                    chatterFeedConfiguration, jsonWriter);
        }
        if (salesforceConfiguration.getCrawlAttachments() != null) {
            Boolean crawlAttachments = salesforceConfiguration.getCrawlAttachments();
            jsonWriter.name("CrawlAttachments");
            jsonWriter.value(crawlAttachments);
        }
        if (salesforceConfiguration.getStandardObjectAttachmentConfiguration() != null) {
            SalesforceStandardObjectAttachmentConfiguration standardObjectAttachmentConfiguration = salesforceConfiguration
                    .getStandardObjectAttachmentConfiguration();
            jsonWriter.name("StandardObjectAttachmentConfiguration");
            SalesforceStandardObjectAttachmentConfigurationJsonMarshaller.getInstance().marshall(
                    standardObjectAttachmentConfiguration, jsonWriter);
        }
        if (salesforceConfiguration.getIncludeAttachmentFilePatterns() != null) {
            java.util.List<String> includeAttachmentFilePatterns = salesforceConfiguration
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
        if (salesforceConfiguration.getExcludeAttachmentFilePatterns() != null) {
            java.util.List<String> excludeAttachmentFilePatterns = salesforceConfiguration
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
        jsonWriter.endObject();
    }

    private static SalesforceConfigurationJsonMarshaller instance;

    public static SalesforceConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SalesforceConfigurationJsonMarshaller();
        return instance;
    }
}
