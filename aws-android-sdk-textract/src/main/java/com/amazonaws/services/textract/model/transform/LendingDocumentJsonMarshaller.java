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

package com.amazonaws.services.textract.model.transform;

import com.amazonaws.services.textract.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LendingDocument
 */
class LendingDocumentJsonMarshaller {

    public void marshall(LendingDocument lendingDocument, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (lendingDocument.getLendingFields() != null) {
            java.util.List<LendingField> lendingFields = lendingDocument.getLendingFields();
            jsonWriter.name("LendingFields");
            jsonWriter.beginArray();
            for (LendingField lendingFieldsItem : lendingFields) {
                if (lendingFieldsItem != null) {
                    LendingFieldJsonMarshaller.getInstance()
                            .marshall(lendingFieldsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (lendingDocument.getSignatureDetections() != null) {
            java.util.List<SignatureDetection> signatureDetections = lendingDocument
                    .getSignatureDetections();
            jsonWriter.name("SignatureDetections");
            jsonWriter.beginArray();
            for (SignatureDetection signatureDetectionsItem : signatureDetections) {
                if (signatureDetectionsItem != null) {
                    SignatureDetectionJsonMarshaller.getInstance().marshall(
                            signatureDetectionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static LendingDocumentJsonMarshaller instance;

    public static LendingDocumentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LendingDocumentJsonMarshaller();
        return instance;
    }
}
