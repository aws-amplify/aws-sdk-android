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

package com.amazonaws.services.amazontranscribestreamingservice.model.transform;

import com.amazonaws.services.amazontranscribestreamingservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TranscriptResultStream
 */
class TranscriptResultStreamJsonMarshaller {

    public void marshall(TranscriptResultStream transcriptResultStream, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (transcriptResultStream.getTranscriptEvent() != null) {
            TranscriptEvent transcriptEvent = transcriptResultStream.getTranscriptEvent();
            jsonWriter.name("TranscriptEvent");
            TranscriptEventJsonMarshaller.getInstance().marshall(transcriptEvent, jsonWriter);
        }
        if (transcriptResultStream.getBadRequestException() != null) {
            BadRequestException badRequestException = transcriptResultStream
                    .getBadRequestException();
            jsonWriter.name("BadRequestException");
        }
        if (transcriptResultStream.getLimitExceededException() != null) {
            LimitExceededException limitExceededException = transcriptResultStream
                    .getLimitExceededException();
            jsonWriter.name("LimitExceededException");
        }
        if (transcriptResultStream.getInternalFailureException() != null) {
            InternalFailureException internalFailureException = transcriptResultStream
                    .getInternalFailureException();
            jsonWriter.name("InternalFailureException");
        }
        if (transcriptResultStream.getConflictException() != null) {
            ConflictException conflictException = transcriptResultStream.getConflictException();
            jsonWriter.name("ConflictException");
        }
        if (transcriptResultStream.getServiceUnavailableException() != null) {
            ServiceUnavailableException serviceUnavailableException = transcriptResultStream
                    .getServiceUnavailableException();
            jsonWriter.name("ServiceUnavailableException");
        }
        jsonWriter.endObject();
    }

    private static TranscriptResultStreamJsonMarshaller instance;

    public static TranscriptResultStreamJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TranscriptResultStreamJsonMarshaller();
        return instance;
    }
}
