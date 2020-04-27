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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HumanTaskUiSummary
 */
class HumanTaskUiSummaryJsonMarshaller {

    public void marshall(HumanTaskUiSummary humanTaskUiSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (humanTaskUiSummary.getHumanTaskUiName() != null) {
            String humanTaskUiName = humanTaskUiSummary.getHumanTaskUiName();
            jsonWriter.name("HumanTaskUiName");
            jsonWriter.value(humanTaskUiName);
        }
        if (humanTaskUiSummary.getHumanTaskUiArn() != null) {
            String humanTaskUiArn = humanTaskUiSummary.getHumanTaskUiArn();
            jsonWriter.name("HumanTaskUiArn");
            jsonWriter.value(humanTaskUiArn);
        }
        if (humanTaskUiSummary.getCreationTime() != null) {
            java.util.Date creationTime = humanTaskUiSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        jsonWriter.endObject();
    }

    private static HumanTaskUiSummaryJsonMarshaller instance;

    public static HumanTaskUiSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HumanTaskUiSummaryJsonMarshaller();
        return instance;
    }
}
