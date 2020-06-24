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
 * JSON marshaller for POJO PullRequestSourceReferenceUpdatedEventMetadata
 */
class PullRequestSourceReferenceUpdatedEventMetadataJsonMarshaller {

    public void marshall(
            PullRequestSourceReferenceUpdatedEventMetadata pullRequestSourceReferenceUpdatedEventMetadata,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (pullRequestSourceReferenceUpdatedEventMetadata.getRepositoryName() != null) {
            String repositoryName = pullRequestSourceReferenceUpdatedEventMetadata
                    .getRepositoryName();
            jsonWriter.name("repositoryName");
            jsonWriter.value(repositoryName);
        }
        if (pullRequestSourceReferenceUpdatedEventMetadata.getBeforeCommitId() != null) {
            String beforeCommitId = pullRequestSourceReferenceUpdatedEventMetadata
                    .getBeforeCommitId();
            jsonWriter.name("beforeCommitId");
            jsonWriter.value(beforeCommitId);
        }
        if (pullRequestSourceReferenceUpdatedEventMetadata.getAfterCommitId() != null) {
            String afterCommitId = pullRequestSourceReferenceUpdatedEventMetadata
                    .getAfterCommitId();
            jsonWriter.name("afterCommitId");
            jsonWriter.value(afterCommitId);
        }
        if (pullRequestSourceReferenceUpdatedEventMetadata.getMergeBase() != null) {
            String mergeBase = pullRequestSourceReferenceUpdatedEventMetadata.getMergeBase();
            jsonWriter.name("mergeBase");
            jsonWriter.value(mergeBase);
        }
        jsonWriter.endObject();
    }

    private static PullRequestSourceReferenceUpdatedEventMetadataJsonMarshaller instance;

    public static PullRequestSourceReferenceUpdatedEventMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PullRequestSourceReferenceUpdatedEventMetadataJsonMarshaller();
        return instance;
    }
}
