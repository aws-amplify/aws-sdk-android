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
 * JSON marshaller for POJO SalesforceKnowledgeArticleConfiguration
 */
class SalesforceKnowledgeArticleConfigurationJsonMarshaller {

    public void marshall(
            SalesforceKnowledgeArticleConfiguration salesforceKnowledgeArticleConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (salesforceKnowledgeArticleConfiguration.getIncludedStates() != null) {
            java.util.List<String> includedStates = salesforceKnowledgeArticleConfiguration
                    .getIncludedStates();
            jsonWriter.name("IncludedStates");
            jsonWriter.beginArray();
            for (String includedStatesItem : includedStates) {
                if (includedStatesItem != null) {
                    jsonWriter.value(includedStatesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (salesforceKnowledgeArticleConfiguration.getStandardKnowledgeArticleTypeConfiguration() != null) {
            SalesforceStandardKnowledgeArticleTypeConfiguration standardKnowledgeArticleTypeConfiguration = salesforceKnowledgeArticleConfiguration
                    .getStandardKnowledgeArticleTypeConfiguration();
            jsonWriter.name("StandardKnowledgeArticleTypeConfiguration");
            SalesforceStandardKnowledgeArticleTypeConfigurationJsonMarshaller.getInstance()
                    .marshall(standardKnowledgeArticleTypeConfiguration, jsonWriter);
        }
        if (salesforceKnowledgeArticleConfiguration.getCustomKnowledgeArticleTypeConfigurations() != null) {
            java.util.List<SalesforceCustomKnowledgeArticleTypeConfiguration> customKnowledgeArticleTypeConfigurations = salesforceKnowledgeArticleConfiguration
                    .getCustomKnowledgeArticleTypeConfigurations();
            jsonWriter.name("CustomKnowledgeArticleTypeConfigurations");
            jsonWriter.beginArray();
            for (SalesforceCustomKnowledgeArticleTypeConfiguration customKnowledgeArticleTypeConfigurationsItem : customKnowledgeArticleTypeConfigurations) {
                if (customKnowledgeArticleTypeConfigurationsItem != null) {
                    SalesforceCustomKnowledgeArticleTypeConfigurationJsonMarshaller.getInstance()
                            .marshall(customKnowledgeArticleTypeConfigurationsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static SalesforceKnowledgeArticleConfigurationJsonMarshaller instance;

    public static SalesforceKnowledgeArticleConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SalesforceKnowledgeArticleConfigurationJsonMarshaller();
        return instance;
    }
}
