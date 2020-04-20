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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO JobNodeDetails
 */
class JobNodeDetailsJsonMarshaller {

    public void marshall(JobNodeDetails jobNodeDetails, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (jobNodeDetails.getJobRuns() != null) {
            java.util.List<JobRun> jobRuns = jobNodeDetails.getJobRuns();
            jsonWriter.name("JobRuns");
            jsonWriter.beginArray();
            for (JobRun jobRunsItem : jobRuns) {
                if (jobRunsItem != null) {
                    JobRunJsonMarshaller.getInstance().marshall(jobRunsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static JobNodeDetailsJsonMarshaller instance;

    public static JobNodeDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobNodeDetailsJsonMarshaller();
        return instance;
    }
}
