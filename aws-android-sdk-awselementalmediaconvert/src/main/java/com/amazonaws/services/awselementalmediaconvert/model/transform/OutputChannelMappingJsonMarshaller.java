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
 * JSON marshaller for POJO OutputChannelMapping
 */
class OutputChannelMappingJsonMarshaller {

    public void marshall(OutputChannelMapping outputChannelMapping, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (outputChannelMapping.getInputChannels() != null) {
            java.util.List<Integer> inputChannels = outputChannelMapping.getInputChannels();
            jsonWriter.name("InputChannels");
            jsonWriter.beginArray();
            for (Integer inputChannelsItem : inputChannels) {
                if (inputChannelsItem != null) {
                    jsonWriter.value(inputChannelsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static OutputChannelMappingJsonMarshaller instance;

    public static OutputChannelMappingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OutputChannelMappingJsonMarshaller();
        return instance;
    }
}
