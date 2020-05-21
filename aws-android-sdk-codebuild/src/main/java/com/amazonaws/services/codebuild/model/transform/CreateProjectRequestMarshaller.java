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
 * JSON request marshaller for CreateProjectRequest
 */
public class CreateProjectRequestMarshaller implements
        Marshaller<Request<CreateProjectRequest>, CreateProjectRequest> {

    public Request<CreateProjectRequest> marshall(CreateProjectRequest createProjectRequest) {
        if (createProjectRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateProjectRequest)");
        }

        Request<CreateProjectRequest> request = new DefaultRequest<CreateProjectRequest>(
                createProjectRequest, "AWSCodeBuild");
        String target = "CodeBuild_20161006.CreateProject";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createProjectRequest.getName() != null) {
                String name = createProjectRequest.getName();
                jsonWriter.name("name");
                jsonWriter.value(name);
            }
            if (createProjectRequest.getDescription() != null) {
                String description = createProjectRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
            }
            if (createProjectRequest.getSource() != null) {
                ProjectSource source = createProjectRequest.getSource();
                jsonWriter.name("source");
                ProjectSourceJsonMarshaller.getInstance().marshall(source, jsonWriter);
            }
            if (createProjectRequest.getSecondarySources() != null) {
                java.util.List<ProjectSource> secondarySources = createProjectRequest
                        .getSecondarySources();
                jsonWriter.name("secondarySources");
                jsonWriter.beginArray();
                for (ProjectSource secondarySourcesItem : secondarySources) {
                    if (secondarySourcesItem != null) {
                        ProjectSourceJsonMarshaller.getInstance().marshall(secondarySourcesItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createProjectRequest.getSourceVersion() != null) {
                String sourceVersion = createProjectRequest.getSourceVersion();
                jsonWriter.name("sourceVersion");
                jsonWriter.value(sourceVersion);
            }
            if (createProjectRequest.getSecondarySourceVersions() != null) {
                java.util.List<ProjectSourceVersion> secondarySourceVersions = createProjectRequest
                        .getSecondarySourceVersions();
                jsonWriter.name("secondarySourceVersions");
                jsonWriter.beginArray();
                for (ProjectSourceVersion secondarySourceVersionsItem : secondarySourceVersions) {
                    if (secondarySourceVersionsItem != null) {
                        ProjectSourceVersionJsonMarshaller.getInstance().marshall(
                                secondarySourceVersionsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createProjectRequest.getArtifacts() != null) {
                ProjectArtifacts artifacts = createProjectRequest.getArtifacts();
                jsonWriter.name("artifacts");
                ProjectArtifactsJsonMarshaller.getInstance().marshall(artifacts, jsonWriter);
            }
            if (createProjectRequest.getSecondaryArtifacts() != null) {
                java.util.List<ProjectArtifacts> secondaryArtifacts = createProjectRequest
                        .getSecondaryArtifacts();
                jsonWriter.name("secondaryArtifacts");
                jsonWriter.beginArray();
                for (ProjectArtifacts secondaryArtifactsItem : secondaryArtifacts) {
                    if (secondaryArtifactsItem != null) {
                        ProjectArtifactsJsonMarshaller.getInstance().marshall(
                                secondaryArtifactsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createProjectRequest.getCache() != null) {
                ProjectCache cache = createProjectRequest.getCache();
                jsonWriter.name("cache");
                ProjectCacheJsonMarshaller.getInstance().marshall(cache, jsonWriter);
            }
            if (createProjectRequest.getEnvironment() != null) {
                ProjectEnvironment environment = createProjectRequest.getEnvironment();
                jsonWriter.name("environment");
                ProjectEnvironmentJsonMarshaller.getInstance().marshall(environment, jsonWriter);
            }
            if (createProjectRequest.getServiceRole() != null) {
                String serviceRole = createProjectRequest.getServiceRole();
                jsonWriter.name("serviceRole");
                jsonWriter.value(serviceRole);
            }
            if (createProjectRequest.getTimeoutInMinutes() != null) {
                Integer timeoutInMinutes = createProjectRequest.getTimeoutInMinutes();
                jsonWriter.name("timeoutInMinutes");
                jsonWriter.value(timeoutInMinutes);
            }
            if (createProjectRequest.getQueuedTimeoutInMinutes() != null) {
                Integer queuedTimeoutInMinutes = createProjectRequest.getQueuedTimeoutInMinutes();
                jsonWriter.name("queuedTimeoutInMinutes");
                jsonWriter.value(queuedTimeoutInMinutes);
            }
            if (createProjectRequest.getEncryptionKey() != null) {
                String encryptionKey = createProjectRequest.getEncryptionKey();
                jsonWriter.name("encryptionKey");
                jsonWriter.value(encryptionKey);
            }
            if (createProjectRequest.getTags() != null) {
                java.util.List<Tag> tags = createProjectRequest.getTags();
                jsonWriter.name("tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createProjectRequest.getVpcConfig() != null) {
                VpcConfig vpcConfig = createProjectRequest.getVpcConfig();
                jsonWriter.name("vpcConfig");
                VpcConfigJsonMarshaller.getInstance().marshall(vpcConfig, jsonWriter);
            }
            if (createProjectRequest.getBadgeEnabled() != null) {
                Boolean badgeEnabled = createProjectRequest.getBadgeEnabled();
                jsonWriter.name("badgeEnabled");
                jsonWriter.value(badgeEnabled);
            }
            if (createProjectRequest.getLogsConfig() != null) {
                LogsConfig logsConfig = createProjectRequest.getLogsConfig();
                jsonWriter.name("logsConfig");
                LogsConfigJsonMarshaller.getInstance().marshall(logsConfig, jsonWriter);
            }
            if (createProjectRequest.getFileSystemLocations() != null) {
                java.util.List<ProjectFileSystemLocation> fileSystemLocations = createProjectRequest
                        .getFileSystemLocations();
                jsonWriter.name("fileSystemLocations");
                jsonWriter.beginArray();
                for (ProjectFileSystemLocation fileSystemLocationsItem : fileSystemLocations) {
                    if (fileSystemLocationsItem != null) {
                        ProjectFileSystemLocationJsonMarshaller.getInstance().marshall(
                                fileSystemLocationsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
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
