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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO MedicalTranscriptionJobSummary
 */
class MedicalTranscriptionJobSummaryJsonUnmarshaller implements
        Unmarshaller<MedicalTranscriptionJobSummary, JsonUnmarshallerContext> {

    public MedicalTranscriptionJobSummary unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MedicalTranscriptionJobSummary medicalTranscriptionJobSummary = new MedicalTranscriptionJobSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("MedicalTranscriptionJobName")) {
                medicalTranscriptionJobSummary
                        .setMedicalTranscriptionJobName(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                medicalTranscriptionJobSummary.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartTime")) {
                medicalTranscriptionJobSummary.setStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompletionTime")) {
                medicalTranscriptionJobSummary.setCompletionTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LanguageCode")) {
                medicalTranscriptionJobSummary.setLanguageCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TranscriptionJobStatus")) {
                medicalTranscriptionJobSummary.setTranscriptionJobStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                medicalTranscriptionJobSummary.setFailureReason(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutputLocationType")) {
                medicalTranscriptionJobSummary.setOutputLocationType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Specialty")) {
                medicalTranscriptionJobSummary.setSpecialty(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ContentIdentificationType")) {
                medicalTranscriptionJobSummary.setContentIdentificationType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                medicalTranscriptionJobSummary.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return medicalTranscriptionJobSummary;
    }

    private static MedicalTranscriptionJobSummaryJsonUnmarshaller instance;

    public static MedicalTranscriptionJobSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MedicalTranscriptionJobSummaryJsonUnmarshaller();
        return instance;
    }
}
