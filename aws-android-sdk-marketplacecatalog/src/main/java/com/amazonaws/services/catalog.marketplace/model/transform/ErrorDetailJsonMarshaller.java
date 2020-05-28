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

package com.amazonaws.services.catalog.marketplace.model.transform;

import com.amazonaws.services.catalog.marketplace.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ErrorDetail
 */
class ErrorDetailJsonMarshaller {

    public void marshall(ErrorDetail errorDetail, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (errorDetail.getErrorCode() != null) {
            String errorCode = errorDetail.getErrorCode();
            jsonWriter.name("ErrorCode");
            jsonWriter.value(errorCode);
        }
        if (errorDetail.getErrorMessage() != null) {
            String errorMessage = errorDetail.getErrorMessage();
            jsonWriter.name("ErrorMessage");
            jsonWriter.value(errorMessage);
        }
        jsonWriter.endObject();
    }

    private static ErrorDetailJsonMarshaller instance;

    public static ErrorDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ErrorDetailJsonMarshaller();
        return instance;
    }
}
