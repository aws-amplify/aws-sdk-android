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
 * JSON unmarshaller for POJO AssociationDescription
 */
class AssociationDescriptionJsonUnmarshaller implements
        Unmarshaller<AssociationDescription, JsonUnmarshallerContext> {

    public AssociationDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AssociationDescription associationDescription = new AssociationDescription();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                associationDescription.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceId")) {
                associationDescription.setInstanceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AssociationVersion")) {
                associationDescription.setAssociationVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Date")) {
                associationDescription.setDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdateAssociationDate")) {
                associationDescription.setLastUpdateAssociationDate(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                associationDescription.setStatus(AssociationStatusJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Overview")) {
                associationDescription.setOverview(AssociationOverviewJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DocumentVersion")) {
                associationDescription.setDocumentVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AutomationTargetParameterName")) {
                associationDescription.setAutomationTargetParameterName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Parameters")) {
                associationDescription.setParameters(new MapUnmarshaller<java.util.List<String>>(
                        new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                        )
                                .unmarshall(context));
            } else if (name.equals("AssociationId")) {
                associationDescription.setAssociationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Targets")) {
                associationDescription.setTargets(new ListUnmarshaller<Target>(
                        TargetJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ScheduleExpression")) {
                associationDescription.setScheduleExpression(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutputLocation")) {
                associationDescription
                        .setOutputLocation(InstanceAssociationOutputLocationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("LastExecutionDate")) {
                associationDescription.setLastExecutionDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastSuccessfulExecutionDate")) {
                associationDescription.setLastSuccessfulExecutionDate(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AssociationName")) {
                associationDescription.setAssociationName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxErrors")) {
                associationDescription.setMaxErrors(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxConcurrency")) {
                associationDescription.setMaxConcurrency(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ComplianceSeverity")) {
                associationDescription.setComplianceSeverity(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SyncCompliance")) {
                associationDescription.setSyncCompliance(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ApplyOnlyAtCronInterval")) {
                associationDescription.setApplyOnlyAtCronInterval(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return associationDescription;
    }

    private static AssociationDescriptionJsonUnmarshaller instance;

    public static AssociationDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssociationDescriptionJsonUnmarshaller();
        return instance;
    }
}
