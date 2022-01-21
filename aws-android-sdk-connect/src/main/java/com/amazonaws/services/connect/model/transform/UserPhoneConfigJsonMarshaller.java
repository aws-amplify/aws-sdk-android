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
 * JSON marshaller for POJO UserPhoneConfig
 */
class UserPhoneConfigJsonMarshaller {

    public void marshall(UserPhoneConfig userPhoneConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (userPhoneConfig.getPhoneType() != null) {
            String phoneType = userPhoneConfig.getPhoneType();
            jsonWriter.name("PhoneType");
            jsonWriter.value(phoneType);
        }
        if (userPhoneConfig.getAutoAccept() != null) {
            Boolean autoAccept = userPhoneConfig.getAutoAccept();
            jsonWriter.name("AutoAccept");
            jsonWriter.value(autoAccept);
        }
        if (userPhoneConfig.getAfterContactWorkTimeLimit() != null) {
            Integer afterContactWorkTimeLimit = userPhoneConfig.getAfterContactWorkTimeLimit();
            jsonWriter.name("AfterContactWorkTimeLimit");
            jsonWriter.value(afterContactWorkTimeLimit);
        }
        if (userPhoneConfig.getDeskPhoneNumber() != null) {
            String deskPhoneNumber = userPhoneConfig.getDeskPhoneNumber();
            jsonWriter.name("DeskPhoneNumber");
            jsonWriter.value(deskPhoneNumber);
        }
        jsonWriter.endObject();
    }

    private static UserPhoneConfigJsonMarshaller instance;

    public static UserPhoneConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserPhoneConfigJsonMarshaller();
        return instance;
    }
}
