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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Branch
 */
class BranchJsonUnmarshaller implements Unmarshaller<Branch, JsonUnmarshallerContext> {

    public Branch unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Branch branch = new Branch();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("branchArn")) {
                branch.setBranchArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("branchName")) {
                branch.setBranchName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                branch.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                branch.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("stage")) {
                branch.setStage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("displayName")) {
                branch.setDisplayName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("enableNotification")) {
                branch.setEnableNotification(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createTime")) {
                branch.setCreateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("updateTime")) {
                branch.setUpdateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("environmentVariables")) {
                branch.setEnvironmentVariables(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("enableAutoBuild")) {
                branch.setEnableAutoBuild(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("customDomains")) {
                branch.setCustomDomains(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("framework")) {
                branch.setFramework(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("activeJobId")) {
                branch.setActiveJobId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("totalNumberOfJobs")) {
                branch.setTotalNumberOfJobs(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("enableBasicAuth")) {
                branch.setEnableBasicAuth(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("thumbnailUrl")) {
                branch.setThumbnailUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("basicAuthCredentials")) {
                branch.setBasicAuthCredentials(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("buildSpec")) {
                branch.setBuildSpec(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ttl")) {
                branch.setTtl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("associatedResources")) {
                branch.setAssociatedResources(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("enablePullRequestPreview")) {
                branch.setEnablePullRequestPreview(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("pullRequestEnvironmentName")) {
                branch.setPullRequestEnvironmentName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("destinationBranch")) {
                branch.setDestinationBranch(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("sourceBranch")) {
                branch.setSourceBranch(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("backendEnvironmentArn")) {
                branch.setBackendEnvironmentArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return branch;
    }

    private static BranchJsonUnmarshaller instance;

    public static BranchJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BranchJsonUnmarshaller();
        return instance;
    }
}
