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
 * JSON marshaller for POJO UserIdentityInfo
 */
class UserIdentityInfoJsonMarshaller {

    public void marshall(UserIdentityInfo userIdentityInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (userIdentityInfo.getFirstName() != null) {
            String firstName = userIdentityInfo.getFirstName();
            jsonWriter.name("FirstName");
            jsonWriter.value(firstName);
        }
        if (userIdentityInfo.getLastName() != null) {
            String lastName = userIdentityInfo.getLastName();
            jsonWriter.name("LastName");
            jsonWriter.value(lastName);
        }
        if (userIdentityInfo.getEmail() != null) {
            String email = userIdentityInfo.getEmail();
            jsonWriter.name("Email");
            jsonWriter.value(email);
        }
        jsonWriter.endObject();
    }

    private static UserIdentityInfoJsonMarshaller instance;

    public static UserIdentityInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserIdentityInfoJsonMarshaller();
        return instance;
    }
}
