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
 * JSON marshaller for POJO JobRun
 */
class JobRunJsonMarshaller {

    public void marshall(JobRun jobRun, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (jobRun.getId() != null) {
            String id = jobRun.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (jobRun.getAttempt() != null) {
            Integer attempt = jobRun.getAttempt();
            jsonWriter.name("Attempt");
            jsonWriter.value(attempt);
        }
        if (jobRun.getPreviousRunId() != null) {
            String previousRunId = jobRun.getPreviousRunId();
            jsonWriter.name("PreviousRunId");
            jsonWriter.value(previousRunId);
        }
        if (jobRun.getTriggerName() != null) {
            String triggerName = jobRun.getTriggerName();
            jsonWriter.name("TriggerName");
            jsonWriter.value(triggerName);
        }
        if (jobRun.getJobName() != null) {
            String jobName = jobRun.getJobName();
            jsonWriter.name("JobName");
            jsonWriter.value(jobName);
        }
        if (jobRun.getStartedOn() != null) {
            java.util.Date startedOn = jobRun.getStartedOn();
            jsonWriter.name("StartedOn");
            jsonWriter.value(startedOn);
        }
        if (jobRun.getLastModifiedOn() != null) {
            java.util.Date lastModifiedOn = jobRun.getLastModifiedOn();
            jsonWriter.name("LastModifiedOn");
            jsonWriter.value(lastModifiedOn);
        }
        if (jobRun.getCompletedOn() != null) {
            java.util.Date completedOn = jobRun.getCompletedOn();
            jsonWriter.name("CompletedOn");
            jsonWriter.value(completedOn);
        }
        if (jobRun.getJobRunState() != null) {
            String jobRunState = jobRun.getJobRunState();
            jsonWriter.name("JobRunState");
            jsonWriter.value(jobRunState);
        }
        if (jobRun.getArguments() != null) {
            java.util.Map<String, String> arguments = jobRun.getArguments();
            jsonWriter.name("Arguments");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> argumentsEntry : arguments.entrySet()) {
                String argumentsValue = argumentsEntry.getValue();
                if (argumentsValue != null) {
                    jsonWriter.name(argumentsEntry.getKey());
                    jsonWriter.value(argumentsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (jobRun.getErrorMessage() != null) {
            String errorMessage = jobRun.getErrorMessage();
            jsonWriter.name("ErrorMessage");
            jsonWriter.value(errorMessage);
        }
        if (jobRun.getPredecessorRuns() != null) {
            java.util.List<Predecessor> predecessorRuns = jobRun.getPredecessorRuns();
            jsonWriter.name("PredecessorRuns");
            jsonWriter.beginArray();
            for (Predecessor predecessorRunsItem : predecessorRuns) {
                if (predecessorRunsItem != null) {
                    PredecessorJsonMarshaller.getInstance().marshall(predecessorRunsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (jobRun.getAllocatedCapacity() != null) {
            Integer allocatedCapacity = jobRun.getAllocatedCapacity();
            jsonWriter.name("AllocatedCapacity");
            jsonWriter.value(allocatedCapacity);
        }
        if (jobRun.getExecutionTime() != null) {
            Integer executionTime = jobRun.getExecutionTime();
            jsonWriter.name("ExecutionTime");
            jsonWriter.value(executionTime);
        }
        if (jobRun.getTimeout() != null) {
            Integer timeout = jobRun.getTimeout();
            jsonWriter.name("Timeout");
            jsonWriter.value(timeout);
        }
        if (jobRun.getMaxCapacity() != null) {
            Double maxCapacity = jobRun.getMaxCapacity();
            jsonWriter.name("MaxCapacity");
            jsonWriter.value(maxCapacity);
        }
        if (jobRun.getWorkerType() != null) {
            String workerType = jobRun.getWorkerType();
            jsonWriter.name("WorkerType");
            jsonWriter.value(workerType);
        }
        if (jobRun.getNumberOfWorkers() != null) {
            Integer numberOfWorkers = jobRun.getNumberOfWorkers();
            jsonWriter.name("NumberOfWorkers");
            jsonWriter.value(numberOfWorkers);
        }
        if (jobRun.getSecurityConfiguration() != null) {
            String securityConfiguration = jobRun.getSecurityConfiguration();
            jsonWriter.name("SecurityConfiguration");
            jsonWriter.value(securityConfiguration);
        }
        if (jobRun.getLogGroupName() != null) {
            String logGroupName = jobRun.getLogGroupName();
            jsonWriter.name("LogGroupName");
            jsonWriter.value(logGroupName);
        }
        if (jobRun.getNotificationProperty() != null) {
            NotificationProperty notificationProperty = jobRun.getNotificationProperty();
            jsonWriter.name("NotificationProperty");
            NotificationPropertyJsonMarshaller.getInstance().marshall(notificationProperty,
                    jsonWriter);
        }
        if (jobRun.getGlueVersion() != null) {
            String glueVersion = jobRun.getGlueVersion();
            jsonWriter.name("GlueVersion");
            jsonWriter.value(glueVersion);
        }
        jsonWriter.endObject();
    }

    private static JobRunJsonMarshaller instance;

    public static JobRunJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobRunJsonMarshaller();
        return instance;
    }
}
