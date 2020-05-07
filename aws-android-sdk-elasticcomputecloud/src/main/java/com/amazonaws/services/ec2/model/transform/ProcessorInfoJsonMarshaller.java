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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ProcessorInfo
 */
class ProcessorInfoJsonMarshaller {

    public void marshall(ProcessorInfo processorInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (processorInfo.getSupportedArchitectures() != null) {
            java.util.List<String> supportedArchitectures = processorInfo
                    .getSupportedArchitectures();
            jsonWriter.name("SupportedArchitectures");
            jsonWriter.beginArray();
            for (String supportedArchitecturesItem : supportedArchitectures) {
                if (supportedArchitecturesItem != null) {
                    jsonWriter.value(supportedArchitecturesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (processorInfo.getSustainedClockSpeedInGhz() != null) {
            Double sustainedClockSpeedInGhz = processorInfo.getSustainedClockSpeedInGhz();
            jsonWriter.name("SustainedClockSpeedInGhz");
            jsonWriter.value(sustainedClockSpeedInGhz);
        }
        jsonWriter.endObject();
    }

    private static ProcessorInfoJsonMarshaller instance;

    public static ProcessorInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProcessorInfoJsonMarshaller();
        return instance;
    }
}
