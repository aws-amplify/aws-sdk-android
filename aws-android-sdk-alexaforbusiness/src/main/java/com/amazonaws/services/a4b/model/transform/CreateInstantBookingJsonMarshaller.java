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

package com.amazonaws.services.a4b.model.transform;

import com.amazonaws.services.a4b.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CreateInstantBooking
 */
class CreateInstantBookingJsonMarshaller {

    public void marshall(CreateInstantBooking createInstantBooking, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (createInstantBooking.getDurationInMinutes() != null) {
            Integer durationInMinutes = createInstantBooking.getDurationInMinutes();
            jsonWriter.name("DurationInMinutes");
            jsonWriter.value(durationInMinutes);
        }
        if (createInstantBooking.getEnabled() != null) {
            Boolean enabled = createInstantBooking.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        jsonWriter.endObject();
    }

    private static CreateInstantBookingJsonMarshaller instance;

    public static CreateInstantBookingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CreateInstantBookingJsonMarshaller();
        return instance;
    }
}
