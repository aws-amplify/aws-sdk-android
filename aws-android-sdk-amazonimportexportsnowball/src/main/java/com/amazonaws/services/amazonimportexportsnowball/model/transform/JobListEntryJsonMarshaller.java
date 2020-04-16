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

package com.amazonaws.services.amazonimportexportsnowball.model.transform;

import com.amazonaws.services.amazonimportexportsnowball.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO JobListEntry
 */
class JobListEntryJsonMarshaller {

    public void marshall(JobListEntry jobListEntry, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (jobListEntry.getJobId() != null) {
            String jobId = jobListEntry.getJobId();
            jsonWriter.name("JobId");
            jsonWriter.value(jobId);
        }
        if (jobListEntry.getJobState() != null) {
            String jobState = jobListEntry.getJobState();
            jsonWriter.name("JobState");
            jsonWriter.value(jobState);
        }
        if (jobListEntry.getIsMaster() != null) {
            Boolean isMaster = jobListEntry.getIsMaster();
            jsonWriter.name("IsMaster");
            jsonWriter.value(isMaster);
        }
        if (jobListEntry.getJobType() != null) {
            String jobType = jobListEntry.getJobType();
            jsonWriter.name("JobType");
            jsonWriter.value(jobType);
        }
        if (jobListEntry.getSnowballType() != null) {
            String snowballType = jobListEntry.getSnowballType();
            jsonWriter.name("SnowballType");
            jsonWriter.value(snowballType);
        }
        if (jobListEntry.getCreationDate() != null) {
            java.util.Date creationDate = jobListEntry.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (jobListEntry.getDescription() != null) {
            String description = jobListEntry.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        jsonWriter.endObject();
    }

    private static JobListEntryJsonMarshaller instance;

    public static JobListEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobListEntryJsonMarshaller();
        return instance;
    }
}
