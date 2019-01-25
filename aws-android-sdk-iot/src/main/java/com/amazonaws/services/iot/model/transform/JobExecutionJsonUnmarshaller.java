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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO JobExecution
 */
class JobExecutionJsonUnmarshaller implements Unmarshaller<JobExecution, JsonUnmarshallerContext> {

    public JobExecution unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        JobExecution jobExecution = new JobExecution();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("jobId")) {
                jobExecution.setJobId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                jobExecution.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("forceCanceled")) {
                jobExecution.setForceCanceled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("statusDetails")) {
                jobExecution.setStatusDetails(JobExecutionStatusDetailsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("thingArn")) {
                jobExecution.setThingArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("queuedAt")) {
                jobExecution.setQueuedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("startedAt")) {
                jobExecution.setStartedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedAt")) {
                jobExecution.setLastUpdatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("executionNumber")) {
                jobExecution.setExecutionNumber(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("versionNumber")) {
                jobExecution.setVersionNumber(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("approximateSecondsBeforeTimedOut")) {
                jobExecution.setApproximateSecondsBeforeTimedOut(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return jobExecution;
    }

    private static JobExecutionJsonUnmarshaller instance;

    public static JobExecutionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobExecutionJsonUnmarshaller();
        return instance;
    }
}
