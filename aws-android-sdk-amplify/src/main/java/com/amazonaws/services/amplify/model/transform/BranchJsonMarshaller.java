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

import com.amazonaws.services.amplify.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Branch
 */
class BranchJsonMarshaller {

    public void marshall(Branch branch, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (branch.getBranchArn() != null) {
            String branchArn = branch.getBranchArn();
            jsonWriter.name("branchArn");
            jsonWriter.value(branchArn);
        }
        if (branch.getBranchName() != null) {
            String branchName = branch.getBranchName();
            jsonWriter.name("branchName");
            jsonWriter.value(branchName);
        }
        if (branch.getDescription() != null) {
            String description = branch.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (branch.getTags() != null) {
            java.util.Map<String, String> tags = branch.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (branch.getStage() != null) {
            String stage = branch.getStage();
            jsonWriter.name("stage");
            jsonWriter.value(stage);
        }
        if (branch.getDisplayName() != null) {
            String displayName = branch.getDisplayName();
            jsonWriter.name("displayName");
            jsonWriter.value(displayName);
        }
        if (branch.getEnableNotification() != null) {
            Boolean enableNotification = branch.getEnableNotification();
            jsonWriter.name("enableNotification");
            jsonWriter.value(enableNotification);
        }
        if (branch.getCreateTime() != null) {
            java.util.Date createTime = branch.getCreateTime();
            jsonWriter.name("createTime");
            jsonWriter.value(createTime);
        }
        if (branch.getUpdateTime() != null) {
            java.util.Date updateTime = branch.getUpdateTime();
            jsonWriter.name("updateTime");
            jsonWriter.value(updateTime);
        }
        if (branch.getEnvironmentVariables() != null) {
            java.util.Map<String, String> environmentVariables = branch.getEnvironmentVariables();
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
        if (branch.getEnableAutoBuild() != null) {
            Boolean enableAutoBuild = branch.getEnableAutoBuild();
            jsonWriter.name("enableAutoBuild");
            jsonWriter.value(enableAutoBuild);
        }
        if (branch.getCustomDomains() != null) {
            java.util.List<String> customDomains = branch.getCustomDomains();
            jsonWriter.name("customDomains");
            jsonWriter.beginArray();
            for (String customDomainsItem : customDomains) {
                if (customDomainsItem != null) {
                    jsonWriter.value(customDomainsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (branch.getFramework() != null) {
            String framework = branch.getFramework();
            jsonWriter.name("framework");
            jsonWriter.value(framework);
        }
        if (branch.getActiveJobId() != null) {
            String activeJobId = branch.getActiveJobId();
            jsonWriter.name("activeJobId");
            jsonWriter.value(activeJobId);
        }
        if (branch.getTotalNumberOfJobs() != null) {
            String totalNumberOfJobs = branch.getTotalNumberOfJobs();
            jsonWriter.name("totalNumberOfJobs");
            jsonWriter.value(totalNumberOfJobs);
        }
        if (branch.getEnableBasicAuth() != null) {
            Boolean enableBasicAuth = branch.getEnableBasicAuth();
            jsonWriter.name("enableBasicAuth");
            jsonWriter.value(enableBasicAuth);
        }
        if (branch.getThumbnailUrl() != null) {
            String thumbnailUrl = branch.getThumbnailUrl();
            jsonWriter.name("thumbnailUrl");
            jsonWriter.value(thumbnailUrl);
        }
        if (branch.getBasicAuthCredentials() != null) {
            String basicAuthCredentials = branch.getBasicAuthCredentials();
            jsonWriter.name("basicAuthCredentials");
            jsonWriter.value(basicAuthCredentials);
        }
        if (branch.getBuildSpec() != null) {
            String buildSpec = branch.getBuildSpec();
            jsonWriter.name("buildSpec");
            jsonWriter.value(buildSpec);
        }
        if (branch.getTtl() != null) {
            String ttl = branch.getTtl();
            jsonWriter.name("ttl");
            jsonWriter.value(ttl);
        }
        if (branch.getAssociatedResources() != null) {
            java.util.List<String> associatedResources = branch.getAssociatedResources();
            jsonWriter.name("associatedResources");
            jsonWriter.beginArray();
            for (String associatedResourcesItem : associatedResources) {
                if (associatedResourcesItem != null) {
                    jsonWriter.value(associatedResourcesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (branch.getEnablePullRequestPreview() != null) {
            Boolean enablePullRequestPreview = branch.getEnablePullRequestPreview();
            jsonWriter.name("enablePullRequestPreview");
            jsonWriter.value(enablePullRequestPreview);
        }
        if (branch.getPullRequestEnvironmentName() != null) {
            String pullRequestEnvironmentName = branch.getPullRequestEnvironmentName();
            jsonWriter.name("pullRequestEnvironmentName");
            jsonWriter.value(pullRequestEnvironmentName);
        }
        if (branch.getDestinationBranch() != null) {
            String destinationBranch = branch.getDestinationBranch();
            jsonWriter.name("destinationBranch");
            jsonWriter.value(destinationBranch);
        }
        if (branch.getSourceBranch() != null) {
            String sourceBranch = branch.getSourceBranch();
            jsonWriter.name("sourceBranch");
            jsonWriter.value(sourceBranch);
        }
        if (branch.getBackendEnvironmentArn() != null) {
            String backendEnvironmentArn = branch.getBackendEnvironmentArn();
            jsonWriter.name("backendEnvironmentArn");
            jsonWriter.value(backendEnvironmentArn);
        }
        jsonWriter.endObject();
    }

    private static BranchJsonMarshaller instance;

    public static BranchJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BranchJsonMarshaller();
        return instance;
    }
}
