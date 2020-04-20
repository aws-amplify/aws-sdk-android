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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FindMatchesParameters
 */
class FindMatchesParametersJsonMarshaller {

    public void marshall(FindMatchesParameters findMatchesParameters, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (findMatchesParameters.getPrimaryKeyColumnName() != null) {
            String primaryKeyColumnName = findMatchesParameters.getPrimaryKeyColumnName();
            jsonWriter.name("PrimaryKeyColumnName");
            jsonWriter.value(primaryKeyColumnName);
        }
        if (findMatchesParameters.getPrecisionRecallTradeoff() != null) {
            Double precisionRecallTradeoff = findMatchesParameters.getPrecisionRecallTradeoff();
            jsonWriter.name("PrecisionRecallTradeoff");
            jsonWriter.value(precisionRecallTradeoff);
        }
        if (findMatchesParameters.getAccuracyCostTradeoff() != null) {
            Double accuracyCostTradeoff = findMatchesParameters.getAccuracyCostTradeoff();
            jsonWriter.name("AccuracyCostTradeoff");
            jsonWriter.value(accuracyCostTradeoff);
        }
        if (findMatchesParameters.getEnforceProvidedLabels() != null) {
            Boolean enforceProvidedLabels = findMatchesParameters.getEnforceProvidedLabels();
            jsonWriter.name("EnforceProvidedLabels");
            jsonWriter.value(enforceProvidedLabels);
        }
        jsonWriter.endObject();
    }

    private static FindMatchesParametersJsonMarshaller instance;

    public static FindMatchesParametersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FindMatchesParametersJsonMarshaller();
        return instance;
    }
}
