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
 * JSON marshaller for POJO AuditSuppression
 */
class AuditSuppressionJsonMarshaller {

    public void marshall(AuditSuppression auditSuppression, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (auditSuppression.getCheckName() != null) {
            String checkName = auditSuppression.getCheckName();
            jsonWriter.name("checkName");
            jsonWriter.value(checkName);
        }
        if (auditSuppression.getResourceIdentifier() != null) {
            ResourceIdentifier resourceIdentifier = auditSuppression.getResourceIdentifier();
            jsonWriter.name("resourceIdentifier");
            ResourceIdentifierJsonMarshaller.getInstance().marshall(resourceIdentifier, jsonWriter);
        }
        if (auditSuppression.getExpirationDate() != null) {
            java.util.Date expirationDate = auditSuppression.getExpirationDate();
            jsonWriter.name("expirationDate");
            jsonWriter.value(expirationDate);
        }
        if (auditSuppression.getSuppressIndefinitely() != null) {
            Boolean suppressIndefinitely = auditSuppression.getSuppressIndefinitely();
            jsonWriter.name("suppressIndefinitely");
            jsonWriter.value(suppressIndefinitely);
        }
        if (auditSuppression.getDescription() != null) {
            String description = auditSuppression.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        jsonWriter.endObject();
    }

    private static AuditSuppressionJsonMarshaller instance;

    public static AuditSuppressionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AuditSuppressionJsonMarshaller();
        return instance;
    }
}
