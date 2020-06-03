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

package com.amazonaws.services.es.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.es.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateElasticsearchDomainRequest
 */
public class CreateElasticsearchDomainRequestMarshaller implements
        Marshaller<Request<CreateElasticsearchDomainRequest>, CreateElasticsearchDomainRequest> {

    public Request<CreateElasticsearchDomainRequest> marshall(
            CreateElasticsearchDomainRequest createElasticsearchDomainRequest) {
        if (createElasticsearchDomainRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateElasticsearchDomainRequest)");
        }

        Request<CreateElasticsearchDomainRequest> request = new DefaultRequest<CreateElasticsearchDomainRequest>(
                createElasticsearchDomainRequest, "AmazonElasticsearchService");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2015-01-01/es/domain";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createElasticsearchDomainRequest.getDomainName() != null) {
                String domainName = createElasticsearchDomainRequest.getDomainName();
                jsonWriter.name("DomainName");
                jsonWriter.value(domainName);
            }
            if (createElasticsearchDomainRequest.getElasticsearchVersion() != null) {
                String elasticsearchVersion = createElasticsearchDomainRequest
                        .getElasticsearchVersion();
                jsonWriter.name("ElasticsearchVersion");
                jsonWriter.value(elasticsearchVersion);
            }
            if (createElasticsearchDomainRequest.getElasticsearchClusterConfig() != null) {
                ElasticsearchClusterConfig elasticsearchClusterConfig = createElasticsearchDomainRequest
                        .getElasticsearchClusterConfig();
                jsonWriter.name("ElasticsearchClusterConfig");
                ElasticsearchClusterConfigJsonMarshaller.getInstance().marshall(
                        elasticsearchClusterConfig, jsonWriter);
            }
            if (createElasticsearchDomainRequest.getEBSOptions() != null) {
                EBSOptions eBSOptions = createElasticsearchDomainRequest.getEBSOptions();
                jsonWriter.name("EBSOptions");
                EBSOptionsJsonMarshaller.getInstance().marshall(eBSOptions, jsonWriter);
            }
            if (createElasticsearchDomainRequest.getAccessPolicies() != null) {
                String accessPolicies = createElasticsearchDomainRequest.getAccessPolicies();
                jsonWriter.name("AccessPolicies");
                jsonWriter.value(accessPolicies);
            }
            if (createElasticsearchDomainRequest.getSnapshotOptions() != null) {
                SnapshotOptions snapshotOptions = createElasticsearchDomainRequest
                        .getSnapshotOptions();
                jsonWriter.name("SnapshotOptions");
                SnapshotOptionsJsonMarshaller.getInstance().marshall(snapshotOptions, jsonWriter);
            }
            if (createElasticsearchDomainRequest.getVPCOptions() != null) {
                VPCOptions vPCOptions = createElasticsearchDomainRequest.getVPCOptions();
                jsonWriter.name("VPCOptions");
                VPCOptionsJsonMarshaller.getInstance().marshall(vPCOptions, jsonWriter);
            }
            if (createElasticsearchDomainRequest.getCognitoOptions() != null) {
                CognitoOptions cognitoOptions = createElasticsearchDomainRequest
                        .getCognitoOptions();
                jsonWriter.name("CognitoOptions");
                CognitoOptionsJsonMarshaller.getInstance().marshall(cognitoOptions, jsonWriter);
            }
            if (createElasticsearchDomainRequest.getEncryptionAtRestOptions() != null) {
                EncryptionAtRestOptions encryptionAtRestOptions = createElasticsearchDomainRequest
                        .getEncryptionAtRestOptions();
                jsonWriter.name("EncryptionAtRestOptions");
                EncryptionAtRestOptionsJsonMarshaller.getInstance().marshall(
                        encryptionAtRestOptions, jsonWriter);
            }
            if (createElasticsearchDomainRequest.getNodeToNodeEncryptionOptions() != null) {
                NodeToNodeEncryptionOptions nodeToNodeEncryptionOptions = createElasticsearchDomainRequest
                        .getNodeToNodeEncryptionOptions();
                jsonWriter.name("NodeToNodeEncryptionOptions");
                NodeToNodeEncryptionOptionsJsonMarshaller.getInstance().marshall(
                        nodeToNodeEncryptionOptions, jsonWriter);
            }
            if (createElasticsearchDomainRequest.getAdvancedOptions() != null) {
                java.util.Map<String, String> advancedOptions = createElasticsearchDomainRequest
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
            if (createElasticsearchDomainRequest.getLogPublishingOptions() != null) {
                java.util.Map<String, LogPublishingOption> logPublishingOptions = createElasticsearchDomainRequest
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
            if (createElasticsearchDomainRequest.getDomainEndpointOptions() != null) {
                DomainEndpointOptions domainEndpointOptions = createElasticsearchDomainRequest
                        .getDomainEndpointOptions();
                jsonWriter.name("DomainEndpointOptions");
                DomainEndpointOptionsJsonMarshaller.getInstance().marshall(domainEndpointOptions,
                        jsonWriter);
            }
            if (createElasticsearchDomainRequest.getAdvancedSecurityOptions() != null) {
                AdvancedSecurityOptionsInput advancedSecurityOptions = createElasticsearchDomainRequest
                        .getAdvancedSecurityOptions();
                jsonWriter.name("AdvancedSecurityOptions");
                AdvancedSecurityOptionsInputJsonMarshaller.getInstance().marshall(
                        advancedSecurityOptions, jsonWriter);
            }

            jsonWriter.endObject();
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
