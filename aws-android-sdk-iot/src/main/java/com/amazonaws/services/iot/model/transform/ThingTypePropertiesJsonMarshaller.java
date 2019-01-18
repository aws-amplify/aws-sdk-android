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
 * JSON marshaller for POJO ThingTypeProperties
 */
class ThingTypePropertiesJsonMarshaller {

    public void marshall(ThingTypeProperties thingTypeProperties, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (thingTypeProperties.getThingTypeDescription() != null) {
            String thingTypeDescription = thingTypeProperties.getThingTypeDescription();
            jsonWriter.name("thingTypeDescription");
            jsonWriter.value(thingTypeDescription);
        }
        if (thingTypeProperties.getSearchableAttributes() != null) {
            java.util.List<String> searchableAttributes = thingTypeProperties
                    .getSearchableAttributes();
            jsonWriter.name("searchableAttributes");
            jsonWriter.beginArray();
            for (String searchableAttributesItem : searchableAttributes) {
                if (searchableAttributesItem != null) {
                    jsonWriter.value(searchableAttributesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ThingTypePropertiesJsonMarshaller instance;

    public static ThingTypePropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ThingTypePropertiesJsonMarshaller();
        return instance;
    }
}
