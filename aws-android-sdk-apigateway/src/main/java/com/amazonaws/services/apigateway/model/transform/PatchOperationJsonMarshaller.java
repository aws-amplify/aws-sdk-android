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

package com.amazonaws.services.apigateway.model.transform;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PatchOperation
 */
class PatchOperationJsonMarshaller {

    public void marshall(PatchOperation patchOperation, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (patchOperation.getOp() != null) {
            String op = patchOperation.getOp();
            jsonWriter.name("op");
            jsonWriter.value(op);
        }
        if (patchOperation.getPath() != null) {
            String path = patchOperation.getPath();
            jsonWriter.name("path");
            jsonWriter.value(path);
        }
        if (patchOperation.getValue() != null) {
            String value = patchOperation.getValue();
            jsonWriter.name("value");
            jsonWriter.value(value);
        }
        if (patchOperation.getFrom() != null) {
            String from = patchOperation.getFrom();
            jsonWriter.name("from");
            jsonWriter.value(from);
        }
        jsonWriter.endObject();
    }

    private static PatchOperationJsonMarshaller instance;

    public static PatchOperationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PatchOperationJsonMarshaller();
        return instance;
    }
}
