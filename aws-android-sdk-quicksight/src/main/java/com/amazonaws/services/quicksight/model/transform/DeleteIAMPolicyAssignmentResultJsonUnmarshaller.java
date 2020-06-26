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
 * JSON unmarshaller for response DeleteIAMPolicyAssignmentResult
 */
public class DeleteIAMPolicyAssignmentResultJsonUnmarshaller implements
        Unmarshaller<DeleteIAMPolicyAssignmentResult, JsonUnmarshallerContext> {

    public DeleteIAMPolicyAssignmentResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DeleteIAMPolicyAssignmentResult deleteIAMPolicyAssignmentResult = new DeleteIAMPolicyAssignmentResult();

        deleteIAMPolicyAssignmentResult.setStatus(context.getHttpResponse().getStatusCode());
        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AssignmentName")) {
                deleteIAMPolicyAssignmentResult.setAssignmentName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequestId")) {
                deleteIAMPolicyAssignmentResult.setRequestId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                deleteIAMPolicyAssignmentResult.setStatus(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return deleteIAMPolicyAssignmentResult;
    }

    private static DeleteIAMPolicyAssignmentResultJsonUnmarshaller instance;

    public static DeleteIAMPolicyAssignmentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteIAMPolicyAssignmentResultJsonUnmarshaller();
        return instance;
    }
}
