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
 * JSON marshaller for POJO Extraction
 */
class ExtractionJsonMarshaller {

    public void marshall(Extraction extraction, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (extraction.getLendingDocument() != null) {
            LendingDocument lendingDocument = extraction.getLendingDocument();
            jsonWriter.name("LendingDocument");
            LendingDocumentJsonMarshaller.getInstance().marshall(lendingDocument, jsonWriter);
        }
        if (extraction.getExpenseDocument() != null) {
            ExpenseDocument expenseDocument = extraction.getExpenseDocument();
            jsonWriter.name("ExpenseDocument");
            ExpenseDocumentJsonMarshaller.getInstance().marshall(expenseDocument, jsonWriter);
        }
        if (extraction.getIdentityDocument() != null) {
            IdentityDocument identityDocument = extraction.getIdentityDocument();
            jsonWriter.name("IdentityDocument");
            IdentityDocumentJsonMarshaller.getInstance().marshall(identityDocument, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ExtractionJsonMarshaller instance;

    public static ExtractionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExtractionJsonMarshaller();
        return instance;
    }
}
