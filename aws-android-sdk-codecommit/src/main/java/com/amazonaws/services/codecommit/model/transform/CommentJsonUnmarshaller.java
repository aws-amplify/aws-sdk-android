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
 * JSON unmarshaller for POJO Comment
 */
class CommentJsonUnmarshaller implements Unmarshaller<Comment, JsonUnmarshallerContext> {

    public Comment unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Comment comment = new Comment();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("commentId")) {
                comment.setCommentId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("content")) {
                comment.setContent(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("inReplyTo")) {
                comment.setInReplyTo(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("creationDate")) {
                comment.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastModifiedDate")) {
                comment.setLastModifiedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("authorArn")) {
                comment.setAuthorArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("deleted")) {
                comment.setDeleted(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("clientRequestToken")) {
                comment.setClientRequestToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("callerReactions")) {
                comment.setCallerReactions(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("reactionCounts")) {
                comment.setReactionCounts(new MapUnmarshaller<Integer>(IntegerJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return comment;
    }

    private static CommentJsonUnmarshaller instance;

    public static CommentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CommentJsonUnmarshaller();
        return instance;
    }
}
