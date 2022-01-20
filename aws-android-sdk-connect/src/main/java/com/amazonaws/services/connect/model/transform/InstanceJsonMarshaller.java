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
 * JSON marshaller for POJO Instance
 */
class InstanceJsonMarshaller {

    public void marshall(Instance instance, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instance.getId() != null) {
            String id = instance.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (instance.getArn() != null) {
            String arn = instance.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (instance.getIdentityManagementType() != null) {
            String identityManagementType = instance.getIdentityManagementType();
            jsonWriter.name("IdentityManagementType");
            jsonWriter.value(identityManagementType);
        }
        if (instance.getInstanceAlias() != null) {
            String instanceAlias = instance.getInstanceAlias();
            jsonWriter.name("InstanceAlias");
            jsonWriter.value(instanceAlias);
        }
        if (instance.getCreatedTime() != null) {
            java.util.Date createdTime = instance.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (instance.getServiceRole() != null) {
            String serviceRole = instance.getServiceRole();
            jsonWriter.name("ServiceRole");
            jsonWriter.value(serviceRole);
        }
        if (instance.getInstanceStatus() != null) {
            String instanceStatus = instance.getInstanceStatus();
            jsonWriter.name("InstanceStatus");
            jsonWriter.value(instanceStatus);
        }
        if (instance.getStatusReason() != null) {
            InstanceStatusReason statusReason = instance.getStatusReason();
            jsonWriter.name("StatusReason");
            InstanceStatusReasonJsonMarshaller.getInstance().marshall(statusReason, jsonWriter);
        }
        if (instance.getInboundCallsEnabled() != null) {
            Boolean inboundCallsEnabled = instance.getInboundCallsEnabled();
            jsonWriter.name("InboundCallsEnabled");
            jsonWriter.value(inboundCallsEnabled);
        }
        if (instance.getOutboundCallsEnabled() != null) {
            Boolean outboundCallsEnabled = instance.getOutboundCallsEnabled();
            jsonWriter.name("OutboundCallsEnabled");
            jsonWriter.value(outboundCallsEnabled);
        }
        jsonWriter.endObject();
    }

    private static InstanceJsonMarshaller instance;

    public static InstanceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceJsonMarshaller();
        return instance;
    }
}
