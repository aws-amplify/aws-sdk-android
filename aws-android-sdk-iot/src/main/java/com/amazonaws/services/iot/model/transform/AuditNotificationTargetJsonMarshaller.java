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
 * JSON marshaller for POJO AuditNotificationTarget
 */
class AuditNotificationTargetJsonMarshaller {

    public void marshall(AuditNotificationTarget auditNotificationTarget, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (auditNotificationTarget.getTargetArn() != null) {
            String targetArn = auditNotificationTarget.getTargetArn();
            jsonWriter.name("targetArn");
            jsonWriter.value(targetArn);
        }
        if (auditNotificationTarget.getRoleArn() != null) {
            String roleArn = auditNotificationTarget.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        if (auditNotificationTarget.getEnabled() != null) {
            Boolean enabled = auditNotificationTarget.getEnabled();
            jsonWriter.name("enabled");
            jsonWriter.value(enabled);
        }
        jsonWriter.endObject();
    }

    private static AuditNotificationTargetJsonMarshaller instance;

    public static AuditNotificationTargetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AuditNotificationTargetJsonMarshaller();
        return instance;
    }
}
