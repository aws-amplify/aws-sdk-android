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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Project
 */
class ProjectJsonUnmarshaller implements Unmarshaller<Project, JsonUnmarshallerContext> {

    public Project unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Project project = new Project();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                project.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("arn")) {
                project.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                project.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("source")) {
                project.setSource(ProjectSourceJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("secondarySources")) {
                project.setSecondarySources(new ListUnmarshaller<ProjectSource>(
                        ProjectSourceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("sourceVersion")) {
                project.setSourceVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("secondarySourceVersions")) {
                project.setSecondarySourceVersions(new ListUnmarshaller<ProjectSourceVersion>(
                        ProjectSourceVersionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("artifacts")) {
                project.setArtifacts(ProjectArtifactsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("secondaryArtifacts")) {
                project.setSecondaryArtifacts(new ListUnmarshaller<ProjectArtifacts>(
                        ProjectArtifactsJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("cache")) {
                project.setCache(ProjectCacheJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("environment")) {
                project.setEnvironment(ProjectEnvironmentJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("serviceRole")) {
                project.setServiceRole(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("timeoutInMinutes")) {
                project.setTimeoutInMinutes(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("queuedTimeoutInMinutes")) {
                project.setQueuedTimeoutInMinutes(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("encryptionKey")) {
                project.setEncryptionKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                project.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("created")) {
                project.setCreated(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastModified")) {
                project.setLastModified(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("webhook")) {
                project.setWebhook(WebhookJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("vpcConfig")) {
                project.setVpcConfig(VpcConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("badge")) {
                project.setBadge(ProjectBadgeJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("logsConfig")) {
                project.setLogsConfig(LogsConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("fileSystemLocations")) {
                project.setFileSystemLocations(new ListUnmarshaller<ProjectFileSystemLocation>(
                        ProjectFileSystemLocationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return project;
    }

    private static ProjectJsonUnmarshaller instance;

    public static ProjectJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProjectJsonUnmarshaller();
        return instance;
    }
}
