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
 * JSON unmarshaller for POJO Commit
 */
class CommitJsonUnmarshaller implements Unmarshaller<Commit, JsonUnmarshallerContext> {

    public Commit unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Commit commit = new Commit();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("commitId")) {
                commit.setCommitId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("treeId")) {
                commit.setTreeId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("parents")) {
                commit.setParents(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("message")) {
                commit.setMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("author")) {
                commit.setAuthor(UserInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("committer")) {
                commit.setCommitter(UserInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("additionalData")) {
                commit.setAdditionalData(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return commit;
    }

    private static CommitJsonUnmarshaller instance;

    public static CommitJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CommitJsonUnmarshaller();
        return instance;
    }
}
