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
 * JSON request marshaller for UpdateAppRequest
 */
public class UpdateAppRequestMarshaller implements
        Marshaller<Request<UpdateAppRequest>, UpdateAppRequest> {

    public Request<UpdateAppRequest> marshall(UpdateAppRequest updateAppRequest) {
        if (updateAppRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(UpdateAppRequest)");
        }

        Request<UpdateAppRequest> request = new DefaultRequest<UpdateAppRequest>(updateAppRequest,
                "AWSAmplify");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/apps/{appId}";
        uriResourcePath = uriResourcePath.replace(
                "{appId}",
                (updateAppRequest.getAppId() == null) ? "" : StringUtils
                        .fromString(updateAppRequest.getAppId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateAppRequest.getName() != null) {
                String name = updateAppRequest.getName();
                jsonWriter.name("name");
                jsonWriter.value(name);
            }
            if (updateAppRequest.getDescription() != null) {
                String description = updateAppRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
            }
            if (updateAppRequest.getPlatform() != null) {
                String platform = updateAppRequest.getPlatform();
                jsonWriter.name("platform");
                jsonWriter.value(platform);
            }
            if (updateAppRequest.getIamServiceRoleArn() != null) {
                String iamServiceRoleArn = updateAppRequest.getIamServiceRoleArn();
                jsonWriter.name("iamServiceRoleArn");
                jsonWriter.value(iamServiceRoleArn);
            }
            if (updateAppRequest.getEnvironmentVariables() != null) {
                java.util.Map<String, String> environmentVariables = updateAppRequest
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
            if (updateAppRequest.getEnableBranchAutoBuild() != null) {
                Boolean enableBranchAutoBuild = updateAppRequest.getEnableBranchAutoBuild();
                jsonWriter.name("enableBranchAutoBuild");
                jsonWriter.value(enableBranchAutoBuild);
            }
            if (updateAppRequest.getEnableBranchAutoDeletion() != null) {
                Boolean enableBranchAutoDeletion = updateAppRequest.getEnableBranchAutoDeletion();
                jsonWriter.name("enableBranchAutoDeletion");
                jsonWriter.value(enableBranchAutoDeletion);
            }
            if (updateAppRequest.getEnableBasicAuth() != null) {
                Boolean enableBasicAuth = updateAppRequest.getEnableBasicAuth();
                jsonWriter.name("enableBasicAuth");
                jsonWriter.value(enableBasicAuth);
            }
            if (updateAppRequest.getBasicAuthCredentials() != null) {
                String basicAuthCredentials = updateAppRequest.getBasicAuthCredentials();
                jsonWriter.name("basicAuthCredentials");
                jsonWriter.value(basicAuthCredentials);
            }
            if (updateAppRequest.getCustomRules() != null) {
                java.util.List<CustomRule> customRules = updateAppRequest.getCustomRules();
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
            if (updateAppRequest.getBuildSpec() != null) {
                String buildSpec = updateAppRequest.getBuildSpec();
                jsonWriter.name("buildSpec");
                jsonWriter.value(buildSpec);
            }
            if (updateAppRequest.getEnableAutoBranchCreation() != null) {
                Boolean enableAutoBranchCreation = updateAppRequest.getEnableAutoBranchCreation();
                jsonWriter.name("enableAutoBranchCreation");
                jsonWriter.value(enableAutoBranchCreation);
            }
            if (updateAppRequest.getAutoBranchCreationPatterns() != null) {
                java.util.List<String> autoBranchCreationPatterns = updateAppRequest
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
            if (updateAppRequest.getAutoBranchCreationConfig() != null) {
                AutoBranchCreationConfig autoBranchCreationConfig = updateAppRequest
                        .getAutoBranchCreationConfig();
                jsonWriter.name("autoBranchCreationConfig");
                AutoBranchCreationConfigJsonMarshaller.getInstance().marshall(
                        autoBranchCreationConfig, jsonWriter);
            }
            if (updateAppRequest.getRepository() != null) {
                String repository = updateAppRequest.getRepository();
                jsonWriter.name("repository");
                jsonWriter.value(repository);
            }
            if (updateAppRequest.getOauthToken() != null) {
                String oauthToken = updateAppRequest.getOauthToken();
                jsonWriter.name("oauthToken");
                jsonWriter.value(oauthToken);
            }
            if (updateAppRequest.getAccessToken() != null) {
                String accessToken = updateAppRequest.getAccessToken();
                jsonWriter.name("accessToken");
                jsonWriter.value(accessToken);
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
