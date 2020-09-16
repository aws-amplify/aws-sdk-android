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
 * JSON marshaller for POJO InstanceAssociationStatusInfo
 */
class InstanceAssociationStatusInfoJsonMarshaller {

    public void marshall(InstanceAssociationStatusInfo instanceAssociationStatusInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instanceAssociationStatusInfo.getAssociationId() != null) {
            String associationId = instanceAssociationStatusInfo.getAssociationId();
            jsonWriter.name("AssociationId");
            jsonWriter.value(associationId);
        }
        if (instanceAssociationStatusInfo.getName() != null) {
            String name = instanceAssociationStatusInfo.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (instanceAssociationStatusInfo.getDocumentVersion() != null) {
            String documentVersion = instanceAssociationStatusInfo.getDocumentVersion();
            jsonWriter.name("DocumentVersion");
            jsonWriter.value(documentVersion);
        }
        if (instanceAssociationStatusInfo.getAssociationVersion() != null) {
            String associationVersion = instanceAssociationStatusInfo.getAssociationVersion();
            jsonWriter.name("AssociationVersion");
            jsonWriter.value(associationVersion);
        }
        if (instanceAssociationStatusInfo.getInstanceId() != null) {
            String instanceId = instanceAssociationStatusInfo.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (instanceAssociationStatusInfo.getExecutionDate() != null) {
            java.util.Date executionDate = instanceAssociationStatusInfo.getExecutionDate();
            jsonWriter.name("ExecutionDate");
            jsonWriter.value(executionDate);
        }
        if (instanceAssociationStatusInfo.getStatus() != null) {
            String status = instanceAssociationStatusInfo.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (instanceAssociationStatusInfo.getDetailedStatus() != null) {
            String detailedStatus = instanceAssociationStatusInfo.getDetailedStatus();
            jsonWriter.name("DetailedStatus");
            jsonWriter.value(detailedStatus);
        }
        if (instanceAssociationStatusInfo.getExecutionSummary() != null) {
            String executionSummary = instanceAssociationStatusInfo.getExecutionSummary();
            jsonWriter.name("ExecutionSummary");
            jsonWriter.value(executionSummary);
        }
        if (instanceAssociationStatusInfo.getErrorCode() != null) {
            String errorCode = instanceAssociationStatusInfo.getErrorCode();
            jsonWriter.name("ErrorCode");
            jsonWriter.value(errorCode);
        }
        if (instanceAssociationStatusInfo.getOutputUrl() != null) {
            InstanceAssociationOutputUrl outputUrl = instanceAssociationStatusInfo.getOutputUrl();
            jsonWriter.name("OutputUrl");
            InstanceAssociationOutputUrlJsonMarshaller.getInstance().marshall(outputUrl, jsonWriter);
        }
        if (instanceAssociationStatusInfo.getAssociationName() != null) {
            String associationName = instanceAssociationStatusInfo.getAssociationName();
            jsonWriter.name("AssociationName");
            jsonWriter.value(associationName);
        }
        jsonWriter.endObject();
    }

    private static InstanceAssociationStatusInfoJsonMarshaller instance;
    public static InstanceAssociationStatusInfoJsonMarshaller getInstance() {
        if (instance == null) instance = new InstanceAssociationStatusInfoJsonMarshaller();
        return instance;
    }
}
