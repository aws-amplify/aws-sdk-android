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

package com.amazonaws.services.codecommit.model.transform;

import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UserInfo
 */
class UserInfoJsonMarshaller {

    public void marshall(UserInfo userInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (userInfo.getName() != null) {
            String name = userInfo.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (userInfo.getEmail() != null) {
            String email = userInfo.getEmail();
            jsonWriter.name("email");
            jsonWriter.value(email);
        }
        if (userInfo.getDate() != null) {
            String dateValue = userInfo.getDate();
            jsonWriter.name("date");
            jsonWriter.value(dateValue);
        }
        jsonWriter.endObject();
    }

    private static UserInfoJsonMarshaller instance;

    public static UserInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserInfoJsonMarshaller();
        return instance;
    }
}
