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
 * JSON unmarshaller for POJO PullRequest
 */
class PullRequestJsonUnmarshaller implements Unmarshaller<PullRequest, JsonUnmarshallerContext> {

    public PullRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PullRequest pullRequest = new PullRequest();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("pullRequestId")) {
                pullRequest.setPullRequestId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("title")) {
                pullRequest.setTitle(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                pullRequest.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastActivityDate")) {
                pullRequest.setLastActivityDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("creationDate")) {
                pullRequest.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("pullRequestStatus")) {
                pullRequest.setPullRequestStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("authorArn")) {
                pullRequest.setAuthorArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("pullRequestTargets")) {
                pullRequest.setPullRequestTargets(new ListUnmarshaller<PullRequestTarget>(
                        PullRequestTargetJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("clientRequestToken")) {
                pullRequest.setClientRequestToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("revisionId")) {
                pullRequest.setRevisionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("approvalRules")) {
                pullRequest.setApprovalRules(new ListUnmarshaller<ApprovalRule>(
                        ApprovalRuleJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return pullRequest;
    }

    private static PullRequestJsonUnmarshaller instance;

    public static PullRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PullRequestJsonUnmarshaller();
        return instance;
    }
}
