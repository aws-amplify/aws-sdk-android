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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CodeGenNode
 */
class CodeGenNodeJsonMarshaller {

    public void marshall(CodeGenNode codeGenNode, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (codeGenNode.getId() != null) {
            String id = codeGenNode.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (codeGenNode.getNodeType() != null) {
            String nodeType = codeGenNode.getNodeType();
            jsonWriter.name("NodeType");
            jsonWriter.value(nodeType);
        }
        if (codeGenNode.getArgs() != null) {
            java.util.List<CodeGenNodeArg> args = codeGenNode.getArgs();
            jsonWriter.name("Args");
            jsonWriter.beginArray();
            for (CodeGenNodeArg argsItem : args) {
                if (argsItem != null) {
                    CodeGenNodeArgJsonMarshaller.getInstance().marshall(argsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (codeGenNode.getLineNumber() != null) {
            Integer lineNumber = codeGenNode.getLineNumber();
            jsonWriter.name("LineNumber");
            jsonWriter.value(lineNumber);
        }
        jsonWriter.endObject();
    }

    private static CodeGenNodeJsonMarshaller instance;

    public static CodeGenNodeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CodeGenNodeJsonMarshaller();
        return instance;
    }
}
