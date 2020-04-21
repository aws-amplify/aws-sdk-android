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
 * JSON marshaller for POJO StepExecutionStatusDetail
 */
class StepExecutionStatusDetailJsonMarshaller {

    public void marshall(StepExecutionStatusDetail stepExecutionStatusDetail,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (stepExecutionStatusDetail.getState() != null) {
            String state = stepExecutionStatusDetail.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (stepExecutionStatusDetail.getCreationDateTime() != null) {
            java.util.Date creationDateTime = stepExecutionStatusDetail.getCreationDateTime();
            jsonWriter.name("CreationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (stepExecutionStatusDetail.getStartDateTime() != null) {
            java.util.Date startDateTime = stepExecutionStatusDetail.getStartDateTime();
            jsonWriter.name("StartDateTime");
            jsonWriter.value(startDateTime);
        }
        if (stepExecutionStatusDetail.getEndDateTime() != null) {
            java.util.Date endDateTime = stepExecutionStatusDetail.getEndDateTime();
            jsonWriter.name("EndDateTime");
            jsonWriter.value(endDateTime);
        }
        if (stepExecutionStatusDetail.getLastStateChangeReason() != null) {
            String lastStateChangeReason = stepExecutionStatusDetail.getLastStateChangeReason();
            jsonWriter.name("LastStateChangeReason");
            jsonWriter.value(lastStateChangeReason);
        }
        jsonWriter.endObject();
    }

    private static StepExecutionStatusDetailJsonMarshaller instance;

    public static StepExecutionStatusDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StepExecutionStatusDetailJsonMarshaller();
        return instance;
    }
}
