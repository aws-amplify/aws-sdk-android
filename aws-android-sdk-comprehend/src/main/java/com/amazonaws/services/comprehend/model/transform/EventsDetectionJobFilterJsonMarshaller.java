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
 * JSON marshaller for POJO EventsDetectionJobFilter
 */
class EventsDetectionJobFilterJsonMarshaller {

    public void marshall(EventsDetectionJobFilter eventsDetectionJobFilter, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (eventsDetectionJobFilter.getJobName() != null) {
            String jobName = eventsDetectionJobFilter.getJobName();
            jsonWriter.name("JobName");
            jsonWriter.value(jobName);
        }
        if (eventsDetectionJobFilter.getJobStatus() != null) {
            String jobStatus = eventsDetectionJobFilter.getJobStatus();
            jsonWriter.name("JobStatus");
            jsonWriter.value(jobStatus);
        }
        if (eventsDetectionJobFilter.getSubmitTimeBefore() != null) {
            java.util.Date submitTimeBefore = eventsDetectionJobFilter.getSubmitTimeBefore();
            jsonWriter.name("SubmitTimeBefore");
            jsonWriter.value(submitTimeBefore);
        }
        if (eventsDetectionJobFilter.getSubmitTimeAfter() != null) {
            java.util.Date submitTimeAfter = eventsDetectionJobFilter.getSubmitTimeAfter();
            jsonWriter.name("SubmitTimeAfter");
            jsonWriter.value(submitTimeAfter);
        }
        jsonWriter.endObject();
    }

    private static EventsDetectionJobFilterJsonMarshaller instance;

    public static EventsDetectionJobFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventsDetectionJobFilterJsonMarshaller();
        return instance;
    }
}
