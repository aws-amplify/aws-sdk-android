/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model.transform;

import com.amazonaws.services.geo.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MapConfigurationUpdate
 */
class MapConfigurationUpdateJsonMarshaller {

    public void marshall(MapConfigurationUpdate mapConfigurationUpdate, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (mapConfigurationUpdate.getPoliticalView() != null) {
            String politicalView = mapConfigurationUpdate.getPoliticalView();
            jsonWriter.name("PoliticalView");
            jsonWriter.value(politicalView);
        }
        if (mapConfigurationUpdate.getCustomLayers() != null) {
            java.util.List<String> customLayers = mapConfigurationUpdate.getCustomLayers();
            jsonWriter.name("CustomLayers");
            jsonWriter.beginArray();
            for (String customLayersItem : customLayers) {
                if (customLayersItem != null) {
                    jsonWriter.value(customLayersItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static MapConfigurationUpdateJsonMarshaller instance;

    public static MapConfigurationUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MapConfigurationUpdateJsonMarshaller();
        return instance;
    }
}
