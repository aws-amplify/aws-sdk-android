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

package com.amazonaws.services.chime.model.transform;

import com.amazonaws.services.chime.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PhoneNumberError
 */
class PhoneNumberErrorJsonMarshaller {

    public void marshall(PhoneNumberError phoneNumberError, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (phoneNumberError.getPhoneNumberId() != null) {
            String phoneNumberId = phoneNumberError.getPhoneNumberId();
            jsonWriter.name("PhoneNumberId");
            jsonWriter.value(phoneNumberId);
        }
        if (phoneNumberError.getErrorCode() != null) {
            String errorCode = phoneNumberError.getErrorCode();
            jsonWriter.name("ErrorCode");
            jsonWriter.value(errorCode);
        }
        if (phoneNumberError.getErrorMessage() != null) {
            String errorMessage = phoneNumberError.getErrorMessage();
            jsonWriter.name("ErrorMessage");
            jsonWriter.value(errorMessage);
        }
        jsonWriter.endObject();
    }

    private static PhoneNumberErrorJsonMarshaller instance;

    public static PhoneNumberErrorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PhoneNumberErrorJsonMarshaller();
        return instance;
    }
}
