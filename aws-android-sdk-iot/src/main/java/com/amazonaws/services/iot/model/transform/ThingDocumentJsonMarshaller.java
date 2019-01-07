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
 * JSON marshaller for POJO ThingDocument
 */
class ThingDocumentJsonMarshaller {

    public void marshall(ThingDocument thingDocument, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (thingDocument.getThingName() != null) {
            String thingName = thingDocument.getThingName();
            jsonWriter.name("thingName");
            jsonWriter.value(thingName);
        }
        if (thingDocument.getThingId() != null) {
            String thingId = thingDocument.getThingId();
            jsonWriter.name("thingId");
            jsonWriter.value(thingId);
        }
        if (thingDocument.getThingTypeName() != null) {
            String thingTypeName = thingDocument.getThingTypeName();
            jsonWriter.name("thingTypeName");
            jsonWriter.value(thingTypeName);
        }
        if (thingDocument.getThingGroupNames() != null) {
            java.util.List<String> thingGroupNames = thingDocument.getThingGroupNames();
            jsonWriter.name("thingGroupNames");
            jsonWriter.beginArray();
            for (String thingGroupNamesItem : thingGroupNames) {
                if (thingGroupNamesItem != null) {
                    jsonWriter.value(thingGroupNamesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (thingDocument.getAttributes() != null) {
            java.util.Map<String, String> attributes = thingDocument.getAttributes();
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
        if (thingDocument.getShadow() != null) {
            String shadow = thingDocument.getShadow();
            jsonWriter.name("shadow");
            jsonWriter.value(shadow);
        }
        if (thingDocument.getConnectivity() != null) {
            ThingConnectivity connectivity = thingDocument.getConnectivity();
            jsonWriter.name("connectivity");
            ThingConnectivityJsonMarshaller.getInstance().marshall(connectivity, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ThingDocumentJsonMarshaller instance;

    public static ThingDocumentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ThingDocumentJsonMarshaller();
        return instance;
    }
}
