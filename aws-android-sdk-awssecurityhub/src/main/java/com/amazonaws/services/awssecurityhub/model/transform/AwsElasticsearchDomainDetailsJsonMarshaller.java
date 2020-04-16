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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AwsElasticsearchDomainDetails
 */
class AwsElasticsearchDomainDetailsJsonMarshaller {

    public void marshall(AwsElasticsearchDomainDetails awsElasticsearchDomainDetails,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (awsElasticsearchDomainDetails.getAccessPolicies() != null) {
            String accessPolicies = awsElasticsearchDomainDetails.getAccessPolicies();
            jsonWriter.name("AccessPolicies");
            jsonWriter.value(accessPolicies);
        }
        if (awsElasticsearchDomainDetails.getDomainEndpointOptions() != null) {
            AwsElasticsearchDomainDomainEndpointOptions domainEndpointOptions = awsElasticsearchDomainDetails
                    .getDomainEndpointOptions();
            jsonWriter.name("DomainEndpointOptions");
            AwsElasticsearchDomainDomainEndpointOptionsJsonMarshaller.getInstance().marshall(
                    domainEndpointOptions, jsonWriter);
        }
        if (awsElasticsearchDomainDetails.getDomainId() != null) {
            String domainId = awsElasticsearchDomainDetails.getDomainId();
            jsonWriter.name("DomainId");
            jsonWriter.value(domainId);
        }
        if (awsElasticsearchDomainDetails.getDomainName() != null) {
            String domainName = awsElasticsearchDomainDetails.getDomainName();
            jsonWriter.name("DomainName");
            jsonWriter.value(domainName);
        }
        if (awsElasticsearchDomainDetails.getEndpoint() != null) {
            String endpoint = awsElasticsearchDomainDetails.getEndpoint();
            jsonWriter.name("Endpoint");
            jsonWriter.value(endpoint);
        }
        if (awsElasticsearchDomainDetails.getEndpoints() != null) {
            java.util.Map<String, String> endpoints = awsElasticsearchDomainDetails.getEndpoints();
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
        if (awsElasticsearchDomainDetails.getElasticsearchVersion() != null) {
            String elasticsearchVersion = awsElasticsearchDomainDetails.getElasticsearchVersion();
            jsonWriter.name("ElasticsearchVersion");
            jsonWriter.value(elasticsearchVersion);
        }
        if (awsElasticsearchDomainDetails.getEncryptionAtRestOptions() != null) {
            AwsElasticsearchDomainEncryptionAtRestOptions encryptionAtRestOptions = awsElasticsearchDomainDetails
                    .getEncryptionAtRestOptions();
            jsonWriter.name("EncryptionAtRestOptions");
            AwsElasticsearchDomainEncryptionAtRestOptionsJsonMarshaller.getInstance().marshall(
                    encryptionAtRestOptions, jsonWriter);
        }
        if (awsElasticsearchDomainDetails.getNodeToNodeEncryptionOptions() != null) {
            AwsElasticsearchDomainNodeToNodeEncryptionOptions nodeToNodeEncryptionOptions = awsElasticsearchDomainDetails
                    .getNodeToNodeEncryptionOptions();
            jsonWriter.name("NodeToNodeEncryptionOptions");
            AwsElasticsearchDomainNodeToNodeEncryptionOptionsJsonMarshaller.getInstance().marshall(
                    nodeToNodeEncryptionOptions, jsonWriter);
        }
        if (awsElasticsearchDomainDetails.getVPCOptions() != null) {
            AwsElasticsearchDomainVPCOptions vPCOptions = awsElasticsearchDomainDetails
                    .getVPCOptions();
            jsonWriter.name("VPCOptions");
            AwsElasticsearchDomainVPCOptionsJsonMarshaller.getInstance().marshall(vPCOptions,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AwsElasticsearchDomainDetailsJsonMarshaller instance;

    public static AwsElasticsearchDomainDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsElasticsearchDomainDetailsJsonMarshaller();
        return instance;
    }
}
