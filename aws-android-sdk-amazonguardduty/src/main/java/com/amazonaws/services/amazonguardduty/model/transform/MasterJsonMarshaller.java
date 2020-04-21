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

package com.amazonaws.services.amazonguardduty.model.transform;

import com.amazonaws.services.amazonguardduty.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Master
 */
class MasterJsonMarshaller {

    public void marshall(Master master, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (master.getAccountId() != null) {
            String accountId = master.getAccountId();
            jsonWriter.name("AccountId");
            jsonWriter.value(accountId);
        }
        if (master.getInvitationId() != null) {
            String invitationId = master.getInvitationId();
            jsonWriter.name("InvitationId");
            jsonWriter.value(invitationId);
        }
        if (master.getRelationshipStatus() != null) {
            String relationshipStatus = master.getRelationshipStatus();
            jsonWriter.name("RelationshipStatus");
            jsonWriter.value(relationshipStatus);
        }
        if (master.getInvitedAt() != null) {
            String invitedAt = master.getInvitedAt();
            jsonWriter.name("InvitedAt");
            jsonWriter.value(invitedAt);
        }
        jsonWriter.endObject();
    }

    private static MasterJsonMarshaller instance;

    public static MasterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MasterJsonMarshaller();
        return instance;
    }
}
