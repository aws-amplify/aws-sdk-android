/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AuditCheckDetails
 */
class AuditCheckDetailsJsonMarshaller {

    public void marshall(AuditCheckDetails auditCheckDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (auditCheckDetails.getCheckRunStatus() != null) {
            String checkRunStatus = auditCheckDetails.getCheckRunStatus();
            jsonWriter.name("checkRunStatus");
            jsonWriter.value(checkRunStatus);
        }
        if (auditCheckDetails.getCheckCompliant() != null) {
            Boolean checkCompliant = auditCheckDetails.getCheckCompliant();
            jsonWriter.name("checkCompliant");
            jsonWriter.value(checkCompliant);
        }
        if (auditCheckDetails.getTotalResourcesCount() != null) {
            Long totalResourcesCount = auditCheckDetails.getTotalResourcesCount();
            jsonWriter.name("totalResourcesCount");
            jsonWriter.value(totalResourcesCount);
        }
        if (auditCheckDetails.getNonCompliantResourcesCount() != null) {
            Long nonCompliantResourcesCount = auditCheckDetails.getNonCompliantResourcesCount();
            jsonWriter.name("nonCompliantResourcesCount");
            jsonWriter.value(nonCompliantResourcesCount);
        }
        if (auditCheckDetails.getErrorCode() != null) {
            String errorCode = auditCheckDetails.getErrorCode();
            jsonWriter.name("errorCode");
            jsonWriter.value(errorCode);
        }
        if (auditCheckDetails.getMessage() != null) {
            String message = auditCheckDetails.getMessage();
            jsonWriter.name("message");
            jsonWriter.value(message);
        }
        jsonWriter.endObject();
    }

    private static AuditCheckDetailsJsonMarshaller instance;

    public static AuditCheckDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AuditCheckDetailsJsonMarshaller();
        return instance;
    }
}
