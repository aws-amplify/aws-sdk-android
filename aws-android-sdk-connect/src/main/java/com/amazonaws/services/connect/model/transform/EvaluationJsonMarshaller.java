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
 * JSON marshaller for POJO Evaluation
 */
class EvaluationJsonMarshaller {

    public void marshall(Evaluation evaluation, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (evaluation.getEvaluationId() != null) {
            String evaluationId = evaluation.getEvaluationId();
            jsonWriter.name("EvaluationId");
            jsonWriter.value(evaluationId);
        }
        if (evaluation.getEvaluationArn() != null) {
            String evaluationArn = evaluation.getEvaluationArn();
            jsonWriter.name("EvaluationArn");
            jsonWriter.value(evaluationArn);
        }
        if (evaluation.getMetadata() != null) {
            EvaluationMetadata metadata = evaluation.getMetadata();
            jsonWriter.name("Metadata");
            EvaluationMetadataJsonMarshaller.getInstance().marshall(metadata, jsonWriter);
        }
        if (evaluation.getAnswers() != null) {
            java.util.Map<String, EvaluationAnswerOutput> answers = evaluation.getAnswers();
            jsonWriter.name("Answers");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, EvaluationAnswerOutput> answersEntry : answers
                    .entrySet()) {
                EvaluationAnswerOutput answersValue = answersEntry.getValue();
                if (answersValue != null) {
                    jsonWriter.name(answersEntry.getKey());
                    EvaluationAnswerOutputJsonMarshaller.getInstance().marshall(answersValue,
                            jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (evaluation.getNotes() != null) {
            java.util.Map<String, EvaluationNote> notes = evaluation.getNotes();
            jsonWriter.name("Notes");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, EvaluationNote> notesEntry : notes.entrySet()) {
                EvaluationNote notesValue = notesEntry.getValue();
                if (notesValue != null) {
                    jsonWriter.name(notesEntry.getKey());
                    EvaluationNoteJsonMarshaller.getInstance().marshall(notesValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (evaluation.getStatus() != null) {
            String status = evaluation.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (evaluation.getScores() != null) {
            java.util.Map<String, EvaluationScore> scores = evaluation.getScores();
            jsonWriter.name("Scores");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, EvaluationScore> scoresEntry : scores.entrySet()) {
                EvaluationScore scoresValue = scoresEntry.getValue();
                if (scoresValue != null) {
                    jsonWriter.name(scoresEntry.getKey());
                    EvaluationScoreJsonMarshaller.getInstance().marshall(scoresValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (evaluation.getCreatedTime() != null) {
            java.util.Date createdTime = evaluation.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (evaluation.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = evaluation.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (evaluation.getTags() != null) {
            java.util.Map<String, String> tags = evaluation.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static EvaluationJsonMarshaller instance;

    public static EvaluationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationJsonMarshaller();
        return instance;
    }
}
