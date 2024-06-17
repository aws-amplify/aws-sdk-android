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
 * JSON marshaller for POJO Place
 */
class PlaceJsonMarshaller {

    public void marshall(Place place, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (place.getLabel() != null) {
            String label = place.getLabel();
            jsonWriter.name("Label");
            jsonWriter.value(label);
        }
        if (place.getGeometry() != null) {
            PlaceGeometry geometry = place.getGeometry();
            jsonWriter.name("Geometry");
            PlaceGeometryJsonMarshaller.getInstance().marshall(geometry, jsonWriter);
        }
        if (place.getAddressNumber() != null) {
            String addressNumber = place.getAddressNumber();
            jsonWriter.name("AddressNumber");
            jsonWriter.value(addressNumber);
        }
        if (place.getStreet() != null) {
            String street = place.getStreet();
            jsonWriter.name("Street");
            jsonWriter.value(street);
        }
        if (place.getNeighborhood() != null) {
            String neighborhood = place.getNeighborhood();
            jsonWriter.name("Neighborhood");
            jsonWriter.value(neighborhood);
        }
        if (place.getMunicipality() != null) {
            String municipality = place.getMunicipality();
            jsonWriter.name("Municipality");
            jsonWriter.value(municipality);
        }
        if (place.getSubRegion() != null) {
            String subRegion = place.getSubRegion();
            jsonWriter.name("SubRegion");
            jsonWriter.value(subRegion);
        }
        if (place.getRegion() != null) {
            String region = place.getRegion();
            jsonWriter.name("Region");
            jsonWriter.value(region);
        }
        if (place.getCountry() != null) {
            String country = place.getCountry();
            jsonWriter.name("Country");
            jsonWriter.value(country);
        }
        if (place.getPostalCode() != null) {
            String postalCode = place.getPostalCode();
            jsonWriter.name("PostalCode");
            jsonWriter.value(postalCode);
        }
        if (place.getInterpolated() != null) {
            Boolean interpolated = place.getInterpolated();
            jsonWriter.name("Interpolated");
            jsonWriter.value(interpolated);
        }
        if (place.getTimeZone() != null) {
            TimeZone timeZone = place.getTimeZone();
            jsonWriter.name("TimeZone");
            TimeZoneJsonMarshaller.getInstance().marshall(timeZone, jsonWriter);
        }
        if (place.getUnitType() != null) {
            String unitType = place.getUnitType();
            jsonWriter.name("UnitType");
            jsonWriter.value(unitType);
        }
        if (place.getUnitNumber() != null) {
            String unitNumber = place.getUnitNumber();
            jsonWriter.name("UnitNumber");
            jsonWriter.value(unitNumber);
        }
        if (place.getCategories() != null) {
            java.util.List<String> categories = place.getCategories();
            jsonWriter.name("Categories");
            jsonWriter.beginArray();
            for (String categoriesItem : categories) {
                if (categoriesItem != null) {
                    jsonWriter.value(categoriesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (place.getSupplementalCategories() != null) {
            java.util.List<String> supplementalCategories = place.getSupplementalCategories();
            jsonWriter.name("SupplementalCategories");
            jsonWriter.beginArray();
            for (String supplementalCategoriesItem : supplementalCategories) {
                if (supplementalCategoriesItem != null) {
                    jsonWriter.value(supplementalCategoriesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (place.getSubMunicipality() != null) {
            String subMunicipality = place.getSubMunicipality();
            jsonWriter.name("SubMunicipality");
            jsonWriter.value(subMunicipality);
        }
        jsonWriter.endObject();
    }

    private static PlaceJsonMarshaller instance;

    public static PlaceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PlaceJsonMarshaller();
        return instance;
    }
}
