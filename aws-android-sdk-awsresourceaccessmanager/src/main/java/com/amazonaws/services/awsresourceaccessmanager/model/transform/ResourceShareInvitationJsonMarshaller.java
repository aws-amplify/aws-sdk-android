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

package com.amazonaws.services.awsresourceaccessmanager.model.transform;

import com.amazonaws.services.awsresourceaccessmanager.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ResourceShareInvitation
 */
class ResourceShareInvitationJsonMarshaller {

    public void marshall(ResourceShareInvitation resourceShareInvitation, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (resourceShareInvitation.getResourceShareInvitationArn() != null) {
            String resourceShareInvitationArn = resourceShareInvitation
                    .getResourceShareInvitationArn();
            jsonWriter.name("resourceShareInvitationArn");
            jsonWriter.value(resourceShareInvitationArn);
        }
        if (resourceShareInvitation.getResourceShareName() != null) {
            String resourceShareName = resourceShareInvitation.getResourceShareName();
            jsonWriter.name("resourceShareName");
            jsonWriter.value(resourceShareName);
        }
        if (resourceShareInvitation.getResourceShareArn() != null) {
            String resourceShareArn = resourceShareInvitation.getResourceShareArn();
            jsonWriter.name("resourceShareArn");
            jsonWriter.value(resourceShareArn);
        }
        if (resourceShareInvitation.getSenderAccountId() != null) {
            String senderAccountId = resourceShareInvitation.getSenderAccountId();
            jsonWriter.name("senderAccountId");
            jsonWriter.value(senderAccountId);
        }
        if (resourceShareInvitation.getReceiverAccountId() != null) {
            String receiverAccountId = resourceShareInvitation.getReceiverAccountId();
            jsonWriter.name("receiverAccountId");
            jsonWriter.value(receiverAccountId);
        }
        if (resourceShareInvitation.getInvitationTimestamp() != null) {
            java.util.Date invitationTimestamp = resourceShareInvitation.getInvitationTimestamp();
            jsonWriter.name("invitationTimestamp");
            jsonWriter.value(invitationTimestamp);
        }
        if (resourceShareInvitation.getStatus() != null) {
            String status = resourceShareInvitation.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (resourceShareInvitation.getResourceShareAssociations() != null) {
            java.util.List<ResourceShareAssociation> resourceShareAssociations = resourceShareInvitation
                    .getResourceShareAssociations();
            jsonWriter.name("resourceShareAssociations");
            jsonWriter.beginArray();
            for (ResourceShareAssociation resourceShareAssociationsItem : resourceShareAssociations) {
                if (resourceShareAssociationsItem != null) {
                    ResourceShareAssociationJsonMarshaller.getInstance().marshall(
                            resourceShareAssociationsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ResourceShareInvitationJsonMarshaller instance;

    public static ResourceShareInvitationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceShareInvitationJsonMarshaller();
        return instance;
    }
}
