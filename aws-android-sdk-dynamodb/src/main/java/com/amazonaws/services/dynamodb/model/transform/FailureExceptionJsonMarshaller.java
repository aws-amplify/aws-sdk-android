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

package com.amazonaws.services.dynamodb.model.transform;

import com.amazonaws.services.dynamodb.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FailureException
 */
class FailureExceptionJsonMarshaller {

    public void marshall(FailureException failureException, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (failureException.getExceptionName() != null) {
            String exceptionName = failureException.getExceptionName();
            jsonWriter.name("ExceptionName");
            jsonWriter.value(exceptionName);
        }
        if (failureException.getExceptionDescription() != null) {
            String exceptionDescription = failureException.getExceptionDescription();
            jsonWriter.name("ExceptionDescription");
            jsonWriter.value(exceptionDescription);
        }
        jsonWriter.endObject();
    }

    private static FailureExceptionJsonMarshaller instance;

    public static FailureExceptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FailureExceptionJsonMarshaller();
        return instance;
    }
}
