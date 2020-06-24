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
 * JSON marshaller for POJO Comment
 */
class CommentJsonMarshaller {

    public void marshall(Comment comment, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (comment.getCommentId() != null) {
            String commentId = comment.getCommentId();
            jsonWriter.name("commentId");
            jsonWriter.value(commentId);
        }
        if (comment.getContent() != null) {
            String content = comment.getContent();
            jsonWriter.name("content");
            jsonWriter.value(content);
        }
        if (comment.getInReplyTo() != null) {
            String inReplyTo = comment.getInReplyTo();
            jsonWriter.name("inReplyTo");
            jsonWriter.value(inReplyTo);
        }
        if (comment.getCreationDate() != null) {
            java.util.Date creationDate = comment.getCreationDate();
            jsonWriter.name("creationDate");
            jsonWriter.value(creationDate);
        }
        if (comment.getLastModifiedDate() != null) {
            java.util.Date lastModifiedDate = comment.getLastModifiedDate();
            jsonWriter.name("lastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (comment.getAuthorArn() != null) {
            String authorArn = comment.getAuthorArn();
            jsonWriter.name("authorArn");
            jsonWriter.value(authorArn);
        }
        if (comment.getDeleted() != null) {
            Boolean deleted = comment.getDeleted();
            jsonWriter.name("deleted");
            jsonWriter.value(deleted);
        }
        if (comment.getClientRequestToken() != null) {
            String clientRequestToken = comment.getClientRequestToken();
            jsonWriter.name("clientRequestToken");
            jsonWriter.value(clientRequestToken);
        }
        if (comment.getCallerReactions() != null) {
            java.util.List<String> callerReactions = comment.getCallerReactions();
            jsonWriter.name("callerReactions");
            jsonWriter.beginArray();
            for (String callerReactionsItem : callerReactions) {
                if (callerReactionsItem != null) {
                    jsonWriter.value(callerReactionsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (comment.getReactionCounts() != null) {
            java.util.Map<String, Integer> reactionCounts = comment.getReactionCounts();
            jsonWriter.name("reactionCounts");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, Integer> reactionCountsEntry : reactionCounts
                    .entrySet()) {
                Integer reactionCountsValue = reactionCountsEntry.getValue();
                if (reactionCountsValue != null) {
                    jsonWriter.name(reactionCountsEntry.getKey());
                    jsonWriter.value(reactionCountsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static CommentJsonMarshaller instance;

    public static CommentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CommentJsonMarshaller();
        return instance;
    }
}
