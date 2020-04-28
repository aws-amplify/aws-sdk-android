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

package com.amazonaws.services.awselementalmedialive.model.transform;

import com.amazonaws.services.awselementalmedialive.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Scte35Descriptor
 */
class Scte35DescriptorJsonMarshaller {

    public void marshall(Scte35Descriptor scte35Descriptor, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (scte35Descriptor.getScte35DescriptorSettings() != null) {
            Scte35DescriptorSettings scte35DescriptorSettings = scte35Descriptor
                    .getScte35DescriptorSettings();
            jsonWriter.name("Scte35DescriptorSettings");
            Scte35DescriptorSettingsJsonMarshaller.getInstance().marshall(scte35DescriptorSettings,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static Scte35DescriptorJsonMarshaller instance;

    public static Scte35DescriptorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Scte35DescriptorJsonMarshaller();
        return instance;
    }
}
