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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO PolicyComplianceStatus
 */
class PolicyComplianceStatusJsonUnmarshaller implements
        Unmarshaller<PolicyComplianceStatus, JsonUnmarshallerContext> {

    public PolicyComplianceStatus unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PolicyComplianceStatus policyComplianceStatus = new PolicyComplianceStatus();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("PolicyOwner")) {
                policyComplianceStatus.setPolicyOwner(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PolicyId")) {
                policyComplianceStatus.setPolicyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PolicyName")) {
                policyComplianceStatus.setPolicyName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MemberAccount")) {
                policyComplianceStatus.setMemberAccount(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EvaluationResults")) {
                policyComplianceStatus.setEvaluationResults(new ListUnmarshaller<EvaluationResult>(
                        EvaluationResultJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("LastUpdated")) {
                policyComplianceStatus.setLastUpdated(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IssueInfoMap")) {
                policyComplianceStatus.setIssueInfoMap(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return policyComplianceStatus;
    }

    private static PolicyComplianceStatusJsonUnmarshaller instance;

    public static PolicyComplianceStatusJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PolicyComplianceStatusJsonUnmarshaller();
        return instance;
    }
}
