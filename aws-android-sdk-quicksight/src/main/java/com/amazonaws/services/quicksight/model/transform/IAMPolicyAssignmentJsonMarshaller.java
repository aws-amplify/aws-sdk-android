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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO IAMPolicyAssignment
 */
class IAMPolicyAssignmentJsonMarshaller {

    public void marshall(IAMPolicyAssignment iAMPolicyAssignment, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (iAMPolicyAssignment.getAwsAccountId() != null) {
            String awsAccountId = iAMPolicyAssignment.getAwsAccountId();
            jsonWriter.name("AwsAccountId");
            jsonWriter.value(awsAccountId);
        }
        if (iAMPolicyAssignment.getAssignmentId() != null) {
            String assignmentId = iAMPolicyAssignment.getAssignmentId();
            jsonWriter.name("AssignmentId");
            jsonWriter.value(assignmentId);
        }
        if (iAMPolicyAssignment.getAssignmentName() != null) {
            String assignmentName = iAMPolicyAssignment.getAssignmentName();
            jsonWriter.name("AssignmentName");
            jsonWriter.value(assignmentName);
        }
        if (iAMPolicyAssignment.getPolicyArn() != null) {
            String policyArn = iAMPolicyAssignment.getPolicyArn();
            jsonWriter.name("PolicyArn");
            jsonWriter.value(policyArn);
        }
        if (iAMPolicyAssignment.getIdentities() != null) {
            java.util.Map<String, java.util.List<String>> identities = iAMPolicyAssignment
                    .getIdentities();
            jsonWriter.name("Identities");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, java.util.List<String>> identitiesEntry : identities
                    .entrySet()) {
                java.util.List<String> identitiesValue = identitiesEntry.getValue();
                if (identitiesValue != null) {
                    jsonWriter.name(identitiesEntry.getKey());
                    jsonWriter.beginArray();
                    for (String identitiesValueItem : identitiesValue) {
                        if (identitiesValueItem != null) {
                            jsonWriter.value(identitiesValueItem);
                        }
                    }
                    jsonWriter.endArray();
                }
            }
            jsonWriter.endObject();
        }
        if (iAMPolicyAssignment.getAssignmentStatus() != null) {
            String assignmentStatus = iAMPolicyAssignment.getAssignmentStatus();
            jsonWriter.name("AssignmentStatus");
            jsonWriter.value(assignmentStatus);
        }
        jsonWriter.endObject();
    }

    private static IAMPolicyAssignmentJsonMarshaller instance;

    public static IAMPolicyAssignmentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IAMPolicyAssignmentJsonMarshaller();
        return instance;
    }
}
