/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for POJO ThingTypeDefinition
 */
class ThingTypeDefinitionJsonUnmarshaller implements
        Unmarshaller<ThingTypeDefinition, JsonUnmarshallerContext> {

    public ThingTypeDefinition unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ThingTypeDefinition thingTypeDefinition = new ThingTypeDefinition();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("thingTypeName")) {
                thingTypeDefinition.setThingTypeName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("thingTypeArn")) {
                thingTypeDefinition.setThingTypeArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("thingTypeProperties")) {
                thingTypeDefinition.setThingTypeProperties(ThingTypePropertiesJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("thingTypeMetadata")) {
                thingTypeDefinition.setThingTypeMetadata(ThingTypeMetadataJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return thingTypeDefinition;
    }

    private static ThingTypeDefinitionJsonUnmarshaller instance;

    public static ThingTypeDefinitionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ThingTypeDefinitionJsonUnmarshaller();
        return instance;
    }
}
