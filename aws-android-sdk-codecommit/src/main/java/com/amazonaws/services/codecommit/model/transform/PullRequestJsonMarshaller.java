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
 * JSON marshaller for POJO PullRequest
 */
class PullRequestJsonMarshaller {

    public void marshall(PullRequest pullRequest, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (pullRequest.getPullRequestId() != null) {
            String pullRequestId = pullRequest.getPullRequestId();
            jsonWriter.name("pullRequestId");
            jsonWriter.value(pullRequestId);
        }
        if (pullRequest.getTitle() != null) {
            String title = pullRequest.getTitle();
            jsonWriter.name("title");
            jsonWriter.value(title);
        }
        if (pullRequest.getDescription() != null) {
            String description = pullRequest.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (pullRequest.getLastActivityDate() != null) {
            java.util.Date lastActivityDate = pullRequest.getLastActivityDate();
            jsonWriter.name("lastActivityDate");
            jsonWriter.value(lastActivityDate);
        }
        if (pullRequest.getCreationDate() != null) {
            java.util.Date creationDate = pullRequest.getCreationDate();
            jsonWriter.name("creationDate");
            jsonWriter.value(creationDate);
        }
        if (pullRequest.getPullRequestStatus() != null) {
            String pullRequestStatus = pullRequest.getPullRequestStatus();
            jsonWriter.name("pullRequestStatus");
            jsonWriter.value(pullRequestStatus);
        }
        if (pullRequest.getAuthorArn() != null) {
            String authorArn = pullRequest.getAuthorArn();
            jsonWriter.name("authorArn");
            jsonWriter.value(authorArn);
        }
        if (pullRequest.getPullRequestTargets() != null) {
            java.util.List<PullRequestTarget> pullRequestTargets = pullRequest
                    .getPullRequestTargets();
            jsonWriter.name("pullRequestTargets");
            jsonWriter.beginArray();
            for (PullRequestTarget pullRequestTargetsItem : pullRequestTargets) {
                if (pullRequestTargetsItem != null) {
                    PullRequestTargetJsonMarshaller.getInstance().marshall(pullRequestTargetsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (pullRequest.getClientRequestToken() != null) {
            String clientRequestToken = pullRequest.getClientRequestToken();
            jsonWriter.name("clientRequestToken");
            jsonWriter.value(clientRequestToken);
        }
        if (pullRequest.getRevisionId() != null) {
            String revisionId = pullRequest.getRevisionId();
            jsonWriter.name("revisionId");
            jsonWriter.value(revisionId);
        }
        if (pullRequest.getApprovalRules() != null) {
            java.util.List<ApprovalRule> approvalRules = pullRequest.getApprovalRules();
            jsonWriter.name("approvalRules");
            jsonWriter.beginArray();
            for (ApprovalRule approvalRulesItem : approvalRules) {
                if (approvalRulesItem != null) {
                    ApprovalRuleJsonMarshaller.getInstance()
                            .marshall(approvalRulesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static PullRequestJsonMarshaller instance;

    public static PullRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PullRequestJsonMarshaller();
        return instance;
    }
}
