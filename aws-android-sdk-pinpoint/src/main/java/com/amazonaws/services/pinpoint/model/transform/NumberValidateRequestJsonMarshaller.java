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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NumberValidateRequest
 */
class NumberValidateRequestJsonMarshaller {

    public void marshall(NumberValidateRequest numberValidateRequest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (numberValidateRequest.getIsoCountryCode() != null) {
            String isoCountryCode = numberValidateRequest.getIsoCountryCode();
            jsonWriter.name("IsoCountryCode");
            jsonWriter.value(isoCountryCode);
        }
        if (numberValidateRequest.getPhoneNumber() != null) {
            String phoneNumber = numberValidateRequest.getPhoneNumber();
            jsonWriter.name("PhoneNumber");
            jsonWriter.value(phoneNumber);
        }
        jsonWriter.endObject();
    }

    private static NumberValidateRequestJsonMarshaller instance;

    public static NumberValidateRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NumberValidateRequestJsonMarshaller();
        return instance;
    }
}
