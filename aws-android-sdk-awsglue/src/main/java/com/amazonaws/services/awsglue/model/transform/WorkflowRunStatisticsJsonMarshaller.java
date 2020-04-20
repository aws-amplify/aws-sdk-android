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
 * JSON marshaller for POJO WorkflowRunStatistics
 */
class WorkflowRunStatisticsJsonMarshaller {

    public void marshall(WorkflowRunStatistics workflowRunStatistics, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (workflowRunStatistics.getTotalActions() != null) {
            Integer totalActions = workflowRunStatistics.getTotalActions();
            jsonWriter.name("TotalActions");
            jsonWriter.value(totalActions);
        }
        if (workflowRunStatistics.getTimeoutActions() != null) {
            Integer timeoutActions = workflowRunStatistics.getTimeoutActions();
            jsonWriter.name("TimeoutActions");
            jsonWriter.value(timeoutActions);
        }
        if (workflowRunStatistics.getFailedActions() != null) {
            Integer failedActions = workflowRunStatistics.getFailedActions();
            jsonWriter.name("FailedActions");
            jsonWriter.value(failedActions);
        }
        if (workflowRunStatistics.getStoppedActions() != null) {
            Integer stoppedActions = workflowRunStatistics.getStoppedActions();
            jsonWriter.name("StoppedActions");
            jsonWriter.value(stoppedActions);
        }
        if (workflowRunStatistics.getSucceededActions() != null) {
            Integer succeededActions = workflowRunStatistics.getSucceededActions();
            jsonWriter.name("SucceededActions");
            jsonWriter.value(succeededActions);
        }
        if (workflowRunStatistics.getRunningActions() != null) {
            Integer runningActions = workflowRunStatistics.getRunningActions();
            jsonWriter.name("RunningActions");
            jsonWriter.value(runningActions);
        }
        jsonWriter.endObject();
    }

    private static WorkflowRunStatisticsJsonMarshaller instance;

    public static WorkflowRunStatisticsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WorkflowRunStatisticsJsonMarshaller();
        return instance;
    }
}
