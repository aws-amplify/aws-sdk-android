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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DirectConnectGatewayAttachment
 */
class DirectConnectGatewayAttachmentJsonMarshaller {

    public void marshall(DirectConnectGatewayAttachment directConnectGatewayAttachment,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (directConnectGatewayAttachment.getDirectConnectGatewayId() != null) {
            String directConnectGatewayId = directConnectGatewayAttachment
                    .getDirectConnectGatewayId();
            jsonWriter.name("directConnectGatewayId");
            jsonWriter.value(directConnectGatewayId);
        }
        if (directConnectGatewayAttachment.getVirtualInterfaceId() != null) {
            String virtualInterfaceId = directConnectGatewayAttachment.getVirtualInterfaceId();
            jsonWriter.name("virtualInterfaceId");
            jsonWriter.value(virtualInterfaceId);
        }
        if (directConnectGatewayAttachment.getVirtualInterfaceRegion() != null) {
            String virtualInterfaceRegion = directConnectGatewayAttachment
                    .getVirtualInterfaceRegion();
            jsonWriter.name("virtualInterfaceRegion");
            jsonWriter.value(virtualInterfaceRegion);
        }
        if (directConnectGatewayAttachment.getVirtualInterfaceOwnerAccount() != null) {
            String virtualInterfaceOwnerAccount = directConnectGatewayAttachment
                    .getVirtualInterfaceOwnerAccount();
            jsonWriter.name("virtualInterfaceOwnerAccount");
            jsonWriter.value(virtualInterfaceOwnerAccount);
        }
        if (directConnectGatewayAttachment.getAttachmentState() != null) {
            String attachmentState = directConnectGatewayAttachment.getAttachmentState();
            jsonWriter.name("attachmentState");
            jsonWriter.value(attachmentState);
        }
        if (directConnectGatewayAttachment.getAttachmentType() != null) {
            String attachmentType = directConnectGatewayAttachment.getAttachmentType();
            jsonWriter.name("attachmentType");
            jsonWriter.value(attachmentType);
        }
        if (directConnectGatewayAttachment.getStateChangeError() != null) {
            String stateChangeError = directConnectGatewayAttachment.getStateChangeError();
            jsonWriter.name("stateChangeError");
            jsonWriter.value(stateChangeError);
        }
        jsonWriter.endObject();
    }

    private static DirectConnectGatewayAttachmentJsonMarshaller instance;

    public static DirectConnectGatewayAttachmentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DirectConnectGatewayAttachmentJsonMarshaller();
        return instance;
    }
}
