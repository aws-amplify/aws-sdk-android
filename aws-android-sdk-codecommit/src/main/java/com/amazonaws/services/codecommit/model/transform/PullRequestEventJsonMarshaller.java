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
 * JSON marshaller for POJO PullRequestEvent
 */
class PullRequestEventJsonMarshaller {

    public void marshall(PullRequestEvent pullRequestEvent, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (pullRequestEvent.getPullRequestId() != null) {
            String pullRequestId = pullRequestEvent.getPullRequestId();
            jsonWriter.name("pullRequestId");
            jsonWriter.value(pullRequestId);
        }
        if (pullRequestEvent.getEventDate() != null) {
            java.util.Date eventDate = pullRequestEvent.getEventDate();
            jsonWriter.name("eventDate");
            jsonWriter.value(eventDate);
        }
        if (pullRequestEvent.getPullRequestEventType() != null) {
            String pullRequestEventType = pullRequestEvent.getPullRequestEventType();
            jsonWriter.name("pullRequestEventType");
            jsonWriter.value(pullRequestEventType);
        }
        if (pullRequestEvent.getActorArn() != null) {
            String actorArn = pullRequestEvent.getActorArn();
            jsonWriter.name("actorArn");
            jsonWriter.value(actorArn);
        }
        if (pullRequestEvent.getPullRequestCreatedEventMetadata() != null) {
            PullRequestCreatedEventMetadata pullRequestCreatedEventMetadata = pullRequestEvent
                    .getPullRequestCreatedEventMetadata();
            jsonWriter.name("pullRequestCreatedEventMetadata");
            PullRequestCreatedEventMetadataJsonMarshaller.getInstance().marshall(
                    pullRequestCreatedEventMetadata, jsonWriter);
        }
        if (pullRequestEvent.getPullRequestStatusChangedEventMetadata() != null) {
            PullRequestStatusChangedEventMetadata pullRequestStatusChangedEventMetadata = pullRequestEvent
                    .getPullRequestStatusChangedEventMetadata();
            jsonWriter.name("pullRequestStatusChangedEventMetadata");
            PullRequestStatusChangedEventMetadataJsonMarshaller.getInstance().marshall(
                    pullRequestStatusChangedEventMetadata, jsonWriter);
        }
        if (pullRequestEvent.getPullRequestSourceReferenceUpdatedEventMetadata() != null) {
            PullRequestSourceReferenceUpdatedEventMetadata pullRequestSourceReferenceUpdatedEventMetadata = pullRequestEvent
                    .getPullRequestSourceReferenceUpdatedEventMetadata();
            jsonWriter.name("pullRequestSourceReferenceUpdatedEventMetadata");
            PullRequestSourceReferenceUpdatedEventMetadataJsonMarshaller.getInstance().marshall(
                    pullRequestSourceReferenceUpdatedEventMetadata, jsonWriter);
        }
        if (pullRequestEvent.getPullRequestMergedStateChangedEventMetadata() != null) {
            PullRequestMergedStateChangedEventMetadata pullRequestMergedStateChangedEventMetadata = pullRequestEvent
                    .getPullRequestMergedStateChangedEventMetadata();
            jsonWriter.name("pullRequestMergedStateChangedEventMetadata");
            PullRequestMergedStateChangedEventMetadataJsonMarshaller.getInstance().marshall(
                    pullRequestMergedStateChangedEventMetadata, jsonWriter);
        }
        if (pullRequestEvent.getApprovalRuleEventMetadata() != null) {
            ApprovalRuleEventMetadata approvalRuleEventMetadata = pullRequestEvent
                    .getApprovalRuleEventMetadata();
            jsonWriter.name("approvalRuleEventMetadata");
            ApprovalRuleEventMetadataJsonMarshaller.getInstance().marshall(
                    approvalRuleEventMetadata, jsonWriter);
        }
        if (pullRequestEvent.getApprovalStateChangedEventMetadata() != null) {
            ApprovalStateChangedEventMetadata approvalStateChangedEventMetadata = pullRequestEvent
                    .getApprovalStateChangedEventMetadata();
            jsonWriter.name("approvalStateChangedEventMetadata");
            ApprovalStateChangedEventMetadataJsonMarshaller.getInstance().marshall(
                    approvalStateChangedEventMetadata, jsonWriter);
        }
        if (pullRequestEvent.getApprovalRuleOverriddenEventMetadata() != null) {
            ApprovalRuleOverriddenEventMetadata approvalRuleOverriddenEventMetadata = pullRequestEvent
                    .getApprovalRuleOverriddenEventMetadata();
            jsonWriter.name("approvalRuleOverriddenEventMetadata");
            ApprovalRuleOverriddenEventMetadataJsonMarshaller.getInstance().marshall(
                    approvalRuleOverriddenEventMetadata, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static PullRequestEventJsonMarshaller instance;

    public static PullRequestEventJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PullRequestEventJsonMarshaller();
        return instance;
    }
}
