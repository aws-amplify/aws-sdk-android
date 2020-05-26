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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO GeoSpatialColumnGroup
 */
class GeoSpatialColumnGroupJsonMarshaller {

    public void marshall(GeoSpatialColumnGroup geoSpatialColumnGroup, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (geoSpatialColumnGroup.getName() != null) {
            String name = geoSpatialColumnGroup.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (geoSpatialColumnGroup.getCountryCode() != null) {
            String countryCode = geoSpatialColumnGroup.getCountryCode();
            jsonWriter.name("CountryCode");
            jsonWriter.value(countryCode);
        }
        if (geoSpatialColumnGroup.getColumns() != null) {
            java.util.List<String> columns = geoSpatialColumnGroup.getColumns();
            jsonWriter.name("Columns");
            jsonWriter.beginArray();
            for (String columnsItem : columns) {
                if (columnsItem != null) {
                    jsonWriter.value(columnsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static GeoSpatialColumnGroupJsonMarshaller instance;

    public static GeoSpatialColumnGroupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GeoSpatialColumnGroupJsonMarshaller();
        return instance;
    }
}
