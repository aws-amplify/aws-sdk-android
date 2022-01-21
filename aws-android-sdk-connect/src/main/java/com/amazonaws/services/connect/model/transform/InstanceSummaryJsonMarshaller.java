/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InstanceSummary
 */
class InstanceSummaryJsonMarshaller {

    public void marshall(InstanceSummary instanceSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instanceSummary.getId() != null) {
            String id = instanceSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (instanceSummary.getArn() != null) {
            String arn = instanceSummary.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (instanceSummary.getIdentityManagementType() != null) {
            String identityManagementType = instanceSummary.getIdentityManagementType();
            jsonWriter.name("IdentityManagementType");
            jsonWriter.value(identityManagementType);
        }
        if (instanceSummary.getInstanceAlias() != null) {
            String instanceAlias = instanceSummary.getInstanceAlias();
            jsonWriter.name("InstanceAlias");
            jsonWriter.value(instanceAlias);
        }
        if (instanceSummary.getCreatedTime() != null) {
            java.util.Date createdTime = instanceSummary.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (instanceSummary.getServiceRole() != null) {
            String serviceRole = instanceSummary.getServiceRole();
            jsonWriter.name("ServiceRole");
            jsonWriter.value(serviceRole);
        }
        if (instanceSummary.getInstanceStatus() != null) {
            String instanceStatus = instanceSummary.getInstanceStatus();
            jsonWriter.name("InstanceStatus");
            jsonWriter.value(instanceStatus);
        }
        if (instanceSummary.getInboundCallsEnabled() != null) {
            Boolean inboundCallsEnabled = instanceSummary.getInboundCallsEnabled();
            jsonWriter.name("InboundCallsEnabled");
            jsonWriter.value(inboundCallsEnabled);
        }
        if (instanceSummary.getOutboundCallsEnabled() != null) {
            Boolean outboundCallsEnabled = instanceSummary.getOutboundCallsEnabled();
            jsonWriter.name("OutboundCallsEnabled");
            jsonWriter.value(outboundCallsEnabled);
        }
        jsonWriter.endObject();
    }

    private static InstanceSummaryJsonMarshaller instance;

    public static InstanceSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceSummaryJsonMarshaller();
        return instance;
    }
}
