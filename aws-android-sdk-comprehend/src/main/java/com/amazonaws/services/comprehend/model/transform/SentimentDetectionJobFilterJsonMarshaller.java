/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SentimentDetectionJobFilter
 */
class SentimentDetectionJobFilterJsonMarshaller {

    public void marshall(SentimentDetectionJobFilter sentimentDetectionJobFilter,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (sentimentDetectionJobFilter.getJobName() != null) {
            String jobName = sentimentDetectionJobFilter.getJobName();
            jsonWriter.name("JobName");
            jsonWriter.value(jobName);
        }
        if (sentimentDetectionJobFilter.getJobStatus() != null) {
            String jobStatus = sentimentDetectionJobFilter.getJobStatus();
            jsonWriter.name("JobStatus");
            jsonWriter.value(jobStatus);
        }
        if (sentimentDetectionJobFilter.getSubmitTimeBefore() != null) {
            java.util.Date submitTimeBefore = sentimentDetectionJobFilter.getSubmitTimeBefore();
            jsonWriter.name("SubmitTimeBefore");
            jsonWriter.value(submitTimeBefore);
        }
        if (sentimentDetectionJobFilter.getSubmitTimeAfter() != null) {
            java.util.Date submitTimeAfter = sentimentDetectionJobFilter.getSubmitTimeAfter();
            jsonWriter.name("SubmitTimeAfter");
            jsonWriter.value(submitTimeAfter);
        }
        jsonWriter.endObject();
    }

    private static SentimentDetectionJobFilterJsonMarshaller instance;

    public static SentimentDetectionJobFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SentimentDetectionJobFilterJsonMarshaller();
        return instance;
    }
}
