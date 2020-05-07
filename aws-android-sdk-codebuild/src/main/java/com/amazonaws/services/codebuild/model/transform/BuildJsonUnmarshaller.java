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
 * JSON unmarshaller for POJO Build
 */
class BuildJsonUnmarshaller implements Unmarshaller<Build, JsonUnmarshallerContext> {

    public Build unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Build build = new Build();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("id")) {
                build.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("arn")) {
                build.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("buildNumber")) {
                build.setBuildNumber(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("startTime")) {
                build.setStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("endTime")) {
                build.setEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("currentPhase")) {
                build.setCurrentPhase(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("buildStatus")) {
                build.setBuildStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("sourceVersion")) {
                build.setSourceVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resolvedSourceVersion")) {
                build.setResolvedSourceVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("projectName")) {
                build.setProjectName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("phases")) {
                build.setPhases(new ListUnmarshaller<BuildPhase>(BuildPhaseJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("source")) {
                build.setSource(ProjectSourceJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("secondarySources")) {
                build.setSecondarySources(new ListUnmarshaller<ProjectSource>(
                        ProjectSourceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("secondarySourceVersions")) {
                build.setSecondarySourceVersions(new ListUnmarshaller<ProjectSourceVersion>(
                        ProjectSourceVersionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("artifacts")) {
                build.setArtifacts(BuildArtifactsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("secondaryArtifacts")) {
                build.setSecondaryArtifacts(new ListUnmarshaller<BuildArtifacts>(
                        BuildArtifactsJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("cache")) {
                build.setCache(ProjectCacheJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("environment")) {
                build.setEnvironment(ProjectEnvironmentJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("serviceRole")) {
                build.setServiceRole(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("logs")) {
                build.setLogs(LogsLocationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("timeoutInMinutes")) {
                build.setTimeoutInMinutes(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("queuedTimeoutInMinutes")) {
                build.setQueuedTimeoutInMinutes(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("buildComplete")) {
                build.setBuildComplete(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("initiator")) {
                build.setInitiator(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("vpcConfig")) {
                build.setVpcConfig(VpcConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("networkInterface")) {
                build.setNetworkInterface(NetworkInterfaceJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("encryptionKey")) {
                build.setEncryptionKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("exportedEnvironmentVariables")) {
                build.setExportedEnvironmentVariables(new ListUnmarshaller<ExportedEnvironmentVariable>(
                        ExportedEnvironmentVariableJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("reportArns")) {
                build.setReportArns(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("fileSystemLocations")) {
                build.setFileSystemLocations(new ListUnmarshaller<ProjectFileSystemLocation>(
                        ProjectFileSystemLocationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return build;
    }

    private static BuildJsonUnmarshaller instance;

    public static BuildJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BuildJsonUnmarshaller();
        return instance;
    }
}
