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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Member
 */
class MemberJsonMarshaller {

    public void marshall(Member member, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (member.getAccountId() != null) {
            String accountId = member.getAccountId();
            jsonWriter.name("accountId");
            jsonWriter.value(accountId);
        }
        if (member.getArn() != null) {
            String arn = member.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (member.getEmail() != null) {
            String email = member.getEmail();
            jsonWriter.name("email");
            jsonWriter.value(email);
        }
        if (member.getInvitedAt() != null) {
            java.util.Date invitedAt = member.getInvitedAt();
            jsonWriter.name("invitedAt");
            jsonWriter.value(invitedAt);
        }
        if (member.getMasterAccountId() != null) {
            String masterAccountId = member.getMasterAccountId();
            jsonWriter.name("masterAccountId");
            jsonWriter.value(masterAccountId);
        }
        if (member.getRelationshipStatus() != null) {
            String relationshipStatus = member.getRelationshipStatus();
            jsonWriter.name("relationshipStatus");
            jsonWriter.value(relationshipStatus);
        }
        if (member.getTags() != null) {
            java.util.Map<String, String> tags = member.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (member.getUpdatedAt() != null) {
            java.util.Date updatedAt = member.getUpdatedAt();
            jsonWriter.name("updatedAt");
            jsonWriter.value(updatedAt);
        }
        jsonWriter.endObject();
    }

    private static MemberJsonMarshaller instance;

    public static MemberJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MemberJsonMarshaller();
        return instance;
    }
}
