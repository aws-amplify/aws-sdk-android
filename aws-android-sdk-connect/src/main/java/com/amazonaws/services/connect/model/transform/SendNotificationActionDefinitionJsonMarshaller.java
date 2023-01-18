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
 * JSON marshaller for POJO SendNotificationActionDefinition
 */
class SendNotificationActionDefinitionJsonMarshaller {

    public void marshall(SendNotificationActionDefinition sendNotificationActionDefinition,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (sendNotificationActionDefinition.getDeliveryMethod() != null) {
            String deliveryMethod = sendNotificationActionDefinition.getDeliveryMethod();
            jsonWriter.name("DeliveryMethod");
            jsonWriter.value(deliveryMethod);
        }
        if (sendNotificationActionDefinition.getSubject() != null) {
            String subject = sendNotificationActionDefinition.getSubject();
            jsonWriter.name("Subject");
            jsonWriter.value(subject);
        }
        if (sendNotificationActionDefinition.getContent() != null) {
            String content = sendNotificationActionDefinition.getContent();
            jsonWriter.name("Content");
            jsonWriter.value(content);
        }
        if (sendNotificationActionDefinition.getContentType() != null) {
            String contentType = sendNotificationActionDefinition.getContentType();
            jsonWriter.name("ContentType");
            jsonWriter.value(contentType);
        }
        if (sendNotificationActionDefinition.getRecipient() != null) {
            NotificationRecipientType recipient = sendNotificationActionDefinition.getRecipient();
            jsonWriter.name("Recipient");
            NotificationRecipientTypeJsonMarshaller.getInstance().marshall(recipient, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static SendNotificationActionDefinitionJsonMarshaller instance;

    public static SendNotificationActionDefinitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SendNotificationActionDefinitionJsonMarshaller();
        return instance;
    }
}
