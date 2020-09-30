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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ThingGroupIndexingConfiguration
 */
class ThingGroupIndexingConfigurationJsonMarshaller {

    public void marshall(ThingGroupIndexingConfiguration thingGroupIndexingConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (thingGroupIndexingConfiguration.getThingGroupIndexingMode() != null) {
            String thingGroupIndexingMode = thingGroupIndexingConfiguration
                    .getThingGroupIndexingMode();
            jsonWriter.name("thingGroupIndexingMode");
            jsonWriter.value(thingGroupIndexingMode);
        }
        if (thingGroupIndexingConfiguration.getManagedFields() != null) {
            java.util.List<Field> managedFields = thingGroupIndexingConfiguration
                    .getManagedFields();
            jsonWriter.name("managedFields");
            jsonWriter.beginArray();
            for (Field managedFieldsItem : managedFields) {
                if (managedFieldsItem != null) {
                    FieldJsonMarshaller.getInstance().marshall(managedFieldsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (thingGroupIndexingConfiguration.getCustomFields() != null) {
            java.util.List<Field> customFields = thingGroupIndexingConfiguration.getCustomFields();
            jsonWriter.name("customFields");
            jsonWriter.beginArray();
            for (Field customFieldsItem : customFields) {
                if (customFieldsItem != null) {
                    FieldJsonMarshaller.getInstance().marshall(customFieldsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ThingGroupIndexingConfigurationJsonMarshaller instance;

    public static ThingGroupIndexingConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ThingGroupIndexingConfigurationJsonMarshaller();
        return instance;
    }
}
