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
 * JSON unmarshaller for POJO Item
 */
class ItemJsonUnmarshaller implements Unmarshaller<Item, JsonUnmarshallerContext> {

    public Item unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Item item = new Item();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AbsoluteTime")) {
                item.setAbsoluteTime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Content")) {
                item.setContent(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ContentType")) {
                item.setContentType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                item.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                item.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParticipantId")) {
                item.setParticipantId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DisplayName")) {
                item.setDisplayName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParticipantRole")) {
                item.setParticipantRole(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Attachments")) {
                item.setAttachments(new ListUnmarshaller<AttachmentItem>(
                        AttachmentItemJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return item;
    }

    private static ItemJsonUnmarshaller instance;

    public static ItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ItemJsonUnmarshaller();
        return instance;
    }
}
