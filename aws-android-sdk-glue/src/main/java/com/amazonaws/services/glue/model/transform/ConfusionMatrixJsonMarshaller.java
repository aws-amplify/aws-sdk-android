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
 * JSON marshaller for POJO ConfusionMatrix
 */
class ConfusionMatrixJsonMarshaller {

    public void marshall(ConfusionMatrix confusionMatrix, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (confusionMatrix.getNumTruePositives() != null) {
            Long numTruePositives = confusionMatrix.getNumTruePositives();
            jsonWriter.name("NumTruePositives");
            jsonWriter.value(numTruePositives);
        }
        if (confusionMatrix.getNumFalsePositives() != null) {
            Long numFalsePositives = confusionMatrix.getNumFalsePositives();
            jsonWriter.name("NumFalsePositives");
            jsonWriter.value(numFalsePositives);
        }
        if (confusionMatrix.getNumTrueNegatives() != null) {
            Long numTrueNegatives = confusionMatrix.getNumTrueNegatives();
            jsonWriter.name("NumTrueNegatives");
            jsonWriter.value(numTrueNegatives);
        }
        if (confusionMatrix.getNumFalseNegatives() != null) {
            Long numFalseNegatives = confusionMatrix.getNumFalseNegatives();
            jsonWriter.name("NumFalseNegatives");
            jsonWriter.value(numFalseNegatives);
        }
        jsonWriter.endObject();
    }

    private static ConfusionMatrixJsonMarshaller instance;

    public static ConfusionMatrixJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConfusionMatrixJsonMarshaller();
        return instance;
    }
}
