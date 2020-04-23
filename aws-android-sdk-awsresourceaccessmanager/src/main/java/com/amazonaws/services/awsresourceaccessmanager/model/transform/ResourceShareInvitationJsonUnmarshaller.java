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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ResourceShareInvitation
 */
class ResourceShareInvitationJsonUnmarshaller implements
        Unmarshaller<ResourceShareInvitation, JsonUnmarshallerContext> {

    public ResourceShareInvitation unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ResourceShareInvitation resourceShareInvitation = new ResourceShareInvitation();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("resourceShareInvitationArn")) {
                resourceShareInvitation.setResourceShareInvitationArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceShareName")) {
                resourceShareInvitation.setResourceShareName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceShareArn")) {
                resourceShareInvitation.setResourceShareArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("senderAccountId")) {
                resourceShareInvitation.setSenderAccountId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("receiverAccountId")) {
                resourceShareInvitation.setReceiverAccountId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("invitationTimestamp")) {
                resourceShareInvitation.setInvitationTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                resourceShareInvitation.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceShareAssociations")) {
                resourceShareInvitation
                        .setResourceShareAssociations(new ListUnmarshaller<ResourceShareAssociation>(
                                ResourceShareAssociationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return resourceShareInvitation;
    }

    private static ResourceShareInvitationJsonUnmarshaller instance;

    public static ResourceShareInvitationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResourceShareInvitationJsonUnmarshaller();
        return instance;
    }
}
