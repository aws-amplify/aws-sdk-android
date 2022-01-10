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
 * JSON unmarshaller for POJO MedicalTranscriptionJob
 */
class MedicalTranscriptionJobJsonUnmarshaller implements
        Unmarshaller<MedicalTranscriptionJob, JsonUnmarshallerContext> {

    public MedicalTranscriptionJob unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MedicalTranscriptionJob medicalTranscriptionJob = new MedicalTranscriptionJob();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("MedicalTranscriptionJobName")) {
                medicalTranscriptionJob.setMedicalTranscriptionJobName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TranscriptionJobStatus")) {
                medicalTranscriptionJob.setTranscriptionJobStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LanguageCode")) {
                medicalTranscriptionJob.setLanguageCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MediaSampleRateHertz")) {
                medicalTranscriptionJob.setMediaSampleRateHertz(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MediaFormat")) {
                medicalTranscriptionJob.setMediaFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Media")) {
                medicalTranscriptionJob.setMedia(MediaJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Transcript")) {
                medicalTranscriptionJob.setTranscript(MedicalTranscriptJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartTime")) {
                medicalTranscriptionJob.setStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                medicalTranscriptionJob.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompletionTime")) {
                medicalTranscriptionJob.setCompletionTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                medicalTranscriptionJob.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Settings")) {
                medicalTranscriptionJob.setSettings(MedicalTranscriptionSettingJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ContentIdentificationType")) {
                medicalTranscriptionJob.setContentIdentificationType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Specialty")) {
                medicalTranscriptionJob.setSpecialty(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                medicalTranscriptionJob.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                medicalTranscriptionJob.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return medicalTranscriptionJob;
    }

    private static MedicalTranscriptionJobJsonUnmarshaller instance;

    public static MedicalTranscriptionJobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MedicalTranscriptionJobJsonUnmarshaller();
        return instance;
    }
}
