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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HoursOfOperation
 */
class HoursOfOperationJsonMarshaller {

    public void marshall(HoursOfOperation hoursOfOperation, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (hoursOfOperation.getHoursOfOperationId() != null) {
            String hoursOfOperationId = hoursOfOperation.getHoursOfOperationId();
            jsonWriter.name("HoursOfOperationId");
            jsonWriter.value(hoursOfOperationId);
        }
        if (hoursOfOperation.getHoursOfOperationArn() != null) {
            String hoursOfOperationArn = hoursOfOperation.getHoursOfOperationArn();
            jsonWriter.name("HoursOfOperationArn");
            jsonWriter.value(hoursOfOperationArn);
        }
        if (hoursOfOperation.getName() != null) {
            String name = hoursOfOperation.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (hoursOfOperation.getDescription() != null) {
            String description = hoursOfOperation.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (hoursOfOperation.getTimeZone() != null) {
            String timeZone = hoursOfOperation.getTimeZone();
            jsonWriter.name("TimeZone");
            jsonWriter.value(timeZone);
        }
        if (hoursOfOperation.getConfig() != null) {
            java.util.List<HoursOfOperationConfig> config = hoursOfOperation.getConfig();
            jsonWriter.name("Config");
            jsonWriter.beginArray();
            for (HoursOfOperationConfig configItem : config) {
                if (configItem != null) {
                    HoursOfOperationConfigJsonMarshaller.getInstance().marshall(configItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (hoursOfOperation.getTags() != null) {
            java.util.Map<String, String> tags = hoursOfOperation.getTags();
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

    private static HoursOfOperationJsonMarshaller instance;

    public static HoursOfOperationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HoursOfOperationJsonMarshaller();
        return instance;
    }
}
