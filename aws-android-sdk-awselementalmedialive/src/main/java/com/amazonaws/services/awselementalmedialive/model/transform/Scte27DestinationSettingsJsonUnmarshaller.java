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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for POJO Scte27DestinationSettings
 */
class Scte27DestinationSettingsJsonUnmarshaller implements Unmarshaller<Scte27DestinationSettings, JsonUnmarshallerContext> {

    public Scte27DestinationSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Scte27DestinationSettings scte27DestinationSettings = new Scte27DestinationSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return scte27DestinationSettings;
    }

    private static Scte27DestinationSettingsJsonUnmarshaller instance;
    public static Scte27DestinationSettingsJsonUnmarshaller getInstance() {
        if (instance == null) instance = new Scte27DestinationSettingsJsonUnmarshaller();
        return instance;
    }
}
