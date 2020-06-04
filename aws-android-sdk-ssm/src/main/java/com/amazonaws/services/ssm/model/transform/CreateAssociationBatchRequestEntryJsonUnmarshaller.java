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
 * JSON unmarshaller for POJO CreateAssociationBatchRequestEntry
 */
class CreateAssociationBatchRequestEntryJsonUnmarshaller implements
        Unmarshaller<CreateAssociationBatchRequestEntry, JsonUnmarshallerContext> {

    public CreateAssociationBatchRequestEntry unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CreateAssociationBatchRequestEntry createAssociationBatchRequestEntry = new CreateAssociationBatchRequestEntry();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                createAssociationBatchRequestEntry.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceId")) {
                createAssociationBatchRequestEntry.setInstanceId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Parameters")) {
                createAssociationBatchRequestEntry
                        .setParameters(new MapUnmarshaller<java.util.List<String>>(
                                new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                                )
                        )
                                .unmarshall(context));
            } else if (name.equals("AutomationTargetParameterName")) {
                createAssociationBatchRequestEntry
                        .setAutomationTargetParameterName(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("DocumentVersion")) {
                createAssociationBatchRequestEntry.setDocumentVersion(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Targets")) {
                createAssociationBatchRequestEntry.setTargets(new ListUnmarshaller<Target>(
                        TargetJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ScheduleExpression")) {
                createAssociationBatchRequestEntry.setScheduleExpression(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutputLocation")) {
                createAssociationBatchRequestEntry
                        .setOutputLocation(InstanceAssociationOutputLocationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("AssociationName")) {
                createAssociationBatchRequestEntry.setAssociationName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxErrors")) {
                createAssociationBatchRequestEntry.setMaxErrors(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxConcurrency")) {
                createAssociationBatchRequestEntry.setMaxConcurrency(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ComplianceSeverity")) {
                createAssociationBatchRequestEntry.setComplianceSeverity(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SyncCompliance")) {
                createAssociationBatchRequestEntry.setSyncCompliance(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ApplyOnlyAtCronInterval")) {
                createAssociationBatchRequestEntry
                        .setApplyOnlyAtCronInterval(BooleanJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return createAssociationBatchRequestEntry;
    }

    private static CreateAssociationBatchRequestEntryJsonUnmarshaller instance;

    public static CreateAssociationBatchRequestEntryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateAssociationBatchRequestEntryJsonUnmarshaller();
        return instance;
    }
}
