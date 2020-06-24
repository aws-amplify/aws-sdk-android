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

package com.amazonaws.services.amplify.model.transform;

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
import com.amazonaws.services.amplify.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateBackendEnvironmentRequest
 */
public class CreateBackendEnvironmentRequestMarshaller implements
        Marshaller<Request<CreateBackendEnvironmentRequest>, CreateBackendEnvironmentRequest> {

    public Request<CreateBackendEnvironmentRequest> marshall(
            CreateBackendEnvironmentRequest createBackendEnvironmentRequest) {
        if (createBackendEnvironmentRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateBackendEnvironmentRequest)");
        }

        Request<CreateBackendEnvironmentRequest> request = new DefaultRequest<CreateBackendEnvironmentRequest>(
                createBackendEnvironmentRequest, "AWSAmplify");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/apps/{appId}/backendenvironments";
        uriResourcePath = uriResourcePath.replace(
                "{appId}",
                (createBackendEnvironmentRequest.getAppId() == null) ? "" : StringUtils
                        .fromString(createBackendEnvironmentRequest.getAppId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createBackendEnvironmentRequest.getEnvironmentName() != null) {
                String environmentName = createBackendEnvironmentRequest.getEnvironmentName();
                jsonWriter.name("environmentName");
                jsonWriter.value(environmentName);
            }
            if (createBackendEnvironmentRequest.getStackName() != null) {
                String stackName = createBackendEnvironmentRequest.getStackName();
                jsonWriter.name("stackName");
                jsonWriter.value(stackName);
            }
            if (createBackendEnvironmentRequest.getDeploymentArtifacts() != null) {
                String deploymentArtifacts = createBackendEnvironmentRequest
                        .getDeploymentArtifacts();
                jsonWriter.name("deploymentArtifacts");
                jsonWriter.value(deploymentArtifacts);
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
