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

package com.amazonaws.services.mediaconvert.model.transform;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Job
 */
class JobJsonUnmarshaller implements Unmarshaller<Job, JsonUnmarshallerContext> {

    public Job unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Job job = new Job();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AccelerationSettings")) {
                job.setAccelerationSettings(AccelerationSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AccelerationStatus")) {
                job.setAccelerationStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Arn")) {
                job.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BillingTagsSource")) {
                job.setBillingTagsSource(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedAt")) {
                job.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CurrentPhase")) {
                job.setCurrentPhase(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ErrorCode")) {
                job.setErrorCode(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ErrorMessage")) {
                job.setErrorMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HopDestinations")) {
                job.setHopDestinations(new ListUnmarshaller<HopDestination>(
                        HopDestinationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Id")) {
                job.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobPercentComplete")) {
                job.setJobPercentComplete(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobTemplate")) {
                job.setJobTemplate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Messages")) {
                job.setMessages(JobMessagesJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutputGroupDetails")) {
                job.setOutputGroupDetails(new ListUnmarshaller<OutputGroupDetail>(
                        OutputGroupDetailJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Priority")) {
                job.setPriority(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Queue")) {
                job.setQueue(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("QueueTransitions")) {
                job.setQueueTransitions(new ListUnmarshaller<QueueTransition>(
                        QueueTransitionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RetryCount")) {
                job.setRetryCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Role")) {
                job.setRole(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Settings")) {
                job.setSettings(JobSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SimulateReservedQueue")) {
                job.setSimulateReservedQueue(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                job.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusUpdateInterval")) {
                job.setStatusUpdateInterval(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Timing")) {
                job.setTiming(TimingJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UserMetadata")) {
                job.setUserMetadata(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return job;
    }

    private static JobJsonUnmarshaller instance;

    public static JobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobJsonUnmarshaller();
        return instance;
    }
}
