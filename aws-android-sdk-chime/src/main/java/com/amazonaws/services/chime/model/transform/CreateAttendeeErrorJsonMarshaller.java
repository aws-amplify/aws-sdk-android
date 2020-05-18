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
 * JSON marshaller for POJO CreateAttendeeError
 */
class CreateAttendeeErrorJsonMarshaller {

    public void marshall(CreateAttendeeError createAttendeeError, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (createAttendeeError.getExternalUserId() != null) {
            String externalUserId = createAttendeeError.getExternalUserId();
            jsonWriter.name("ExternalUserId");
            jsonWriter.value(externalUserId);
        }
        if (createAttendeeError.getErrorCode() != null) {
            String errorCode = createAttendeeError.getErrorCode();
            jsonWriter.name("ErrorCode");
            jsonWriter.value(errorCode);
        }
        if (createAttendeeError.getErrorMessage() != null) {
            String errorMessage = createAttendeeError.getErrorMessage();
            jsonWriter.name("ErrorMessage");
            jsonWriter.value(errorMessage);
        }
        jsonWriter.endObject();
    }

    private static CreateAttendeeErrorJsonMarshaller instance;

    public static CreateAttendeeErrorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CreateAttendeeErrorJsonMarshaller();
        return instance;
    }
}
