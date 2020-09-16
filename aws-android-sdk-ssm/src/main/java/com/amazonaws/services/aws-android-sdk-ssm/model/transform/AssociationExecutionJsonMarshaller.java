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
 * JSON marshaller for POJO AssociationExecution
 */
class AssociationExecutionJsonMarshaller {

    public void marshall(AssociationExecution associationExecution, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (associationExecution.getAssociationId() != null) {
            String associationId = associationExecution.getAssociationId();
            jsonWriter.name("AssociationId");
            jsonWriter.value(associationId);
        }
        if (associationExecution.getAssociationVersion() != null) {
            String associationVersion = associationExecution.getAssociationVersion();
            jsonWriter.name("AssociationVersion");
            jsonWriter.value(associationVersion);
        }
        if (associationExecution.getExecutionId() != null) {
            String executionId = associationExecution.getExecutionId();
            jsonWriter.name("ExecutionId");
            jsonWriter.value(executionId);
        }
        if (associationExecution.getStatus() != null) {
            String status = associationExecution.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (associationExecution.getDetailedStatus() != null) {
            String detailedStatus = associationExecution.getDetailedStatus();
            jsonWriter.name("DetailedStatus");
            jsonWriter.value(detailedStatus);
        }
        if (associationExecution.getCreatedTime() != null) {
            java.util.Date createdTime = associationExecution.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (associationExecution.getLastExecutionDate() != null) {
            java.util.Date lastExecutionDate = associationExecution.getLastExecutionDate();
            jsonWriter.name("LastExecutionDate");
            jsonWriter.value(lastExecutionDate);
        }
        if (associationExecution.getResourceCountByStatus() != null) {
            String resourceCountByStatus = associationExecution.getResourceCountByStatus();
            jsonWriter.name("ResourceCountByStatus");
            jsonWriter.value(resourceCountByStatus);
        }
        jsonWriter.endObject();
    }

    private static AssociationExecutionJsonMarshaller instance;
    public static AssociationExecutionJsonMarshaller getInstance() {
        if (instance == null) instance = new AssociationExecutionJsonMarshaller();
        return instance;
    }
}
