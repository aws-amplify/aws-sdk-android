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

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Project
 */
class ProjectJsonMarshaller {

    public void marshall(Project project, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (project.getName() != null) {
            String name = project.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (project.getArn() != null) {
            String arn = project.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (project.getDescription() != null) {
            String description = project.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (project.getSource() != null) {
            ProjectSource source = project.getSource();
            jsonWriter.name("source");
            ProjectSourceJsonMarshaller.getInstance().marshall(source, jsonWriter);
        }
        if (project.getSecondarySources() != null) {
            java.util.List<ProjectSource> secondarySources = project.getSecondarySources();
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
        if (project.getSourceVersion() != null) {
            String sourceVersion = project.getSourceVersion();
            jsonWriter.name("sourceVersion");
            jsonWriter.value(sourceVersion);
        }
        if (project.getSecondarySourceVersions() != null) {
            java.util.List<ProjectSourceVersion> secondarySourceVersions = project
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
        if (project.getArtifacts() != null) {
            ProjectArtifacts artifacts = project.getArtifacts();
            jsonWriter.name("artifacts");
            ProjectArtifactsJsonMarshaller.getInstance().marshall(artifacts, jsonWriter);
        }
        if (project.getSecondaryArtifacts() != null) {
            java.util.List<ProjectArtifacts> secondaryArtifacts = project.getSecondaryArtifacts();
            jsonWriter.name("secondaryArtifacts");
            jsonWriter.beginArray();
            for (ProjectArtifacts secondaryArtifactsItem : secondaryArtifacts) {
                if (secondaryArtifactsItem != null) {
                    ProjectArtifactsJsonMarshaller.getInstance().marshall(secondaryArtifactsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (project.getCache() != null) {
            ProjectCache cache = project.getCache();
            jsonWriter.name("cache");
            ProjectCacheJsonMarshaller.getInstance().marshall(cache, jsonWriter);
        }
        if (project.getEnvironment() != null) {
            ProjectEnvironment environment = project.getEnvironment();
            jsonWriter.name("environment");
            ProjectEnvironmentJsonMarshaller.getInstance().marshall(environment, jsonWriter);
        }
        if (project.getServiceRole() != null) {
            String serviceRole = project.getServiceRole();
            jsonWriter.name("serviceRole");
            jsonWriter.value(serviceRole);
        }
        if (project.getTimeoutInMinutes() != null) {
            Integer timeoutInMinutes = project.getTimeoutInMinutes();
            jsonWriter.name("timeoutInMinutes");
            jsonWriter.value(timeoutInMinutes);
        }
        if (project.getQueuedTimeoutInMinutes() != null) {
            Integer queuedTimeoutInMinutes = project.getQueuedTimeoutInMinutes();
            jsonWriter.name("queuedTimeoutInMinutes");
            jsonWriter.value(queuedTimeoutInMinutes);
        }
        if (project.getEncryptionKey() != null) {
            String encryptionKey = project.getEncryptionKey();
            jsonWriter.name("encryptionKey");
            jsonWriter.value(encryptionKey);
        }
        if (project.getTags() != null) {
            java.util.List<Tag> tags = project.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (project.getCreated() != null) {
            java.util.Date created = project.getCreated();
            jsonWriter.name("created");
            jsonWriter.value(created);
        }
        if (project.getLastModified() != null) {
            java.util.Date lastModified = project.getLastModified();
            jsonWriter.name("lastModified");
            jsonWriter.value(lastModified);
        }
        if (project.getWebhook() != null) {
            Webhook webhook = project.getWebhook();
            jsonWriter.name("webhook");
            WebhookJsonMarshaller.getInstance().marshall(webhook, jsonWriter);
        }
        if (project.getVpcConfig() != null) {
            VpcConfig vpcConfig = project.getVpcConfig();
            jsonWriter.name("vpcConfig");
            VpcConfigJsonMarshaller.getInstance().marshall(vpcConfig, jsonWriter);
        }
        if (project.getBadge() != null) {
            ProjectBadge badge = project.getBadge();
            jsonWriter.name("badge");
            ProjectBadgeJsonMarshaller.getInstance().marshall(badge, jsonWriter);
        }
        if (project.getLogsConfig() != null) {
            LogsConfig logsConfig = project.getLogsConfig();
            jsonWriter.name("logsConfig");
            LogsConfigJsonMarshaller.getInstance().marshall(logsConfig, jsonWriter);
        }
        if (project.getFileSystemLocations() != null) {
            java.util.List<ProjectFileSystemLocation> fileSystemLocations = project
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
    }

    private static ProjectJsonMarshaller instance;

    public static ProjectJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProjectJsonMarshaller();
        return instance;
    }
}
