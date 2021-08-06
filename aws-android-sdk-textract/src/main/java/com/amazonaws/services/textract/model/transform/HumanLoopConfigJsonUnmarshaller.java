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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO HumanLoopConfig
 */
class HumanLoopConfigJsonUnmarshaller implements
        Unmarshaller<HumanLoopConfig, JsonUnmarshallerContext> {

    public HumanLoopConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        HumanLoopConfig humanLoopConfig = new HumanLoopConfig();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("HumanLoopName")) {
                humanLoopConfig.setHumanLoopName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FlowDefinitionArn")) {
                humanLoopConfig.setFlowDefinitionArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DataAttributes")) {
                humanLoopConfig.setDataAttributes(HumanLoopDataAttributesJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return humanLoopConfig;
    }

    private static HumanLoopConfigJsonUnmarshaller instance;

    public static HumanLoopConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HumanLoopConfigJsonUnmarshaller();
        return instance;
    }
}
