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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PiiEntity
 */
class PiiEntityJsonMarshaller {

    public void marshall(PiiEntity piiEntity, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (piiEntity.getScore() != null) {
            Float score = piiEntity.getScore();
            jsonWriter.name("Score");
            jsonWriter.value(score);
        }
        if (piiEntity.getType() != null) {
            String type = piiEntity.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (piiEntity.getBeginOffset() != null) {
            Integer beginOffset = piiEntity.getBeginOffset();
            jsonWriter.name("BeginOffset");
            jsonWriter.value(beginOffset);
        }
        if (piiEntity.getEndOffset() != null) {
            Integer endOffset = piiEntity.getEndOffset();
            jsonWriter.name("EndOffset");
            jsonWriter.value(endOffset);
        }
        jsonWriter.endObject();
    }

    private static PiiEntityJsonMarshaller instance;

    public static PiiEntityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PiiEntityJsonMarshaller();
        return instance;
    }
}
