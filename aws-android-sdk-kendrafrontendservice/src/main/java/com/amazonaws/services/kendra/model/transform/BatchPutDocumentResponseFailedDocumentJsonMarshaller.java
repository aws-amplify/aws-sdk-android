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

package com.amazonaws.services.kendra.model.transform;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BatchPutDocumentResponseFailedDocument
 */
class BatchPutDocumentResponseFailedDocumentJsonMarshaller {

    public void marshall(
            BatchPutDocumentResponseFailedDocument batchPutDocumentResponseFailedDocument,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (batchPutDocumentResponseFailedDocument.getId() != null) {
            String id = batchPutDocumentResponseFailedDocument.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (batchPutDocumentResponseFailedDocument.getErrorCode() != null) {
            String errorCode = batchPutDocumentResponseFailedDocument.getErrorCode();
            jsonWriter.name("ErrorCode");
            jsonWriter.value(errorCode);
        }
        if (batchPutDocumentResponseFailedDocument.getErrorMessage() != null) {
            String errorMessage = batchPutDocumentResponseFailedDocument.getErrorMessage();
            jsonWriter.name("ErrorMessage");
            jsonWriter.value(errorMessage);
        }
        jsonWriter.endObject();
    }

    private static BatchPutDocumentResponseFailedDocumentJsonMarshaller instance;

    public static BatchPutDocumentResponseFailedDocumentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BatchPutDocumentResponseFailedDocumentJsonMarshaller();
        return instance;
    }
}
