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

package com.amazonaws.services.ec2imagebuilder.model.transform;

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
import com.amazonaws.services.ec2imagebuilder.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateInfrastructureConfigurationRequest
 */
public class CreateInfrastructureConfigurationRequestMarshaller
        implements
        Marshaller<Request<CreateInfrastructureConfigurationRequest>, CreateInfrastructureConfigurationRequest> {

    public Request<CreateInfrastructureConfigurationRequest> marshall(
            CreateInfrastructureConfigurationRequest createInfrastructureConfigurationRequest) {
        if (createInfrastructureConfigurationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateInfrastructureConfigurationRequest)");
        }

        Request<CreateInfrastructureConfigurationRequest> request = new DefaultRequest<CreateInfrastructureConfigurationRequest>(
                createInfrastructureConfigurationRequest, "EC2ImageBuilder");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/CreateInfrastructureConfiguration";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createInfrastructureConfigurationRequest.getName() != null) {
                String name = createInfrastructureConfigurationRequest.getName();
                jsonWriter.name("name");
                jsonWriter.value(name);
            }
            if (createInfrastructureConfigurationRequest.getDescription() != null) {
                String description = createInfrastructureConfigurationRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
            }
            if (createInfrastructureConfigurationRequest.getInstanceTypes() != null) {
                java.util.List<String> instanceTypes = createInfrastructureConfigurationRequest
                        .getInstanceTypes();
                jsonWriter.name("instanceTypes");
                jsonWriter.beginArray();
                for (String instanceTypesItem : instanceTypes) {
                    if (instanceTypesItem != null) {
                        jsonWriter.value(instanceTypesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createInfrastructureConfigurationRequest.getInstanceProfileName() != null) {
                String instanceProfileName = createInfrastructureConfigurationRequest
                        .getInstanceProfileName();
                jsonWriter.name("instanceProfileName");
                jsonWriter.value(instanceProfileName);
            }
            if (createInfrastructureConfigurationRequest.getSecurityGroupIds() != null) {
                java.util.List<String> securityGroupIds = createInfrastructureConfigurationRequest
                        .getSecurityGroupIds();
                jsonWriter.name("securityGroupIds");
                jsonWriter.beginArray();
                for (String securityGroupIdsItem : securityGroupIds) {
                    if (securityGroupIdsItem != null) {
                        jsonWriter.value(securityGroupIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createInfrastructureConfigurationRequest.getSubnetId() != null) {
                String subnetId = createInfrastructureConfigurationRequest.getSubnetId();
                jsonWriter.name("subnetId");
                jsonWriter.value(subnetId);
            }
            if (createInfrastructureConfigurationRequest.getLogging() != null) {
                Logging logging = createInfrastructureConfigurationRequest.getLogging();
                jsonWriter.name("logging");
                LoggingJsonMarshaller.getInstance().marshall(logging, jsonWriter);
            }
            if (createInfrastructureConfigurationRequest.getKeyPair() != null) {
                String keyPair = createInfrastructureConfigurationRequest.getKeyPair();
                jsonWriter.name("keyPair");
                jsonWriter.value(keyPair);
            }
            if (createInfrastructureConfigurationRequest.getTerminateInstanceOnFailure() != null) {
                Boolean terminateInstanceOnFailure = createInfrastructureConfigurationRequest
                        .getTerminateInstanceOnFailure();
                jsonWriter.name("terminateInstanceOnFailure");
                jsonWriter.value(terminateInstanceOnFailure);
            }
            if (createInfrastructureConfigurationRequest.getSnsTopicArn() != null) {
                String snsTopicArn = createInfrastructureConfigurationRequest.getSnsTopicArn();
                jsonWriter.name("snsTopicArn");
                jsonWriter.value(snsTopicArn);
            }
            if (createInfrastructureConfigurationRequest.getTags() != null) {
                java.util.Map<String, String> tags = createInfrastructureConfigurationRequest
                        .getTags();
                jsonWriter.name("tags");
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
            if (createInfrastructureConfigurationRequest.getClientToken() != null) {
                String clientToken = createInfrastructureConfigurationRequest.getClientToken();
                jsonWriter.name("clientToken");
                jsonWriter.value(clientToken);
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
