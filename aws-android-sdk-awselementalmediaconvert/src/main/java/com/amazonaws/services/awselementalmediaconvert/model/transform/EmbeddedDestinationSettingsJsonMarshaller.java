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
 * JSON marshaller for POJO EmbeddedDestinationSettings
 */
class EmbeddedDestinationSettingsJsonMarshaller {

    public void marshall(EmbeddedDestinationSettings embeddedDestinationSettings,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (embeddedDestinationSettings.getDestination608ChannelNumber() != null) {
            Integer destination608ChannelNumber = embeddedDestinationSettings
                    .getDestination608ChannelNumber();
            jsonWriter.name("Destination608ChannelNumber");
            jsonWriter.value(destination608ChannelNumber);
        }
        if (embeddedDestinationSettings.getDestination708ServiceNumber() != null) {
            Integer destination708ServiceNumber = embeddedDestinationSettings
                    .getDestination708ServiceNumber();
            jsonWriter.name("Destination708ServiceNumber");
            jsonWriter.value(destination708ServiceNumber);
        }
        jsonWriter.endObject();
    }

    private static EmbeddedDestinationSettingsJsonMarshaller instance;

    public static EmbeddedDestinationSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EmbeddedDestinationSettingsJsonMarshaller();
        return instance;
    }
}
