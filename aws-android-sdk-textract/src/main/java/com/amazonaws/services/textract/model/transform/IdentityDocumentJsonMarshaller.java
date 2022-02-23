/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO IdentityDocument
 */
class IdentityDocumentJsonMarshaller {

    public void marshall(IdentityDocument identityDocument, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (identityDocument.getDocumentIndex() != null) {
            Integer documentIndex = identityDocument.getDocumentIndex();
            jsonWriter.name("DocumentIndex");
            jsonWriter.value(documentIndex);
        }
        if (identityDocument.getIdentityDocumentFields() != null) {
            java.util.List<IdentityDocumentField> identityDocumentFields = identityDocument
                    .getIdentityDocumentFields();
            jsonWriter.name("IdentityDocumentFields");
            jsonWriter.beginArray();
            for (IdentityDocumentField identityDocumentFieldsItem : identityDocumentFields) {
                if (identityDocumentFieldsItem != null) {
                    IdentityDocumentFieldJsonMarshaller.getInstance().marshall(
                            identityDocumentFieldsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static IdentityDocumentJsonMarshaller instance;

    public static IdentityDocumentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IdentityDocumentJsonMarshaller();
        return instance;
    }
}
