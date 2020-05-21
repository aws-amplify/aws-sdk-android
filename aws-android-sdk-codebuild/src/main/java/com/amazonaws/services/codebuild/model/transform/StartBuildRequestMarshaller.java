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

package com.amazonaws.services.codebuild.model.transform;

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
import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for StartBuildRequest
 */
public class StartBuildRequestMarshaller implements
        Marshaller<Request<StartBuildRequest>, StartBuildRequest> {

    public Request<StartBuildRequest> marshall(StartBuildRequest startBuildRequest) {
        if (startBuildRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StartBuildRequest)");
        }

        Request<StartBuildRequest> request = new DefaultRequest<StartBuildRequest>(
                startBuildRequest, "AWSCodeBuild");
        String target = "CodeBuild_20161006.StartBuild";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (startBuildRequest.getProjectName() != null) {
                String projectName = startBuildRequest.getProjectName();
                jsonWriter.name("projectName");
                jsonWriter.value(projectName);
            }
            if (startBuildRequest.getSecondarySourcesOverride() != null) {
                java.util.List<ProjectSource> secondarySourcesOverride = startBuildRequest
                        .getSecondarySourcesOverride();
                jsonWriter.name("secondarySourcesOverride");
                jsonWriter.beginArray();
                for (ProjectSource secondarySourcesOverrideItem : secondarySourcesOverride) {
                    if (secondarySourcesOverrideItem != null) {
                        ProjectSourceJsonMarshaller.getInstance().marshall(
                                secondarySourcesOverrideItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (startBuildRequest.getSecondarySourcesVersionOverride() != null) {
                java.util.List<ProjectSourceVersion> secondarySourcesVersionOverride = startBuildRequest
                        .getSecondarySourcesVersionOverride();
                jsonWriter.name("secondarySourcesVersionOverride");
                jsonWriter.beginArray();
                for (ProjectSourceVersion secondarySourcesVersionOverrideItem : secondarySourcesVersionOverride) {
                    if (secondarySourcesVersionOverrideItem != null) {
                        ProjectSourceVersionJsonMarshaller.getInstance().marshall(
                                secondarySourcesVersionOverrideItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (startBuildRequest.getSourceVersion() != null) {
                String sourceVersion = startBuildRequest.getSourceVersion();
                jsonWriter.name("sourceVersion");
                jsonWriter.value(sourceVersion);
            }
            if (startBuildRequest.getArtifactsOverride() != null) {
                ProjectArtifacts artifactsOverride = startBuildRequest.getArtifactsOverride();
                jsonWriter.name("artifactsOverride");
                ProjectArtifactsJsonMarshaller.getInstance()
                        .marshall(artifactsOverride, jsonWriter);
            }
            if (startBuildRequest.getSecondaryArtifactsOverride() != null) {
                java.util.List<ProjectArtifacts> secondaryArtifactsOverride = startBuildRequest
                        .getSecondaryArtifactsOverride();
                jsonWriter.name("secondaryArtifactsOverride");
                jsonWriter.beginArray();
                for (ProjectArtifacts secondaryArtifactsOverrideItem : secondaryArtifactsOverride) {
                    if (secondaryArtifactsOverrideItem != null) {
                        ProjectArtifactsJsonMarshaller.getInstance().marshall(
                                secondaryArtifactsOverrideItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (startBuildRequest.getEnvironmentVariablesOverride() != null) {
                java.util.List<EnvironmentVariable> environmentVariablesOverride = startBuildRequest
                        .getEnvironmentVariablesOverride();
                jsonWriter.name("environmentVariablesOverride");
                jsonWriter.beginArray();
                for (EnvironmentVariable environmentVariablesOverrideItem : environmentVariablesOverride) {
                    if (environmentVariablesOverrideItem != null) {
                        EnvironmentVariableJsonMarshaller.getInstance().marshall(
                                environmentVariablesOverrideItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (startBuildRequest.getSourceTypeOverride() != null) {
                String sourceTypeOverride = startBuildRequest.getSourceTypeOverride();
                jsonWriter.name("sourceTypeOverride");
                jsonWriter.value(sourceTypeOverride);
            }
            if (startBuildRequest.getSourceLocationOverride() != null) {
                String sourceLocationOverride = startBuildRequest.getSourceLocationOverride();
                jsonWriter.name("sourceLocationOverride");
                jsonWriter.value(sourceLocationOverride);
            }
            if (startBuildRequest.getSourceAuthOverride() != null) {
                SourceAuth sourceAuthOverride = startBuildRequest.getSourceAuthOverride();
                jsonWriter.name("sourceAuthOverride");
                SourceAuthJsonMarshaller.getInstance().marshall(sourceAuthOverride, jsonWriter);
            }
            if (startBuildRequest.getGitCloneDepthOverride() != null) {
                Integer gitCloneDepthOverride = startBuildRequest.getGitCloneDepthOverride();
                jsonWriter.name("gitCloneDepthOverride");
                jsonWriter.value(gitCloneDepthOverride);
            }
            if (startBuildRequest.getGitSubmodulesConfigOverride() != null) {
                GitSubmodulesConfig gitSubmodulesConfigOverride = startBuildRequest
                        .getGitSubmodulesConfigOverride();
                jsonWriter.name("gitSubmodulesConfigOverride");
                GitSubmodulesConfigJsonMarshaller.getInstance().marshall(
                        gitSubmodulesConfigOverride, jsonWriter);
            }
            if (startBuildRequest.getBuildspecOverride() != null) {
                String buildspecOverride = startBuildRequest.getBuildspecOverride();
                jsonWriter.name("buildspecOverride");
                jsonWriter.value(buildspecOverride);
            }
            if (startBuildRequest.getInsecureSslOverride() != null) {
                Boolean insecureSslOverride = startBuildRequest.getInsecureSslOverride();
                jsonWriter.name("insecureSslOverride");
                jsonWriter.value(insecureSslOverride);
            }
            if (startBuildRequest.getReportBuildStatusOverride() != null) {
                Boolean reportBuildStatusOverride = startBuildRequest
                        .getReportBuildStatusOverride();
                jsonWriter.name("reportBuildStatusOverride");
                jsonWriter.value(reportBuildStatusOverride);
            }
            if (startBuildRequest.getEnvironmentTypeOverride() != null) {
                String environmentTypeOverride = startBuildRequest.getEnvironmentTypeOverride();
                jsonWriter.name("environmentTypeOverride");
                jsonWriter.value(environmentTypeOverride);
            }
            if (startBuildRequest.getImageOverride() != null) {
                String imageOverride = startBuildRequest.getImageOverride();
                jsonWriter.name("imageOverride");
                jsonWriter.value(imageOverride);
            }
            if (startBuildRequest.getComputeTypeOverride() != null) {
                String computeTypeOverride = startBuildRequest.getComputeTypeOverride();
                jsonWriter.name("computeTypeOverride");
                jsonWriter.value(computeTypeOverride);
            }
            if (startBuildRequest.getCertificateOverride() != null) {
                String certificateOverride = startBuildRequest.getCertificateOverride();
                jsonWriter.name("certificateOverride");
                jsonWriter.value(certificateOverride);
            }
            if (startBuildRequest.getCacheOverride() != null) {
                ProjectCache cacheOverride = startBuildRequest.getCacheOverride();
                jsonWriter.name("cacheOverride");
                ProjectCacheJsonMarshaller.getInstance().marshall(cacheOverride, jsonWriter);
            }
            if (startBuildRequest.getServiceRoleOverride() != null) {
                String serviceRoleOverride = startBuildRequest.getServiceRoleOverride();
                jsonWriter.name("serviceRoleOverride");
                jsonWriter.value(serviceRoleOverride);
            }
            if (startBuildRequest.getPrivilegedModeOverride() != null) {
                Boolean privilegedModeOverride = startBuildRequest.getPrivilegedModeOverride();
                jsonWriter.name("privilegedModeOverride");
                jsonWriter.value(privilegedModeOverride);
            }
            if (startBuildRequest.getTimeoutInMinutesOverride() != null) {
                Integer timeoutInMinutesOverride = startBuildRequest.getTimeoutInMinutesOverride();
                jsonWriter.name("timeoutInMinutesOverride");
                jsonWriter.value(timeoutInMinutesOverride);
            }
            if (startBuildRequest.getQueuedTimeoutInMinutesOverride() != null) {
                Integer queuedTimeoutInMinutesOverride = startBuildRequest
                        .getQueuedTimeoutInMinutesOverride();
                jsonWriter.name("queuedTimeoutInMinutesOverride");
                jsonWriter.value(queuedTimeoutInMinutesOverride);
            }
            if (startBuildRequest.getEncryptionKeyOverride() != null) {
                String encryptionKeyOverride = startBuildRequest.getEncryptionKeyOverride();
                jsonWriter.name("encryptionKeyOverride");
                jsonWriter.value(encryptionKeyOverride);
            }
            if (startBuildRequest.getIdempotencyToken() != null) {
                String idempotencyToken = startBuildRequest.getIdempotencyToken();
                jsonWriter.name("idempotencyToken");
                jsonWriter.value(idempotencyToken);
            }
            if (startBuildRequest.getLogsConfigOverride() != null) {
                LogsConfig logsConfigOverride = startBuildRequest.getLogsConfigOverride();
                jsonWriter.name("logsConfigOverride");
                LogsConfigJsonMarshaller.getInstance().marshall(logsConfigOverride, jsonWriter);
            }
            if (startBuildRequest.getRegistryCredentialOverride() != null) {
                RegistryCredential registryCredentialOverride = startBuildRequest
                        .getRegistryCredentialOverride();
                jsonWriter.name("registryCredentialOverride");
                RegistryCredentialJsonMarshaller.getInstance().marshall(registryCredentialOverride,
                        jsonWriter);
            }
            if (startBuildRequest.getImagePullCredentialsTypeOverride() != null) {
                String imagePullCredentialsTypeOverride = startBuildRequest
                        .getImagePullCredentialsTypeOverride();
                jsonWriter.name("imagePullCredentialsTypeOverride");
                jsonWriter.value(imagePullCredentialsTypeOverride);
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
