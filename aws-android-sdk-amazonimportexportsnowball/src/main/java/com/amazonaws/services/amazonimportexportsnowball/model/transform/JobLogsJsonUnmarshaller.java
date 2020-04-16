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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO JobLogs
 */
class JobLogsJsonUnmarshaller implements Unmarshaller<JobLogs, JsonUnmarshallerContext> {

    public JobLogs unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        JobLogs jobLogs = new JobLogs();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("JobCompletionReportURI")) {
                jobLogs.setJobCompletionReportURI(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobSuccessLogURI")) {
                jobLogs.setJobSuccessLogURI(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobFailureLogURI")) {
                jobLogs.setJobFailureLogURI(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return jobLogs;
    }

    private static JobLogsJsonUnmarshaller instance;

    public static JobLogsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobLogsJsonUnmarshaller();
        return instance;
    }
}
