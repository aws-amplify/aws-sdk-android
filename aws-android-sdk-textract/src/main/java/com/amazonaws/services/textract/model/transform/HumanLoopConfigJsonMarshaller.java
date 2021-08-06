/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model.transform;

import com.amazonaws.services.textract.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HumanLoopConfig
 */
class HumanLoopConfigJsonMarshaller {

    public void marshall(HumanLoopConfig humanLoopConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (humanLoopConfig.getHumanLoopName() != null) {
            String humanLoopName = humanLoopConfig.getHumanLoopName();
            jsonWriter.name("HumanLoopName");
            jsonWriter.value(humanLoopName);
        }
        if (humanLoopConfig.getFlowDefinitionArn() != null) {
            String flowDefinitionArn = humanLoopConfig.getFlowDefinitionArn();
            jsonWriter.name("FlowDefinitionArn");
            jsonWriter.value(flowDefinitionArn);
        }
        if (humanLoopConfig.getDataAttributes() != null) {
            HumanLoopDataAttributes dataAttributes = humanLoopConfig.getDataAttributes();
            jsonWriter.name("DataAttributes");
            HumanLoopDataAttributesJsonMarshaller.getInstance()
                    .marshall(dataAttributes, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static HumanLoopConfigJsonMarshaller instance;

    public static HumanLoopConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HumanLoopConfigJsonMarshaller();
        return instance;
    }
}
