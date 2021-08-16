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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO CallAnalyticsJobSummary
 */
class CallAnalyticsJobSummaryJsonUnmarshaller implements
        Unmarshaller<CallAnalyticsJobSummary, JsonUnmarshallerContext> {

    public CallAnalyticsJobSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CallAnalyticsJobSummary callAnalyticsJobSummary = new CallAnalyticsJobSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CallAnalyticsJobName")) {
                callAnalyticsJobSummary.setCallAnalyticsJobName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                callAnalyticsJobSummary.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartTime")) {
                callAnalyticsJobSummary.setStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompletionTime")) {
                callAnalyticsJobSummary.setCompletionTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LanguageCode")) {
                callAnalyticsJobSummary.setLanguageCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CallAnalyticsJobStatus")) {
                callAnalyticsJobSummary.setCallAnalyticsJobStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                callAnalyticsJobSummary.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return callAnalyticsJobSummary;
    }

    private static CallAnalyticsJobSummaryJsonUnmarshaller instance;

    public static CallAnalyticsJobSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CallAnalyticsJobSummaryJsonUnmarshaller();
        return instance;
    }
}
