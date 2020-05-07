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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Operation
 */
class OperationJsonMarshaller {

    public void marshall(Operation operation, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (operation.getId() != null) {
            String id = operation.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (operation.getResourceName() != null) {
            String resourceName = operation.getResourceName();
            jsonWriter.name("resourceName");
            jsonWriter.value(resourceName);
        }
        if (operation.getResourceType() != null) {
            String resourceType = operation.getResourceType();
            jsonWriter.name("resourceType");
            jsonWriter.value(resourceType);
        }
        if (operation.getCreatedAt() != null) {
            java.util.Date createdAt = operation.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (operation.getLocation() != null) {
            ResourceLocation location = operation.getLocation();
            jsonWriter.name("location");
            ResourceLocationJsonMarshaller.getInstance().marshall(location, jsonWriter);
        }
        if (operation.getIsTerminal() != null) {
            Boolean isTerminal = operation.getIsTerminal();
            jsonWriter.name("isTerminal");
            jsonWriter.value(isTerminal);
        }
        if (operation.getOperationDetails() != null) {
            String operationDetails = operation.getOperationDetails();
            jsonWriter.name("operationDetails");
            jsonWriter.value(operationDetails);
        }
        if (operation.getOperationType() != null) {
            String operationType = operation.getOperationType();
            jsonWriter.name("operationType");
            jsonWriter.value(operationType);
        }
        if (operation.getStatus() != null) {
            String status = operation.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (operation.getStatusChangedAt() != null) {
            java.util.Date statusChangedAt = operation.getStatusChangedAt();
            jsonWriter.name("statusChangedAt");
            jsonWriter.value(statusChangedAt);
        }
        if (operation.getErrorCode() != null) {
            String errorCode = operation.getErrorCode();
            jsonWriter.name("errorCode");
            jsonWriter.value(errorCode);
        }
        if (operation.getErrorDetails() != null) {
            String errorDetails = operation.getErrorDetails();
            jsonWriter.name("errorDetails");
            jsonWriter.value(errorDetails);
        }
        jsonWriter.endObject();
    }

    private static OperationJsonMarshaller instance;

    public static OperationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OperationJsonMarshaller();
        return instance;
    }
}
