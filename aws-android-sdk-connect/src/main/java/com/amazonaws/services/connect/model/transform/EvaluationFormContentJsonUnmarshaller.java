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
 * JSON unmarshaller for POJO EvaluationFormContent
 */
class EvaluationFormContentJsonUnmarshaller implements
        Unmarshaller<EvaluationFormContent, JsonUnmarshallerContext> {

    public EvaluationFormContent unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EvaluationFormContent evaluationFormContent = new EvaluationFormContent();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("EvaluationFormVersion")) {
                evaluationFormContent.setEvaluationFormVersion(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EvaluationFormId")) {
                evaluationFormContent.setEvaluationFormId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EvaluationFormArn")) {
                evaluationFormContent.setEvaluationFormArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Title")) {
                evaluationFormContent.setTitle(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                evaluationFormContent.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Items")) {
                evaluationFormContent.setItems(new ListUnmarshaller<EvaluationFormItem>(
                        EvaluationFormItemJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ScoringStrategy")) {
                evaluationFormContent
                        .setScoringStrategy(EvaluationFormScoringStrategyJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return evaluationFormContent;
    }

    private static EvaluationFormContentJsonUnmarshaller instance;

    public static EvaluationFormContentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationFormContentJsonUnmarshaller();
        return instance;
    }
}
