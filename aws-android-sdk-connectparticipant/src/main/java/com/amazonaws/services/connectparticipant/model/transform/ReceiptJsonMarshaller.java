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
 * JSON marshaller for POJO Receipt
 */
class ReceiptJsonMarshaller {

    public void marshall(Receipt receipt, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (receipt.getDeliveredTimestamp() != null) {
            String deliveredTimestamp = receipt.getDeliveredTimestamp();
            jsonWriter.name("DeliveredTimestamp");
            jsonWriter.value(deliveredTimestamp);
        }
        if (receipt.getReadTimestamp() != null) {
            String readTimestamp = receipt.getReadTimestamp();
            jsonWriter.name("ReadTimestamp");
            jsonWriter.value(readTimestamp);
        }
        if (receipt.getRecipientParticipantId() != null) {
            String recipientParticipantId = receipt.getRecipientParticipantId();
            jsonWriter.name("RecipientParticipantId");
            jsonWriter.value(recipientParticipantId);
        }
        jsonWriter.endObject();
    }

    private static ReceiptJsonMarshaller instance;

    public static ReceiptJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReceiptJsonMarshaller();
        return instance;
    }
}
