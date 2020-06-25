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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FindMatchesTaskRunProperties
 */
class FindMatchesTaskRunPropertiesJsonMarshaller {

    public void marshall(FindMatchesTaskRunProperties findMatchesTaskRunProperties,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (findMatchesTaskRunProperties.getJobId() != null) {
            String jobId = findMatchesTaskRunProperties.getJobId();
            jsonWriter.name("JobId");
            jsonWriter.value(jobId);
        }
        if (findMatchesTaskRunProperties.getJobName() != null) {
            String jobName = findMatchesTaskRunProperties.getJobName();
            jsonWriter.name("JobName");
            jsonWriter.value(jobName);
        }
        if (findMatchesTaskRunProperties.getJobRunId() != null) {
            String jobRunId = findMatchesTaskRunProperties.getJobRunId();
            jsonWriter.name("JobRunId");
            jsonWriter.value(jobRunId);
        }
        jsonWriter.endObject();
    }

    private static FindMatchesTaskRunPropertiesJsonMarshaller instance;

    public static FindMatchesTaskRunPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FindMatchesTaskRunPropertiesJsonMarshaller();
        return instance;
    }
}
