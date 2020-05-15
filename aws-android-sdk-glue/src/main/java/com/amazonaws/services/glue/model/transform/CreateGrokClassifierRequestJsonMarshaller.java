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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CreateGrokClassifierRequest
 */
class CreateGrokClassifierRequestJsonMarshaller {

    public void marshall(CreateGrokClassifierRequest createGrokClassifierRequest,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (createGrokClassifierRequest.getClassification() != null) {
            String classification = createGrokClassifierRequest.getClassification();
            jsonWriter.name("Classification");
            jsonWriter.value(classification);
        }
        if (createGrokClassifierRequest.getName() != null) {
            String name = createGrokClassifierRequest.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (createGrokClassifierRequest.getGrokPattern() != null) {
            String grokPattern = createGrokClassifierRequest.getGrokPattern();
            jsonWriter.name("GrokPattern");
            jsonWriter.value(grokPattern);
        }
        if (createGrokClassifierRequest.getCustomPatterns() != null) {
            String customPatterns = createGrokClassifierRequest.getCustomPatterns();
            jsonWriter.name("CustomPatterns");
            jsonWriter.value(customPatterns);
        }
        jsonWriter.endObject();
    }

    private static CreateGrokClassifierRequestJsonMarshaller instance;

    public static CreateGrokClassifierRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CreateGrokClassifierRequestJsonMarshaller();
        return instance;
    }
}
