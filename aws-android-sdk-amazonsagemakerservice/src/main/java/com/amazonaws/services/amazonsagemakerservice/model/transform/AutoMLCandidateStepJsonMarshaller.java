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
 * JSON marshaller for POJO AutoMLCandidateStep
 */
class AutoMLCandidateStepJsonMarshaller {

    public void marshall(AutoMLCandidateStep autoMLCandidateStep, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (autoMLCandidateStep.getCandidateStepType() != null) {
            String candidateStepType = autoMLCandidateStep.getCandidateStepType();
            jsonWriter.name("CandidateStepType");
            jsonWriter.value(candidateStepType);
        }
        if (autoMLCandidateStep.getCandidateStepArn() != null) {
            String candidateStepArn = autoMLCandidateStep.getCandidateStepArn();
            jsonWriter.name("CandidateStepArn");
            jsonWriter.value(candidateStepArn);
        }
        if (autoMLCandidateStep.getCandidateStepName() != null) {
            String candidateStepName = autoMLCandidateStep.getCandidateStepName();
            jsonWriter.name("CandidateStepName");
            jsonWriter.value(candidateStepName);
        }
        jsonWriter.endObject();
    }

    private static AutoMLCandidateStepJsonMarshaller instance;

    public static AutoMLCandidateStepJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AutoMLCandidateStepJsonMarshaller();
        return instance;
    }
}
