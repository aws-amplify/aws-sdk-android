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
 * JSON marshaller for POJO TextWithHighlights
 */
class TextWithHighlightsJsonMarshaller {

    public void marshall(TextWithHighlights textWithHighlights, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (textWithHighlights.getText() != null) {
            String text = textWithHighlights.getText();
            jsonWriter.name("Text");
            jsonWriter.value(text);
        }
        if (textWithHighlights.getHighlights() != null) {
            java.util.List<Highlight> highlights = textWithHighlights.getHighlights();
            jsonWriter.name("Highlights");
            jsonWriter.beginArray();
            for (Highlight highlightsItem : highlights) {
                if (highlightsItem != null) {
                    HighlightJsonMarshaller.getInstance().marshall(highlightsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static TextWithHighlightsJsonMarshaller instance;

    public static TextWithHighlightsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TextWithHighlightsJsonMarshaller();
        return instance;
    }
}
