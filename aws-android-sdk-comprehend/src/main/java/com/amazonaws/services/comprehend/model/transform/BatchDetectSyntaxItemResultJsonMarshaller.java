/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BatchDetectSyntaxItemResult
 */
class BatchDetectSyntaxItemResultJsonMarshaller {

    public void marshall(BatchDetectSyntaxItemResult batchDetectSyntaxItemResult,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (batchDetectSyntaxItemResult.getIndex() != null) {
            Integer index = batchDetectSyntaxItemResult.getIndex();
            jsonWriter.name("Index");
            jsonWriter.value(index);
        }
        if (batchDetectSyntaxItemResult.getSyntaxTokens() != null) {
            java.util.List<SyntaxToken> syntaxTokens = batchDetectSyntaxItemResult
                    .getSyntaxTokens();
            jsonWriter.name("SyntaxTokens");
            jsonWriter.beginArray();
            for (SyntaxToken syntaxTokensItem : syntaxTokens) {
                if (syntaxTokensItem != null) {
                    SyntaxTokenJsonMarshaller.getInstance().marshall(syntaxTokensItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static BatchDetectSyntaxItemResultJsonMarshaller instance;

    public static BatchDetectSyntaxItemResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BatchDetectSyntaxItemResultJsonMarshaller();
        return instance;
    }
}
