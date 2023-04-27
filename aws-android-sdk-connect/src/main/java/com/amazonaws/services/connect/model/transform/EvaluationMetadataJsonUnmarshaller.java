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
 * JSON unmarshaller for POJO EvaluationMetadata
 */
class EvaluationMetadataJsonUnmarshaller implements
        Unmarshaller<EvaluationMetadata, JsonUnmarshallerContext> {

    public EvaluationMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EvaluationMetadata evaluationMetadata = new EvaluationMetadata();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ContactId")) {
                evaluationMetadata.setContactId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EvaluatorArn")) {
                evaluationMetadata.setEvaluatorArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ContactAgentId")) {
                evaluationMetadata.setContactAgentId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Score")) {
                evaluationMetadata.setScore(EvaluationScoreJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return evaluationMetadata;
    }

    private static EvaluationMetadataJsonUnmarshaller instance;

    public static EvaluationMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationMetadataJsonUnmarshaller();
        return instance;
    }
}
