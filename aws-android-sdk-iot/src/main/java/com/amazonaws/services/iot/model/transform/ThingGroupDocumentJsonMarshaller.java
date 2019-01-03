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
 * JSON marshaller for POJO ThingGroupDocument
 */
class ThingGroupDocumentJsonMarshaller {

    public void marshall(ThingGroupDocument thingGroupDocument, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (thingGroupDocument.getThingGroupName() != null) {
            String thingGroupName = thingGroupDocument.getThingGroupName();
            jsonWriter.name("thingGroupName");
            jsonWriter.value(thingGroupName);
        }
        if (thingGroupDocument.getThingGroupId() != null) {
            String thingGroupId = thingGroupDocument.getThingGroupId();
            jsonWriter.name("thingGroupId");
            jsonWriter.value(thingGroupId);
        }
        if (thingGroupDocument.getThingGroupDescription() != null) {
            String thingGroupDescription = thingGroupDocument.getThingGroupDescription();
            jsonWriter.name("thingGroupDescription");
            jsonWriter.value(thingGroupDescription);
        }
        if (thingGroupDocument.getAttributes() != null) {
            java.util.Map<String, String> attributes = thingGroupDocument.getAttributes();
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
        if (thingGroupDocument.getParentGroupNames() != null) {
            java.util.List<String> parentGroupNames = thingGroupDocument.getParentGroupNames();
            jsonWriter.name("parentGroupNames");
            jsonWriter.beginArray();
            for (String parentGroupNamesItem : parentGroupNames) {
                if (parentGroupNamesItem != null) {
                    jsonWriter.value(parentGroupNamesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ThingGroupDocumentJsonMarshaller instance;

    public static ThingGroupDocumentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ThingGroupDocumentJsonMarshaller();
        return instance;
    }
}
