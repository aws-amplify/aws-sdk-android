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
 * JSON marshaller for POJO UserError
 */
class UserErrorJsonMarshaller {

    public void marshall(UserError userError, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (userError.getUserId() != null) {
            String userId = userError.getUserId();
            jsonWriter.name("UserId");
            jsonWriter.value(userId);
        }
        if (userError.getErrorCode() != null) {
            String errorCode = userError.getErrorCode();
            jsonWriter.name("ErrorCode");
            jsonWriter.value(errorCode);
        }
        if (userError.getErrorMessage() != null) {
            String errorMessage = userError.getErrorMessage();
            jsonWriter.name("ErrorMessage");
            jsonWriter.value(errorMessage);
        }
        jsonWriter.endObject();
    }

    private static UserErrorJsonMarshaller instance;

    public static UserErrorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserErrorJsonMarshaller();
        return instance;
    }
}
