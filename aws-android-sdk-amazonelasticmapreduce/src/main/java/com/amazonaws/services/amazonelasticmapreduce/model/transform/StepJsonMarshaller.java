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

package com.amazonaws.services.amazonelasticmapreduce.model.transform;

import com.amazonaws.services.amazonelasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Step
 */
class StepJsonMarshaller {

    public void marshall(Step step, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (step.getId() != null) {
            String id = step.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (step.getName() != null) {
            String name = step.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (step.getConfig() != null) {
            HadoopStepConfig config = step.getConfig();
            jsonWriter.name("Config");
            HadoopStepConfigJsonMarshaller.getInstance().marshall(config, jsonWriter);
        }
        if (step.getActionOnFailure() != null) {
            String actionOnFailure = step.getActionOnFailure();
            jsonWriter.name("ActionOnFailure");
            jsonWriter.value(actionOnFailure);
        }
        if (step.getStatus() != null) {
            StepStatus status = step.getStatus();
            jsonWriter.name("Status");
            StepStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static StepJsonMarshaller instance;

    public static StepJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StepJsonMarshaller();
        return instance;
    }
}
