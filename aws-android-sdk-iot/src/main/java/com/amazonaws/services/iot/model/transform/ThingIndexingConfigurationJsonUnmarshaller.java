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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ThingIndexingConfiguration
 */
class ThingIndexingConfigurationJsonUnmarshaller implements
        Unmarshaller<ThingIndexingConfiguration, JsonUnmarshallerContext> {

    public ThingIndexingConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ThingIndexingConfiguration thingIndexingConfiguration = new ThingIndexingConfiguration();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("thingIndexingMode")) {
                thingIndexingConfiguration.setThingIndexingMode(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("thingConnectivityIndexingMode")) {
                thingIndexingConfiguration.setThingConnectivityIndexingMode(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("managedFields")) {
                thingIndexingConfiguration.setManagedFields(new ListUnmarshaller<Field>(
                        FieldJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("customFields")) {
                thingIndexingConfiguration.setCustomFields(new ListUnmarshaller<Field>(
                        FieldJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return thingIndexingConfiguration;
    }

    private static ThingIndexingConfigurationJsonUnmarshaller instance;

    public static ThingIndexingConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ThingIndexingConfigurationJsonUnmarshaller();
        return instance;
    }
}
