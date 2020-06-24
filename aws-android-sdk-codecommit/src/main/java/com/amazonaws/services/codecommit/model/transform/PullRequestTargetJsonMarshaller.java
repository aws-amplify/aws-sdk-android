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
 * JSON marshaller for POJO PullRequestTarget
 */
class PullRequestTargetJsonMarshaller {

    public void marshall(PullRequestTarget pullRequestTarget, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (pullRequestTarget.getRepositoryName() != null) {
            String repositoryName = pullRequestTarget.getRepositoryName();
            jsonWriter.name("repositoryName");
            jsonWriter.value(repositoryName);
        }
        if (pullRequestTarget.getSourceReference() != null) {
            String sourceReference = pullRequestTarget.getSourceReference();
            jsonWriter.name("sourceReference");
            jsonWriter.value(sourceReference);
        }
        if (pullRequestTarget.getDestinationReference() != null) {
            String destinationReference = pullRequestTarget.getDestinationReference();
            jsonWriter.name("destinationReference");
            jsonWriter.value(destinationReference);
        }
        if (pullRequestTarget.getDestinationCommit() != null) {
            String destinationCommit = pullRequestTarget.getDestinationCommit();
            jsonWriter.name("destinationCommit");
            jsonWriter.value(destinationCommit);
        }
        if (pullRequestTarget.getSourceCommit() != null) {
            String sourceCommit = pullRequestTarget.getSourceCommit();
            jsonWriter.name("sourceCommit");
            jsonWriter.value(sourceCommit);
        }
        if (pullRequestTarget.getMergeBase() != null) {
            String mergeBase = pullRequestTarget.getMergeBase();
            jsonWriter.name("mergeBase");
            jsonWriter.value(mergeBase);
        }
        if (pullRequestTarget.getMergeMetadata() != null) {
            MergeMetadata mergeMetadata = pullRequestTarget.getMergeMetadata();
            jsonWriter.name("mergeMetadata");
            MergeMetadataJsonMarshaller.getInstance().marshall(mergeMetadata, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static PullRequestTargetJsonMarshaller instance;

    public static PullRequestTargetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PullRequestTargetJsonMarshaller();
        return instance;
    }
}
