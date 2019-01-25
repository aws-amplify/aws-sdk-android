/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ValidationError
 */
class ValidationErrorJsonMarshaller {

    public void marshall(ValidationError validationError, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (validationError.getErrorMessage() != null) {
            String errorMessage = validationError.getErrorMessage();
            jsonWriter.name("errorMessage");
            jsonWriter.value(errorMessage);
        }
        jsonWriter.endObject();
    }

    private static ValidationErrorJsonMarshaller instance;

    public static ValidationErrorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ValidationErrorJsonMarshaller();
        return instance;
    }
}
