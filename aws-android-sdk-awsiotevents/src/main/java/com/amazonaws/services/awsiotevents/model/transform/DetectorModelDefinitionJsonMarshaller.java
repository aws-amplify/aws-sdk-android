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
 * JSON marshaller for POJO DetectorModelDefinition
 */
class DetectorModelDefinitionJsonMarshaller {

    public void marshall(DetectorModelDefinition detectorModelDefinition, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (detectorModelDefinition.getStates() != null) {
            java.util.List<State> states = detectorModelDefinition.getStates();
            jsonWriter.name("states");
            jsonWriter.beginArray();
            for (State statesItem : states) {
                if (statesItem != null) {
                    StateJsonMarshaller.getInstance().marshall(statesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (detectorModelDefinition.getInitialStateName() != null) {
            String initialStateName = detectorModelDefinition.getInitialStateName();
            jsonWriter.name("initialStateName");
            jsonWriter.value(initialStateName);
        }
        jsonWriter.endObject();
    }

    private static DetectorModelDefinitionJsonMarshaller instance;

    public static DetectorModelDefinitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DetectorModelDefinitionJsonMarshaller();
        return instance;
    }
}
