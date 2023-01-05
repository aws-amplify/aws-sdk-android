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
 * JSON marshaller for POJO ClaimedPhoneNumberSummary
 */
class ClaimedPhoneNumberSummaryJsonMarshaller {

    public void marshall(ClaimedPhoneNumberSummary claimedPhoneNumberSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (claimedPhoneNumberSummary.getPhoneNumberId() != null) {
            String phoneNumberId = claimedPhoneNumberSummary.getPhoneNumberId();
            jsonWriter.name("PhoneNumberId");
            jsonWriter.value(phoneNumberId);
        }
        if (claimedPhoneNumberSummary.getPhoneNumberArn() != null) {
            String phoneNumberArn = claimedPhoneNumberSummary.getPhoneNumberArn();
            jsonWriter.name("PhoneNumberArn");
            jsonWriter.value(phoneNumberArn);
        }
        if (claimedPhoneNumberSummary.getPhoneNumber() != null) {
            String phoneNumber = claimedPhoneNumberSummary.getPhoneNumber();
            jsonWriter.name("PhoneNumber");
            jsonWriter.value(phoneNumber);
        }
        if (claimedPhoneNumberSummary.getPhoneNumberCountryCode() != null) {
            String phoneNumberCountryCode = claimedPhoneNumberSummary.getPhoneNumberCountryCode();
            jsonWriter.name("PhoneNumberCountryCode");
            jsonWriter.value(phoneNumberCountryCode);
        }
        if (claimedPhoneNumberSummary.getPhoneNumberType() != null) {
            String phoneNumberType = claimedPhoneNumberSummary.getPhoneNumberType();
            jsonWriter.name("PhoneNumberType");
            jsonWriter.value(phoneNumberType);
        }
        if (claimedPhoneNumberSummary.getPhoneNumberDescription() != null) {
            String phoneNumberDescription = claimedPhoneNumberSummary.getPhoneNumberDescription();
            jsonWriter.name("PhoneNumberDescription");
            jsonWriter.value(phoneNumberDescription);
        }
        if (claimedPhoneNumberSummary.getTargetArn() != null) {
            String targetArn = claimedPhoneNumberSummary.getTargetArn();
            jsonWriter.name("TargetArn");
            jsonWriter.value(targetArn);
        }
        if (claimedPhoneNumberSummary.getTags() != null) {
            java.util.Map<String, String> tags = claimedPhoneNumberSummary.getTags();
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
        if (claimedPhoneNumberSummary.getPhoneNumberStatus() != null) {
            PhoneNumberStatus phoneNumberStatus = claimedPhoneNumberSummary.getPhoneNumberStatus();
            jsonWriter.name("PhoneNumberStatus");
            PhoneNumberStatusJsonMarshaller.getInstance().marshall(phoneNumberStatus, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ClaimedPhoneNumberSummaryJsonMarshaller instance;

    public static ClaimedPhoneNumberSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClaimedPhoneNumberSummaryJsonMarshaller();
        return instance;
    }
}
