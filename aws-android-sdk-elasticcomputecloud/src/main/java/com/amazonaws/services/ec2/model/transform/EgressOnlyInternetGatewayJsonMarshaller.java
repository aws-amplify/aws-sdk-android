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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EgressOnlyInternetGateway
 */
class EgressOnlyInternetGatewayJsonMarshaller {

    public void marshall(EgressOnlyInternetGateway egressOnlyInternetGateway,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (egressOnlyInternetGateway.getAttachments() != null) {
            java.util.List<InternetGatewayAttachment> attachments = egressOnlyInternetGateway
                    .getAttachments();
            jsonWriter.name("Attachments");
            jsonWriter.beginArray();
            for (InternetGatewayAttachment attachmentsItem : attachments) {
                if (attachmentsItem != null) {
                    InternetGatewayAttachmentJsonMarshaller.getInstance().marshall(attachmentsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (egressOnlyInternetGateway.getEgressOnlyInternetGatewayId() != null) {
            String egressOnlyInternetGatewayId = egressOnlyInternetGateway
                    .getEgressOnlyInternetGatewayId();
            jsonWriter.name("EgressOnlyInternetGatewayId");
            jsonWriter.value(egressOnlyInternetGatewayId);
        }
        if (egressOnlyInternetGateway.getTags() != null) {
            java.util.List<Tag> tags = egressOnlyInternetGateway.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static EgressOnlyInternetGatewayJsonMarshaller instance;

    public static EgressOnlyInternetGatewayJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EgressOnlyInternetGatewayJsonMarshaller();
        return instance;
    }
}
