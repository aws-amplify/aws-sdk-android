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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EvaluationMetadata
 */
class EvaluationMetadataJsonMarshaller {

    public void marshall(EvaluationMetadata evaluationMetadata, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (evaluationMetadata.getContactId() != null) {
            String contactId = evaluationMetadata.getContactId();
            jsonWriter.name("ContactId");
            jsonWriter.value(contactId);
        }
        if (evaluationMetadata.getEvaluatorArn() != null) {
            String evaluatorArn = evaluationMetadata.getEvaluatorArn();
            jsonWriter.name("EvaluatorArn");
            jsonWriter.value(evaluatorArn);
        }
        if (evaluationMetadata.getContactAgentId() != null) {
            String contactAgentId = evaluationMetadata.getContactAgentId();
            jsonWriter.name("ContactAgentId");
            jsonWriter.value(contactAgentId);
        }
        if (evaluationMetadata.getScore() != null) {
            EvaluationScore score = evaluationMetadata.getScore();
            jsonWriter.name("Score");
            EvaluationScoreJsonMarshaller.getInstance().marshall(score, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static EvaluationMetadataJsonMarshaller instance;

    public static EvaluationMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationMetadataJsonMarshaller();
        return instance;
    }
}
