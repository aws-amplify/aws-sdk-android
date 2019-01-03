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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ThingTypeDefinition
 */
class ThingTypeDefinitionJsonMarshaller {

    public void marshall(ThingTypeDefinition thingTypeDefinition, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (thingTypeDefinition.getThingTypeName() != null) {
            String thingTypeName = thingTypeDefinition.getThingTypeName();
            jsonWriter.name("thingTypeName");
            jsonWriter.value(thingTypeName);
        }
        if (thingTypeDefinition.getThingTypeArn() != null) {
            String thingTypeArn = thingTypeDefinition.getThingTypeArn();
            jsonWriter.name("thingTypeArn");
            jsonWriter.value(thingTypeArn);
        }
        if (thingTypeDefinition.getThingTypeProperties() != null) {
            ThingTypeProperties thingTypeProperties = thingTypeDefinition.getThingTypeProperties();
            jsonWriter.name("thingTypeProperties");
            ThingTypePropertiesJsonMarshaller.getInstance().marshall(thingTypeProperties,
                    jsonWriter);
        }
        if (thingTypeDefinition.getThingTypeMetadata() != null) {
            ThingTypeMetadata thingTypeMetadata = thingTypeDefinition.getThingTypeMetadata();
            jsonWriter.name("thingTypeMetadata");
            ThingTypeMetadataJsonMarshaller.getInstance().marshall(thingTypeMetadata, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ThingTypeDefinitionJsonMarshaller instance;

    public static ThingTypeDefinitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ThingTypeDefinitionJsonMarshaller();
        return instance;
    }
}
