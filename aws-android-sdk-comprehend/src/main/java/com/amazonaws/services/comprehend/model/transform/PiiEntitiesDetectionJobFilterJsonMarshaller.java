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
 * JSON marshaller for POJO PiiEntitiesDetectionJobFilter
 */
class PiiEntitiesDetectionJobFilterJsonMarshaller {

    public void marshall(PiiEntitiesDetectionJobFilter piiEntitiesDetectionJobFilter,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (piiEntitiesDetectionJobFilter.getJobName() != null) {
            String jobName = piiEntitiesDetectionJobFilter.getJobName();
            jsonWriter.name("JobName");
            jsonWriter.value(jobName);
        }
        if (piiEntitiesDetectionJobFilter.getJobStatus() != null) {
            String jobStatus = piiEntitiesDetectionJobFilter.getJobStatus();
            jsonWriter.name("JobStatus");
            jsonWriter.value(jobStatus);
        }
        if (piiEntitiesDetectionJobFilter.getSubmitTimeBefore() != null) {
            java.util.Date submitTimeBefore = piiEntitiesDetectionJobFilter.getSubmitTimeBefore();
            jsonWriter.name("SubmitTimeBefore");
            jsonWriter.value(submitTimeBefore);
        }
        if (piiEntitiesDetectionJobFilter.getSubmitTimeAfter() != null) {
            java.util.Date submitTimeAfter = piiEntitiesDetectionJobFilter.getSubmitTimeAfter();
            jsonWriter.name("SubmitTimeAfter");
            jsonWriter.value(submitTimeAfter);
        }
        jsonWriter.endObject();
    }

    private static PiiEntitiesDetectionJobFilterJsonMarshaller instance;

    public static PiiEntitiesDetectionJobFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PiiEntitiesDetectionJobFilterJsonMarshaller();
        return instance;
    }
}
