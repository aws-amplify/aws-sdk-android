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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO CommentsForPullRequest
 */
class CommentsForPullRequestJsonUnmarshaller implements
        Unmarshaller<CommentsForPullRequest, JsonUnmarshallerContext> {

    public CommentsForPullRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CommentsForPullRequest commentsForPullRequest = new CommentsForPullRequest();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("pullRequestId")) {
                commentsForPullRequest.setPullRequestId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("repositoryName")) {
                commentsForPullRequest.setRepositoryName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("beforeCommitId")) {
                commentsForPullRequest.setBeforeCommitId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("afterCommitId")) {
                commentsForPullRequest.setAfterCommitId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("beforeBlobId")) {
                commentsForPullRequest.setBeforeBlobId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("afterBlobId")) {
                commentsForPullRequest.setAfterBlobId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                commentsForPullRequest.setLocation(LocationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("comments")) {
                commentsForPullRequest.setComments(new ListUnmarshaller<Comment>(
                        CommentJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return commentsForPullRequest;
    }

    private static CommentsForPullRequestJsonUnmarshaller instance;

    public static CommentsForPullRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CommentsForPullRequestJsonUnmarshaller();
        return instance;
    }
}
