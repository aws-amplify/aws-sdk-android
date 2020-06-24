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
 * JSON request marshaller for CreateBranchRequest
 */
public class CreateBranchRequestMarshaller implements
        Marshaller<Request<CreateBranchRequest>, CreateBranchRequest> {

    public Request<CreateBranchRequest> marshall(CreateBranchRequest createBranchRequest) {
        if (createBranchRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateBranchRequest)");
        }

        Request<CreateBranchRequest> request = new DefaultRequest<CreateBranchRequest>(
                createBranchRequest, "AWSAmplify");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/apps/{appId}/branches";
        uriResourcePath = uriResourcePath.replace(
                "{appId}",
                (createBranchRequest.getAppId() == null) ? "" : StringUtils
                        .fromString(createBranchRequest.getAppId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createBranchRequest.getBranchName() != null) {
                String branchName = createBranchRequest.getBranchName();
                jsonWriter.name("branchName");
                jsonWriter.value(branchName);
            }
            if (createBranchRequest.getDescription() != null) {
                String description = createBranchRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
            }
            if (createBranchRequest.getStage() != null) {
                String stage = createBranchRequest.getStage();
                jsonWriter.name("stage");
                jsonWriter.value(stage);
            }
            if (createBranchRequest.getFramework() != null) {
                String framework = createBranchRequest.getFramework();
                jsonWriter.name("framework");
                jsonWriter.value(framework);
            }
            if (createBranchRequest.getEnableNotification() != null) {
                Boolean enableNotification = createBranchRequest.getEnableNotification();
                jsonWriter.name("enableNotification");
                jsonWriter.value(enableNotification);
            }
            if (createBranchRequest.getEnableAutoBuild() != null) {
                Boolean enableAutoBuild = createBranchRequest.getEnableAutoBuild();
                jsonWriter.name("enableAutoBuild");
                jsonWriter.value(enableAutoBuild);
            }
            if (createBranchRequest.getEnvironmentVariables() != null) {
                java.util.Map<String, String> environmentVariables = createBranchRequest
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
            if (createBranchRequest.getBasicAuthCredentials() != null) {
                String basicAuthCredentials = createBranchRequest.getBasicAuthCredentials();
                jsonWriter.name("basicAuthCredentials");
                jsonWriter.value(basicAuthCredentials);
            }
            if (createBranchRequest.getEnableBasicAuth() != null) {
                Boolean enableBasicAuth = createBranchRequest.getEnableBasicAuth();
                jsonWriter.name("enableBasicAuth");
                jsonWriter.value(enableBasicAuth);
            }
            if (createBranchRequest.getTags() != null) {
                java.util.Map<String, String> tags = createBranchRequest.getTags();
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
            if (createBranchRequest.getBuildSpec() != null) {
                String buildSpec = createBranchRequest.getBuildSpec();
                jsonWriter.name("buildSpec");
                jsonWriter.value(buildSpec);
            }
            if (createBranchRequest.getTtl() != null) {
                String ttl = createBranchRequest.getTtl();
                jsonWriter.name("ttl");
                jsonWriter.value(ttl);
            }
            if (createBranchRequest.getDisplayName() != null) {
                String displayName = createBranchRequest.getDisplayName();
                jsonWriter.name("displayName");
                jsonWriter.value(displayName);
            }
            if (createBranchRequest.getEnablePullRequestPreview() != null) {
                Boolean enablePullRequestPreview = createBranchRequest
                        .getEnablePullRequestPreview();
                jsonWriter.name("enablePullRequestPreview");
                jsonWriter.value(enablePullRequestPreview);
            }
            if (createBranchRequest.getPullRequestEnvironmentName() != null) {
                String pullRequestEnvironmentName = createBranchRequest
                        .getPullRequestEnvironmentName();
                jsonWriter.name("pullRequestEnvironmentName");
                jsonWriter.value(pullRequestEnvironmentName);
            }
            if (createBranchRequest.getBackendEnvironmentArn() != null) {
                String backendEnvironmentArn = createBranchRequest.getBackendEnvironmentArn();
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
