/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO ListPhoneNumbersSummary
 */
class ListPhoneNumbersSummaryJsonMarshaller {

    public void marshall(ListPhoneNumbersSummary listPhoneNumbersSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (listPhoneNumbersSummary.getPhoneNumberId() != null) {
            String phoneNumberId = listPhoneNumbersSummary.getPhoneNumberId();
            jsonWriter.name("PhoneNumberId");
            jsonWriter.value(phoneNumberId);
        }
        if (listPhoneNumbersSummary.getPhoneNumberArn() != null) {
            String phoneNumberArn = listPhoneNumbersSummary.getPhoneNumberArn();
            jsonWriter.name("PhoneNumberArn");
            jsonWriter.value(phoneNumberArn);
        }
        if (listPhoneNumbersSummary.getPhoneNumber() != null) {
            String phoneNumber = listPhoneNumbersSummary.getPhoneNumber();
            jsonWriter.name("PhoneNumber");
            jsonWriter.value(phoneNumber);
        }
        if (listPhoneNumbersSummary.getPhoneNumberCountryCode() != null) {
            String phoneNumberCountryCode = listPhoneNumbersSummary.getPhoneNumberCountryCode();
            jsonWriter.name("PhoneNumberCountryCode");
            jsonWriter.value(phoneNumberCountryCode);
        }
        if (listPhoneNumbersSummary.getPhoneNumberType() != null) {
            String phoneNumberType = listPhoneNumbersSummary.getPhoneNumberType();
            jsonWriter.name("PhoneNumberType");
            jsonWriter.value(phoneNumberType);
        }
        if (listPhoneNumbersSummary.getTargetArn() != null) {
            String targetArn = listPhoneNumbersSummary.getTargetArn();
            jsonWriter.name("TargetArn");
            jsonWriter.value(targetArn);
        }
        jsonWriter.endObject();
    }

    private static ListPhoneNumbersSummaryJsonMarshaller instance;

    public static ListPhoneNumbersSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ListPhoneNumbersSummaryJsonMarshaller();
        return instance;
    }
}
