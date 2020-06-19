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

package com.amazonaws.services.medialive.model.transform;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Multiplex
 */
class MultiplexJsonMarshaller {

    public void marshall(Multiplex multiplex, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (multiplex.getArn() != null) {
            String arn = multiplex.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (multiplex.getAvailabilityZones() != null) {
            java.util.List<String> availabilityZones = multiplex.getAvailabilityZones();
            jsonWriter.name("AvailabilityZones");
            jsonWriter.beginArray();
            for (String availabilityZonesItem : availabilityZones) {
                if (availabilityZonesItem != null) {
                    jsonWriter.value(availabilityZonesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (multiplex.getDestinations() != null) {
            java.util.List<MultiplexOutputDestination> destinations = multiplex.getDestinations();
            jsonWriter.name("Destinations");
            jsonWriter.beginArray();
            for (MultiplexOutputDestination destinationsItem : destinations) {
                if (destinationsItem != null) {
                    MultiplexOutputDestinationJsonMarshaller.getInstance().marshall(
                            destinationsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (multiplex.getId() != null) {
            String id = multiplex.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (multiplex.getMultiplexSettings() != null) {
            MultiplexSettings multiplexSettings = multiplex.getMultiplexSettings();
            jsonWriter.name("MultiplexSettings");
            MultiplexSettingsJsonMarshaller.getInstance().marshall(multiplexSettings, jsonWriter);
        }
        if (multiplex.getName() != null) {
            String name = multiplex.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (multiplex.getPipelinesRunningCount() != null) {
            Integer pipelinesRunningCount = multiplex.getPipelinesRunningCount();
            jsonWriter.name("PipelinesRunningCount");
            jsonWriter.value(pipelinesRunningCount);
        }
        if (multiplex.getProgramCount() != null) {
            Integer programCount = multiplex.getProgramCount();
            jsonWriter.name("ProgramCount");
            jsonWriter.value(programCount);
        }
        if (multiplex.getState() != null) {
            String state = multiplex.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (multiplex.getTags() != null) {
            java.util.Map<String, String> tags = multiplex.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static MultiplexJsonMarshaller instance;

    public static MultiplexJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MultiplexJsonMarshaller();
        return instance;
    }
}
