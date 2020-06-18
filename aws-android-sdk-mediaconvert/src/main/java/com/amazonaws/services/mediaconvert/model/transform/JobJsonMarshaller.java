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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Job
 */
class JobJsonMarshaller {

    public void marshall(Job job, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (job.getAccelerationSettings() != null) {
            AccelerationSettings accelerationSettings = job.getAccelerationSettings();
            jsonWriter.name("AccelerationSettings");
            AccelerationSettingsJsonMarshaller.getInstance().marshall(accelerationSettings,
                    jsonWriter);
        }
        if (job.getAccelerationStatus() != null) {
            String accelerationStatus = job.getAccelerationStatus();
            jsonWriter.name("AccelerationStatus");
            jsonWriter.value(accelerationStatus);
        }
        if (job.getArn() != null) {
            String arn = job.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (job.getBillingTagsSource() != null) {
            String billingTagsSource = job.getBillingTagsSource();
            jsonWriter.name("BillingTagsSource");
            jsonWriter.value(billingTagsSource);
        }
        if (job.getCreatedAt() != null) {
            java.util.Date createdAt = job.getCreatedAt();
            jsonWriter.name("CreatedAt");
            jsonWriter.value(createdAt);
        }
        if (job.getCurrentPhase() != null) {
            String currentPhase = job.getCurrentPhase();
            jsonWriter.name("CurrentPhase");
            jsonWriter.value(currentPhase);
        }
        if (job.getErrorCode() != null) {
            Integer errorCode = job.getErrorCode();
            jsonWriter.name("ErrorCode");
            jsonWriter.value(errorCode);
        }
        if (job.getErrorMessage() != null) {
            String errorMessage = job.getErrorMessage();
            jsonWriter.name("ErrorMessage");
            jsonWriter.value(errorMessage);
        }
        if (job.getHopDestinations() != null) {
            java.util.List<HopDestination> hopDestinations = job.getHopDestinations();
            jsonWriter.name("HopDestinations");
            jsonWriter.beginArray();
            for (HopDestination hopDestinationsItem : hopDestinations) {
                if (hopDestinationsItem != null) {
                    HopDestinationJsonMarshaller.getInstance().marshall(hopDestinationsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (job.getId() != null) {
            String id = job.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (job.getJobPercentComplete() != null) {
            Integer jobPercentComplete = job.getJobPercentComplete();
            jsonWriter.name("JobPercentComplete");
            jsonWriter.value(jobPercentComplete);
        }
        if (job.getJobTemplate() != null) {
            String jobTemplate = job.getJobTemplate();
            jsonWriter.name("JobTemplate");
            jsonWriter.value(jobTemplate);
        }
        if (job.getMessages() != null) {
            JobMessages messages = job.getMessages();
            jsonWriter.name("Messages");
            JobMessagesJsonMarshaller.getInstance().marshall(messages, jsonWriter);
        }
        if (job.getOutputGroupDetails() != null) {
            java.util.List<OutputGroupDetail> outputGroupDetails = job.getOutputGroupDetails();
            jsonWriter.name("OutputGroupDetails");
            jsonWriter.beginArray();
            for (OutputGroupDetail outputGroupDetailsItem : outputGroupDetails) {
                if (outputGroupDetailsItem != null) {
                    OutputGroupDetailJsonMarshaller.getInstance().marshall(outputGroupDetailsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (job.getPriority() != null) {
            Integer priority = job.getPriority();
            jsonWriter.name("Priority");
            jsonWriter.value(priority);
        }
        if (job.getQueue() != null) {
            String queue = job.getQueue();
            jsonWriter.name("Queue");
            jsonWriter.value(queue);
        }
        if (job.getQueueTransitions() != null) {
            java.util.List<QueueTransition> queueTransitions = job.getQueueTransitions();
            jsonWriter.name("QueueTransitions");
            jsonWriter.beginArray();
            for (QueueTransition queueTransitionsItem : queueTransitions) {
                if (queueTransitionsItem != null) {
                    QueueTransitionJsonMarshaller.getInstance().marshall(queueTransitionsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (job.getRetryCount() != null) {
            Integer retryCount = job.getRetryCount();
            jsonWriter.name("RetryCount");
            jsonWriter.value(retryCount);
        }
        if (job.getRole() != null) {
            String role = job.getRole();
            jsonWriter.name("Role");
            jsonWriter.value(role);
        }
        if (job.getSettings() != null) {
            JobSettings settings = job.getSettings();
            jsonWriter.name("Settings");
            JobSettingsJsonMarshaller.getInstance().marshall(settings, jsonWriter);
        }
        if (job.getSimulateReservedQueue() != null) {
            String simulateReservedQueue = job.getSimulateReservedQueue();
            jsonWriter.name("SimulateReservedQueue");
            jsonWriter.value(simulateReservedQueue);
        }
        if (job.getStatus() != null) {
            String status = job.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (job.getStatusUpdateInterval() != null) {
            String statusUpdateInterval = job.getStatusUpdateInterval();
            jsonWriter.name("StatusUpdateInterval");
            jsonWriter.value(statusUpdateInterval);
        }
        if (job.getTiming() != null) {
            Timing timing = job.getTiming();
            jsonWriter.name("Timing");
            TimingJsonMarshaller.getInstance().marshall(timing, jsonWriter);
        }
        if (job.getUserMetadata() != null) {
            java.util.Map<String, String> userMetadata = job.getUserMetadata();
            jsonWriter.name("UserMetadata");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> userMetadataEntry : userMetadata.entrySet()) {
                String userMetadataValue = userMetadataEntry.getValue();
                if (userMetadataValue != null) {
                    jsonWriter.name(userMetadataEntry.getKey());
                    jsonWriter.value(userMetadataValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static JobJsonMarshaller instance;

    public static JobJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobJsonMarshaller();
        return instance;
    }
}
