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
 * JSON marshaller for POJO PolicySummary
 */
class PolicySummaryJsonMarshaller {

    public void marshall(PolicySummary policySummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (policySummary.getPolicyArn() != null) {
            String policyArn = policySummary.getPolicyArn();
            jsonWriter.name("PolicyArn");
            jsonWriter.value(policyArn);
        }
        if (policySummary.getPolicyId() != null) {
            String policyId = policySummary.getPolicyId();
            jsonWriter.name("PolicyId");
            jsonWriter.value(policyId);
        }
        if (policySummary.getPolicyName() != null) {
            String policyName = policySummary.getPolicyName();
            jsonWriter.name("PolicyName");
            jsonWriter.value(policyName);
        }
        if (policySummary.getResourceType() != null) {
            String resourceType = policySummary.getResourceType();
            jsonWriter.name("ResourceType");
            jsonWriter.value(resourceType);
        }
        if (policySummary.getSecurityServiceType() != null) {
            String securityServiceType = policySummary.getSecurityServiceType();
            jsonWriter.name("SecurityServiceType");
            jsonWriter.value(securityServiceType);
        }
        if (policySummary.getRemediationEnabled() != null) {
            Boolean remediationEnabled = policySummary.getRemediationEnabled();
            jsonWriter.name("RemediationEnabled");
            jsonWriter.value(remediationEnabled);
        }
        jsonWriter.endObject();
    }

    private static PolicySummaryJsonMarshaller instance;

    public static PolicySummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PolicySummaryJsonMarshaller();
        return instance;
    }
}
