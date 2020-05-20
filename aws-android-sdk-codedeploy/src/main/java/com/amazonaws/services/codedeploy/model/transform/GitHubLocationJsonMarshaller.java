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

package com.amazonaws.services.codedeploy.model.transform;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO GitHubLocation
 */
class GitHubLocationJsonMarshaller {

    public void marshall(GitHubLocation gitHubLocation, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (gitHubLocation.getRepository() != null) {
            String repository = gitHubLocation.getRepository();
            jsonWriter.name("repository");
            jsonWriter.value(repository);
        }
        if (gitHubLocation.getCommitId() != null) {
            String commitId = gitHubLocation.getCommitId();
            jsonWriter.name("commitId");
            jsonWriter.value(commitId);
        }
        jsonWriter.endObject();
    }

    private static GitHubLocationJsonMarshaller instance;

    public static GitHubLocationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GitHubLocationJsonMarshaller();
        return instance;
    }
}
