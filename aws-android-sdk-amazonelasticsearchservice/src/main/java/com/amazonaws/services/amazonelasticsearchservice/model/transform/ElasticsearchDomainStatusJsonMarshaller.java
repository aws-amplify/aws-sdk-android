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
 * JSON marshaller for POJO ElasticsearchDomainStatus
 */
class ElasticsearchDomainStatusJsonMarshaller {

    public void marshall(ElasticsearchDomainStatus elasticsearchDomainStatus,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (elasticsearchDomainStatus.getDomainId() != null) {
            String domainId = elasticsearchDomainStatus.getDomainId();
            jsonWriter.name("DomainId");
            jsonWriter.value(domainId);
        }
        if (elasticsearchDomainStatus.getDomainName() != null) {
            String domainName = elasticsearchDomainStatus.getDomainName();
            jsonWriter.name("DomainName");
            jsonWriter.value(domainName);
        }
        if (elasticsearchDomainStatus.getARN() != null) {
            String aRN = elasticsearchDomainStatus.getARN();
            jsonWriter.name("ARN");
            jsonWriter.value(aRN);
        }
        if (elasticsearchDomainStatus.getCreated() != null) {
            Boolean created = elasticsearchDomainStatus.getCreated();
            jsonWriter.name("Created");
            jsonWriter.value(created);
        }
        if (elasticsearchDomainStatus.getDeleted() != null) {
            Boolean deleted = elasticsearchDomainStatus.getDeleted();
            jsonWriter.name("Deleted");
            jsonWriter.value(deleted);
        }
        if (elasticsearchDomainStatus.getEndpoint() != null) {
            String endpoint = elasticsearchDomainStatus.getEndpoint();
            jsonWriter.name("Endpoint");
            jsonWriter.value(endpoint);
        }
        if (elasticsearchDomainStatus.getEndpoints() != null) {
            java.util.Map<String, String> endpoints = elasticsearchDomainStatus.getEndpoints();
            jsonWriter.name("Endpoints");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> endpointsEntry : endpoints.entrySet()) {
                String endpointsValue = endpointsEntry.getValue();
                if (endpointsValue != null) {
                    jsonWriter.name(endpointsEntry.getKey());
                    jsonWriter.value(endpointsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (elasticsearchDomainStatus.getProcessing() != null) {
            Boolean processing = elasticsearchDomainStatus.getProcessing();
            jsonWriter.name("Processing");
            jsonWriter.value(processing);
        }
        if (elasticsearchDomainStatus.getUpgradeProcessing() != null) {
            Boolean upgradeProcessing = elasticsearchDomainStatus.getUpgradeProcessing();
            jsonWriter.name("UpgradeProcessing");
            jsonWriter.value(upgradeProcessing);
        }
        if (elasticsearchDomainStatus.getElasticsearchVersion() != null) {
            String elasticsearchVersion = elasticsearchDomainStatus.getElasticsearchVersion();
            jsonWriter.name("ElasticsearchVersion");
            jsonWriter.value(elasticsearchVersion);
        }
        if (elasticsearchDomainStatus.getElasticsearchClusterConfig() != null) {
            ElasticsearchClusterConfig elasticsearchClusterConfig = elasticsearchDomainStatus
                    .getElasticsearchClusterConfig();
            jsonWriter.name("ElasticsearchClusterConfig");
            ElasticsearchClusterConfigJsonMarshaller.getInstance().marshall(
                    elasticsearchClusterConfig, jsonWriter);
        }
        if (elasticsearchDomainStatus.getEBSOptions() != null) {
            EBSOptions eBSOptions = elasticsearchDomainStatus.getEBSOptions();
            jsonWriter.name("EBSOptions");
            EBSOptionsJsonMarshaller.getInstance().marshall(eBSOptions, jsonWriter);
        }
        if (elasticsearchDomainStatus.getAccessPolicies() != null) {
            String accessPolicies = elasticsearchDomainStatus.getAccessPolicies();
            jsonWriter.name("AccessPolicies");
            jsonWriter.value(accessPolicies);
        }
        if (elasticsearchDomainStatus.getSnapshotOptions() != null) {
            SnapshotOptions snapshotOptions = elasticsearchDomainStatus.getSnapshotOptions();
            jsonWriter.name("SnapshotOptions");
            SnapshotOptionsJsonMarshaller.getInstance().marshall(snapshotOptions, jsonWriter);
        }
        if (elasticsearchDomainStatus.getVPCOptions() != null) {
            VPCDerivedInfo vPCOptions = elasticsearchDomainStatus.getVPCOptions();
            jsonWriter.name("VPCOptions");
            VPCDerivedInfoJsonMarshaller.getInstance().marshall(vPCOptions, jsonWriter);
        }
        if (elasticsearchDomainStatus.getCognitoOptions() != null) {
            CognitoOptions cognitoOptions = elasticsearchDomainStatus.getCognitoOptions();
            jsonWriter.name("CognitoOptions");
            CognitoOptionsJsonMarshaller.getInstance().marshall(cognitoOptions, jsonWriter);
        }
        if (elasticsearchDomainStatus.getEncryptionAtRestOptions() != null) {
            EncryptionAtRestOptions encryptionAtRestOptions = elasticsearchDomainStatus
                    .getEncryptionAtRestOptions();
            jsonWriter.name("EncryptionAtRestOptions");
            EncryptionAtRestOptionsJsonMarshaller.getInstance().marshall(encryptionAtRestOptions,
                    jsonWriter);
        }
        if (elasticsearchDomainStatus.getNodeToNodeEncryptionOptions() != null) {
            NodeToNodeEncryptionOptions nodeToNodeEncryptionOptions = elasticsearchDomainStatus
                    .getNodeToNodeEncryptionOptions();
            jsonWriter.name("NodeToNodeEncryptionOptions");
            NodeToNodeEncryptionOptionsJsonMarshaller.getInstance().marshall(
                    nodeToNodeEncryptionOptions, jsonWriter);
        }
        if (elasticsearchDomainStatus.getAdvancedOptions() != null) {
            java.util.Map<String, String> advancedOptions = elasticsearchDomainStatus
                    .getAdvancedOptions();
            jsonWriter.name("AdvancedOptions");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> advancedOptionsEntry : advancedOptions
                    .entrySet()) {
                String advancedOptionsValue = advancedOptionsEntry.getValue();
                if (advancedOptionsValue != null) {
                    jsonWriter.name(advancedOptionsEntry.getKey());
                    jsonWriter.value(advancedOptionsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (elasticsearchDomainStatus.getLogPublishingOptions() != null) {
            java.util.Map<String, LogPublishingOption> logPublishingOptions = elasticsearchDomainStatus
                    .getLogPublishingOptions();
            jsonWriter.name("LogPublishingOptions");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, LogPublishingOption> logPublishingOptionsEntry : logPublishingOptions
                    .entrySet()) {
                LogPublishingOption logPublishingOptionsValue = logPublishingOptionsEntry
                        .getValue();
                if (logPublishingOptionsValue != null) {
                    jsonWriter.name(logPublishingOptionsEntry.getKey());
                    LogPublishingOptionJsonMarshaller.getInstance().marshall(
                            logPublishingOptionsValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (elasticsearchDomainStatus.getServiceSoftwareOptions() != null) {
            ServiceSoftwareOptions serviceSoftwareOptions = elasticsearchDomainStatus
                    .getServiceSoftwareOptions();
            jsonWriter.name("ServiceSoftwareOptions");
            ServiceSoftwareOptionsJsonMarshaller.getInstance().marshall(serviceSoftwareOptions,
                    jsonWriter);
        }
        if (elasticsearchDomainStatus.getDomainEndpointOptions() != null) {
            DomainEndpointOptions domainEndpointOptions = elasticsearchDomainStatus
                    .getDomainEndpointOptions();
            jsonWriter.name("DomainEndpointOptions");
            DomainEndpointOptionsJsonMarshaller.getInstance().marshall(domainEndpointOptions,
                    jsonWriter);
        }
        if (elasticsearchDomainStatus.getAdvancedSecurityOptions() != null) {
            AdvancedSecurityOptions advancedSecurityOptions = elasticsearchDomainStatus
                    .getAdvancedSecurityOptions();
            jsonWriter.name("AdvancedSecurityOptions");
            AdvancedSecurityOptionsJsonMarshaller.getInstance().marshall(advancedSecurityOptions,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ElasticsearchDomainStatusJsonMarshaller instance;

    public static ElasticsearchDomainStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ElasticsearchDomainStatusJsonMarshaller();
        return instance;
    }
}
