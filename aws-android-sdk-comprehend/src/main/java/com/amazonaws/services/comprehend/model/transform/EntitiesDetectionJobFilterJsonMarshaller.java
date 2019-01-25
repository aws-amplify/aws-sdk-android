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
 * JSON marshaller for POJO EntitiesDetectionJobFilter
 */
class EntitiesDetectionJobFilterJsonMarshaller {

    public void marshall(EntitiesDetectionJobFilter entitiesDetectionJobFilter,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (entitiesDetectionJobFilter.getJobName() != null) {
            String jobName = entitiesDetectionJobFilter.getJobName();
            jsonWriter.name("JobName");
            jsonWriter.value(jobName);
        }
        if (entitiesDetectionJobFilter.getJobStatus() != null) {
            String jobStatus = entitiesDetectionJobFilter.getJobStatus();
            jsonWriter.name("JobStatus");
            jsonWriter.value(jobStatus);
        }
        if (entitiesDetectionJobFilter.getSubmitTimeBefore() != null) {
            java.util.Date submitTimeBefore = entitiesDetectionJobFilter.getSubmitTimeBefore();
            jsonWriter.name("SubmitTimeBefore");
            jsonWriter.value(submitTimeBefore);
        }
        if (entitiesDetectionJobFilter.getSubmitTimeAfter() != null) {
            java.util.Date submitTimeAfter = entitiesDetectionJobFilter.getSubmitTimeAfter();
            jsonWriter.name("SubmitTimeAfter");
            jsonWriter.value(submitTimeAfter);
        }
        jsonWriter.endObject();
    }

    private static EntitiesDetectionJobFilterJsonMarshaller instance;

    public static EntitiesDetectionJobFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EntitiesDetectionJobFilterJsonMarshaller();
        return instance;
    }
}
