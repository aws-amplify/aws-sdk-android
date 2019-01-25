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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ScheduledAuditMetadata
 */
class ScheduledAuditMetadataJsonMarshaller {

    public void marshall(ScheduledAuditMetadata scheduledAuditMetadata, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (scheduledAuditMetadata.getScheduledAuditName() != null) {
            String scheduledAuditName = scheduledAuditMetadata.getScheduledAuditName();
            jsonWriter.name("scheduledAuditName");
            jsonWriter.value(scheduledAuditName);
        }
        if (scheduledAuditMetadata.getScheduledAuditArn() != null) {
            String scheduledAuditArn = scheduledAuditMetadata.getScheduledAuditArn();
            jsonWriter.name("scheduledAuditArn");
            jsonWriter.value(scheduledAuditArn);
        }
        if (scheduledAuditMetadata.getFrequency() != null) {
            String frequency = scheduledAuditMetadata.getFrequency();
            jsonWriter.name("frequency");
            jsonWriter.value(frequency);
        }
        if (scheduledAuditMetadata.getDayOfMonth() != null) {
            String dayOfMonth = scheduledAuditMetadata.getDayOfMonth();
            jsonWriter.name("dayOfMonth");
            jsonWriter.value(dayOfMonth);
        }
        if (scheduledAuditMetadata.getDayOfWeek() != null) {
            String dayOfWeek = scheduledAuditMetadata.getDayOfWeek();
            jsonWriter.name("dayOfWeek");
            jsonWriter.value(dayOfWeek);
        }
        jsonWriter.endObject();
    }

    private static ScheduledAuditMetadataJsonMarshaller instance;

    public static ScheduledAuditMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledAuditMetadataJsonMarshaller();
        return instance;
    }
}
