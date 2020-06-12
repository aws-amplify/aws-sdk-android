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

package com.amazonaws.services.glue.model.transform;

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
import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateDevEndpointRequest
 */
public class CreateDevEndpointRequestMarshaller implements
        Marshaller<Request<CreateDevEndpointRequest>, CreateDevEndpointRequest> {

    public Request<CreateDevEndpointRequest> marshall(
            CreateDevEndpointRequest createDevEndpointRequest) {
        if (createDevEndpointRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateDevEndpointRequest)");
        }

        Request<CreateDevEndpointRequest> request = new DefaultRequest<CreateDevEndpointRequest>(
                createDevEndpointRequest, "AWSGlue");
        String target = "AWSGlue.CreateDevEndpoint";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createDevEndpointRequest.getEndpointName() != null) {
                String endpointName = createDevEndpointRequest.getEndpointName();
                jsonWriter.name("EndpointName");
                jsonWriter.value(endpointName);
            }
            if (createDevEndpointRequest.getRoleArn() != null) {
                String roleArn = createDevEndpointRequest.getRoleArn();
                jsonWriter.name("RoleArn");
                jsonWriter.value(roleArn);
            }
            if (createDevEndpointRequest.getSecurityGroupIds() != null) {
                java.util.List<String> securityGroupIds = createDevEndpointRequest
                        .getSecurityGroupIds();
                jsonWriter.name("SecurityGroupIds");
                jsonWriter.beginArray();
                for (String securityGroupIdsItem : securityGroupIds) {
                    if (securityGroupIdsItem != null) {
                        jsonWriter.value(securityGroupIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createDevEndpointRequest.getSubnetId() != null) {
                String subnetId = createDevEndpointRequest.getSubnetId();
                jsonWriter.name("SubnetId");
                jsonWriter.value(subnetId);
            }
            if (createDevEndpointRequest.getPublicKey() != null) {
                String publicKey = createDevEndpointRequest.getPublicKey();
                jsonWriter.name("PublicKey");
                jsonWriter.value(publicKey);
            }
            if (createDevEndpointRequest.getPublicKeys() != null) {
                java.util.List<String> publicKeys = createDevEndpointRequest.getPublicKeys();
                jsonWriter.name("PublicKeys");
                jsonWriter.beginArray();
                for (String publicKeysItem : publicKeys) {
                    if (publicKeysItem != null) {
                        jsonWriter.value(publicKeysItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createDevEndpointRequest.getNumberOfNodes() != null) {
                Integer numberOfNodes = createDevEndpointRequest.getNumberOfNodes();
                jsonWriter.name("NumberOfNodes");
                jsonWriter.value(numberOfNodes);
            }
            if (createDevEndpointRequest.getWorkerType() != null) {
                String workerType = createDevEndpointRequest.getWorkerType();
                jsonWriter.name("WorkerType");
                jsonWriter.value(workerType);
            }
            if (createDevEndpointRequest.getGlueVersion() != null) {
                String glueVersion = createDevEndpointRequest.getGlueVersion();
                jsonWriter.name("GlueVersion");
                jsonWriter.value(glueVersion);
            }
            if (createDevEndpointRequest.getNumberOfWorkers() != null) {
                Integer numberOfWorkers = createDevEndpointRequest.getNumberOfWorkers();
                jsonWriter.name("NumberOfWorkers");
                jsonWriter.value(numberOfWorkers);
            }
            if (createDevEndpointRequest.getExtraPythonLibsS3Path() != null) {
                String extraPythonLibsS3Path = createDevEndpointRequest.getExtraPythonLibsS3Path();
                jsonWriter.name("ExtraPythonLibsS3Path");
                jsonWriter.value(extraPythonLibsS3Path);
            }
            if (createDevEndpointRequest.getExtraJarsS3Path() != null) {
                String extraJarsS3Path = createDevEndpointRequest.getExtraJarsS3Path();
                jsonWriter.name("ExtraJarsS3Path");
                jsonWriter.value(extraJarsS3Path);
            }
            if (createDevEndpointRequest.getSecurityConfiguration() != null) {
                String securityConfiguration = createDevEndpointRequest.getSecurityConfiguration();
                jsonWriter.name("SecurityConfiguration");
                jsonWriter.value(securityConfiguration);
            }
            if (createDevEndpointRequest.getTags() != null) {
                java.util.Map<String, String> tags = createDevEndpointRequest.getTags();
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
            if (createDevEndpointRequest.getArguments() != null) {
                java.util.Map<String, String> arguments = createDevEndpointRequest.getArguments();
                jsonWriter.name("Arguments");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> argumentsEntry : arguments.entrySet()) {
                    String argumentsValue = argumentsEntry.getValue();
                    if (argumentsValue != null) {
                        jsonWriter.name(argumentsEntry.getKey());
                        jsonWriter.value(argumentsValue);
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
