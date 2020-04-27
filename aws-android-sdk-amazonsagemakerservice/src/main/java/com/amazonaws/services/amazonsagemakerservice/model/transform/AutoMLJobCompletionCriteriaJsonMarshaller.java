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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AutoMLJobCompletionCriteria
 */
class AutoMLJobCompletionCriteriaJsonMarshaller {

    public void marshall(AutoMLJobCompletionCriteria autoMLJobCompletionCriteria,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (autoMLJobCompletionCriteria.getMaxCandidates() != null) {
            Integer maxCandidates = autoMLJobCompletionCriteria.getMaxCandidates();
            jsonWriter.name("MaxCandidates");
            jsonWriter.value(maxCandidates);
        }
        if (autoMLJobCompletionCriteria.getMaxRuntimePerTrainingJobInSeconds() != null) {
            Integer maxRuntimePerTrainingJobInSeconds = autoMLJobCompletionCriteria
                    .getMaxRuntimePerTrainingJobInSeconds();
            jsonWriter.name("MaxRuntimePerTrainingJobInSeconds");
            jsonWriter.value(maxRuntimePerTrainingJobInSeconds);
        }
        if (autoMLJobCompletionCriteria.getMaxAutoMLJobRuntimeInSeconds() != null) {
            Integer maxAutoMLJobRuntimeInSeconds = autoMLJobCompletionCriteria
                    .getMaxAutoMLJobRuntimeInSeconds();
            jsonWriter.name("MaxAutoMLJobRuntimeInSeconds");
            jsonWriter.value(maxAutoMLJobRuntimeInSeconds);
        }
        jsonWriter.endObject();
    }

    private static AutoMLJobCompletionCriteriaJsonMarshaller instance;

    public static AutoMLJobCompletionCriteriaJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AutoMLJobCompletionCriteriaJsonMarshaller();
        return instance;
    }
}
