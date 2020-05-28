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

package com.amazonaws.services.kafka.model.transform;

import com.amazonaws.services.kafka.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ClusterOperationInfo
 */
class ClusterOperationInfoJsonMarshaller {

    public void marshall(ClusterOperationInfo clusterOperationInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (clusterOperationInfo.getClientRequestId() != null) {
            String clientRequestId = clusterOperationInfo.getClientRequestId();
            jsonWriter.name("ClientRequestId");
            jsonWriter.value(clientRequestId);
        }
        if (clusterOperationInfo.getClusterArn() != null) {
            String clusterArn = clusterOperationInfo.getClusterArn();
            jsonWriter.name("ClusterArn");
            jsonWriter.value(clusterArn);
        }
        if (clusterOperationInfo.getCreationTime() != null) {
            java.util.Date creationTime = clusterOperationInfo.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (clusterOperationInfo.getEndTime() != null) {
            java.util.Date endTime = clusterOperationInfo.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (clusterOperationInfo.getErrorInfo() != null) {
            ErrorInfo errorInfo = clusterOperationInfo.getErrorInfo();
            jsonWriter.name("ErrorInfo");
            ErrorInfoJsonMarshaller.getInstance().marshall(errorInfo, jsonWriter);
        }
        if (clusterOperationInfo.getOperationArn() != null) {
            String operationArn = clusterOperationInfo.getOperationArn();
            jsonWriter.name("OperationArn");
            jsonWriter.value(operationArn);
        }
        if (clusterOperationInfo.getOperationState() != null) {
            String operationState = clusterOperationInfo.getOperationState();
            jsonWriter.name("OperationState");
            jsonWriter.value(operationState);
        }
        if (clusterOperationInfo.getOperationSteps() != null) {
            java.util.List<ClusterOperationStep> operationSteps = clusterOperationInfo
                    .getOperationSteps();
            jsonWriter.name("OperationSteps");
            jsonWriter.beginArray();
            for (ClusterOperationStep operationStepsItem : operationSteps) {
                if (operationStepsItem != null) {
                    ClusterOperationStepJsonMarshaller.getInstance().marshall(operationStepsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (clusterOperationInfo.getOperationType() != null) {
            String operationType = clusterOperationInfo.getOperationType();
            jsonWriter.name("OperationType");
            jsonWriter.value(operationType);
        }
        if (clusterOperationInfo.getSourceClusterInfo() != null) {
            MutableClusterInfo sourceClusterInfo = clusterOperationInfo.getSourceClusterInfo();
            jsonWriter.name("SourceClusterInfo");
            MutableClusterInfoJsonMarshaller.getInstance().marshall(sourceClusterInfo, jsonWriter);
        }
        if (clusterOperationInfo.getTargetClusterInfo() != null) {
            MutableClusterInfo targetClusterInfo = clusterOperationInfo.getTargetClusterInfo();
            jsonWriter.name("TargetClusterInfo");
            MutableClusterInfoJsonMarshaller.getInstance().marshall(targetClusterInfo, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ClusterOperationInfoJsonMarshaller instance;

    public static ClusterOperationInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClusterOperationInfoJsonMarshaller();
        return instance;
    }
}
