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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for POJO AutomationExecution
 */
class AutomationExecutionJsonUnmarshaller implements Unmarshaller<AutomationExecution, JsonUnmarshallerContext> {

    public AutomationExecution unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AutomationExecution automationExecution = new AutomationExecution();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AutomationExecutionId")) {
                automationExecution.setAutomationExecutionId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("DocumentName")) {
                automationExecution.setDocumentName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("DocumentVersion")) {
                automationExecution.setDocumentVersion(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ExecutionStartTime")) {
                automationExecution.setExecutionStartTime(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ExecutionEndTime")) {
                automationExecution.setExecutionEndTime(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("AutomationExecutionStatus")) {
                automationExecution.setAutomationExecutionStatus(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("StepExecutions")) {
                automationExecution.setStepExecutions(new ListUnmarshaller<StepExecution>(StepExecutionJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("StepExecutionsTruncated")) {
                automationExecution.setStepExecutionsTruncated(BooleanJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Parameters")) {
                automationExecution.setParameters(new MapUnmarshaller<java.util.List<String>>(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
)
)
.unmarshall(context));
            } else if (name.equals("Outputs")) {
                automationExecution.setOutputs(new MapUnmarshaller<java.util.List<String>>(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
)
)
.unmarshall(context));
            } else if (name.equals("FailureMessage")) {
                automationExecution.setFailureMessage(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Mode")) {
                automationExecution.setMode(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ParentAutomationExecutionId")) {
                automationExecution.setParentAutomationExecutionId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ExecutedBy")) {
                automationExecution.setExecutedBy(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("CurrentStepName")) {
                automationExecution.setCurrentStepName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("CurrentAction")) {
                automationExecution.setCurrentAction(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("TargetParameterName")) {
                automationExecution.setTargetParameterName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Targets")) {
                automationExecution.setTargets(new ListUnmarshaller<Target>(TargetJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("TargetMaps")) {
                automationExecution.setTargetMaps(new ListUnmarshaller<java.util.Map<String, java.util.List<String>>>(new MapUnmarshaller<java.util.List<String>>(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
)
)
)
.unmarshall(context));
            } else if (name.equals("ResolvedTargets")) {
                automationExecution.setResolvedTargets(ResolvedTargetsJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("MaxConcurrency")) {
                automationExecution.setMaxConcurrency(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("MaxErrors")) {
                automationExecution.setMaxErrors(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Target")) {
                automationExecution.setTarget(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("TargetLocations")) {
                automationExecution.setTargetLocations(new ListUnmarshaller<TargetLocation>(TargetLocationJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("ProgressCounters")) {
                automationExecution.setProgressCounters(ProgressCountersJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return automationExecution;
    }

    private static AutomationExecutionJsonUnmarshaller instance;
    public static AutomationExecutionJsonUnmarshaller getInstance() {
        if (instance == null) instance = new AutomationExecutionJsonUnmarshaller();
        return instance;
    }
}
