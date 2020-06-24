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
 * JSON marshaller for POJO CommentsForComparedCommit
 */
class CommentsForComparedCommitJsonMarshaller {

    public void marshall(CommentsForComparedCommit commentsForComparedCommit,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (commentsForComparedCommit.getRepositoryName() != null) {
            String repositoryName = commentsForComparedCommit.getRepositoryName();
            jsonWriter.name("repositoryName");
            jsonWriter.value(repositoryName);
        }
        if (commentsForComparedCommit.getBeforeCommitId() != null) {
            String beforeCommitId = commentsForComparedCommit.getBeforeCommitId();
            jsonWriter.name("beforeCommitId");
            jsonWriter.value(beforeCommitId);
        }
        if (commentsForComparedCommit.getAfterCommitId() != null) {
            String afterCommitId = commentsForComparedCommit.getAfterCommitId();
            jsonWriter.name("afterCommitId");
            jsonWriter.value(afterCommitId);
        }
        if (commentsForComparedCommit.getBeforeBlobId() != null) {
            String beforeBlobId = commentsForComparedCommit.getBeforeBlobId();
            jsonWriter.name("beforeBlobId");
            jsonWriter.value(beforeBlobId);
        }
        if (commentsForComparedCommit.getAfterBlobId() != null) {
            String afterBlobId = commentsForComparedCommit.getAfterBlobId();
            jsonWriter.name("afterBlobId");
            jsonWriter.value(afterBlobId);
        }
        if (commentsForComparedCommit.getLocation() != null) {
            Location location = commentsForComparedCommit.getLocation();
            jsonWriter.name("location");
            LocationJsonMarshaller.getInstance().marshall(location, jsonWriter);
        }
        if (commentsForComparedCommit.getComments() != null) {
            java.util.List<Comment> comments = commentsForComparedCommit.getComments();
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

    private static CommentsForComparedCommitJsonMarshaller instance;

    public static CommentsForComparedCommitJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CommentsForComparedCommitJsonMarshaller();
        return instance;
    }
}
