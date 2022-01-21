/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Place
 */
class PlaceJsonUnmarshaller implements Unmarshaller<Place, JsonUnmarshallerContext> {

    public Place unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Place place = new Place();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AddressNumber")) {
                place.setAddressNumber(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Country")) {
                place.setCountry(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Geometry")) {
                place.setGeometry(PlaceGeometryJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Interpolated")) {
                place.setInterpolated(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Label")) {
                place.setLabel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Municipality")) {
                place.setMunicipality(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Neighborhood")) {
                place.setNeighborhood(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PostalCode")) {
                place.setPostalCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Region")) {
                place.setRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Street")) {
                place.setStreet(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubRegion")) {
                place.setSubRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimeZone")) {
                place.setTimeZone(TimeZoneJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return place;
    }

    private static PlaceJsonUnmarshaller instance;

    public static PlaceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PlaceJsonUnmarshaller();
        return instance;
    }
}
