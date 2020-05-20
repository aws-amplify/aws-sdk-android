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

package com.amazonaws.services.medialive.model.transform;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InputLocation
 */
class InputLocationJsonMarshaller {

    public void marshall(InputLocation inputLocation, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (inputLocation.getPasswordParam() != null) {
            String passwordParam = inputLocation.getPasswordParam();
            jsonWriter.name("PasswordParam");
            jsonWriter.value(passwordParam);
        }
        if (inputLocation.getUri() != null) {
            String uri = inputLocation.getUri();
            jsonWriter.name("Uri");
            jsonWriter.value(uri);
        }
        if (inputLocation.getUsername() != null) {
            String username = inputLocation.getUsername();
            jsonWriter.name("Username");
            jsonWriter.value(username);
        }
        jsonWriter.endObject();
    }

    private static InputLocationJsonMarshaller instance;

    public static InputLocationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InputLocationJsonMarshaller();
        return instance;
    }
}
