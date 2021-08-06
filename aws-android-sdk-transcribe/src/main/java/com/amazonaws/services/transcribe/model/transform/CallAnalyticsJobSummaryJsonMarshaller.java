/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO CallAnalyticsJobSummary
 */
class CallAnalyticsJobSummaryJsonMarshaller {

    public void marshall(CallAnalyticsJobSummary callAnalyticsJobSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (callAnalyticsJobSummary.getCallAnalyticsJobName() != null) {
            String callAnalyticsJobName = callAnalyticsJobSummary.getCallAnalyticsJobName();
            jsonWriter.name("CallAnalyticsJobName");
            jsonWriter.value(callAnalyticsJobName);
        }
        if (callAnalyticsJobSummary.getCreationTime() != null) {
            java.util.Date creationTime = callAnalyticsJobSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (callAnalyticsJobSummary.getStartTime() != null) {
            java.util.Date startTime = callAnalyticsJobSummary.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (callAnalyticsJobSummary.getCompletionTime() != null) {
            java.util.Date completionTime = callAnalyticsJobSummary.getCompletionTime();
            jsonWriter.name("CompletionTime");
            jsonWriter.value(completionTime);
        }
        if (callAnalyticsJobSummary.getLanguageCode() != null) {
            String languageCode = callAnalyticsJobSummary.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (callAnalyticsJobSummary.getCallAnalyticsJobStatus() != null) {
            String callAnalyticsJobStatus = callAnalyticsJobSummary.getCallAnalyticsJobStatus();
            jsonWriter.name("CallAnalyticsJobStatus");
            jsonWriter.value(callAnalyticsJobStatus);
        }
        if (callAnalyticsJobSummary.getFailureReason() != null) {
            String failureReason = callAnalyticsJobSummary.getFailureReason();
            jsonWriter.name("FailureReason");
            jsonWriter.value(failureReason);
        }
        jsonWriter.endObject();
    }

    private static CallAnalyticsJobSummaryJsonMarshaller instance;

    public static CallAnalyticsJobSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CallAnalyticsJobSummaryJsonMarshaller();
        return instance;
    }
}
