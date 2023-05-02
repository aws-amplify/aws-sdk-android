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
 * JSON marshaller for POJO EvaluationForm
 */
class EvaluationFormJsonMarshaller {

    public void marshall(EvaluationForm evaluationForm, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (evaluationForm.getEvaluationFormId() != null) {
            String evaluationFormId = evaluationForm.getEvaluationFormId();
            jsonWriter.name("EvaluationFormId");
            jsonWriter.value(evaluationFormId);
        }
        if (evaluationForm.getEvaluationFormVersion() != null) {
            Integer evaluationFormVersion = evaluationForm.getEvaluationFormVersion();
            jsonWriter.name("EvaluationFormVersion");
            jsonWriter.value(evaluationFormVersion);
        }
        if (evaluationForm.getLocked() != null) {
            Boolean locked = evaluationForm.getLocked();
            jsonWriter.name("Locked");
            jsonWriter.value(locked);
        }
        if (evaluationForm.getEvaluationFormArn() != null) {
            String evaluationFormArn = evaluationForm.getEvaluationFormArn();
            jsonWriter.name("EvaluationFormArn");
            jsonWriter.value(evaluationFormArn);
        }
        if (evaluationForm.getTitle() != null) {
            String title = evaluationForm.getTitle();
            jsonWriter.name("Title");
            jsonWriter.value(title);
        }
        if (evaluationForm.getDescription() != null) {
            String description = evaluationForm.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (evaluationForm.getStatus() != null) {
            String status = evaluationForm.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (evaluationForm.getItems() != null) {
            java.util.List<EvaluationFormItem> items = evaluationForm.getItems();
            jsonWriter.name("Items");
            jsonWriter.beginArray();
            for (EvaluationFormItem itemsItem : items) {
                if (itemsItem != null) {
                    EvaluationFormItemJsonMarshaller.getInstance().marshall(itemsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (evaluationForm.getScoringStrategy() != null) {
            EvaluationFormScoringStrategy scoringStrategy = evaluationForm.getScoringStrategy();
            jsonWriter.name("ScoringStrategy");
            EvaluationFormScoringStrategyJsonMarshaller.getInstance().marshall(scoringStrategy,
                    jsonWriter);
        }
        if (evaluationForm.getCreatedTime() != null) {
            java.util.Date createdTime = evaluationForm.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (evaluationForm.getCreatedBy() != null) {
            String createdBy = evaluationForm.getCreatedBy();
            jsonWriter.name("CreatedBy");
            jsonWriter.value(createdBy);
        }
        if (evaluationForm.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = evaluationForm.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (evaluationForm.getLastModifiedBy() != null) {
            String lastModifiedBy = evaluationForm.getLastModifiedBy();
            jsonWriter.name("LastModifiedBy");
            jsonWriter.value(lastModifiedBy);
        }
        if (evaluationForm.getTags() != null) {
            java.util.Map<String, String> tags = evaluationForm.getTags();
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

    private static EvaluationFormJsonMarshaller instance;

    public static EvaluationFormJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationFormJsonMarshaller();
        return instance;
    }
}
