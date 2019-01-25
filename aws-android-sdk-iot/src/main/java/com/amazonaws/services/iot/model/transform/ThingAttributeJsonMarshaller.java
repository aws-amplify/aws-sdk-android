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
 * JSON marshaller for POJO ThingAttribute
 */
class ThingAttributeJsonMarshaller {

    public void marshall(ThingAttribute thingAttribute, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (thingAttribute.getThingName() != null) {
            String thingName = thingAttribute.getThingName();
            jsonWriter.name("thingName");
            jsonWriter.value(thingName);
        }
        if (thingAttribute.getThingTypeName() != null) {
            String thingTypeName = thingAttribute.getThingTypeName();
            jsonWriter.name("thingTypeName");
            jsonWriter.value(thingTypeName);
        }
        if (thingAttribute.getThingArn() != null) {
            String thingArn = thingAttribute.getThingArn();
            jsonWriter.name("thingArn");
            jsonWriter.value(thingArn);
        }
        if (thingAttribute.getAttributes() != null) {
            java.util.Map<String, String> attributes = thingAttribute.getAttributes();
            jsonWriter.name("attributes");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> attributesEntry : attributes.entrySet()) {
                String attributesValue = attributesEntry.getValue();
                if (attributesValue != null) {
                    jsonWriter.name(attributesEntry.getKey());
                    jsonWriter.value(attributesValue);
                }
            }
            jsonWriter.endObject();
        }
        if (thingAttribute.getVersion() != null) {
            Long version = thingAttribute.getVersion();
            jsonWriter.name("version");
            jsonWriter.value(version);
        }
        jsonWriter.endObject();
    }

    private static ThingAttributeJsonMarshaller instance;

    public static ThingAttributeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ThingAttributeJsonMarshaller();
        return instance;
    }
}
