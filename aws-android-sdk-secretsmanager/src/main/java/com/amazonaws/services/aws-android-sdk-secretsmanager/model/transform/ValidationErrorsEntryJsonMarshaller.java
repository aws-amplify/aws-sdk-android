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
package com.amazonaws.services.aws-android-sdk-secretsmanager.model.transform;

import com.amazonaws.services.aws-android-sdk-secretsmanager.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ValidationErrorsEntry
 */
class ValidationErrorsEntryJsonMarshaller {

    public void marshall(ValidationErrorsEntry validationErrorsEntry, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (validationErrorsEntry.getCheckName() != null) {
            String checkName = validationErrorsEntry.getCheckName();
            jsonWriter.name("CheckName");
            jsonWriter.value(checkName);
        }
        if (validationErrorsEntry.getErrorMessage() != null) {
            String errorMessage = validationErrorsEntry.getErrorMessage();
            jsonWriter.name("ErrorMessage");
            jsonWriter.value(errorMessage);
        }
        jsonWriter.endObject();
    }

    private static ValidationErrorsEntryJsonMarshaller instance;
    public static ValidationErrorsEntryJsonMarshaller getInstance() {
        if (instance == null) instance = new ValidationErrorsEntryJsonMarshaller();
        return instance;
    }
}
