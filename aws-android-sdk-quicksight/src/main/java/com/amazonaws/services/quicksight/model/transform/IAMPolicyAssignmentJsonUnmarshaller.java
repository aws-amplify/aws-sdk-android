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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO IAMPolicyAssignment
 */
class IAMPolicyAssignmentJsonUnmarshaller implements
        Unmarshaller<IAMPolicyAssignment, JsonUnmarshallerContext> {

    public IAMPolicyAssignment unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        IAMPolicyAssignment iAMPolicyAssignment = new IAMPolicyAssignment();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AwsAccountId")) {
                iAMPolicyAssignment.setAwsAccountId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AssignmentId")) {
                iAMPolicyAssignment.setAssignmentId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AssignmentName")) {
                iAMPolicyAssignment.setAssignmentName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PolicyArn")) {
                iAMPolicyAssignment.setPolicyArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Identities")) {
                iAMPolicyAssignment.setIdentities(new MapUnmarshaller<java.util.List<String>>(
                        new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                        )
                                .unmarshall(context));
            } else if (name.equals("AssignmentStatus")) {
                iAMPolicyAssignment.setAssignmentStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return iAMPolicyAssignment;
    }

    private static IAMPolicyAssignmentJsonUnmarshaller instance;

    public static IAMPolicyAssignmentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new IAMPolicyAssignmentJsonUnmarshaller();
        return instance;
    }
}
