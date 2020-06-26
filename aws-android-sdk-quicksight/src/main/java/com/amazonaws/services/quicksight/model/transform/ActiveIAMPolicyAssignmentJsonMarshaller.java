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
 * JSON marshaller for POJO ActiveIAMPolicyAssignment
 */
class ActiveIAMPolicyAssignmentJsonMarshaller {

    public void marshall(ActiveIAMPolicyAssignment activeIAMPolicyAssignment,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (activeIAMPolicyAssignment.getAssignmentName() != null) {
            String assignmentName = activeIAMPolicyAssignment.getAssignmentName();
            jsonWriter.name("AssignmentName");
            jsonWriter.value(assignmentName);
        }
        if (activeIAMPolicyAssignment.getPolicyArn() != null) {
            String policyArn = activeIAMPolicyAssignment.getPolicyArn();
            jsonWriter.name("PolicyArn");
            jsonWriter.value(policyArn);
        }
        jsonWriter.endObject();
    }

    private static ActiveIAMPolicyAssignmentJsonMarshaller instance;

    public static ActiveIAMPolicyAssignmentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActiveIAMPolicyAssignmentJsonMarshaller();
        return instance;
    }
}
