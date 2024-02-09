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

package com.amazonaws.services.transcribe.model.transform;

import com.amazonaws.services.transcribe.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MedicalScribeJobSummary
 */
class MedicalScribeJobSummaryJsonMarshaller {

    public void marshall(MedicalScribeJobSummary medicalScribeJobSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (medicalScribeJobSummary.getMedicalScribeJobName() != null) {
            String medicalScribeJobName = medicalScribeJobSummary.getMedicalScribeJobName();
            jsonWriter.name("MedicalScribeJobName");
            jsonWriter.value(medicalScribeJobName);
        }
        if (medicalScribeJobSummary.getCreationTime() != null) {
            java.util.Date creationTime = medicalScribeJobSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (medicalScribeJobSummary.getStartTime() != null) {
            java.util.Date startTime = medicalScribeJobSummary.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (medicalScribeJobSummary.getCompletionTime() != null) {
            java.util.Date completionTime = medicalScribeJobSummary.getCompletionTime();
            jsonWriter.name("CompletionTime");
            jsonWriter.value(completionTime);
        }
        if (medicalScribeJobSummary.getLanguageCode() != null) {
            String languageCode = medicalScribeJobSummary.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (medicalScribeJobSummary.getMedicalScribeJobStatus() != null) {
            String medicalScribeJobStatus = medicalScribeJobSummary.getMedicalScribeJobStatus();
            jsonWriter.name("MedicalScribeJobStatus");
            jsonWriter.value(medicalScribeJobStatus);
        }
        if (medicalScribeJobSummary.getFailureReason() != null) {
            String failureReason = medicalScribeJobSummary.getFailureReason();
            jsonWriter.name("FailureReason");
            jsonWriter.value(failureReason);
        }
        jsonWriter.endObject();
    }

    private static MedicalScribeJobSummaryJsonMarshaller instance;

    public static MedicalScribeJobSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MedicalScribeJobSummaryJsonMarshaller();
        return instance;
    }
}
