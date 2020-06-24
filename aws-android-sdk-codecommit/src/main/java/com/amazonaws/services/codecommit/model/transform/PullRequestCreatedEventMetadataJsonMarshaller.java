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

package com.amazonaws.services.codecommit.model.transform;

import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PullRequestCreatedEventMetadata
 */
class PullRequestCreatedEventMetadataJsonMarshaller {

    public void marshall(PullRequestCreatedEventMetadata pullRequestCreatedEventMetadata,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (pullRequestCreatedEventMetadata.getRepositoryName() != null) {
            String repositoryName = pullRequestCreatedEventMetadata.getRepositoryName();
            jsonWriter.name("repositoryName");
            jsonWriter.value(repositoryName);
        }
        if (pullRequestCreatedEventMetadata.getSourceCommitId() != null) {
            String sourceCommitId = pullRequestCreatedEventMetadata.getSourceCommitId();
            jsonWriter.name("sourceCommitId");
            jsonWriter.value(sourceCommitId);
        }
        if (pullRequestCreatedEventMetadata.getDestinationCommitId() != null) {
            String destinationCommitId = pullRequestCreatedEventMetadata.getDestinationCommitId();
            jsonWriter.name("destinationCommitId");
            jsonWriter.value(destinationCommitId);
        }
        if (pullRequestCreatedEventMetadata.getMergeBase() != null) {
            String mergeBase = pullRequestCreatedEventMetadata.getMergeBase();
            jsonWriter.name("mergeBase");
            jsonWriter.value(mergeBase);
        }
        jsonWriter.endObject();
    }

    private static PullRequestCreatedEventMetadataJsonMarshaller instance;

    public static PullRequestCreatedEventMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PullRequestCreatedEventMetadataJsonMarshaller();
        return instance;
    }
}
