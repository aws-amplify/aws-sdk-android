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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TargetedSentimentDetectionJobFilter
 */
class TargetedSentimentDetectionJobFilterJsonMarshaller {

    public void marshall(TargetedSentimentDetectionJobFilter targetedSentimentDetectionJobFilter,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (targetedSentimentDetectionJobFilter.getJobName() != null) {
            String jobName = targetedSentimentDetectionJobFilter.getJobName();
            jsonWriter.name("JobName");
            jsonWriter.value(jobName);
        }
        if (targetedSentimentDetectionJobFilter.getJobStatus() != null) {
            String jobStatus = targetedSentimentDetectionJobFilter.getJobStatus();
            jsonWriter.name("JobStatus");
            jsonWriter.value(jobStatus);
        }
        if (targetedSentimentDetectionJobFilter.getSubmitTimeBefore() != null) {
            java.util.Date submitTimeBefore = targetedSentimentDetectionJobFilter
                    .getSubmitTimeBefore();
            jsonWriter.name("SubmitTimeBefore");
            jsonWriter.value(submitTimeBefore);
        }
        if (targetedSentimentDetectionJobFilter.getSubmitTimeAfter() != null) {
            java.util.Date submitTimeAfter = targetedSentimentDetectionJobFilter
                    .getSubmitTimeAfter();
            jsonWriter.name("SubmitTimeAfter");
            jsonWriter.value(submitTimeAfter);
        }
        jsonWriter.endObject();
    }

    private static TargetedSentimentDetectionJobFilterJsonMarshaller instance;

    public static TargetedSentimentDetectionJobFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TargetedSentimentDetectionJobFilterJsonMarshaller();
        return instance;
    }
}
