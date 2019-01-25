/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO JobExecutionStatusDetails
 */
class JobExecutionStatusDetailsJsonMarshaller {

    public void marshall(JobExecutionStatusDetails jobExecutionStatusDetails,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (jobExecutionStatusDetails.getDetailsMap() != null) {
            java.util.Map<String, String> detailsMap = jobExecutionStatusDetails.getDetailsMap();
            jsonWriter.name("detailsMap");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> detailsMapEntry : detailsMap.entrySet()) {
                String detailsMapValue = detailsMapEntry.getValue();
                if (detailsMapValue != null) {
                    jsonWriter.name(detailsMapEntry.getKey());
                    jsonWriter.value(detailsMapValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static JobExecutionStatusDetailsJsonMarshaller instance;

    public static JobExecutionStatusDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobExecutionStatusDetailsJsonMarshaller();
        return instance;
    }
}
