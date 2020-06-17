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
 * JSON marshaller for POJO Invitation
 */
class InvitationJsonMarshaller {

    public void marshall(Invitation invitation, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (invitation.getAccountId() != null) {
            String accountId = invitation.getAccountId();
            jsonWriter.name("accountId");
            jsonWriter.value(accountId);
        }
        if (invitation.getInvitationId() != null) {
            String invitationId = invitation.getInvitationId();
            jsonWriter.name("invitationId");
            jsonWriter.value(invitationId);
        }
        if (invitation.getInvitedAt() != null) {
            java.util.Date invitedAt = invitation.getInvitedAt();
            jsonWriter.name("invitedAt");
            jsonWriter.value(invitedAt);
        }
        if (invitation.getRelationshipStatus() != null) {
            String relationshipStatus = invitation.getRelationshipStatus();
            jsonWriter.name("relationshipStatus");
            jsonWriter.value(relationshipStatus);
        }
        jsonWriter.endObject();
    }

    private static InvitationJsonMarshaller instance;

    public static InvitationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InvitationJsonMarshaller();
        return instance;
    }
}
