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

package com.amazonaws.services.workmail.model.transform;

import com.amazonaws.services.workmail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BookingOptions
 */
class BookingOptionsJsonMarshaller {

    public void marshall(BookingOptions bookingOptions, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (bookingOptions.getAutoAcceptRequests() != null) {
            Boolean autoAcceptRequests = bookingOptions.getAutoAcceptRequests();
            jsonWriter.name("AutoAcceptRequests");
            jsonWriter.value(autoAcceptRequests);
        }
        if (bookingOptions.getAutoDeclineRecurringRequests() != null) {
            Boolean autoDeclineRecurringRequests = bookingOptions.getAutoDeclineRecurringRequests();
            jsonWriter.name("AutoDeclineRecurringRequests");
            jsonWriter.value(autoDeclineRecurringRequests);
        }
        if (bookingOptions.getAutoDeclineConflictingRequests() != null) {
            Boolean autoDeclineConflictingRequests = bookingOptions
                    .getAutoDeclineConflictingRequests();
            jsonWriter.name("AutoDeclineConflictingRequests");
            jsonWriter.value(autoDeclineConflictingRequests);
        }
        jsonWriter.endObject();
    }

    private static BookingOptionsJsonMarshaller instance;

    public static BookingOptionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BookingOptionsJsonMarshaller();
        return instance;
    }
}
