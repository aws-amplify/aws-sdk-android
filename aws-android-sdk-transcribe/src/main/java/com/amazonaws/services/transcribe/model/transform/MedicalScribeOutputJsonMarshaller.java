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
 * JSON marshaller for POJO MedicalScribeOutput
 */
class MedicalScribeOutputJsonMarshaller {

    public void marshall(MedicalScribeOutput medicalScribeOutput, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (medicalScribeOutput.getTranscriptFileUri() != null) {
            String transcriptFileUri = medicalScribeOutput.getTranscriptFileUri();
            jsonWriter.name("TranscriptFileUri");
            jsonWriter.value(transcriptFileUri);
        }
        if (medicalScribeOutput.getClinicalDocumentUri() != null) {
            String clinicalDocumentUri = medicalScribeOutput.getClinicalDocumentUri();
            jsonWriter.name("ClinicalDocumentUri");
            jsonWriter.value(clinicalDocumentUri);
        }
        jsonWriter.endObject();
    }

    private static MedicalScribeOutputJsonMarshaller instance;

    public static MedicalScribeOutputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MedicalScribeOutputJsonMarshaller();
        return instance;
    }
}
