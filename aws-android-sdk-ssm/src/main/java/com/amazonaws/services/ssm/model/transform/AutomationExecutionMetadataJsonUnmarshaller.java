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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AutomationExecutionMetadata
 */
class AutomationExecutionMetadataJsonUnmarshaller implements
        Unmarshaller<AutomationExecutionMetadata, JsonUnmarshallerContext> {

    public AutomationExecutionMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AutomationExecutionMetadata automationExecutionMetadata = new AutomationExecutionMetadata();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AutomationExecutionId")) {
                automationExecutionMetadata.setAutomationExecutionId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DocumentName")) {
                automationExecutionMetadata.setDocumentName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DocumentVersion")) {
                automationExecutionMetadata.setDocumentVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AutomationExecutionStatus")) {
                automationExecutionMetadata.setAutomationExecutionStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExecutionStartTime")) {
                automationExecutionMetadata.setExecutionStartTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExecutionEndTime")) {
                automationExecutionMetadata.setExecutionEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExecutedBy")) {
                automationExecutionMetadata.setExecutedBy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LogFile")) {
                automationExecutionMetadata.setLogFile(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Outputs")) {
                automationExecutionMetadata.setOutputs(new MapUnmarshaller<java.util.List<String>>(
                        new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                        )
                                .unmarshall(context));
            } else if (name.equals("Mode")) {
                automationExecutionMetadata.setMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParentAutomationExecutionId")) {
                automationExecutionMetadata.setParentAutomationExecutionId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CurrentStepName")) {
                automationExecutionMetadata.setCurrentStepName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CurrentAction")) {
                automationExecutionMetadata.setCurrentAction(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureMessage")) {
                automationExecutionMetadata.setFailureMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TargetParameterName")) {
                automationExecutionMetadata.setTargetParameterName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Targets")) {
                automationExecutionMetadata.setTargets(new ListUnmarshaller<Target>(
                        TargetJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("TargetMaps")) {
                automationExecutionMetadata
                        .setTargetMaps(new ListUnmarshaller<java.util.Map<String, java.util.List<String>>>(
                                new MapUnmarshaller<java.util.List<String>>(
                                        new ListUnmarshaller<String>(StringJsonUnmarshaller
                                                .getInstance()
                                        )
                                )
                        )
                                .unmarshall(context));
            } else if (name.equals("ResolvedTargets")) {
                automationExecutionMetadata.setResolvedTargets(ResolvedTargetsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxConcurrency")) {
                automationExecutionMetadata.setMaxConcurrency(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxErrors")) {
                automationExecutionMetadata.setMaxErrors(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Target")) {
                automationExecutionMetadata.setTarget(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AutomationType")) {
                automationExecutionMetadata.setAutomationType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return automationExecutionMetadata;
    }

    private static AutomationExecutionMetadataJsonUnmarshaller instance;

    public static AutomationExecutionMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AutomationExecutionMetadataJsonUnmarshaller();
        return instance;
    }
}
