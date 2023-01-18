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
 * JSON marshaller for POJO PhoneNumberStatus
 */
class PhoneNumberStatusJsonMarshaller {

    public void marshall(PhoneNumberStatus phoneNumberStatus, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (phoneNumberStatus.getStatus() != null) {
            String status = phoneNumberStatus.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (phoneNumberStatus.getMessage() != null) {
            String message = phoneNumberStatus.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        jsonWriter.endObject();
    }

    private static PhoneNumberStatusJsonMarshaller instance;

    public static PhoneNumberStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PhoneNumberStatusJsonMarshaller();
        return instance;
    }
}
