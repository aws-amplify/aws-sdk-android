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

package com.amazonaws.services.awsiotevents.model.transform;

import com.amazonaws.services.awsiotevents.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InputSummary
 */
class InputSummaryJsonMarshaller {

    public void marshall(InputSummary inputSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (inputSummary.getInputName() != null) {
            String inputName = inputSummary.getInputName();
            jsonWriter.name("inputName");
            jsonWriter.value(inputName);
        }
        if (inputSummary.getInputDescription() != null) {
            String inputDescription = inputSummary.getInputDescription();
            jsonWriter.name("inputDescription");
            jsonWriter.value(inputDescription);
        }
        if (inputSummary.getInputArn() != null) {
            String inputArn = inputSummary.getInputArn();
            jsonWriter.name("inputArn");
            jsonWriter.value(inputArn);
        }
        if (inputSummary.getCreationTime() != null) {
            java.util.Date creationTime = inputSummary.getCreationTime();
            jsonWriter.name("creationTime");
            jsonWriter.value(creationTime);
        }
        if (inputSummary.getLastUpdateTime() != null) {
            java.util.Date lastUpdateTime = inputSummary.getLastUpdateTime();
            jsonWriter.name("lastUpdateTime");
            jsonWriter.value(lastUpdateTime);
        }
        if (inputSummary.getStatus() != null) {
            String status = inputSummary.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        jsonWriter.endObject();
    }

    private static InputSummaryJsonMarshaller instance;

    public static InputSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InputSummaryJsonMarshaller();
        return instance;
    }
}
