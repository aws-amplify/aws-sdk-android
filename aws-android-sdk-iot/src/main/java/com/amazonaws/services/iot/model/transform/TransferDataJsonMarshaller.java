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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TransferData
 */
class TransferDataJsonMarshaller {

    public void marshall(TransferData transferData, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (transferData.getTransferMessage() != null) {
            String transferMessage = transferData.getTransferMessage();
            jsonWriter.name("transferMessage");
            jsonWriter.value(transferMessage);
        }
        if (transferData.getRejectReason() != null) {
            String rejectReason = transferData.getRejectReason();
            jsonWriter.name("rejectReason");
            jsonWriter.value(rejectReason);
        }
        if (transferData.getTransferDate() != null) {
            java.util.Date transferDate = transferData.getTransferDate();
            jsonWriter.name("transferDate");
            jsonWriter.value(transferDate);
        }
        if (transferData.getAcceptDate() != null) {
            java.util.Date acceptDate = transferData.getAcceptDate();
            jsonWriter.name("acceptDate");
            jsonWriter.value(acceptDate);
        }
        if (transferData.getRejectDate() != null) {
            java.util.Date rejectDate = transferData.getRejectDate();
            jsonWriter.name("rejectDate");
            jsonWriter.value(rejectDate);
        }
        jsonWriter.endObject();
    }

    private static TransferDataJsonMarshaller instance;

    public static TransferDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TransferDataJsonMarshaller();
        return instance;
    }
}
