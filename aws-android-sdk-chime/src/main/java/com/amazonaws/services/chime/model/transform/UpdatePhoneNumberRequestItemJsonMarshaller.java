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
 * JSON marshaller for POJO UpdatePhoneNumberRequestItem
 */
class UpdatePhoneNumberRequestItemJsonMarshaller {

    public void marshall(UpdatePhoneNumberRequestItem updatePhoneNumberRequestItem,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (updatePhoneNumberRequestItem.getPhoneNumberId() != null) {
            String phoneNumberId = updatePhoneNumberRequestItem.getPhoneNumberId();
            jsonWriter.name("PhoneNumberId");
            jsonWriter.value(phoneNumberId);
        }
        if (updatePhoneNumberRequestItem.getProductType() != null) {
            String productType = updatePhoneNumberRequestItem.getProductType();
            jsonWriter.name("ProductType");
            jsonWriter.value(productType);
        }
        if (updatePhoneNumberRequestItem.getCallingName() != null) {
            String callingName = updatePhoneNumberRequestItem.getCallingName();
            jsonWriter.name("CallingName");
            jsonWriter.value(callingName);
        }
        jsonWriter.endObject();
    }

    private static UpdatePhoneNumberRequestItemJsonMarshaller instance;

    public static UpdatePhoneNumberRequestItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UpdatePhoneNumberRequestItemJsonMarshaller();
        return instance;
    }
}
