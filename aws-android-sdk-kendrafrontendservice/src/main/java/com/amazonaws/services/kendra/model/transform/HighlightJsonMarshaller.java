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
 * JSON marshaller for POJO Highlight
 */
class HighlightJsonMarshaller {

    public void marshall(Highlight highlight, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (highlight.getBeginOffset() != null) {
            Integer beginOffset = highlight.getBeginOffset();
            jsonWriter.name("BeginOffset");
            jsonWriter.value(beginOffset);
        }
        if (highlight.getEndOffset() != null) {
            Integer endOffset = highlight.getEndOffset();
            jsonWriter.name("EndOffset");
            jsonWriter.value(endOffset);
        }
        if (highlight.getTopAnswer() != null) {
            Boolean topAnswer = highlight.getTopAnswer();
            jsonWriter.name("TopAnswer");
            jsonWriter.value(topAnswer);
        }
        jsonWriter.endObject();
    }

    private static HighlightJsonMarshaller instance;

    public static HighlightJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HighlightJsonMarshaller();
        return instance;
    }
}
