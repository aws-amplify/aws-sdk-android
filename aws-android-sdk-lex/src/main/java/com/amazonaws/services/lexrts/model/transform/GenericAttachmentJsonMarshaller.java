/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.lexrts.model.transform;

import com.amazonaws.services.lexrts.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO GenericAttachment
 */
class GenericAttachmentJsonMarshaller {

    public void marshall(GenericAttachment genericAttachment, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (genericAttachment.getTitle() != null) {
            String title = genericAttachment.getTitle();
            jsonWriter.name("title");
            jsonWriter.value(title);
        }
        if (genericAttachment.getSubTitle() != null) {
            String subTitle = genericAttachment.getSubTitle();
            jsonWriter.name("subTitle");
            jsonWriter.value(subTitle);
        }
        if (genericAttachment.getAttachmentLinkUrl() != null) {
            String attachmentLinkUrl = genericAttachment.getAttachmentLinkUrl();
            jsonWriter.name("attachmentLinkUrl");
            jsonWriter.value(attachmentLinkUrl);
        }
        if (genericAttachment.getImageUrl() != null) {
            String imageUrl = genericAttachment.getImageUrl();
            jsonWriter.name("imageUrl");
            jsonWriter.value(imageUrl);
        }
        if (genericAttachment.getButtons() != null) {
            java.util.List<Button> buttons = genericAttachment.getButtons();
            jsonWriter.name("buttons");
            jsonWriter.beginArray();
            for (Button buttonsItem : buttons) {
                if (buttonsItem != null) {
                    ButtonJsonMarshaller.getInstance().marshall(buttonsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static GenericAttachmentJsonMarshaller instance;

    public static GenericAttachmentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GenericAttachmentJsonMarshaller();
        return instance;
    }
}
