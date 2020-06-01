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

package com.amazonaws.services.elasticmapreduce.model.transform;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO StepSummary
 */
class StepSummaryJsonMarshaller {

    public void marshall(StepSummary stepSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (stepSummary.getId() != null) {
            String id = stepSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (stepSummary.getName() != null) {
            String name = stepSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (stepSummary.getConfig() != null) {
            HadoopStepConfig config = stepSummary.getConfig();
            jsonWriter.name("Config");
            HadoopStepConfigJsonMarshaller.getInstance().marshall(config, jsonWriter);
        }
        if (stepSummary.getActionOnFailure() != null) {
            String actionOnFailure = stepSummary.getActionOnFailure();
            jsonWriter.name("ActionOnFailure");
            jsonWriter.value(actionOnFailure);
        }
        if (stepSummary.getStatus() != null) {
            StepStatus status = stepSummary.getStatus();
            jsonWriter.name("Status");
            StepStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static StepSummaryJsonMarshaller instance;

    public static StepSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StepSummaryJsonMarshaller();
        return instance;
    }
}
