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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CodeGenNodeArg
 */
class CodeGenNodeArgJsonMarshaller {

    public void marshall(CodeGenNodeArg codeGenNodeArg, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (codeGenNodeArg.getName() != null) {
            String name = codeGenNodeArg.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (codeGenNodeArg.getValue() != null) {
            String value = codeGenNodeArg.getValue();
            jsonWriter.name("Value");
            jsonWriter.value(value);
        }
        if (codeGenNodeArg.getParam() != null) {
            Boolean param = codeGenNodeArg.getParam();
            jsonWriter.name("Param");
            jsonWriter.value(param);
        }
        jsonWriter.endObject();
    }

    private static CodeGenNodeArgJsonMarshaller instance;

    public static CodeGenNodeArgJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CodeGenNodeArgJsonMarshaller();
        return instance;
    }
}
