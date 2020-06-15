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

package com.amazonaws.services.a4b.model.transform;

import com.amazonaws.services.a4b.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UserData
 */
class UserDataJsonMarshaller {

    public void marshall(UserData userData, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (userData.getUserArn() != null) {
            String userArn = userData.getUserArn();
            jsonWriter.name("UserArn");
            jsonWriter.value(userArn);
        }
        if (userData.getFirstName() != null) {
            String firstName = userData.getFirstName();
            jsonWriter.name("FirstName");
            jsonWriter.value(firstName);
        }
        if (userData.getLastName() != null) {
            String lastName = userData.getLastName();
            jsonWriter.name("LastName");
            jsonWriter.value(lastName);
        }
        if (userData.getEmail() != null) {
            String email = userData.getEmail();
            jsonWriter.name("Email");
            jsonWriter.value(email);
        }
        if (userData.getEnrollmentStatus() != null) {
            String enrollmentStatus = userData.getEnrollmentStatus();
            jsonWriter.name("EnrollmentStatus");
            jsonWriter.value(enrollmentStatus);
        }
        if (userData.getEnrollmentId() != null) {
            String enrollmentId = userData.getEnrollmentId();
            jsonWriter.name("EnrollmentId");
            jsonWriter.value(enrollmentId);
        }
        jsonWriter.endObject();
    }

    private static UserDataJsonMarshaller instance;

    public static UserDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserDataJsonMarshaller();
        return instance;
    }
}
