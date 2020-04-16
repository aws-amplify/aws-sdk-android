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
 * JSON request marshaller for UpdateInfrastructureConfigurationRequest
 */
public class UpdateInfrastructureConfigurationRequestMarshaller
        implements
        Marshaller<Request<UpdateInfrastructureConfigurationRequest>, UpdateInfrastructureConfigurationRequest> {

    public Request<UpdateInfrastructureConfigurationRequest> marshall(
            UpdateInfrastructureConfigurationRequest updateInfrastructureConfigurationRequest) {
        if (updateInfrastructureConfigurationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateInfrastructureConfigurationRequest)");
        }

        Request<UpdateInfrastructureConfigurationRequest> request = new DefaultRequest<UpdateInfrastructureConfigurationRequest>(
                updateInfrastructureConfigurationRequest, "EC2ImageBuilder");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/UpdateInfrastructureConfiguration";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateInfrastructureConfigurationRequest.getInfrastructureConfigurationArn() != null) {
                String infrastructureConfigurationArn = updateInfrastructureConfigurationRequest
                        .getInfrastructureConfigurationArn();
                jsonWriter.name("infrastructureConfigurationArn");
                jsonWriter.value(infrastructureConfigurationArn);
            }
            if (updateInfrastructureConfigurationRequest.getDescription() != null) {
                String description = updateInfrastructureConfigurationRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
            }
            if (updateInfrastructureConfigurationRequest.getInstanceTypes() != null) {
                java.util.List<String> instanceTypes = updateInfrastructureConfigurationRequest
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
            if (updateInfrastructureConfigurationRequest.getInstanceProfileName() != null) {
                String instanceProfileName = updateInfrastructureConfigurationRequest
                        .getInstanceProfileName();
                jsonWriter.name("instanceProfileName");
                jsonWriter.value(instanceProfileName);
            }
            if (updateInfrastructureConfigurationRequest.getSecurityGroupIds() != null) {
                java.util.List<String> securityGroupIds = updateInfrastructureConfigurationRequest
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
            if (updateInfrastructureConfigurationRequest.getSubnetId() != null) {
                String subnetId = updateInfrastructureConfigurationRequest.getSubnetId();
                jsonWriter.name("subnetId");
                jsonWriter.value(subnetId);
            }
            if (updateInfrastructureConfigurationRequest.getLogging() != null) {
                Logging logging = updateInfrastructureConfigurationRequest.getLogging();
                jsonWriter.name("logging");
                LoggingJsonMarshaller.getInstance().marshall(logging, jsonWriter);
            }
            if (updateInfrastructureConfigurationRequest.getKeyPair() != null) {
                String keyPair = updateInfrastructureConfigurationRequest.getKeyPair();
                jsonWriter.name("keyPair");
                jsonWriter.value(keyPair);
            }
            if (updateInfrastructureConfigurationRequest.getTerminateInstanceOnFailure() != null) {
                Boolean terminateInstanceOnFailure = updateInfrastructureConfigurationRequest
                        .getTerminateInstanceOnFailure();
                jsonWriter.name("terminateInstanceOnFailure");
                jsonWriter.value(terminateInstanceOnFailure);
            }
            if (updateInfrastructureConfigurationRequest.getSnsTopicArn() != null) {
                String snsTopicArn = updateInfrastructureConfigurationRequest.getSnsTopicArn();
                jsonWriter.name("snsTopicArn");
                jsonWriter.value(snsTopicArn);
            }
            if (updateInfrastructureConfigurationRequest.getClientToken() != null) {
                String clientToken = updateInfrastructureConfigurationRequest.getClientToken();
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
