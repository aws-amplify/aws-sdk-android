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
 * JSON unmarshaller for POJO TeletextDestinationSettings
 */
class TeletextDestinationSettingsJsonUnmarshaller implements Unmarshaller<TeletextDestinationSettings, JsonUnmarshallerContext> {

    public TeletextDestinationSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TeletextDestinationSettings teletextDestinationSettings = new TeletextDestinationSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return teletextDestinationSettings;
    }

    private static TeletextDestinationSettingsJsonUnmarshaller instance;
    public static TeletextDestinationSettingsJsonUnmarshaller getInstance() {
        if (instance == null) instance = new TeletextDestinationSettingsJsonUnmarshaller();
        return instance;
    }
}
