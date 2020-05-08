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

package com.amazonaws.services.tagging.model.transform;

import com.amazonaws.services.tagging.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FailureInfo
 */
class FailureInfoJsonMarshaller {

    public void marshall(FailureInfo failureInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (failureInfo.getStatusCode() != null) {
            Integer statusCode = failureInfo.getStatusCode();
            jsonWriter.name("StatusCode");
            jsonWriter.value(statusCode);
        }
        if (failureInfo.getErrorCode() != null) {
            String errorCode = failureInfo.getErrorCode();
            jsonWriter.name("ErrorCode");
            jsonWriter.value(errorCode);
        }
        if (failureInfo.getErrorMessage() != null) {
            String errorMessage = failureInfo.getErrorMessage();
            jsonWriter.name("ErrorMessage");
            jsonWriter.value(errorMessage);
        }
        jsonWriter.endObject();
    }

    private static FailureInfoJsonMarshaller instance;

    public static FailureInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FailureInfoJsonMarshaller();
        return instance;
    }
}
