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
 * JSON marshaller for POJO ServiceNowConfiguration
 */
class ServiceNowConfigurationJsonMarshaller {

    public void marshall(ServiceNowConfiguration serviceNowConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (serviceNowConfiguration.getHostUrl() != null) {
            String hostUrl = serviceNowConfiguration.getHostUrl();
            jsonWriter.name("HostUrl");
            jsonWriter.value(hostUrl);
        }
        if (serviceNowConfiguration.getSecretArn() != null) {
            String secretArn = serviceNowConfiguration.getSecretArn();
            jsonWriter.name("SecretArn");
            jsonWriter.value(secretArn);
        }
        if (serviceNowConfiguration.getServiceNowBuildVersion() != null) {
            String serviceNowBuildVersion = serviceNowConfiguration.getServiceNowBuildVersion();
            jsonWriter.name("ServiceNowBuildVersion");
            jsonWriter.value(serviceNowBuildVersion);
        }
        if (serviceNowConfiguration.getKnowledgeArticleConfiguration() != null) {
            ServiceNowKnowledgeArticleConfiguration knowledgeArticleConfiguration = serviceNowConfiguration
                    .getKnowledgeArticleConfiguration();
            jsonWriter.name("KnowledgeArticleConfiguration");
            ServiceNowKnowledgeArticleConfigurationJsonMarshaller.getInstance().marshall(
                    knowledgeArticleConfiguration, jsonWriter);
        }
        if (serviceNowConfiguration.getServiceCatalogConfiguration() != null) {
            ServiceNowServiceCatalogConfiguration serviceCatalogConfiguration = serviceNowConfiguration
                    .getServiceCatalogConfiguration();
            jsonWriter.name("ServiceCatalogConfiguration");
            ServiceNowServiceCatalogConfigurationJsonMarshaller.getInstance().marshall(
                    serviceCatalogConfiguration, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ServiceNowConfigurationJsonMarshaller instance;

    public static ServiceNowConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ServiceNowConfigurationJsonMarshaller();
        return instance;
    }
}
