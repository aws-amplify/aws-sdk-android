/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connectparticipant.model.transform;

import com.amazonaws.services.connectparticipant.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AttachmentItem
 */
class AttachmentItemJsonUnmarshaller implements
        Unmarshaller<AttachmentItem, JsonUnmarshallerContext> {

    public AttachmentItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AttachmentItem attachmentItem = new AttachmentItem();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ContentType")) {
                attachmentItem.setContentType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AttachmentId")) {
                attachmentItem.setAttachmentId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AttachmentName")) {
                attachmentItem.setAttachmentName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                attachmentItem.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return attachmentItem;
    }

    private static AttachmentItemJsonUnmarshaller instance;

    public static AttachmentItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AttachmentItemJsonUnmarshaller();
        return instance;
    }
}
