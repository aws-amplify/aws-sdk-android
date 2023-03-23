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
 * JSON marshaller for POJO LendingSummary
 */
class LendingSummaryJsonMarshaller {

    public void marshall(LendingSummary lendingSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (lendingSummary.getDocumentGroups() != null) {
            java.util.List<DocumentGroup> documentGroups = lendingSummary.getDocumentGroups();
            jsonWriter.name("DocumentGroups");
            jsonWriter.beginArray();
            for (DocumentGroup documentGroupsItem : documentGroups) {
                if (documentGroupsItem != null) {
                    DocumentGroupJsonMarshaller.getInstance().marshall(documentGroupsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (lendingSummary.getUndetectedDocumentTypes() != null) {
            java.util.List<String> undetectedDocumentTypes = lendingSummary
                    .getUndetectedDocumentTypes();
            jsonWriter.name("UndetectedDocumentTypes");
            jsonWriter.beginArray();
            for (String undetectedDocumentTypesItem : undetectedDocumentTypes) {
                if (undetectedDocumentTypesItem != null) {
                    jsonWriter.value(undetectedDocumentTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static LendingSummaryJsonMarshaller instance;

    public static LendingSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LendingSummaryJsonMarshaller();
        return instance;
    }
}
