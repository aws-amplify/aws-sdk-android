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

package com.amazonaws.services.connectparticipant.model.transform;

import com.amazonaws.services.connectparticipant.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MessageMetadata
 */
class MessageMetadataJsonMarshaller {

    public void marshall(MessageMetadata messageMetadata, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (messageMetadata.getMessageId() != null) {
            String messageId = messageMetadata.getMessageId();
            jsonWriter.name("MessageId");
            jsonWriter.value(messageId);
        }
        if (messageMetadata.getReceipts() != null) {
            java.util.List<Receipt> receipts = messageMetadata.getReceipts();
            jsonWriter.name("Receipts");
            jsonWriter.beginArray();
            for (Receipt receiptsItem : receipts) {
                if (receiptsItem != null) {
                    ReceiptJsonMarshaller.getInstance().marshall(receiptsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static MessageMetadataJsonMarshaller instance;

    public static MessageMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MessageMetadataJsonMarshaller();
        return instance;
    }
}
