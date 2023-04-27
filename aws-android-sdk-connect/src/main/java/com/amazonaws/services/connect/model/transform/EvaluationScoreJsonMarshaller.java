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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EvaluationScore
 */
class EvaluationScoreJsonMarshaller {

    public void marshall(EvaluationScore evaluationScore, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (evaluationScore.getPercentage() != null) {
            Double percentage = evaluationScore.getPercentage();
            jsonWriter.name("Percentage");
            jsonWriter.value(percentage);
        }
        if (evaluationScore.getNotApplicable() != null) {
            Boolean notApplicable = evaluationScore.getNotApplicable();
            jsonWriter.name("NotApplicable");
            jsonWriter.value(notApplicable);
        }
        if (evaluationScore.getAutomaticFail() != null) {
            Boolean automaticFail = evaluationScore.getAutomaticFail();
            jsonWriter.name("AutomaticFail");
            jsonWriter.value(automaticFail);
        }
        jsonWriter.endObject();
    }

    private static EvaluationScoreJsonMarshaller instance;

    public static EvaluationScoreJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationScoreJsonMarshaller();
        return instance;
    }
}
