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

package com.amazonaws.services.chime.model.transform;

import com.amazonaws.services.chime.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO StreamingConfiguration
 */
class StreamingConfigurationJsonMarshaller {

    public void marshall(StreamingConfiguration streamingConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (streamingConfiguration.getDataRetentionInHours() != null) {
            Integer dataRetentionInHours = streamingConfiguration.getDataRetentionInHours();
            jsonWriter.name("DataRetentionInHours");
            jsonWriter.value(dataRetentionInHours);
        }
        if (streamingConfiguration.getDisabled() != null) {
            Boolean disabled = streamingConfiguration.getDisabled();
            jsonWriter.name("Disabled");
            jsonWriter.value(disabled);
        }
        jsonWriter.endObject();
    }

    private static StreamingConfigurationJsonMarshaller instance;

    public static StreamingConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StreamingConfigurationJsonMarshaller();
        return instance;
    }
}
