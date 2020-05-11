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
 * JSON marshaller for POJO SharePointConfiguration
 */
class SharePointConfigurationJsonMarshaller {

    public void marshall(SharePointConfiguration sharePointConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (sharePointConfiguration.getSharePointVersion() != null) {
            String sharePointVersion = sharePointConfiguration.getSharePointVersion();
            jsonWriter.name("SharePointVersion");
            jsonWriter.value(sharePointVersion);
        }
        if (sharePointConfiguration.getUrls() != null) {
            java.util.List<String> urls = sharePointConfiguration.getUrls();
            jsonWriter.name("Urls");
            jsonWriter.beginArray();
            for (String urlsItem : urls) {
                if (urlsItem != null) {
                    jsonWriter.value(urlsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (sharePointConfiguration.getSecretArn() != null) {
            String secretArn = sharePointConfiguration.getSecretArn();
            jsonWriter.name("SecretArn");
            jsonWriter.value(secretArn);
        }
        if (sharePointConfiguration.getCrawlAttachments() != null) {
            Boolean crawlAttachments = sharePointConfiguration.getCrawlAttachments();
            jsonWriter.name("CrawlAttachments");
            jsonWriter.value(crawlAttachments);
        }
        if (sharePointConfiguration.getUseChangeLog() != null) {
            Boolean useChangeLog = sharePointConfiguration.getUseChangeLog();
            jsonWriter.name("UseChangeLog");
            jsonWriter.value(useChangeLog);
        }
        if (sharePointConfiguration.getInclusionPatterns() != null) {
            java.util.List<String> inclusionPatterns = sharePointConfiguration
                    .getInclusionPatterns();
            jsonWriter.name("InclusionPatterns");
            jsonWriter.beginArray();
            for (String inclusionPatternsItem : inclusionPatterns) {
                if (inclusionPatternsItem != null) {
                    jsonWriter.value(inclusionPatternsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (sharePointConfiguration.getExclusionPatterns() != null) {
            java.util.List<String> exclusionPatterns = sharePointConfiguration
                    .getExclusionPatterns();
            jsonWriter.name("ExclusionPatterns");
            jsonWriter.beginArray();
            for (String exclusionPatternsItem : exclusionPatterns) {
                if (exclusionPatternsItem != null) {
                    jsonWriter.value(exclusionPatternsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (sharePointConfiguration.getVpcConfiguration() != null) {
            DataSourceVpcConfiguration vpcConfiguration = sharePointConfiguration
                    .getVpcConfiguration();
            jsonWriter.name("VpcConfiguration");
            DataSourceVpcConfigurationJsonMarshaller.getInstance().marshall(vpcConfiguration,
                    jsonWriter);
        }
        if (sharePointConfiguration.getFieldMappings() != null) {
            java.util.List<DataSourceToIndexFieldMapping> fieldMappings = sharePointConfiguration
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
        if (sharePointConfiguration.getDocumentTitleFieldName() != null) {
            String documentTitleFieldName = sharePointConfiguration.getDocumentTitleFieldName();
            jsonWriter.name("DocumentTitleFieldName");
            jsonWriter.value(documentTitleFieldName);
        }
        jsonWriter.endObject();
    }

    private static SharePointConfigurationJsonMarshaller instance;

    public static SharePointConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SharePointConfigurationJsonMarshaller();
        return instance;
    }
}
