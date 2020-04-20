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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO JobUpdate
 */
class JobUpdateJsonUnmarshaller implements Unmarshaller<JobUpdate, JsonUnmarshallerContext> {

    public JobUpdate unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        JobUpdate jobUpdate = new JobUpdate();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Description")) {
                jobUpdate.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LogUri")) {
                jobUpdate.setLogUri(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Role")) {
                jobUpdate.setRole(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExecutionProperty")) {
                jobUpdate.setExecutionProperty(ExecutionPropertyJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Command")) {
                jobUpdate.setCommand(JobCommandJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefaultArguments")) {
                jobUpdate.setDefaultArguments(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NonOverridableArguments")) {
                jobUpdate.setNonOverridableArguments(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Connections")) {
                jobUpdate.setConnections(ConnectionsListJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxRetries")) {
                jobUpdate.setMaxRetries(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AllocatedCapacity")) {
                jobUpdate.setAllocatedCapacity(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Timeout")) {
                jobUpdate.setTimeout(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxCapacity")) {
                jobUpdate.setMaxCapacity(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WorkerType")) {
                jobUpdate.setWorkerType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberOfWorkers")) {
                jobUpdate.setNumberOfWorkers(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SecurityConfiguration")) {
                jobUpdate.setSecurityConfiguration(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NotificationProperty")) {
                jobUpdate.setNotificationProperty(NotificationPropertyJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("GlueVersion")) {
                jobUpdate.setGlueVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return jobUpdate;
    }

    private static JobUpdateJsonUnmarshaller instance;

    public static JobUpdateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobUpdateJsonUnmarshaller();
        return instance;
    }
}
