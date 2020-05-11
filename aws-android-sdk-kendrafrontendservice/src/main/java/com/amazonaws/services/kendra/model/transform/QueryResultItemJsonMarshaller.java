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
 * JSON marshaller for POJO QueryResultItem
 */
class QueryResultItemJsonMarshaller {

    public void marshall(QueryResultItem queryResultItem, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (queryResultItem.getId() != null) {
            String id = queryResultItem.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (queryResultItem.getType() != null) {
            String type = queryResultItem.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (queryResultItem.getAdditionalAttributes() != null) {
            java.util.List<AdditionalResultAttribute> additionalAttributes = queryResultItem
                    .getAdditionalAttributes();
            jsonWriter.name("AdditionalAttributes");
            jsonWriter.beginArray();
            for (AdditionalResultAttribute additionalAttributesItem : additionalAttributes) {
                if (additionalAttributesItem != null) {
                    AdditionalResultAttributeJsonMarshaller.getInstance().marshall(
                            additionalAttributesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (queryResultItem.getDocumentId() != null) {
            String documentId = queryResultItem.getDocumentId();
            jsonWriter.name("DocumentId");
            jsonWriter.value(documentId);
        }
        if (queryResultItem.getDocumentTitle() != null) {
            TextWithHighlights documentTitle = queryResultItem.getDocumentTitle();
            jsonWriter.name("DocumentTitle");
            TextWithHighlightsJsonMarshaller.getInstance().marshall(documentTitle, jsonWriter);
        }
        if (queryResultItem.getDocumentExcerpt() != null) {
            TextWithHighlights documentExcerpt = queryResultItem.getDocumentExcerpt();
            jsonWriter.name("DocumentExcerpt");
            TextWithHighlightsJsonMarshaller.getInstance().marshall(documentExcerpt, jsonWriter);
        }
        if (queryResultItem.getDocumentURI() != null) {
            String documentURI = queryResultItem.getDocumentURI();
            jsonWriter.name("DocumentURI");
            jsonWriter.value(documentURI);
        }
        if (queryResultItem.getDocumentAttributes() != null) {
            java.util.List<DocumentAttribute> documentAttributes = queryResultItem
                    .getDocumentAttributes();
            jsonWriter.name("DocumentAttributes");
            jsonWriter.beginArray();
            for (DocumentAttribute documentAttributesItem : documentAttributes) {
                if (documentAttributesItem != null) {
                    DocumentAttributeJsonMarshaller.getInstance().marshall(documentAttributesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static QueryResultItemJsonMarshaller instance;

    public static QueryResultItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new QueryResultItemJsonMarshaller();
        return instance;
    }
}
