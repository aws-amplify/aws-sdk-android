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
 * JSON marshaller for POJO JobFlowExecutionStatusDetail
 */
class JobFlowExecutionStatusDetailJsonMarshaller {

    public void marshall(JobFlowExecutionStatusDetail jobFlowExecutionStatusDetail,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (jobFlowExecutionStatusDetail.getState() != null) {
            String state = jobFlowExecutionStatusDetail.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (jobFlowExecutionStatusDetail.getCreationDateTime() != null) {
            java.util.Date creationDateTime = jobFlowExecutionStatusDetail.getCreationDateTime();
            jsonWriter.name("CreationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (jobFlowExecutionStatusDetail.getStartDateTime() != null) {
            java.util.Date startDateTime = jobFlowExecutionStatusDetail.getStartDateTime();
            jsonWriter.name("StartDateTime");
            jsonWriter.value(startDateTime);
        }
        if (jobFlowExecutionStatusDetail.getReadyDateTime() != null) {
            java.util.Date readyDateTime = jobFlowExecutionStatusDetail.getReadyDateTime();
            jsonWriter.name("ReadyDateTime");
            jsonWriter.value(readyDateTime);
        }
        if (jobFlowExecutionStatusDetail.getEndDateTime() != null) {
            java.util.Date endDateTime = jobFlowExecutionStatusDetail.getEndDateTime();
            jsonWriter.name("EndDateTime");
            jsonWriter.value(endDateTime);
        }
        if (jobFlowExecutionStatusDetail.getLastStateChangeReason() != null) {
            String lastStateChangeReason = jobFlowExecutionStatusDetail.getLastStateChangeReason();
            jsonWriter.name("LastStateChangeReason");
            jsonWriter.value(lastStateChangeReason);
        }
        jsonWriter.endObject();
    }

    private static JobFlowExecutionStatusDetailJsonMarshaller instance;

    public static JobFlowExecutionStatusDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobFlowExecutionStatusDetailJsonMarshaller();
        return instance;
    }
}
