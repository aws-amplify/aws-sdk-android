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
 * JSON unmarshaller for response CreateIAMPolicyAssignmentResult
 */
public class CreateIAMPolicyAssignmentResultJsonUnmarshaller implements
        Unmarshaller<CreateIAMPolicyAssignmentResult, JsonUnmarshallerContext> {

    public CreateIAMPolicyAssignmentResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        CreateIAMPolicyAssignmentResult createIAMPolicyAssignmentResult = new CreateIAMPolicyAssignmentResult();

        createIAMPolicyAssignmentResult.setStatus(context.getHttpResponse().getStatusCode());
        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AssignmentName")) {
                createIAMPolicyAssignmentResult.setAssignmentName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AssignmentId")) {
                createIAMPolicyAssignmentResult.setAssignmentId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AssignmentStatus")) {
                createIAMPolicyAssignmentResult.setAssignmentStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PolicyArn")) {
                createIAMPolicyAssignmentResult.setPolicyArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Identities")) {
                createIAMPolicyAssignmentResult
                        .setIdentities(new MapUnmarshaller<java.util.List<String>>(
                                new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                                )
                        )
                                .unmarshall(context));
            } else if (name.equals("RequestId")) {
                createIAMPolicyAssignmentResult.setRequestId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                createIAMPolicyAssignmentResult.setStatus(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createIAMPolicyAssignmentResult;
    }

    private static CreateIAMPolicyAssignmentResultJsonUnmarshaller instance;

    public static CreateIAMPolicyAssignmentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateIAMPolicyAssignmentResultJsonUnmarshaller();
        return instance;
    }
}
