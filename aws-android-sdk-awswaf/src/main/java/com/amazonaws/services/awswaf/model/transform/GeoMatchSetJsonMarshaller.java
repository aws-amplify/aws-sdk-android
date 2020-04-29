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

package com.amazonaws.services.awswaf.model.transform;

import com.amazonaws.services.awswaf.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO GeoMatchSet
 */
class GeoMatchSetJsonMarshaller {

    public void marshall(GeoMatchSet geoMatchSet, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (geoMatchSet.getGeoMatchSetId() != null) {
            String geoMatchSetId = geoMatchSet.getGeoMatchSetId();
            jsonWriter.name("GeoMatchSetId");
            jsonWriter.value(geoMatchSetId);
        }
        if (geoMatchSet.getName() != null) {
            String name = geoMatchSet.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (geoMatchSet.getGeoMatchConstraints() != null) {
            java.util.List<GeoMatchConstraint> geoMatchConstraints = geoMatchSet
                    .getGeoMatchConstraints();
            jsonWriter.name("GeoMatchConstraints");
            jsonWriter.beginArray();
            for (GeoMatchConstraint geoMatchConstraintsItem : geoMatchConstraints) {
                if (geoMatchConstraintsItem != null) {
                    GeoMatchConstraintJsonMarshaller.getInstance().marshall(
                            geoMatchConstraintsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static GeoMatchSetJsonMarshaller instance;

    public static GeoMatchSetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GeoMatchSetJsonMarshaller();
        return instance;
    }
}
