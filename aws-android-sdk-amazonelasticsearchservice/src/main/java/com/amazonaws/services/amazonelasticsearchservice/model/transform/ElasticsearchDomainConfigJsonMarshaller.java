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

package com.amazonaws.services.amazonelasticsearchservice.model.transform;

import com.amazonaws.services.amazonelasticsearchservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ElasticsearchDomainConfig
 */
class ElasticsearchDomainConfigJsonMarshaller {

    public void marshall(ElasticsearchDomainConfig elasticsearchDomainConfig,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (elasticsearchDomainConfig.getElasticsearchVersion() != null) {
            ElasticsearchVersionStatus elasticsearchVersion = elasticsearchDomainConfig
                    .getElasticsearchVersion();
            jsonWriter.name("ElasticsearchVersion");
            ElasticsearchVersionStatusJsonMarshaller.getInstance().marshall(elasticsearchVersion,
                    jsonWriter);
        }
        if (elasticsearchDomainConfig.getElasticsearchClusterConfig() != null) {
            ElasticsearchClusterConfigStatus elasticsearchClusterConfig = elasticsearchDomainConfig
                    .getElasticsearchClusterConfig();
            jsonWriter.name("ElasticsearchClusterConfig");
            ElasticsearchClusterConfigStatusJsonMarshaller.getInstance().marshall(
                    elasticsearchClusterConfig, jsonWriter);
        }
        if (elasticsearchDomainConfig.getEBSOptions() != null) {
            EBSOptionsStatus eBSOptions = elasticsearchDomainConfig.getEBSOptions();
            jsonWriter.name("EBSOptions");
            EBSOptionsStatusJsonMarshaller.getInstance().marshall(eBSOptions, jsonWriter);
        }
        if (elasticsearchDomainConfig.getAccessPolicies() != null) {
            AccessPoliciesStatus accessPolicies = elasticsearchDomainConfig.getAccessPolicies();
            jsonWriter.name("AccessPolicies");
            AccessPoliciesStatusJsonMarshaller.getInstance().marshall(accessPolicies, jsonWriter);
        }
        if (elasticsearchDomainConfig.getSnapshotOptions() != null) {
            SnapshotOptionsStatus snapshotOptions = elasticsearchDomainConfig.getSnapshotOptions();
            jsonWriter.name("SnapshotOptions");
            SnapshotOptionsStatusJsonMarshaller.getInstance().marshall(snapshotOptions, jsonWriter);
        }
        if (elasticsearchDomainConfig.getVPCOptions() != null) {
            VPCDerivedInfoStatus vPCOptions = elasticsearchDomainConfig.getVPCOptions();
            jsonWriter.name("VPCOptions");
            VPCDerivedInfoStatusJsonMarshaller.getInstance().marshall(vPCOptions, jsonWriter);
        }
        if (elasticsearchDomainConfig.getCognitoOptions() != null) {
            CognitoOptionsStatus cognitoOptions = elasticsearchDomainConfig.getCognitoOptions();
            jsonWriter.name("CognitoOptions");
            CognitoOptionsStatusJsonMarshaller.getInstance().marshall(cognitoOptions, jsonWriter);
        }
        if (elasticsearchDomainConfig.getEncryptionAtRestOptions() != null) {
            EncryptionAtRestOptionsStatus encryptionAtRestOptions = elasticsearchDomainConfig
                    .getEncryptionAtRestOptions();
            jsonWriter.name("EncryptionAtRestOptions");
            EncryptionAtRestOptionsStatusJsonMarshaller.getInstance().marshall(
                    encryptionAtRestOptions, jsonWriter);
        }
        if (elasticsearchDomainConfig.getNodeToNodeEncryptionOptions() != null) {
            NodeToNodeEncryptionOptionsStatus nodeToNodeEncryptionOptions = elasticsearchDomainConfig
                    .getNodeToNodeEncryptionOptions();
            jsonWriter.name("NodeToNodeEncryptionOptions");
            NodeToNodeEncryptionOptionsStatusJsonMarshaller.getInstance().marshall(
                    nodeToNodeEncryptionOptions, jsonWriter);
        }
        if (elasticsearchDomainConfig.getAdvancedOptions() != null) {
            AdvancedOptionsStatus advancedOptions = elasticsearchDomainConfig.getAdvancedOptions();
            jsonWriter.name("AdvancedOptions");
            AdvancedOptionsStatusJsonMarshaller.getInstance().marshall(advancedOptions, jsonWriter);
        }
        if (elasticsearchDomainConfig.getLogPublishingOptions() != null) {
            LogPublishingOptionsStatus logPublishingOptions = elasticsearchDomainConfig
                    .getLogPublishingOptions();
            jsonWriter.name("LogPublishingOptions");
            LogPublishingOptionsStatusJsonMarshaller.getInstance().marshall(logPublishingOptions,
                    jsonWriter);
        }
        if (elasticsearchDomainConfig.getDomainEndpointOptions() != null) {
            DomainEndpointOptionsStatus domainEndpointOptions = elasticsearchDomainConfig
                    .getDomainEndpointOptions();
            jsonWriter.name("DomainEndpointOptions");
            DomainEndpointOptionsStatusJsonMarshaller.getInstance().marshall(domainEndpointOptions,
                    jsonWriter);
        }
        if (elasticsearchDomainConfig.getAdvancedSecurityOptions() != null) {
            AdvancedSecurityOptionsStatus advancedSecurityOptions = elasticsearchDomainConfig
                    .getAdvancedSecurityOptions();
            jsonWriter.name("AdvancedSecurityOptions");
            AdvancedSecurityOptionsStatusJsonMarshaller.getInstance().marshall(
                    advancedSecurityOptions, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ElasticsearchDomainConfigJsonMarshaller instance;

    public static ElasticsearchDomainConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ElasticsearchDomainConfigJsonMarshaller();
        return instance;
    }
}
