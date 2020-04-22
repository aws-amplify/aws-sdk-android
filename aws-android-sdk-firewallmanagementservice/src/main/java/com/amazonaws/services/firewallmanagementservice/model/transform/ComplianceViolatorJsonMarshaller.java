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

package com.amazonaws.services.firewallmanagementservice.model.transform;

import com.amazonaws.services.firewallmanagementservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ComplianceViolator
 */
class ComplianceViolatorJsonMarshaller {

    public void marshall(ComplianceViolator complianceViolator, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (complianceViolator.getResourceId() != null) {
            String resourceId = complianceViolator.getResourceId();
            jsonWriter.name("ResourceId");
            jsonWriter.value(resourceId);
        }
        if (complianceViolator.getViolationReason() != null) {
            String violationReason = complianceViolator.getViolationReason();
            jsonWriter.name("ViolationReason");
            jsonWriter.value(violationReason);
        }
        if (complianceViolator.getResourceType() != null) {
            String resourceType = complianceViolator.getResourceType();
            jsonWriter.name("ResourceType");
            jsonWriter.value(resourceType);
        }
        jsonWriter.endObject();
    }

    private static ComplianceViolatorJsonMarshaller instance;

    public static ComplianceViolatorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ComplianceViolatorJsonMarshaller();
        return instance;
    }
}
