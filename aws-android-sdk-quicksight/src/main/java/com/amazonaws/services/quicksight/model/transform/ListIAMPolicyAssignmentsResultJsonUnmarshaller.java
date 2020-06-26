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
 * JSON unmarshaller for response ListIAMPolicyAssignmentsResult
 */
public class ListIAMPolicyAssignmentsResultJsonUnmarshaller implements
        Unmarshaller<ListIAMPolicyAssignmentsResult, JsonUnmarshallerContext> {

    public ListIAMPolicyAssignmentsResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        ListIAMPolicyAssignmentsResult listIAMPolicyAssignmentsResult = new ListIAMPolicyAssignmentsResult();

        listIAMPolicyAssignmentsResult.setStatus(context.getHttpResponse().getStatusCode());
        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("IAMPolicyAssignments")) {
                listIAMPolicyAssignmentsResult
                        .setIAMPolicyAssignments(new ListUnmarshaller<IAMPolicyAssignmentSummary>(
                                IAMPolicyAssignmentSummaryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                listIAMPolicyAssignmentsResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequestId")) {
                listIAMPolicyAssignmentsResult.setRequestId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                listIAMPolicyAssignmentsResult.setStatus(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listIAMPolicyAssignmentsResult;
    }

    private static ListIAMPolicyAssignmentsResultJsonUnmarshaller instance;

    public static ListIAMPolicyAssignmentsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListIAMPolicyAssignmentsResultJsonUnmarshaller();
        return instance;
    }
}
