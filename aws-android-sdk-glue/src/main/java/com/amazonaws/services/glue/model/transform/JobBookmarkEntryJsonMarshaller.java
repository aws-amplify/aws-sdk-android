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
 * JSON marshaller for POJO JobBookmarkEntry
 */
class JobBookmarkEntryJsonMarshaller {

    public void marshall(JobBookmarkEntry jobBookmarkEntry, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (jobBookmarkEntry.getJobName() != null) {
            String jobName = jobBookmarkEntry.getJobName();
            jsonWriter.name("JobName");
            jsonWriter.value(jobName);
        }
        if (jobBookmarkEntry.getVersion() != null) {
            Integer version = jobBookmarkEntry.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        if (jobBookmarkEntry.getRun() != null) {
            Integer run = jobBookmarkEntry.getRun();
            jsonWriter.name("Run");
            jsonWriter.value(run);
        }
        if (jobBookmarkEntry.getAttempt() != null) {
            Integer attempt = jobBookmarkEntry.getAttempt();
            jsonWriter.name("Attempt");
            jsonWriter.value(attempt);
        }
        if (jobBookmarkEntry.getPreviousRunId() != null) {
            String previousRunId = jobBookmarkEntry.getPreviousRunId();
            jsonWriter.name("PreviousRunId");
            jsonWriter.value(previousRunId);
        }
        if (jobBookmarkEntry.getRunId() != null) {
            String runId = jobBookmarkEntry.getRunId();
            jsonWriter.name("RunId");
            jsonWriter.value(runId);
        }
        if (jobBookmarkEntry.getJobBookmark() != null) {
            String jobBookmark = jobBookmarkEntry.getJobBookmark();
            jsonWriter.name("JobBookmark");
            jsonWriter.value(jobBookmark);
        }
        jsonWriter.endObject();
    }

    private static JobBookmarkEntryJsonMarshaller instance;

    public static JobBookmarkEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobBookmarkEntryJsonMarshaller();
        return instance;
    }
}
