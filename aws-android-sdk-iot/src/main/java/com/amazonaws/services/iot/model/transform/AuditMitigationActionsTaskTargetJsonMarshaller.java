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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AuditMitigationActionsTaskTarget
 */
class AuditMitigationActionsTaskTargetJsonMarshaller {

    public void marshall(AuditMitigationActionsTaskTarget auditMitigationActionsTaskTarget,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (auditMitigationActionsTaskTarget.getAuditTaskId() != null) {
            String auditTaskId = auditMitigationActionsTaskTarget.getAuditTaskId();
            jsonWriter.name("auditTaskId");
            jsonWriter.value(auditTaskId);
        }
        if (auditMitigationActionsTaskTarget.getFindingIds() != null) {
            java.util.List<String> findingIds = auditMitigationActionsTaskTarget.getFindingIds();
            jsonWriter.name("findingIds");
            jsonWriter.beginArray();
            for (String findingIdsItem : findingIds) {
                if (findingIdsItem != null) {
                    jsonWriter.value(findingIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (auditMitigationActionsTaskTarget.getAuditCheckToReasonCodeFilter() != null) {
            java.util.Map<String, java.util.List<String>> auditCheckToReasonCodeFilter = auditMitigationActionsTaskTarget
                    .getAuditCheckToReasonCodeFilter();
            jsonWriter.name("auditCheckToReasonCodeFilter");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, java.util.List<String>> auditCheckToReasonCodeFilterEntry : auditCheckToReasonCodeFilter
                    .entrySet()) {
                java.util.List<String> auditCheckToReasonCodeFilterValue = auditCheckToReasonCodeFilterEntry
                        .getValue();
                if (auditCheckToReasonCodeFilterValue != null) {
                    jsonWriter.name(auditCheckToReasonCodeFilterEntry.getKey());
                    jsonWriter.beginArray();
                    for (String auditCheckToReasonCodeFilterValueItem : auditCheckToReasonCodeFilterValue) {
                        if (auditCheckToReasonCodeFilterValueItem != null) {
                            jsonWriter.value(auditCheckToReasonCodeFilterValueItem);
                        }
                    }
                    jsonWriter.endArray();
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static AuditMitigationActionsTaskTargetJsonMarshaller instance;

    public static AuditMitigationActionsTaskTargetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AuditMitigationActionsTaskTargetJsonMarshaller();
        return instance;
    }
}
