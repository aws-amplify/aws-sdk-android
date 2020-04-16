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

package com.amazonaws.services.awselementalmediaconvert.model.transform;

import com.amazonaws.services.awselementalmediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO OutputGroup
 */
class OutputGroupJsonMarshaller {

    public void marshall(OutputGroup outputGroup, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (outputGroup.getCustomName() != null) {
            String customName = outputGroup.getCustomName();
            jsonWriter.name("CustomName");
            jsonWriter.value(customName);
        }
        if (outputGroup.getName() != null) {
            String name = outputGroup.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (outputGroup.getOutputGroupSettings() != null) {
            OutputGroupSettings outputGroupSettings = outputGroup.getOutputGroupSettings();
            jsonWriter.name("OutputGroupSettings");
            OutputGroupSettingsJsonMarshaller.getInstance().marshall(outputGroupSettings,
                    jsonWriter);
        }
        if (outputGroup.getOutputs() != null) {
            java.util.List<Output> outputs = outputGroup.getOutputs();
            jsonWriter.name("Outputs");
            jsonWriter.beginArray();
            for (Output outputsItem : outputs) {
                if (outputsItem != null) {
                    OutputJsonMarshaller.getInstance().marshall(outputsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static OutputGroupJsonMarshaller instance;

    public static OutputGroupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OutputGroupJsonMarshaller();
        return instance;
    }
}
