/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO MedicalTranscriptionJobSummary
 */
class MedicalTranscriptionJobSummaryJsonMarshaller {

    public void marshall(MedicalTranscriptionJobSummary medicalTranscriptionJobSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (medicalTranscriptionJobSummary.getMedicalTranscriptionJobName() != null) {
            String medicalTranscriptionJobName = medicalTranscriptionJobSummary
                    .getMedicalTranscriptionJobName();
            jsonWriter.name("MedicalTranscriptionJobName");
            jsonWriter.value(medicalTranscriptionJobName);
        }
        if (medicalTranscriptionJobSummary.getCreationTime() != null) {
            java.util.Date creationTime = medicalTranscriptionJobSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (medicalTranscriptionJobSummary.getStartTime() != null) {
            java.util.Date startTime = medicalTranscriptionJobSummary.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (medicalTranscriptionJobSummary.getCompletionTime() != null) {
            java.util.Date completionTime = medicalTranscriptionJobSummary.getCompletionTime();
            jsonWriter.name("CompletionTime");
            jsonWriter.value(completionTime);
        }
        if (medicalTranscriptionJobSummary.getLanguageCode() != null) {
            String languageCode = medicalTranscriptionJobSummary.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (medicalTranscriptionJobSummary.getTranscriptionJobStatus() != null) {
            String transcriptionJobStatus = medicalTranscriptionJobSummary
                    .getTranscriptionJobStatus();
            jsonWriter.name("TranscriptionJobStatus");
            jsonWriter.value(transcriptionJobStatus);
        }
        if (medicalTranscriptionJobSummary.getFailureReason() != null) {
            String failureReason = medicalTranscriptionJobSummary.getFailureReason();
            jsonWriter.name("FailureReason");
            jsonWriter.value(failureReason);
        }
        if (medicalTranscriptionJobSummary.getOutputLocationType() != null) {
            String outputLocationType = medicalTranscriptionJobSummary.getOutputLocationType();
            jsonWriter.name("OutputLocationType");
            jsonWriter.value(outputLocationType);
        }
        if (medicalTranscriptionJobSummary.getSpecialty() != null) {
            String specialty = medicalTranscriptionJobSummary.getSpecialty();
            jsonWriter.name("Specialty");
            jsonWriter.value(specialty);
        }
        if (medicalTranscriptionJobSummary.getContentIdentificationType() != null) {
            String contentIdentificationType = medicalTranscriptionJobSummary
                    .getContentIdentificationType();
            jsonWriter.name("ContentIdentificationType");
            jsonWriter.value(contentIdentificationType);
        }
        if (medicalTranscriptionJobSummary.getType() != null) {
            String type = medicalTranscriptionJobSummary.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        jsonWriter.endObject();
    }

    private static MedicalTranscriptionJobSummaryJsonMarshaller instance;

    public static MedicalTranscriptionJobSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MedicalTranscriptionJobSummaryJsonMarshaller();
        return instance;
    }
}
