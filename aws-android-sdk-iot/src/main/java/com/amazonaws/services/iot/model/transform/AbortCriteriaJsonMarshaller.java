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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AbortCriteria
 */
class AbortCriteriaJsonMarshaller {

    public void marshall(AbortCriteria abortCriteria, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (abortCriteria.getFailureType() != null) {
            String failureType = abortCriteria.getFailureType();
            jsonWriter.name("failureType");
            jsonWriter.value(failureType);
        }
        if (abortCriteria.getAction() != null) {
            String action = abortCriteria.getAction();
            jsonWriter.name("action");
            jsonWriter.value(action);
        }
        if (abortCriteria.getThresholdPercentage() != null) {
            Double thresholdPercentage = abortCriteria.getThresholdPercentage();
            jsonWriter.name("thresholdPercentage");
            jsonWriter.value(thresholdPercentage);
        }
        if (abortCriteria.getMinNumberOfExecutedThings() != null) {
            Integer minNumberOfExecutedThings = abortCriteria.getMinNumberOfExecutedThings();
            jsonWriter.name("minNumberOfExecutedThings");
            jsonWriter.value(minNumberOfExecutedThings);
        }
        jsonWriter.endObject();
    }

    private static AbortCriteriaJsonMarshaller instance;

    public static AbortCriteriaJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AbortCriteriaJsonMarshaller();
        return instance;
    }
}
