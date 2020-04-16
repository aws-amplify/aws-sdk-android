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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO FlowDefinitionSummary
 */
class FlowDefinitionSummaryJsonUnmarshaller implements
        Unmarshaller<FlowDefinitionSummary, JsonUnmarshallerContext> {

    public FlowDefinitionSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        FlowDefinitionSummary flowDefinitionSummary = new FlowDefinitionSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("FlowDefinitionName")) {
                flowDefinitionSummary.setFlowDefinitionName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FlowDefinitionArn")) {
                flowDefinitionSummary.setFlowDefinitionArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FlowDefinitionStatus")) {
                flowDefinitionSummary.setFlowDefinitionStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                flowDefinitionSummary.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                flowDefinitionSummary.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return flowDefinitionSummary;
    }

    private static FlowDefinitionSummaryJsonUnmarshaller instance;

    public static FlowDefinitionSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FlowDefinitionSummaryJsonUnmarshaller();
        return instance;
    }
}
