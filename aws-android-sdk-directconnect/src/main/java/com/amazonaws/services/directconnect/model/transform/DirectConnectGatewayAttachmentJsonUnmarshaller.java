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

package com.amazonaws.services.directconnect.model.transform;

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DirectConnectGatewayAttachment
 */
class DirectConnectGatewayAttachmentJsonUnmarshaller implements
        Unmarshaller<DirectConnectGatewayAttachment, JsonUnmarshallerContext> {

    public DirectConnectGatewayAttachment unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DirectConnectGatewayAttachment directConnectGatewayAttachment = new DirectConnectGatewayAttachment();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("directConnectGatewayId")) {
                directConnectGatewayAttachment.setDirectConnectGatewayId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceId")) {
                directConnectGatewayAttachment.setVirtualInterfaceId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceRegion")) {
                directConnectGatewayAttachment.setVirtualInterfaceRegion(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceOwnerAccount")) {
                directConnectGatewayAttachment
                        .setVirtualInterfaceOwnerAccount(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("attachmentState")) {
                directConnectGatewayAttachment.setAttachmentState(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("attachmentType")) {
                directConnectGatewayAttachment.setAttachmentType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("stateChangeError")) {
                directConnectGatewayAttachment.setStateChangeError(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return directConnectGatewayAttachment;
    }

    private static DirectConnectGatewayAttachmentJsonUnmarshaller instance;

    public static DirectConnectGatewayAttachmentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DirectConnectGatewayAttachmentJsonUnmarshaller();
        return instance;
    }
}
