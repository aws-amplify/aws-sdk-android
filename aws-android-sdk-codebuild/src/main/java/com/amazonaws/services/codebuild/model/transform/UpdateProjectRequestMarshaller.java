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
 * JSON request marshaller for UpdateProjectRequest
 */
public class UpdateProjectRequestMarshaller implements
        Marshaller<Request<UpdateProjectRequest>, UpdateProjectRequest> {

    public Request<UpdateProjectRequest> marshall(UpdateProjectRequest updateProjectRequest) {
        if (updateProjectRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateProjectRequest)");
        }

        Request<UpdateProjectRequest> request = new DefaultRequest<UpdateProjectRequest>(
                updateProjectRequest, "AWSCodeBuild");
        String target = "CodeBuild_20161006.UpdateProject";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateProjectRequest.getName() != null) {
                String name = updateProjectRequest.getName();
                jsonWriter.name("name");
                jsonWriter.value(name);
            }
            if (updateProjectRequest.getDescription() != null) {
                String description = updateProjectRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
            }
            if (updateProjectRequest.getSource() != null) {
                ProjectSource source = updateProjectRequest.getSource();
                jsonWriter.name("source");
                ProjectSourceJsonMarshaller.getInstance().marshall(source, jsonWriter);
            }
            if (updateProjectRequest.getSecondarySources() != null) {
                java.util.List<ProjectSource> secondarySources = updateProjectRequest
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
            if (updateProjectRequest.getSourceVersion() != null) {
                String sourceVersion = updateProjectRequest.getSourceVersion();
                jsonWriter.name("sourceVersion");
                jsonWriter.value(sourceVersion);
            }
            if (updateProjectRequest.getSecondarySourceVersions() != null) {
                java.util.List<ProjectSourceVersion> secondarySourceVersions = updateProjectRequest
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
            if (updateProjectRequest.getArtifacts() != null) {
                ProjectArtifacts artifacts = updateProjectRequest.getArtifacts();
                jsonWriter.name("artifacts");
                ProjectArtifactsJsonMarshaller.getInstance().marshall(artifacts, jsonWriter);
            }
            if (updateProjectRequest.getSecondaryArtifacts() != null) {
                java.util.List<ProjectArtifacts> secondaryArtifacts = updateProjectRequest
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
            if (updateProjectRequest.getCache() != null) {
                ProjectCache cache = updateProjectRequest.getCache();
                jsonWriter.name("cache");
                ProjectCacheJsonMarshaller.getInstance().marshall(cache, jsonWriter);
            }
            if (updateProjectRequest.getEnvironment() != null) {
                ProjectEnvironment environment = updateProjectRequest.getEnvironment();
                jsonWriter.name("environment");
                ProjectEnvironmentJsonMarshaller.getInstance().marshall(environment, jsonWriter);
            }
            if (updateProjectRequest.getServiceRole() != null) {
                String serviceRole = updateProjectRequest.getServiceRole();
                jsonWriter.name("serviceRole");
                jsonWriter.value(serviceRole);
            }
            if (updateProjectRequest.getTimeoutInMinutes() != null) {
                Integer timeoutInMinutes = updateProjectRequest.getTimeoutInMinutes();
                jsonWriter.name("timeoutInMinutes");
                jsonWriter.value(timeoutInMinutes);
            }
            if (updateProjectRequest.getQueuedTimeoutInMinutes() != null) {
                Integer queuedTimeoutInMinutes = updateProjectRequest.getQueuedTimeoutInMinutes();
                jsonWriter.name("queuedTimeoutInMinutes");
                jsonWriter.value(queuedTimeoutInMinutes);
            }
            if (updateProjectRequest.getEncryptionKey() != null) {
                String encryptionKey = updateProjectRequest.getEncryptionKey();
                jsonWriter.name("encryptionKey");
                jsonWriter.value(encryptionKey);
            }
            if (updateProjectRequest.getTags() != null) {
                java.util.List<Tag> tags = updateProjectRequest.getTags();
                jsonWriter.name("tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateProjectRequest.getVpcConfig() != null) {
                VpcConfig vpcConfig = updateProjectRequest.getVpcConfig();
                jsonWriter.name("vpcConfig");
                VpcConfigJsonMarshaller.getInstance().marshall(vpcConfig, jsonWriter);
            }
            if (updateProjectRequest.getBadgeEnabled() != null) {
                Boolean badgeEnabled = updateProjectRequest.getBadgeEnabled();
                jsonWriter.name("badgeEnabled");
                jsonWriter.value(badgeEnabled);
            }
            if (updateProjectRequest.getLogsConfig() != null) {
                LogsConfig logsConfig = updateProjectRequest.getLogsConfig();
                jsonWriter.name("logsConfig");
                LogsConfigJsonMarshaller.getInstance().marshall(logsConfig, jsonWriter);
            }
            if (updateProjectRequest.getFileSystemLocations() != null) {
                java.util.List<ProjectFileSystemLocation> fileSystemLocations = updateProjectRequest
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
