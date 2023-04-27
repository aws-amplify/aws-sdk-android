/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeContactEvaluationResult
 */
public class DescribeContactEvaluationResultJsonUnmarshaller implements
        Unmarshaller<DescribeContactEvaluationResult, JsonUnmarshallerContext> {

    public DescribeContactEvaluationResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeContactEvaluationResult describeContactEvaluationResult = new DescribeContactEvaluationResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Evaluation")) {
                describeContactEvaluationResult.setEvaluation(EvaluationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EvaluationForm")) {
                describeContactEvaluationResult
                        .setEvaluationForm(EvaluationFormContentJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeContactEvaluationResult;
    }

    private static DescribeContactEvaluationResultJsonUnmarshaller instance;

    public static DescribeContactEvaluationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeContactEvaluationResultJsonUnmarshaller();
        return instance;
    }
}
