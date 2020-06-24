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
 * JSON request marshaller for CreateAppRequest
 */
public class CreateAppRequestMarshaller implements
        Marshaller<Request<CreateAppRequest>, CreateAppRequest> {

    public Request<CreateAppRequest> marshall(CreateAppRequest createAppRequest) {
        if (createAppRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(CreateAppRequest)");
        }

        Request<CreateAppRequest> request = new DefaultRequest<CreateAppRequest>(createAppRequest,
                "AWSAmplify");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/apps";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createAppRequest.getName() != null) {
                String name = createAppRequest.getName();
                jsonWriter.name("name");
                jsonWriter.value(name);
            }
            if (createAppRequest.getDescription() != null) {
                String description = createAppRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
            }
            if (createAppRequest.getRepository() != null) {
                String repository = createAppRequest.getRepository();
                jsonWriter.name("repository");
                jsonWriter.value(repository);
            }
            if (createAppRequest.getPlatform() != null) {
                String platform = createAppRequest.getPlatform();
                jsonWriter.name("platform");
                jsonWriter.value(platform);
            }
            if (createAppRequest.getIamServiceRoleArn() != null) {
                String iamServiceRoleArn = createAppRequest.getIamServiceRoleArn();
                jsonWriter.name("iamServiceRoleArn");
                jsonWriter.value(iamServiceRoleArn);
            }
            if (createAppRequest.getOauthToken() != null) {
                String oauthToken = createAppRequest.getOauthToken();
                jsonWriter.name("oauthToken");
                jsonWriter.value(oauthToken);
            }
            if (createAppRequest.getAccessToken() != null) {
                String accessToken = createAppRequest.getAccessToken();
                jsonWriter.name("accessToken");
                jsonWriter.value(accessToken);
            }
            if (createAppRequest.getEnvironmentVariables() != null) {
                java.util.Map<String, String> environmentVariables = createAppRequest
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
            if (createAppRequest.getEnableBranchAutoBuild() != null) {
                Boolean enableBranchAutoBuild = createAppRequest.getEnableBranchAutoBuild();
                jsonWriter.name("enableBranchAutoBuild");
                jsonWriter.value(enableBranchAutoBuild);
            }
            if (createAppRequest.getEnableBranchAutoDeletion() != null) {
                Boolean enableBranchAutoDeletion = createAppRequest.getEnableBranchAutoDeletion();
                jsonWriter.name("enableBranchAutoDeletion");
                jsonWriter.value(enableBranchAutoDeletion);
            }
            if (createAppRequest.getEnableBasicAuth() != null) {
                Boolean enableBasicAuth = createAppRequest.getEnableBasicAuth();
                jsonWriter.name("enableBasicAuth");
                jsonWriter.value(enableBasicAuth);
            }
            if (createAppRequest.getBasicAuthCredentials() != null) {
                String basicAuthCredentials = createAppRequest.getBasicAuthCredentials();
                jsonWriter.name("basicAuthCredentials");
                jsonWriter.value(basicAuthCredentials);
            }
            if (createAppRequest.getCustomRules() != null) {
                java.util.List<CustomRule> customRules = createAppRequest.getCustomRules();
                jsonWriter.name("customRules");
                jsonWriter.beginArray();
                for (CustomRule customRulesItem : customRules) {
                    if (customRulesItem != null) {
                        CustomRuleJsonMarshaller.getInstance()
                                .marshall(customRulesItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createAppRequest.getTags() != null) {
                java.util.Map<String, String> tags = createAppRequest.getTags();
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
            if (createAppRequest.getBuildSpec() != null) {
                String buildSpec = createAppRequest.getBuildSpec();
                jsonWriter.name("buildSpec");
                jsonWriter.value(buildSpec);
            }
            if (createAppRequest.getEnableAutoBranchCreation() != null) {
                Boolean enableAutoBranchCreation = createAppRequest.getEnableAutoBranchCreation();
                jsonWriter.name("enableAutoBranchCreation");
                jsonWriter.value(enableAutoBranchCreation);
            }
            if (createAppRequest.getAutoBranchCreationPatterns() != null) {
                java.util.List<String> autoBranchCreationPatterns = createAppRequest
                        .getAutoBranchCreationPatterns();
                jsonWriter.name("autoBranchCreationPatterns");
                jsonWriter.beginArray();
                for (String autoBranchCreationPatternsItem : autoBranchCreationPatterns) {
                    if (autoBranchCreationPatternsItem != null) {
                        jsonWriter.value(autoBranchCreationPatternsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createAppRequest.getAutoBranchCreationConfig() != null) {
                AutoBranchCreationConfig autoBranchCreationConfig = createAppRequest
                        .getAutoBranchCreationConfig();
                jsonWriter.name("autoBranchCreationConfig");
                AutoBranchCreationConfigJsonMarshaller.getInstance().marshall(
                        autoBranchCreationConfig, jsonWriter);
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
