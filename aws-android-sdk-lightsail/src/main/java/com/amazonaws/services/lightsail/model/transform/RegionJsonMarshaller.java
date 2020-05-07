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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Region
 */
class RegionJsonMarshaller {

    public void marshall(Region region, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (region.getContinentCode() != null) {
            String continentCode = region.getContinentCode();
            jsonWriter.name("continentCode");
            jsonWriter.value(continentCode);
        }
        if (region.getDescription() != null) {
            String description = region.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (region.getDisplayName() != null) {
            String displayName = region.getDisplayName();
            jsonWriter.name("displayName");
            jsonWriter.value(displayName);
        }
        if (region.getName() != null) {
            String name = region.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (region.getAvailabilityZones() != null) {
            java.util.List<AvailabilityZone> availabilityZones = region.getAvailabilityZones();
            jsonWriter.name("availabilityZones");
            jsonWriter.beginArray();
            for (AvailabilityZone availabilityZonesItem : availabilityZones) {
                if (availabilityZonesItem != null) {
                    AvailabilityZoneJsonMarshaller.getInstance().marshall(availabilityZonesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (region.getRelationalDatabaseAvailabilityZones() != null) {
            java.util.List<AvailabilityZone> relationalDatabaseAvailabilityZones = region
                    .getRelationalDatabaseAvailabilityZones();
            jsonWriter.name("relationalDatabaseAvailabilityZones");
            jsonWriter.beginArray();
            for (AvailabilityZone relationalDatabaseAvailabilityZonesItem : relationalDatabaseAvailabilityZones) {
                if (relationalDatabaseAvailabilityZonesItem != null) {
                    AvailabilityZoneJsonMarshaller.getInstance().marshall(
                            relationalDatabaseAvailabilityZonesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static RegionJsonMarshaller instance;

    public static RegionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RegionJsonMarshaller();
        return instance;
    }
}
