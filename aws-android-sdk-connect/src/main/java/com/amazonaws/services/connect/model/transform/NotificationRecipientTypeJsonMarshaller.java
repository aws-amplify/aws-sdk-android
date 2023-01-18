/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NotificationRecipientType
 */
class NotificationRecipientTypeJsonMarshaller {

    public void marshall(NotificationRecipientType notificationRecipientType,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (notificationRecipientType.getUserTags() != null) {
            java.util.Map<String, String> userTags = notificationRecipientType.getUserTags();
            jsonWriter.name("UserTags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> userTagsEntry : userTags.entrySet()) {
                String userTagsValue = userTagsEntry.getValue();
                if (userTagsValue != null) {
                    jsonWriter.name(userTagsEntry.getKey());
                    jsonWriter.value(userTagsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (notificationRecipientType.getUserIds() != null) {
            java.util.List<String> userIds = notificationRecipientType.getUserIds();
            jsonWriter.name("UserIds");
            jsonWriter.beginArray();
            for (String userIdsItem : userIds) {
                if (userIdsItem != null) {
                    jsonWriter.value(userIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static NotificationRecipientTypeJsonMarshaller instance;

    public static NotificationRecipientTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NotificationRecipientTypeJsonMarshaller();
        return instance;
    }
}
