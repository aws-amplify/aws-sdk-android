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
 * JSON marshaller for POJO CommentsForPullRequest
 */
class CommentsForPullRequestJsonMarshaller {

    public void marshall(CommentsForPullRequest commentsForPullRequest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (commentsForPullRequest.getPullRequestId() != null) {
            String pullRequestId = commentsForPullRequest.getPullRequestId();
            jsonWriter.name("pullRequestId");
            jsonWriter.value(pullRequestId);
        }
        if (commentsForPullRequest.getRepositoryName() != null) {
            String repositoryName = commentsForPullRequest.getRepositoryName();
            jsonWriter.name("repositoryName");
            jsonWriter.value(repositoryName);
        }
        if (commentsForPullRequest.getBeforeCommitId() != null) {
            String beforeCommitId = commentsForPullRequest.getBeforeCommitId();
            jsonWriter.name("beforeCommitId");
            jsonWriter.value(beforeCommitId);
        }
        if (commentsForPullRequest.getAfterCommitId() != null) {
            String afterCommitId = commentsForPullRequest.getAfterCommitId();
            jsonWriter.name("afterCommitId");
            jsonWriter.value(afterCommitId);
        }
        if (commentsForPullRequest.getBeforeBlobId() != null) {
            String beforeBlobId = commentsForPullRequest.getBeforeBlobId();
            jsonWriter.name("beforeBlobId");
            jsonWriter.value(beforeBlobId);
        }
        if (commentsForPullRequest.getAfterBlobId() != null) {
            String afterBlobId = commentsForPullRequest.getAfterBlobId();
            jsonWriter.name("afterBlobId");
            jsonWriter.value(afterBlobId);
        }
        if (commentsForPullRequest.getLocation() != null) {
            Location location = commentsForPullRequest.getLocation();
            jsonWriter.name("location");
            LocationJsonMarshaller.getInstance().marshall(location, jsonWriter);
        }
        if (commentsForPullRequest.getComments() != null) {
            java.util.List<Comment> comments = commentsForPullRequest.getComments();
            jsonWriter.name("comments");
            jsonWriter.beginArray();
            for (Comment commentsItem : comments) {
                if (commentsItem != null) {
                    CommentJsonMarshaller.getInstance().marshall(commentsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static CommentsForPullRequestJsonMarshaller instance;

    public static CommentsForPullRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CommentsForPullRequestJsonMarshaller();
        return instance;
    }
}
