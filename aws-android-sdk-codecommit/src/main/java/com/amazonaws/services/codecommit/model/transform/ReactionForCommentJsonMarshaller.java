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
 * JSON marshaller for POJO ReactionForComment
 */
class ReactionForCommentJsonMarshaller {

    public void marshall(ReactionForComment reactionForComment, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (reactionForComment.getReaction() != null) {
            ReactionValueFormats reaction = reactionForComment.getReaction();
            jsonWriter.name("reaction");
            ReactionValueFormatsJsonMarshaller.getInstance().marshall(reaction, jsonWriter);
        }
        if (reactionForComment.getReactionUsers() != null) {
            java.util.List<String> reactionUsers = reactionForComment.getReactionUsers();
            jsonWriter.name("reactionUsers");
            jsonWriter.beginArray();
            for (String reactionUsersItem : reactionUsers) {
                if (reactionUsersItem != null) {
                    jsonWriter.value(reactionUsersItem);
                }
            }
            jsonWriter.endArray();
        }
        if (reactionForComment.getReactionsFromDeletedUsersCount() != null) {
            Integer reactionsFromDeletedUsersCount = reactionForComment
                    .getReactionsFromDeletedUsersCount();
            jsonWriter.name("reactionsFromDeletedUsersCount");
            jsonWriter.value(reactionsFromDeletedUsersCount);
        }
        jsonWriter.endObject();
    }

    private static ReactionForCommentJsonMarshaller instance;

    public static ReactionForCommentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReactionForCommentJsonMarshaller();
        return instance;
    }
}
