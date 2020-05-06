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

package com.amazonaws.services.comprehendmedical.model.transform;

import com.amazonaws.services.comprehendmedical.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ICD10CMConcept
 */
class ICD10CMConceptJsonMarshaller {

    public void marshall(ICD10CMConcept iCD10CMConcept, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (iCD10CMConcept.getDescription() != null) {
            String description = iCD10CMConcept.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (iCD10CMConcept.getCode() != null) {
            String code = iCD10CMConcept.getCode();
            jsonWriter.name("Code");
            jsonWriter.value(code);
        }
        if (iCD10CMConcept.getScore() != null) {
            Float score = iCD10CMConcept.getScore();
            jsonWriter.name("Score");
            jsonWriter.value(score);
        }
        jsonWriter.endObject();
    }

    private static ICD10CMConceptJsonMarshaller instance;

    public static ICD10CMConceptJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ICD10CMConceptJsonMarshaller();
        return instance;
    }
}
