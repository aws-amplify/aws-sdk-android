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
 * JSON marshaller for POJO DocumentGroup
 */
class DocumentGroupJsonMarshaller {

    public void marshall(DocumentGroup documentGroup, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (documentGroup.getType() != null) {
            String type = documentGroup.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (documentGroup.getSplitDocuments() != null) {
            java.util.List<SplitDocument> splitDocuments = documentGroup.getSplitDocuments();
            jsonWriter.name("SplitDocuments");
            jsonWriter.beginArray();
            for (SplitDocument splitDocumentsItem : splitDocuments) {
                if (splitDocumentsItem != null) {
                    SplitDocumentJsonMarshaller.getInstance().marshall(splitDocumentsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (documentGroup.getDetectedSignatures() != null) {
            java.util.List<DetectedSignature> detectedSignatures = documentGroup
                    .getDetectedSignatures();
            jsonWriter.name("DetectedSignatures");
            jsonWriter.beginArray();
            for (DetectedSignature detectedSignaturesItem : detectedSignatures) {
                if (detectedSignaturesItem != null) {
                    DetectedSignatureJsonMarshaller.getInstance().marshall(detectedSignaturesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (documentGroup.getUndetectedSignatures() != null) {
            java.util.List<UndetectedSignature> undetectedSignatures = documentGroup
                    .getUndetectedSignatures();
            jsonWriter.name("UndetectedSignatures");
            jsonWriter.beginArray();
            for (UndetectedSignature undetectedSignaturesItem : undetectedSignatures) {
                if (undetectedSignaturesItem != null) {
                    UndetectedSignatureJsonMarshaller.getInstance().marshall(
                            undetectedSignaturesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static DocumentGroupJsonMarshaller instance;

    public static DocumentGroupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DocumentGroupJsonMarshaller();
        return instance;
    }
}
