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
 * JSON marshaller for POJO PhoneNumberSummary
 */
class PhoneNumberSummaryJsonMarshaller {

    public void marshall(PhoneNumberSummary phoneNumberSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (phoneNumberSummary.getId() != null) {
            String id = phoneNumberSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (phoneNumberSummary.getArn() != null) {
            String arn = phoneNumberSummary.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (phoneNumberSummary.getPhoneNumber() != null) {
            String phoneNumber = phoneNumberSummary.getPhoneNumber();
            jsonWriter.name("PhoneNumber");
            jsonWriter.value(phoneNumber);
        }
        if (phoneNumberSummary.getPhoneNumberType() != null) {
            String phoneNumberType = phoneNumberSummary.getPhoneNumberType();
            jsonWriter.name("PhoneNumberType");
            jsonWriter.value(phoneNumberType);
        }
        if (phoneNumberSummary.getPhoneNumberCountryCode() != null) {
            String phoneNumberCountryCode = phoneNumberSummary.getPhoneNumberCountryCode();
            jsonWriter.name("PhoneNumberCountryCode");
            jsonWriter.value(phoneNumberCountryCode);
        }
        jsonWriter.endObject();
    }

    private static PhoneNumberSummaryJsonMarshaller instance;

    public static PhoneNumberSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PhoneNumberSummaryJsonMarshaller();
        return instance;
    }
}
