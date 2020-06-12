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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO JobRun
 */
class JobRunJsonUnmarshaller implements Unmarshaller<JobRun, JsonUnmarshallerContext> {

    public JobRun unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        JobRun jobRun = new JobRun();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Id")) {
                jobRun.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Attempt")) {
                jobRun.setAttempt(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PreviousRunId")) {
                jobRun.setPreviousRunId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TriggerName")) {
                jobRun.setTriggerName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobName")) {
                jobRun.setJobName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartedOn")) {
                jobRun.setStartedOn(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedOn")) {
                jobRun.setLastModifiedOn(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompletedOn")) {
                jobRun.setCompletedOn(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobRunState")) {
                jobRun.setJobRunState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Arguments")) {
                jobRun.setArguments(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ErrorMessage")) {
                jobRun.setErrorMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PredecessorRuns")) {
                jobRun.setPredecessorRuns(new ListUnmarshaller<Predecessor>(
                        PredecessorJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AllocatedCapacity")) {
                jobRun.setAllocatedCapacity(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExecutionTime")) {
                jobRun.setExecutionTime(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Timeout")) {
                jobRun.setTimeout(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxCapacity")) {
                jobRun.setMaxCapacity(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WorkerType")) {
                jobRun.setWorkerType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberOfWorkers")) {
                jobRun.setNumberOfWorkers(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SecurityConfiguration")) {
                jobRun.setSecurityConfiguration(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LogGroupName")) {
                jobRun.setLogGroupName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NotificationProperty")) {
                jobRun.setNotificationProperty(NotificationPropertyJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GlueVersion")) {
                jobRun.setGlueVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return jobRun;
    }

    private static JobRunJsonUnmarshaller instance;

    public static JobRunJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobRunJsonUnmarshaller();
        return instance;
    }
}
