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
 * JSON marshaller for POJO EvaluationFormVersionSummary
 */
class EvaluationFormVersionSummaryJsonMarshaller {

    public void marshall(EvaluationFormVersionSummary evaluationFormVersionSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (evaluationFormVersionSummary.getEvaluationFormArn() != null) {
            String evaluationFormArn = evaluationFormVersionSummary.getEvaluationFormArn();
            jsonWriter.name("EvaluationFormArn");
            jsonWriter.value(evaluationFormArn);
        }
        if (evaluationFormVersionSummary.getEvaluationFormId() != null) {
            String evaluationFormId = evaluationFormVersionSummary.getEvaluationFormId();
            jsonWriter.name("EvaluationFormId");
            jsonWriter.value(evaluationFormId);
        }
        if (evaluationFormVersionSummary.getEvaluationFormVersion() != null) {
            Integer evaluationFormVersion = evaluationFormVersionSummary.getEvaluationFormVersion();
            jsonWriter.name("EvaluationFormVersion");
            jsonWriter.value(evaluationFormVersion);
        }
        if (evaluationFormVersionSummary.getLocked() != null) {
            Boolean locked = evaluationFormVersionSummary.getLocked();
            jsonWriter.name("Locked");
            jsonWriter.value(locked);
        }
        if (evaluationFormVersionSummary.getStatus() != null) {
            String status = evaluationFormVersionSummary.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (evaluationFormVersionSummary.getCreatedTime() != null) {
            java.util.Date createdTime = evaluationFormVersionSummary.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (evaluationFormVersionSummary.getCreatedBy() != null) {
            String createdBy = evaluationFormVersionSummary.getCreatedBy();
            jsonWriter.name("CreatedBy");
            jsonWriter.value(createdBy);
        }
        if (evaluationFormVersionSummary.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = evaluationFormVersionSummary.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (evaluationFormVersionSummary.getLastModifiedBy() != null) {
            String lastModifiedBy = evaluationFormVersionSummary.getLastModifiedBy();
            jsonWriter.name("LastModifiedBy");
            jsonWriter.value(lastModifiedBy);
        }
        jsonWriter.endObject();
    }

    private static EvaluationFormVersionSummaryJsonMarshaller instance;

    public static EvaluationFormVersionSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationFormVersionSummaryJsonMarshaller();
        return instance;
    }
}
