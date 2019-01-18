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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Geometry
 */
class GeometryJsonMarshaller {

    public void marshall(Geometry geometry, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (geometry.getBoundingBox() != null) {
            BoundingBox boundingBox = geometry.getBoundingBox();
            jsonWriter.name("BoundingBox");
            BoundingBoxJsonMarshaller.getInstance().marshall(boundingBox, jsonWriter);
        }
        if (geometry.getPolygon() != null) {
            java.util.List<Point> polygon = geometry.getPolygon();
            jsonWriter.name("Polygon");
            jsonWriter.beginArray();
            for (Point polygonItem : polygon) {
                if (polygonItem != null) {
                    PointJsonMarshaller.getInstance().marshall(polygonItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static GeometryJsonMarshaller instance;

    public static GeometryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GeometryJsonMarshaller();
        return instance;
    }
}
