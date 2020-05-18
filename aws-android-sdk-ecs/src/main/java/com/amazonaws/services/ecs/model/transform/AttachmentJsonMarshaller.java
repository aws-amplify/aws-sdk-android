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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Attachment
 */
class AttachmentJsonMarshaller {

    public void marshall(Attachment attachment, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (attachment.getId() != null) {
            String id = attachment.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (attachment.getType() != null) {
            String type = attachment.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (attachment.getStatus() != null) {
            String status = attachment.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (attachment.getDetails() != null) {
            java.util.List<KeyValuePair> details = attachment.getDetails();
            jsonWriter.name("details");
            jsonWriter.beginArray();
            for (KeyValuePair detailsItem : details) {
                if (detailsItem != null) {
                    KeyValuePairJsonMarshaller.getInstance().marshall(detailsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AttachmentJsonMarshaller instance;

    public static AttachmentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AttachmentJsonMarshaller();
        return instance;
    }
}
