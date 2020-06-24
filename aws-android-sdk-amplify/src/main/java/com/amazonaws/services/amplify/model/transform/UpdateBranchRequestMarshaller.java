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
 * JSON request marshaller for UpdateBranchRequest
 */
public class UpdateBranchRequestMarshaller implements
        Marshaller<Request<UpdateBranchRequest>, UpdateBranchRequest> {

    public Request<UpdateBranchRequest> marshall(UpdateBranchRequest updateBranchRequest) {
        if (updateBranchRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateBranchRequest)");
        }

        Request<UpdateBranchRequest> request = new DefaultRequest<UpdateBranchRequest>(
                updateBranchRequest, "AWSAmplify");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/apps/{appId}/branches/{branchName}";
        uriResourcePath = uriResourcePath.replace(
                "{appId}",
                (updateBranchRequest.getAppId() == null) ? "" : StringUtils
                        .fromString(updateBranchRequest.getAppId()));
        uriResourcePath = uriResourcePath.replace(
                "{branchName}",
                (updateBranchRequest.getBranchName() == null) ? "" : StringUtils
                        .fromString(updateBranchRequest.getBranchName()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateBranchRequest.getDescription() != null) {
                String description = updateBranchRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
            }
            if (updateBranchRequest.getFramework() != null) {
                String framework = updateBranchRequest.getFramework();
                jsonWriter.name("framework");
                jsonWriter.value(framework);
            }
            if (updateBranchRequest.getStage() != null) {
                String stage = updateBranchRequest.getStage();
                jsonWriter.name("stage");
                jsonWriter.value(stage);
            }
            if (updateBranchRequest.getEnableNotification() != null) {
                Boolean enableNotification = updateBranchRequest.getEnableNotification();
                jsonWriter.name("enableNotification");
                jsonWriter.value(enableNotification);
            }
            if (updateBranchRequest.getEnableAutoBuild() != null) {
                Boolean enableAutoBuild = updateBranchRequest.getEnableAutoBuild();
                jsonWriter.name("enableAutoBuild");
                jsonWriter.value(enableAutoBuild);
            }
            if (updateBranchRequest.getEnvironmentVariables() != null) {
                java.util.Map<String, String> environmentVariables = updateBranchRequest
                        .getEnvironmentVariables();
                jsonWriter.name("environmentVariables");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> environmentVariablesEntry : environmentVariables
                        .entrySet()) {
                    String environmentVariablesValue = environmentVariablesEntry.getValue();
                    if (environmentVariablesValue != null) {
                        jsonWriter.name(environmentVariablesEntry.getKey());
                        jsonWriter.value(environmentVariablesValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (updateBranchRequest.getBasicAuthCredentials() != null) {
                String basicAuthCredentials = updateBranchRequest.getBasicAuthCredentials();
                jsonWriter.name("basicAuthCredentials");
                jsonWriter.value(basicAuthCredentials);
            }
            if (updateBranchRequest.getEnableBasicAuth() != null) {
                Boolean enableBasicAuth = updateBranchRequest.getEnableBasicAuth();
                jsonWriter.name("enableBasicAuth");
                jsonWriter.value(enableBasicAuth);
            }
            if (updateBranchRequest.getBuildSpec() != null) {
                String buildSpec = updateBranchRequest.getBuildSpec();
                jsonWriter.name("buildSpec");
                jsonWriter.value(buildSpec);
            }
            if (updateBranchRequest.getTtl() != null) {
                String ttl = updateBranchRequest.getTtl();
                jsonWriter.name("ttl");
                jsonWriter.value(ttl);
            }
            if (updateBranchRequest.getDisplayName() != null) {
                String displayName = updateBranchRequest.getDisplayName();
                jsonWriter.name("displayName");
                jsonWriter.value(displayName);
            }
            if (updateBranchRequest.getEnablePullRequestPreview() != null) {
                Boolean enablePullRequestPreview = updateBranchRequest
                        .getEnablePullRequestPreview();
                jsonWriter.name("enablePullRequestPreview");
                jsonWriter.value(enablePullRequestPreview);
            }
            if (updateBranchRequest.getPullRequestEnvironmentName() != null) {
                String pullRequestEnvironmentName = updateBranchRequest
                        .getPullRequestEnvironmentName();
                jsonWriter.name("pullRequestEnvironmentName");
                jsonWriter.value(pullRequestEnvironmentName);
            }
            if (updateBranchRequest.getBackendEnvironmentArn() != null) {
                String backendEnvironmentArn = updateBranchRequest.getBackendEnvironmentArn();
                jsonWriter.name("backendEnvironmentArn");
                jsonWriter.value(backendEnvironmentArn);
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
