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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Association
 */
class AssociationJsonMarshaller {

    public void marshall(Association association, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (association.getName() != null) {
            String name = association.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (association.getInstanceId() != null) {
            String instanceId = association.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (association.getAssociationId() != null) {
            String associationId = association.getAssociationId();
            jsonWriter.name("AssociationId");
            jsonWriter.value(associationId);
        }
        if (association.getAssociationVersion() != null) {
            String associationVersion = association.getAssociationVersion();
            jsonWriter.name("AssociationVersion");
            jsonWriter.value(associationVersion);
        }
        if (association.getDocumentVersion() != null) {
            String documentVersion = association.getDocumentVersion();
            jsonWriter.name("DocumentVersion");
            jsonWriter.value(documentVersion);
        }
        if (association.getTargets() != null) {
            java.util.List<Target> targets = association.getTargets();
            jsonWriter.name("Targets");
            jsonWriter.beginArray();
            for (Target targetsItem : targets) {
                if (targetsItem != null) {
            TargetJsonMarshaller.getInstance().marshall(targetsItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        if (association.getLastExecutionDate() != null) {
            java.util.Date lastExecutionDate = association.getLastExecutionDate();
            jsonWriter.name("LastExecutionDate");
            jsonWriter.value(lastExecutionDate);
        }
        if (association.getOverview() != null) {
            AssociationOverview overview = association.getOverview();
            jsonWriter.name("Overview");
            AssociationOverviewJsonMarshaller.getInstance().marshall(overview, jsonWriter);
        }
        if (association.getScheduleExpression() != null) {
            String scheduleExpression = association.getScheduleExpression();
            jsonWriter.name("ScheduleExpression");
            jsonWriter.value(scheduleExpression);
        }
        if (association.getAssociationName() != null) {
            String associationName = association.getAssociationName();
            jsonWriter.name("AssociationName");
            jsonWriter.value(associationName);
        }
        jsonWriter.endObject();
    }

    private static AssociationJsonMarshaller instance;
    public static AssociationJsonMarshaller getInstance() {
        if (instance == null) instance = new AssociationJsonMarshaller();
        return instance;
    }
}
