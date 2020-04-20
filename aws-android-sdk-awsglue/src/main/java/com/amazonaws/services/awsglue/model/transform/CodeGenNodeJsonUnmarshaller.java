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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO CodeGenNode
 */
class CodeGenNodeJsonUnmarshaller implements Unmarshaller<CodeGenNode, JsonUnmarshallerContext> {

    public CodeGenNode unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CodeGenNode codeGenNode = new CodeGenNode();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Id")) {
                codeGenNode.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NodeType")) {
                codeGenNode.setNodeType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Args")) {
                codeGenNode.setArgs(new ListUnmarshaller<CodeGenNodeArg>(
                        CodeGenNodeArgJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("LineNumber")) {
                codeGenNode.setLineNumber(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return codeGenNode;
    }

    private static CodeGenNodeJsonUnmarshaller instance;

    public static CodeGenNodeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CodeGenNodeJsonUnmarshaller();
        return instance;
    }
}
