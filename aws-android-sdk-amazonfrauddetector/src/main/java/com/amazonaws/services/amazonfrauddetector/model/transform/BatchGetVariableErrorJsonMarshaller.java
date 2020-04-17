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

package com.amazonaws.services.amazonfrauddetector.model.transform;

import com.amazonaws.services.amazonfrauddetector.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BatchGetVariableError
 */
class BatchGetVariableErrorJsonMarshaller {

    public void marshall(BatchGetVariableError batchGetVariableError, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (batchGetVariableError.getName() != null) {
            String name = batchGetVariableError.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (batchGetVariableError.getCode() != null) {
            Integer code = batchGetVariableError.getCode();
            jsonWriter.name("code");
            jsonWriter.value(code);
        }
        if (batchGetVariableError.getMessage() != null) {
            String message = batchGetVariableError.getMessage();
            jsonWriter.name("message");
            jsonWriter.value(message);
        }
        jsonWriter.endObject();
    }

    private static BatchGetVariableErrorJsonMarshaller instance;

    public static BatchGetVariableErrorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BatchGetVariableErrorJsonMarshaller();
        return instance;
    }
}
