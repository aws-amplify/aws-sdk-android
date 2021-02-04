/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AuditMitigationActionExecutionMetadata
 */
class AuditMitigationActionExecutionMetadataJsonUnmarshaller implements
        Unmarshaller<AuditMitigationActionExecutionMetadata, JsonUnmarshallerContext> {

    public AuditMitigationActionExecutionMetadata unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AuditMitigationActionExecutionMetadata auditMitigationActionExecutionMetadata = new AuditMitigationActionExecutionMetadata();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("taskId")) {
                auditMitigationActionExecutionMetadata.setTaskId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("findingId")) {
                auditMitigationActionExecutionMetadata.setFindingId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("actionName")) {
                auditMitigationActionExecutionMetadata.setActionName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("actionId")) {
                auditMitigationActionExecutionMetadata.setActionId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                auditMitigationActionExecutionMetadata.setStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("startTime")) {
                auditMitigationActionExecutionMetadata.setStartTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("endTime")) {
                auditMitigationActionExecutionMetadata.setEndTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("errorCode")) {
                auditMitigationActionExecutionMetadata.setErrorCode(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("message")) {
                auditMitigationActionExecutionMetadata.setMessage(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return auditMitigationActionExecutionMetadata;
    }

    private static AuditMitigationActionExecutionMetadataJsonUnmarshaller instance;

    public static AuditMitigationActionExecutionMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AuditMitigationActionExecutionMetadataJsonUnmarshaller();
        return instance;
    }
}
