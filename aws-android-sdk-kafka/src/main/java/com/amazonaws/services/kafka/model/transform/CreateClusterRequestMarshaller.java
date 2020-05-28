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

package com.amazonaws.services.kafka.model.transform;

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
import com.amazonaws.services.kafka.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateClusterRequest
 */
public class CreateClusterRequestMarshaller implements
        Marshaller<Request<CreateClusterRequest>, CreateClusterRequest> {

    public Request<CreateClusterRequest> marshall(CreateClusterRequest createClusterRequest) {
        if (createClusterRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateClusterRequest)");
        }

        Request<CreateClusterRequest> request = new DefaultRequest<CreateClusterRequest>(
                createClusterRequest, "ManagedStreamingforKafka");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/v1/clusters";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createClusterRequest.getBrokerNodeGroupInfo() != null) {
                BrokerNodeGroupInfo brokerNodeGroupInfo = createClusterRequest
                        .getBrokerNodeGroupInfo();
                jsonWriter.name("BrokerNodeGroupInfo");
                BrokerNodeGroupInfoJsonMarshaller.getInstance().marshall(brokerNodeGroupInfo,
                        jsonWriter);
            }
            if (createClusterRequest.getClientAuthentication() != null) {
                ClientAuthentication clientAuthentication = createClusterRequest
                        .getClientAuthentication();
                jsonWriter.name("ClientAuthentication");
                ClientAuthenticationJsonMarshaller.getInstance().marshall(clientAuthentication,
                        jsonWriter);
            }
            if (createClusterRequest.getClusterName() != null) {
                String clusterName = createClusterRequest.getClusterName();
                jsonWriter.name("ClusterName");
                jsonWriter.value(clusterName);
            }
            if (createClusterRequest.getConfigurationInfo() != null) {
                ConfigurationInfo configurationInfo = createClusterRequest.getConfigurationInfo();
                jsonWriter.name("ConfigurationInfo");
                ConfigurationInfoJsonMarshaller.getInstance().marshall(configurationInfo,
                        jsonWriter);
            }
            if (createClusterRequest.getEncryptionInfo() != null) {
                EncryptionInfo encryptionInfo = createClusterRequest.getEncryptionInfo();
                jsonWriter.name("EncryptionInfo");
                EncryptionInfoJsonMarshaller.getInstance().marshall(encryptionInfo, jsonWriter);
            }
            if (createClusterRequest.getEnhancedMonitoring() != null) {
                String enhancedMonitoring = createClusterRequest.getEnhancedMonitoring();
                jsonWriter.name("EnhancedMonitoring");
                jsonWriter.value(enhancedMonitoring);
            }
            if (createClusterRequest.getOpenMonitoring() != null) {
                OpenMonitoringInfo openMonitoring = createClusterRequest.getOpenMonitoring();
                jsonWriter.name("OpenMonitoring");
                OpenMonitoringInfoJsonMarshaller.getInstance().marshall(openMonitoring, jsonWriter);
            }
            if (createClusterRequest.getKafkaVersion() != null) {
                String kafkaVersion = createClusterRequest.getKafkaVersion();
                jsonWriter.name("KafkaVersion");
                jsonWriter.value(kafkaVersion);
            }
            if (createClusterRequest.getLoggingInfo() != null) {
                LoggingInfo loggingInfo = createClusterRequest.getLoggingInfo();
                jsonWriter.name("LoggingInfo");
                LoggingInfoJsonMarshaller.getInstance().marshall(loggingInfo, jsonWriter);
            }
            if (createClusterRequest.getNumberOfBrokerNodes() != null) {
                Integer numberOfBrokerNodes = createClusterRequest.getNumberOfBrokerNodes();
                jsonWriter.name("NumberOfBrokerNodes");
                jsonWriter.value(numberOfBrokerNodes);
            }
            if (createClusterRequest.getTags() != null) {
                java.util.Map<String, String> tags = createClusterRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                    String tagsValue = tagsEntry.getValue();
                    if (tagsValue != null) {
                        jsonWriter.name(tagsEntry.getKey());
                        jsonWriter.value(tagsValue);
                    }
                }
                jsonWriter.endObject();
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
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
