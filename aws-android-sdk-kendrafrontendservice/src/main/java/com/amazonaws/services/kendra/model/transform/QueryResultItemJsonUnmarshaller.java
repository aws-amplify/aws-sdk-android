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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO QueryResultItem
 */
class QueryResultItemJsonUnmarshaller implements
        Unmarshaller<QueryResultItem, JsonUnmarshallerContext> {

    public QueryResultItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        QueryResultItem queryResultItem = new QueryResultItem();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Id")) {
                queryResultItem.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                queryResultItem.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AdditionalAttributes")) {
                queryResultItem
                        .setAdditionalAttributes(new ListUnmarshaller<AdditionalResultAttribute>(
                                AdditionalResultAttributeJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DocumentId")) {
                queryResultItem.setDocumentId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DocumentTitle")) {
                queryResultItem.setDocumentTitle(TextWithHighlightsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DocumentExcerpt")) {
                queryResultItem.setDocumentExcerpt(TextWithHighlightsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DocumentURI")) {
                queryResultItem.setDocumentURI(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DocumentAttributes")) {
                queryResultItem.setDocumentAttributes(new ListUnmarshaller<DocumentAttribute>(
                        DocumentAttributeJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return queryResultItem;
    }

    private static QueryResultItemJsonUnmarshaller instance;

    public static QueryResultItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new QueryResultItemJsonUnmarshaller();
        return instance;
    }
}
