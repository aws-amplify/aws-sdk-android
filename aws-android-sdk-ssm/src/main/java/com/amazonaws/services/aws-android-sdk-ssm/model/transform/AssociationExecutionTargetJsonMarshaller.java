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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AssociationExecutionTarget
 */
class AssociationExecutionTargetJsonMarshaller {

    public void marshall(AssociationExecutionTarget associationExecutionTarget, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (associationExecutionTarget.getAssociationId() != null) {
            String associationId = associationExecutionTarget.getAssociationId();
            jsonWriter.name("AssociationId");
            jsonWriter.value(associationId);
        }
        if (associationExecutionTarget.getAssociationVersion() != null) {
            String associationVersion = associationExecutionTarget.getAssociationVersion();
            jsonWriter.name("AssociationVersion");
            jsonWriter.value(associationVersion);
        }
        if (associationExecutionTarget.getExecutionId() != null) {
            String executionId = associationExecutionTarget.getExecutionId();
            jsonWriter.name("ExecutionId");
            jsonWriter.value(executionId);
        }
        if (associationExecutionTarget.getResourceId() != null) {
            String resourceId = associationExecutionTarget.getResourceId();
            jsonWriter.name("ResourceId");
            jsonWriter.value(resourceId);
        }
        if (associationExecutionTarget.getResourceType() != null) {
            String resourceType = associationExecutionTarget.getResourceType();
            jsonWriter.name("ResourceType");
            jsonWriter.value(resourceType);
        }
        if (associationExecutionTarget.getStatus() != null) {
            String status = associationExecutionTarget.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (associationExecutionTarget.getDetailedStatus() != null) {
            String detailedStatus = associationExecutionTarget.getDetailedStatus();
            jsonWriter.name("DetailedStatus");
            jsonWriter.value(detailedStatus);
        }
        if (associationExecutionTarget.getLastExecutionDate() != null) {
            java.util.Date lastExecutionDate = associationExecutionTarget.getLastExecutionDate();
            jsonWriter.name("LastExecutionDate");
            jsonWriter.value(lastExecutionDate);
        }
        if (associationExecutionTarget.getOutputSource() != null) {
            OutputSource outputSource = associationExecutionTarget.getOutputSource();
            jsonWriter.name("OutputSource");
            OutputSourceJsonMarshaller.getInstance().marshall(outputSource, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AssociationExecutionTargetJsonMarshaller instance;
    public static AssociationExecutionTargetJsonMarshaller getInstance() {
        if (instance == null) instance = new AssociationExecutionTargetJsonMarshaller();
        return instance;
    }
}
