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
 * JSON unmarshaller for POJO Evaluation
 */
class EvaluationJsonUnmarshaller implements Unmarshaller<Evaluation, JsonUnmarshallerContext> {

    public Evaluation unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Evaluation evaluation = new Evaluation();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("EvaluationId")) {
                evaluation.setEvaluationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EvaluationArn")) {
                evaluation.setEvaluationArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Metadata")) {
                evaluation.setMetadata(EvaluationMetadataJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Answers")) {
                evaluation.setAnswers(new MapUnmarshaller<EvaluationAnswerOutput>(
                        EvaluationAnswerOutputJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Notes")) {
                evaluation.setNotes(new MapUnmarshaller<EvaluationNote>(
                        EvaluationNoteJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Status")) {
                evaluation.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Scores")) {
                evaluation.setScores(new MapUnmarshaller<EvaluationScore>(
                        EvaluationScoreJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("CreatedTime")) {
                evaluation.setCreatedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                evaluation.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                evaluation.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return evaluation;
    }

    private static EvaluationJsonUnmarshaller instance;

    public static EvaluationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationJsonUnmarshaller();
        return instance;
    }
}
