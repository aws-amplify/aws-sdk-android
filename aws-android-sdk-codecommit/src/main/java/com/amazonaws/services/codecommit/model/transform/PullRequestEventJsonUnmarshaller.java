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
 * JSON unmarshaller for POJO PullRequestEvent
 */
class PullRequestEventJsonUnmarshaller implements
        Unmarshaller<PullRequestEvent, JsonUnmarshallerContext> {

    public PullRequestEvent unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PullRequestEvent pullRequestEvent = new PullRequestEvent();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("pullRequestId")) {
                pullRequestEvent.setPullRequestId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("eventDate")) {
                pullRequestEvent.setEventDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("pullRequestEventType")) {
                pullRequestEvent.setPullRequestEventType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("actorArn")) {
                pullRequestEvent.setActorArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("pullRequestCreatedEventMetadata")) {
                pullRequestEvent
                        .setPullRequestCreatedEventMetadata(PullRequestCreatedEventMetadataJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("pullRequestStatusChangedEventMetadata")) {
                pullRequestEvent
                        .setPullRequestStatusChangedEventMetadata(PullRequestStatusChangedEventMetadataJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("pullRequestSourceReferenceUpdatedEventMetadata")) {
                pullRequestEvent
                        .setPullRequestSourceReferenceUpdatedEventMetadata(PullRequestSourceReferenceUpdatedEventMetadataJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("pullRequestMergedStateChangedEventMetadata")) {
                pullRequestEvent
                        .setPullRequestMergedStateChangedEventMetadata(PullRequestMergedStateChangedEventMetadataJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("approvalRuleEventMetadata")) {
                pullRequestEvent
                        .setApprovalRuleEventMetadata(ApprovalRuleEventMetadataJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("approvalStateChangedEventMetadata")) {
                pullRequestEvent
                        .setApprovalStateChangedEventMetadata(ApprovalStateChangedEventMetadataJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("approvalRuleOverriddenEventMetadata")) {
                pullRequestEvent
                        .setApprovalRuleOverriddenEventMetadata(ApprovalRuleOverriddenEventMetadataJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return pullRequestEvent;
    }

    private static PullRequestEventJsonUnmarshaller instance;

    public static PullRequestEventJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PullRequestEventJsonUnmarshaller();
        return instance;
    }
}
