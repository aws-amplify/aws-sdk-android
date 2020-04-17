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

package com.amazonaws.services.amazonfrauddetector.model.transform;

import com.amazonaws.services.amazonfrauddetector.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RuleDetail
 */
class RuleDetailJsonMarshaller {

    public void marshall(RuleDetail ruleDetail, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (ruleDetail.getRuleId() != null) {
            String ruleId = ruleDetail.getRuleId();
            jsonWriter.name("ruleId");
            jsonWriter.value(ruleId);
        }
        if (ruleDetail.getDescription() != null) {
            String description = ruleDetail.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (ruleDetail.getDetectorId() != null) {
            String detectorId = ruleDetail.getDetectorId();
            jsonWriter.name("detectorId");
            jsonWriter.value(detectorId);
        }
        if (ruleDetail.getRuleVersion() != null) {
            String ruleVersion = ruleDetail.getRuleVersion();
            jsonWriter.name("ruleVersion");
            jsonWriter.value(ruleVersion);
        }
        if (ruleDetail.getExpression() != null) {
            String expression = ruleDetail.getExpression();
            jsonWriter.name("expression");
            jsonWriter.value(expression);
        }
        if (ruleDetail.getLanguage() != null) {
            String language = ruleDetail.getLanguage();
            jsonWriter.name("language");
            jsonWriter.value(language);
        }
        if (ruleDetail.getOutcomes() != null) {
            java.util.List<String> outcomes = ruleDetail.getOutcomes();
            jsonWriter.name("outcomes");
            jsonWriter.beginArray();
            for (String outcomesItem : outcomes) {
                if (outcomesItem != null) {
                    jsonWriter.value(outcomesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (ruleDetail.getLastUpdatedTime() != null) {
            String lastUpdatedTime = ruleDetail.getLastUpdatedTime();
            jsonWriter.name("lastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        if (ruleDetail.getCreatedTime() != null) {
            String createdTime = ruleDetail.getCreatedTime();
            jsonWriter.name("createdTime");
            jsonWriter.value(createdTime);
        }
        jsonWriter.endObject();
    }

    private static RuleDetailJsonMarshaller instance;

    public static RuleDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RuleDetailJsonMarshaller();
        return instance;
    }
}
