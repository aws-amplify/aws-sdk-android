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
 * JSON marshaller for POJO MultiplexSummary
 */
class MultiplexSummaryJsonMarshaller {

    public void marshall(MultiplexSummary multiplexSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (multiplexSummary.getArn() != null) {
            String arn = multiplexSummary.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (multiplexSummary.getAvailabilityZones() != null) {
            java.util.List<String> availabilityZones = multiplexSummary.getAvailabilityZones();
            jsonWriter.name("AvailabilityZones");
            jsonWriter.beginArray();
            for (String availabilityZonesItem : availabilityZones) {
                if (availabilityZonesItem != null) {
                    jsonWriter.value(availabilityZonesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (multiplexSummary.getId() != null) {
            String id = multiplexSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (multiplexSummary.getMultiplexSettings() != null) {
            MultiplexSettingsSummary multiplexSettings = multiplexSummary.getMultiplexSettings();
            jsonWriter.name("MultiplexSettings");
            MultiplexSettingsSummaryJsonMarshaller.getInstance().marshall(multiplexSettings,
                    jsonWriter);
        }
        if (multiplexSummary.getName() != null) {
            String name = multiplexSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (multiplexSummary.getPipelinesRunningCount() != null) {
            Integer pipelinesRunningCount = multiplexSummary.getPipelinesRunningCount();
            jsonWriter.name("PipelinesRunningCount");
            jsonWriter.value(pipelinesRunningCount);
        }
        if (multiplexSummary.getProgramCount() != null) {
            Integer programCount = multiplexSummary.getProgramCount();
            jsonWriter.name("ProgramCount");
            jsonWriter.value(programCount);
        }
        if (multiplexSummary.getState() != null) {
            String state = multiplexSummary.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (multiplexSummary.getTags() != null) {
            java.util.Map<String, String> tags = multiplexSummary.getTags();
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

    private static MultiplexSummaryJsonMarshaller instance;

    public static MultiplexSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MultiplexSummaryJsonMarshaller();
        return instance;
    }
}
