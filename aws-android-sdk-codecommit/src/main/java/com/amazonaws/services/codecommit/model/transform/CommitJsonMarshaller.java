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
 * JSON marshaller for POJO Commit
 */
class CommitJsonMarshaller {

    public void marshall(Commit commit, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (commit.getCommitId() != null) {
            String commitId = commit.getCommitId();
            jsonWriter.name("commitId");
            jsonWriter.value(commitId);
        }
        if (commit.getTreeId() != null) {
            String treeId = commit.getTreeId();
            jsonWriter.name("treeId");
            jsonWriter.value(treeId);
        }
        if (commit.getParents() != null) {
            java.util.List<String> parents = commit.getParents();
            jsonWriter.name("parents");
            jsonWriter.beginArray();
            for (String parentsItem : parents) {
                if (parentsItem != null) {
                    jsonWriter.value(parentsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (commit.getMessage() != null) {
            String message = commit.getMessage();
            jsonWriter.name("message");
            jsonWriter.value(message);
        }
        if (commit.getAuthor() != null) {
            UserInfo author = commit.getAuthor();
            jsonWriter.name("author");
            UserInfoJsonMarshaller.getInstance().marshall(author, jsonWriter);
        }
        if (commit.getCommitter() != null) {
            UserInfo committer = commit.getCommitter();
            jsonWriter.name("committer");
            UserInfoJsonMarshaller.getInstance().marshall(committer, jsonWriter);
        }
        if (commit.getAdditionalData() != null) {
            String additionalData = commit.getAdditionalData();
            jsonWriter.name("additionalData");
            jsonWriter.value(additionalData);
        }
        jsonWriter.endObject();
    }

    private static CommitJsonMarshaller instance;

    public static CommitJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CommitJsonMarshaller();
        return instance;
    }
}
