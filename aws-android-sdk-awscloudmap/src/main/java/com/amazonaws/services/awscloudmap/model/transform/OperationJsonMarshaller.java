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

package com.amazonaws.services.awscloudmap.model.transform;

import com.amazonaws.services.awscloudmap.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Operation
 */
class OperationJsonMarshaller {

    public void marshall(Operation operation, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (operation.getId() != null) {
            String id = operation.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (operation.getType() != null) {
            String type = operation.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (operation.getStatus() != null) {
            String status = operation.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (operation.getErrorMessage() != null) {
            String errorMessage = operation.getErrorMessage();
            jsonWriter.name("ErrorMessage");
            jsonWriter.value(errorMessage);
        }
        if (operation.getErrorCode() != null) {
            String errorCode = operation.getErrorCode();
            jsonWriter.name("ErrorCode");
            jsonWriter.value(errorCode);
        }
        if (operation.getCreateDate() != null) {
            java.util.Date createDate = operation.getCreateDate();
            jsonWriter.name("CreateDate");
            jsonWriter.value(createDate);
        }
        if (operation.getUpdateDate() != null) {
            java.util.Date updateDate = operation.getUpdateDate();
            jsonWriter.name("UpdateDate");
            jsonWriter.value(updateDate);
        }
        if (operation.getTargets() != null) {
            java.util.Map<String, String> targets = operation.getTargets();
            jsonWriter.name("Targets");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> targetsEntry : targets.entrySet()) {
                String targetsValue = targetsEntry.getValue();
                if (targetsValue != null) {
                    jsonWriter.name(targetsEntry.getKey());
                    jsonWriter.value(targetsValue);
                }
            }
            jsonWriter.endObject();
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
