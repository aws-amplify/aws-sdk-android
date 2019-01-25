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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AuditFinding
 */
class AuditFindingJsonUnmarshaller implements Unmarshaller<AuditFinding, JsonUnmarshallerContext> {

    public AuditFinding unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AuditFinding auditFinding = new AuditFinding();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("taskId")) {
                auditFinding.setTaskId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("checkName")) {
                auditFinding.setCheckName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("taskStartTime")) {
                auditFinding.setTaskStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("findingTime")) {
                auditFinding.setFindingTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("severity")) {
                auditFinding.setSeverity(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("nonCompliantResource")) {
                auditFinding.setNonCompliantResource(NonCompliantResourceJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("relatedResources")) {
                auditFinding.setRelatedResources(new ListUnmarshaller<RelatedResource>(
                        RelatedResourceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("reasonForNonCompliance")) {
                auditFinding.setReasonForNonCompliance(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("reasonForNonComplianceCode")) {
                auditFinding.setReasonForNonComplianceCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return auditFinding;
    }

    private static AuditFindingJsonUnmarshaller instance;

    public static AuditFindingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AuditFindingJsonUnmarshaller();
        return instance;
    }
}
