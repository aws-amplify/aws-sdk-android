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
 * JSON marshaller for POJO ColumnGroup
 */
class ColumnGroupJsonMarshaller {

    public void marshall(ColumnGroup columnGroup, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (columnGroup.getGeoSpatialColumnGroup() != null) {
            GeoSpatialColumnGroup geoSpatialColumnGroup = columnGroup.getGeoSpatialColumnGroup();
            jsonWriter.name("GeoSpatialColumnGroup");
            GeoSpatialColumnGroupJsonMarshaller.getInstance().marshall(geoSpatialColumnGroup,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ColumnGroupJsonMarshaller instance;

    public static ColumnGroupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ColumnGroupJsonMarshaller();
        return instance;
    }
}
