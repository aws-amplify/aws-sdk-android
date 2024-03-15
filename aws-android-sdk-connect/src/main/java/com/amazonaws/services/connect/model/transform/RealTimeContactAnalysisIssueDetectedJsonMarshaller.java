/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RealTimeContactAnalysisIssueDetected
 */
class RealTimeContactAnalysisIssueDetectedJsonMarshaller {

    public void marshall(RealTimeContactAnalysisIssueDetected realTimeContactAnalysisIssueDetected,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (realTimeContactAnalysisIssueDetected.getTranscriptItems() != null) {
            java.util.List<RealTimeContactAnalysisTranscriptItemWithContent> transcriptItems = realTimeContactAnalysisIssueDetected
                    .getTranscriptItems();
            jsonWriter.name("TranscriptItems");
            jsonWriter.beginArray();
            for (RealTimeContactAnalysisTranscriptItemWithContent transcriptItemsItem : transcriptItems) {
                if (transcriptItemsItem != null) {
                    RealTimeContactAnalysisTranscriptItemWithContentJsonMarshaller.getInstance()
                            .marshall(transcriptItemsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static RealTimeContactAnalysisIssueDetectedJsonMarshaller instance;

    public static RealTimeContactAnalysisIssueDetectedJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RealTimeContactAnalysisIssueDetectedJsonMarshaller();
        return instance;
    }
}
