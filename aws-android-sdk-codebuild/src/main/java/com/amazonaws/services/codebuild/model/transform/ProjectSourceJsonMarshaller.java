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
 * JSON marshaller for POJO ProjectSource
 */
class ProjectSourceJsonMarshaller {

    public void marshall(ProjectSource projectSource, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (projectSource.getType() != null) {
            String type = projectSource.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (projectSource.getLocation() != null) {
            String location = projectSource.getLocation();
            jsonWriter.name("location");
            jsonWriter.value(location);
        }
        if (projectSource.getGitCloneDepth() != null) {
            Integer gitCloneDepth = projectSource.getGitCloneDepth();
            jsonWriter.name("gitCloneDepth");
            jsonWriter.value(gitCloneDepth);
        }
        if (projectSource.getGitSubmodulesConfig() != null) {
            GitSubmodulesConfig gitSubmodulesConfig = projectSource.getGitSubmodulesConfig();
            jsonWriter.name("gitSubmodulesConfig");
            GitSubmodulesConfigJsonMarshaller.getInstance().marshall(gitSubmodulesConfig,
                    jsonWriter);
        }
        if (projectSource.getBuildspec() != null) {
            String buildspec = projectSource.getBuildspec();
            jsonWriter.name("buildspec");
            jsonWriter.value(buildspec);
        }
        if (projectSource.getAuth() != null) {
            SourceAuth auth = projectSource.getAuth();
            jsonWriter.name("auth");
            SourceAuthJsonMarshaller.getInstance().marshall(auth, jsonWriter);
        }
        if (projectSource.getReportBuildStatus() != null) {
            Boolean reportBuildStatus = projectSource.getReportBuildStatus();
            jsonWriter.name("reportBuildStatus");
            jsonWriter.value(reportBuildStatus);
        }
        if (projectSource.getInsecureSsl() != null) {
            Boolean insecureSsl = projectSource.getInsecureSsl();
            jsonWriter.name("insecureSsl");
            jsonWriter.value(insecureSsl);
        }
        if (projectSource.getSourceIdentifier() != null) {
            String sourceIdentifier = projectSource.getSourceIdentifier();
            jsonWriter.name("sourceIdentifier");
            jsonWriter.value(sourceIdentifier);
        }
        jsonWriter.endObject();
    }

    private static ProjectSourceJsonMarshaller instance;

    public static ProjectSourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProjectSourceJsonMarshaller();
        return instance;
    }
}
