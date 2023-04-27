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
 * JSON unmarshaller for POJO EvaluationFormVersionSummary
 */
class EvaluationFormVersionSummaryJsonUnmarshaller implements
        Unmarshaller<EvaluationFormVersionSummary, JsonUnmarshallerContext> {

    public EvaluationFormVersionSummary unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EvaluationFormVersionSummary evaluationFormVersionSummary = new EvaluationFormVersionSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("EvaluationFormArn")) {
                evaluationFormVersionSummary.setEvaluationFormArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EvaluationFormId")) {
                evaluationFormVersionSummary.setEvaluationFormId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EvaluationFormVersion")) {
                evaluationFormVersionSummary.setEvaluationFormVersion(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Locked")) {
                evaluationFormVersionSummary.setLocked(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                evaluationFormVersionSummary.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedTime")) {
                evaluationFormVersionSummary.setCreatedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedBy")) {
                evaluationFormVersionSummary.setCreatedBy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                evaluationFormVersionSummary.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedBy")) {
                evaluationFormVersionSummary.setLastModifiedBy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return evaluationFormVersionSummary;
    }

    private static EvaluationFormVersionSummaryJsonUnmarshaller instance;

    public static EvaluationFormVersionSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationFormVersionSummaryJsonUnmarshaller();
        return instance;
    }
}
