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
 * JSON marshaller for POJO Build
 */
class BuildJsonMarshaller {

    public void marshall(Build build, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (build.getId() != null) {
            String id = build.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (build.getArn() != null) {
            String arn = build.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (build.getBuildNumber() != null) {
            Long buildNumber = build.getBuildNumber();
            jsonWriter.name("buildNumber");
            jsonWriter.value(buildNumber);
        }
        if (build.getStartTime() != null) {
            java.util.Date startTime = build.getStartTime();
            jsonWriter.name("startTime");
            jsonWriter.value(startTime);
        }
        if (build.getEndTime() != null) {
            java.util.Date endTime = build.getEndTime();
            jsonWriter.name("endTime");
            jsonWriter.value(endTime);
        }
        if (build.getCurrentPhase() != null) {
            String currentPhase = build.getCurrentPhase();
            jsonWriter.name("currentPhase");
            jsonWriter.value(currentPhase);
        }
        if (build.getBuildStatus() != null) {
            String buildStatus = build.getBuildStatus();
            jsonWriter.name("buildStatus");
            jsonWriter.value(buildStatus);
        }
        if (build.getSourceVersion() != null) {
            String sourceVersion = build.getSourceVersion();
            jsonWriter.name("sourceVersion");
            jsonWriter.value(sourceVersion);
        }
        if (build.getResolvedSourceVersion() != null) {
            String resolvedSourceVersion = build.getResolvedSourceVersion();
            jsonWriter.name("resolvedSourceVersion");
            jsonWriter.value(resolvedSourceVersion);
        }
        if (build.getProjectName() != null) {
            String projectName = build.getProjectName();
            jsonWriter.name("projectName");
            jsonWriter.value(projectName);
        }
        if (build.getPhases() != null) {
            java.util.List<BuildPhase> phases = build.getPhases();
            jsonWriter.name("phases");
            jsonWriter.beginArray();
            for (BuildPhase phasesItem : phases) {
                if (phasesItem != null) {
                    BuildPhaseJsonMarshaller.getInstance().marshall(phasesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (build.getSource() != null) {
            ProjectSource source = build.getSource();
            jsonWriter.name("source");
            ProjectSourceJsonMarshaller.getInstance().marshall(source, jsonWriter);
        }
        if (build.getSecondarySources() != null) {
            java.util.List<ProjectSource> secondarySources = build.getSecondarySources();
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
        if (build.getSecondarySourceVersions() != null) {
            java.util.List<ProjectSourceVersion> secondarySourceVersions = build
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
        if (build.getArtifacts() != null) {
            BuildArtifacts artifacts = build.getArtifacts();
            jsonWriter.name("artifacts");
            BuildArtifactsJsonMarshaller.getInstance().marshall(artifacts, jsonWriter);
        }
        if (build.getSecondaryArtifacts() != null) {
            java.util.List<BuildArtifacts> secondaryArtifacts = build.getSecondaryArtifacts();
            jsonWriter.name("secondaryArtifacts");
            jsonWriter.beginArray();
            for (BuildArtifacts secondaryArtifactsItem : secondaryArtifacts) {
                if (secondaryArtifactsItem != null) {
                    BuildArtifactsJsonMarshaller.getInstance().marshall(secondaryArtifactsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (build.getCache() != null) {
            ProjectCache cache = build.getCache();
            jsonWriter.name("cache");
            ProjectCacheJsonMarshaller.getInstance().marshall(cache, jsonWriter);
        }
        if (build.getEnvironment() != null) {
            ProjectEnvironment environment = build.getEnvironment();
            jsonWriter.name("environment");
            ProjectEnvironmentJsonMarshaller.getInstance().marshall(environment, jsonWriter);
        }
        if (build.getServiceRole() != null) {
            String serviceRole = build.getServiceRole();
            jsonWriter.name("serviceRole");
            jsonWriter.value(serviceRole);
        }
        if (build.getLogs() != null) {
            LogsLocation logs = build.getLogs();
            jsonWriter.name("logs");
            LogsLocationJsonMarshaller.getInstance().marshall(logs, jsonWriter);
        }
        if (build.getTimeoutInMinutes() != null) {
            Integer timeoutInMinutes = build.getTimeoutInMinutes();
            jsonWriter.name("timeoutInMinutes");
            jsonWriter.value(timeoutInMinutes);
        }
        if (build.getQueuedTimeoutInMinutes() != null) {
            Integer queuedTimeoutInMinutes = build.getQueuedTimeoutInMinutes();
            jsonWriter.name("queuedTimeoutInMinutes");
            jsonWriter.value(queuedTimeoutInMinutes);
        }
        if (build.getBuildComplete() != null) {
            Boolean buildComplete = build.getBuildComplete();
            jsonWriter.name("buildComplete");
            jsonWriter.value(buildComplete);
        }
        if (build.getInitiator() != null) {
            String initiator = build.getInitiator();
            jsonWriter.name("initiator");
            jsonWriter.value(initiator);
        }
        if (build.getVpcConfig() != null) {
            VpcConfig vpcConfig = build.getVpcConfig();
            jsonWriter.name("vpcConfig");
            VpcConfigJsonMarshaller.getInstance().marshall(vpcConfig, jsonWriter);
        }
        if (build.getNetworkInterface() != null) {
            NetworkInterface networkInterface = build.getNetworkInterface();
            jsonWriter.name("networkInterface");
            NetworkInterfaceJsonMarshaller.getInstance().marshall(networkInterface, jsonWriter);
        }
        if (build.getEncryptionKey() != null) {
            String encryptionKey = build.getEncryptionKey();
            jsonWriter.name("encryptionKey");
            jsonWriter.value(encryptionKey);
        }
        if (build.getExportedEnvironmentVariables() != null) {
            java.util.List<ExportedEnvironmentVariable> exportedEnvironmentVariables = build
                    .getExportedEnvironmentVariables();
            jsonWriter.name("exportedEnvironmentVariables");
            jsonWriter.beginArray();
            for (ExportedEnvironmentVariable exportedEnvironmentVariablesItem : exportedEnvironmentVariables) {
                if (exportedEnvironmentVariablesItem != null) {
                    ExportedEnvironmentVariableJsonMarshaller.getInstance().marshall(
                            exportedEnvironmentVariablesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (build.getReportArns() != null) {
            java.util.List<String> reportArns = build.getReportArns();
            jsonWriter.name("reportArns");
            jsonWriter.beginArray();
            for (String reportArnsItem : reportArns) {
                if (reportArnsItem != null) {
                    jsonWriter.value(reportArnsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (build.getFileSystemLocations() != null) {
            java.util.List<ProjectFileSystemLocation> fileSystemLocations = build
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

    private static BuildJsonMarshaller instance;

    public static BuildJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BuildJsonMarshaller();
        return instance;
    }
}
