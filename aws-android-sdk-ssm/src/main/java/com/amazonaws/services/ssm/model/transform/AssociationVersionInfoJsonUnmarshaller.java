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
 * JSON unmarshaller for POJO AssociationVersionInfo
 */
class AssociationVersionInfoJsonUnmarshaller implements
        Unmarshaller<AssociationVersionInfo, JsonUnmarshallerContext> {

    public AssociationVersionInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AssociationVersionInfo associationVersionInfo = new AssociationVersionInfo();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AssociationId")) {
                associationVersionInfo.setAssociationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AssociationVersion")) {
                associationVersionInfo.setAssociationVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedDate")) {
                associationVersionInfo.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                associationVersionInfo.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DocumentVersion")) {
                associationVersionInfo.setDocumentVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Parameters")) {
                associationVersionInfo.setParameters(new MapUnmarshaller<java.util.List<String>>(
                        new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                        )
                                .unmarshall(context));
            } else if (name.equals("Targets")) {
                associationVersionInfo.setTargets(new ListUnmarshaller<Target>(
                        TargetJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ScheduleExpression")) {
                associationVersionInfo.setScheduleExpression(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutputLocation")) {
                associationVersionInfo
                        .setOutputLocation(InstanceAssociationOutputLocationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("AssociationName")) {
                associationVersionInfo.setAssociationName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxErrors")) {
                associationVersionInfo.setMaxErrors(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxConcurrency")) {
                associationVersionInfo.setMaxConcurrency(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ComplianceSeverity")) {
                associationVersionInfo.setComplianceSeverity(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SyncCompliance")) {
                associationVersionInfo.setSyncCompliance(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ApplyOnlyAtCronInterval")) {
                associationVersionInfo.setApplyOnlyAtCronInterval(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return associationVersionInfo;
    }

    private static AssociationVersionInfoJsonUnmarshaller instance;

    public static AssociationVersionInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssociationVersionInfoJsonUnmarshaller();
        return instance;
    }
}
