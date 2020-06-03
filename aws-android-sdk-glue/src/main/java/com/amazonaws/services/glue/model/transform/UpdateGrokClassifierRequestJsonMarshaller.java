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
 * JSON marshaller for POJO UpdateGrokClassifierRequest
 */
class UpdateGrokClassifierRequestJsonMarshaller {

    public void marshall(UpdateGrokClassifierRequest updateGrokClassifierRequest,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (updateGrokClassifierRequest.getName() != null) {
            String name = updateGrokClassifierRequest.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (updateGrokClassifierRequest.getClassification() != null) {
            String classification = updateGrokClassifierRequest.getClassification();
            jsonWriter.name("Classification");
            jsonWriter.value(classification);
        }
        if (updateGrokClassifierRequest.getGrokPattern() != null) {
            String grokPattern = updateGrokClassifierRequest.getGrokPattern();
            jsonWriter.name("GrokPattern");
            jsonWriter.value(grokPattern);
        }
        if (updateGrokClassifierRequest.getCustomPatterns() != null) {
            String customPatterns = updateGrokClassifierRequest.getCustomPatterns();
            jsonWriter.name("CustomPatterns");
            jsonWriter.value(customPatterns);
        }
        jsonWriter.endObject();
    }

    private static UpdateGrokClassifierRequestJsonMarshaller instance;

    public static UpdateGrokClassifierRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UpdateGrokClassifierRequestJsonMarshaller();
        return instance;
    }
}
