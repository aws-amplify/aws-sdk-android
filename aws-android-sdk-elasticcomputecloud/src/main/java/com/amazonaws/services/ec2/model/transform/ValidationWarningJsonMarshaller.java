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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ValidationWarning
 */
class ValidationWarningJsonMarshaller {

    public void marshall(ValidationWarning validationWarning, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (validationWarning.getErrors() != null) {
            java.util.List<ValidationError> errors = validationWarning.getErrors();
            jsonWriter.name("Errors");
            jsonWriter.beginArray();
            for (ValidationError errorsItem : errors) {
                if (errorsItem != null) {
                    ValidationErrorJsonMarshaller.getInstance().marshall(errorsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ValidationWarningJsonMarshaller instance;

    public static ValidationWarningJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ValidationWarningJsonMarshaller();
        return instance;
    }
}
