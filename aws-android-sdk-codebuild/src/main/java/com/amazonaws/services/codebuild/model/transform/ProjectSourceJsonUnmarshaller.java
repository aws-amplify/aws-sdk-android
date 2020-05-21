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
 * JSON unmarshaller for POJO ProjectSource
 */
class ProjectSourceJsonUnmarshaller implements Unmarshaller<ProjectSource, JsonUnmarshallerContext> {

    public ProjectSource unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ProjectSource projectSource = new ProjectSource();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("type")) {
                projectSource.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                projectSource.setLocation(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("gitCloneDepth")) {
                projectSource.setGitCloneDepth(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("gitSubmodulesConfig")) {
                projectSource.setGitSubmodulesConfig(GitSubmodulesConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("buildspec")) {
                projectSource.setBuildspec(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("auth")) {
                projectSource.setAuth(SourceAuthJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("reportBuildStatus")) {
                projectSource.setReportBuildStatus(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("insecureSsl")) {
                projectSource.setInsecureSsl(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("sourceIdentifier")) {
                projectSource.setSourceIdentifier(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return projectSource;
    }

    private static ProjectSourceJsonUnmarshaller instance;

    public static ProjectSourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProjectSourceJsonUnmarshaller();
        return instance;
    }
}
