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

package com.amazonaws.services.comprehendmedical.model.transform;

import com.amazonaws.services.comprehendmedical.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ComprehendMedicalAsyncJobFilter
 */
class ComprehendMedicalAsyncJobFilterJsonMarshaller {

    public void marshall(ComprehendMedicalAsyncJobFilter comprehendMedicalAsyncJobFilter,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (comprehendMedicalAsyncJobFilter.getJobName() != null) {
            String jobName = comprehendMedicalAsyncJobFilter.getJobName();
            jsonWriter.name("JobName");
            jsonWriter.value(jobName);
        }
        if (comprehendMedicalAsyncJobFilter.getJobStatus() != null) {
            String jobStatus = comprehendMedicalAsyncJobFilter.getJobStatus();
            jsonWriter.name("JobStatus");
            jsonWriter.value(jobStatus);
        }
        if (comprehendMedicalAsyncJobFilter.getSubmitTimeBefore() != null) {
            java.util.Date submitTimeBefore = comprehendMedicalAsyncJobFilter.getSubmitTimeBefore();
            jsonWriter.name("SubmitTimeBefore");
            jsonWriter.value(submitTimeBefore);
        }
        if (comprehendMedicalAsyncJobFilter.getSubmitTimeAfter() != null) {
            java.util.Date submitTimeAfter = comprehendMedicalAsyncJobFilter.getSubmitTimeAfter();
            jsonWriter.name("SubmitTimeAfter");
            jsonWriter.value(submitTimeAfter);
        }
        jsonWriter.endObject();
    }

    private static ComprehendMedicalAsyncJobFilterJsonMarshaller instance;

    public static ComprehendMedicalAsyncJobFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ComprehendMedicalAsyncJobFilterJsonMarshaller();
        return instance;
    }
}
