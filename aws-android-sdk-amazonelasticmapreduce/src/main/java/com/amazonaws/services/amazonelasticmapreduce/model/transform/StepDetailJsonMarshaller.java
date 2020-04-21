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
 * JSON marshaller for POJO StepDetail
 */
class StepDetailJsonMarshaller {

    public void marshall(StepDetail stepDetail, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (stepDetail.getStepConfig() != null) {
            StepConfig stepConfig = stepDetail.getStepConfig();
            jsonWriter.name("StepConfig");
            StepConfigJsonMarshaller.getInstance().marshall(stepConfig, jsonWriter);
        }
        if (stepDetail.getExecutionStatusDetail() != null) {
            StepExecutionStatusDetail executionStatusDetail = stepDetail.getExecutionStatusDetail();
            jsonWriter.name("ExecutionStatusDetail");
            StepExecutionStatusDetailJsonMarshaller.getInstance().marshall(executionStatusDetail,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static StepDetailJsonMarshaller instance;

    public static StepDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StepDetailJsonMarshaller();
        return instance;
    }
}
